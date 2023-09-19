package hello.core.memeber;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberservice;
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberservice = appConfig.memberService();
    }



    @Test
    void join(){
        //given
        Member member = new Member(1L,"meberA", Grade.Vip);
        //when
        memberservice.join(member);
        Member findMeme = memberservice.findMember(1L);
        //them
        Assertions.assertThat(member).isEqualTo(findMeme);

    }
}
