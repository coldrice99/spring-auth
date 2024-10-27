package com.sparta.springauth.controller;

import com.sparta.springauth.security.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /* @AuthenticationPrincipal 를 사용하여 username을 동적으로 넣어줌
       @AuthenticationPrincipal UserDetailsImpl userDetails: Spring Security에서 인증된 사용자 정보를 얻기 위해 사용
     */
    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        model.addAttribute("username", userDetails.getUsername());
        return "index";
    }
}