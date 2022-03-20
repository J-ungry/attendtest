package com.attendtest.attendtest.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo,Long> { // id 값이 long 이다
    List<Memo> findAllByOrderByModifiedAtDesc();
}
