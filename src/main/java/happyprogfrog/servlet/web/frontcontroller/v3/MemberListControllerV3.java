package happyprogfrog.servlet.web.frontcontroller.v3;

import happyprogfrog.servlet.domain.member.Member;
import happyprogfrog.servlet.domain.member.MemberRepository;
import happyprogfrog.servlet.web.frontcontroller.ModelView;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();

        ModelView modelView = new ModelView("members");
        modelView.getModel().put("members", members);

        return modelView;
    }
}
