package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
//    private ArrayList<MemberDto> list;
    @Autowired
    MemberService memberService;

    public IndexController() {
//        list = new ArrayList<>();
//        MemberDto m1 = new MemberDto("u1", "1111", "u1@naevr.com");
//        MemberDto m2 = new MemberDto("u2", "2222", "u2@naevr.com");
//        MemberDto m3 = new MemberDto("u3", "3333", "u3@naevr.com");
//        list.add(m1);
//        list.add(m2);
//        list.add(m3);
    }

    @GetMapping("/")
    public String main(HttpSession httpSession){
        System.out.println("현재세션유저아이디 : " + httpSession.getAttribute("userId"));
        return "/index/index";
    }

    @GetMapping("/join")
    public String join() {
        return "/index/join";
    }

    @GetMapping("/login")
    public String login(){
        return "/index/login";
    }

    @PostMapping("/rest/login")
    public String getMember(MemberDto memberDto, HttpSession httpSession, Model model) throws Exception{
        MemberDto memberLogin = memberService.getMember(memberDto.getId(), memberDto.getPassword());
        if (memberLogin == null) {
                System.out.println("null");
                return "/index/login";
        }else{
            System.out.println("아이디 : " + memberDto.getId());
            System.out.println("비밀번호 : " + memberDto.getPassword());
            System.out.println("이름 : " + memberDto.getName());
            httpSession.setAttribute("userId", memberDto.getId());
            model.addAttribute("user", memberDto.getId());
                return "/index/index";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
