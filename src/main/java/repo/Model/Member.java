package repo.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Member implements Comparable<Member>{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int memberid;
	private String name;
	private String password;
	
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Game> ownedgames;
	
	public Member() {
		super();
	}
	public Member(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Game> getOwnedgames() {
		return ownedgames;
	}
	public void setOwnedgames(List<Game> ownedgames) {
		this.ownedgames = ownedgames;
	}
	
	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", name=" + name + ", password=" + password + ", ownedgames="
				+ ownedgames + "]";
	}
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		if(this.getName()==o.getName()) {
		return 0;}
	return 1;
		}
	}
	
	
	

