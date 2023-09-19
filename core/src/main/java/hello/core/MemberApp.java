package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;


public class MemberApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L,"memberA", Grade.Vip); //객체 생성하는거지?
        memberService.join(member);

        Member findmem = memberService.findMember(1L);
        System.out.println("newmeme ="+ member.getName());
        System.out.println("findmem ="+ findmem.getName());
    }
}
