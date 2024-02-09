package com.camila.springbootcertificationnlw.controllers;

import com.camila.springbootcertificationnlw.dto.AlternativeResultDTO;
import com.camila.springbootcertificationnlw.dto.QuestionResultDTO;
import com.camila.springbootcertificationnlw.entities.AlternativesEntity;
import com.camila.springbootcertificationnlw.entities.QuestionEntity;
import com.camila.springbootcertificationnlw.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/technology/{technology}")
    public List<QuestionResultDTO> findByTechnology(@PathVariable String technology) {
        var result = this.questionRepository.findByTechnology(technology);

        var toMap = result.stream().map(question -> mapQuestionToDTO(question))
                .collect(Collectors.toList());
                return toMap;
    }

    static QuestionResultDTO mapQuestionToDTO(QuestionEntity questionEntity) {
        var questionResultoDTO = QuestionResultDTO.builder()
                .id(questionEntity.getId())
                .technology(questionEntity.getTechnology())
                .description(questionEntity.getDescription()).build();

        List<AlternativeResultDTO> alternativeResultDTOs =
                questionEntity.getAlternativesEntity()
                        .stream().map(alternative -> mapAlternativeDTO(alternative))
                        .collect(Collectors.toList());

        questionResultoDTO.setAlternativeResultDTO(alternativeResultDTOs);
        return questionResultoDTO;
    }

    static AlternativeResultDTO mapAlternativeDTO(AlternativesEntity alternativeResultDTO) {
        return AlternativeResultDTO.builder()
                .id(alternativeResultDTO.getId())
                .description(alternativeResultDTO.getDescription()).build();

    }
}
