package repo.Controller;

import java.util.List;

import javax.persistence.metamodel.Metamodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import repo.Model.Member;
import repo.Repository.MemberRepository;

@Controller
@RequestMapping("/")
public class MemberController {
	@Autowired
	MemberRepository mrepo;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/profile")
	public String profile(@ModelAttribute("member") Member member, Model model) {
		List<Member> allmembers = mrepo.findAll();
		for (Member m: allmembers) {
			if(m.getName()==member.getName()) {
				return "signup";
			}
		}

		mrepo.save(member);

		return "profile";
	}

	@GetMapping("/payment")
	public String payment() {
		return "payment";
	}

	@GetMapping("/cart")
	public String cart() {
		return "cart";
	}

	@GetMapping("/signup")
	public String signup(Model model) {
		Member member = new Member();
		model.addAttribute("member", member);
		return "signup";
	}
}

