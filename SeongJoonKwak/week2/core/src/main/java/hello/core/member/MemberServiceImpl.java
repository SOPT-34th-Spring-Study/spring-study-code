package hello.core.member;

public class MemberServiceImpl implements MemberService {

    //가입을 하고 멤버를 찾으려면 memberRepository interface(memberRepository)가 필요함 -> 구현체도 필요함(MemoryMemberRespository)
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
