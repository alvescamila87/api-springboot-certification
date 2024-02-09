package com.camila.springbootcertificationnlw.seed;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;

public class CreateSeed {

    private final JdbcTemplate jdbcTemplate;

    public CreateSeed(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5434/postgres_nlw");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");

        CreateSeed createSeed = new CreateSeed(dataSource);
        createSeed.run(args);
    }

    public void run(String... args) {
        String filePath = "src/main/resources/create.sql";
        executeSqlFile(filePath);
    }

    public void executeSqlFile(String filePath) {
        try {
            String sqlScript = new String(Files.readAllBytes(Paths.get(filePath)));

            jdbcTemplate.execute(sqlScript);

            System.out.println("Seed realizado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao executar arquivo " + e.getMessage());;
        }
    }
}
