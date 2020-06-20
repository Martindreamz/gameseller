package repo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import repo.Model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{
List<Member> findByname(String name);
}
