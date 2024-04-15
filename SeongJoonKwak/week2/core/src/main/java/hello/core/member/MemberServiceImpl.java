package hello.core.member;

public class MemberServiceImpl implements MemberService {

    //가입을 하고 멤버를 찾으려면 memberRepository interface(memberRepository)에도 의존하면서 구현체(MemoryMemberRepository에도 의존하고있음(문제!)
    //추상화에도 의존하고 구체화에도 의존중
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member fineMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
