package com.mysite.sbb.question;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import com.mysite.sbb.DataNotFoundException;

//bumper service
@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> getList(){
        return this.questionRepository.findAll();
    }
    public Question getQuestion(Integer id){
        Optional<Question> question = this.questionRepository.findById(id);
        if(question.isPresent()){
            return question.get();
        } else{
            throw new DataNotFoundException("question not found");
        }
    }
}
