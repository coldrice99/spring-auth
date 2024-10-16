package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Primary와 Qualifier 우선순위 확인") // 프라이머리 : 범용적  <  퀄리파이어 : 지엽적
    void test() {
        food.eat();
    }
}
