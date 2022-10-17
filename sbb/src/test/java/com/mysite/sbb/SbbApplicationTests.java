package com.mysite.sbb;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
class SbbApplicationTests {

    @Autowired //생성자를 대체 가능한 spring의 annotation.
	//테스트 코드에서는 @Autowired를 써야하고 실제로는 생성자를 통한 객체 생성이 권장된다.(순환참조이슈)
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {        
        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
		assertEquals(1, q.getId());
    }
}