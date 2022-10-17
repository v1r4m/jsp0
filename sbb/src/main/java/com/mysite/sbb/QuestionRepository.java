package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject); //상속을 받아도 선언해줘야 사용할 수 있단
}