package org.jboss.example.sampleWebFlow.repo;

import java.util.List;

import org.jboss.example.sampleWebFlow.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
