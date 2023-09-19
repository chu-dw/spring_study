package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import hello.core.member.MemoryMemberRepostory;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceimpl(new MemoryMemberRepostory());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepostory(), new FixDiscountPolicy());
    }

}
