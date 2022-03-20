package com.attendtest.attendtest.service;

import com.attendtest.attendtest.domain.Memo;
import com.attendtest.attendtest.domain.MemoRepository;
import com.attendtest.attendtest.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository; // memorepository 가져오기

    @Transactional
    public Long update(Long id, MemoRequestDto requestDto){
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 아이디 입니다")
        );
        memo.update(requestDto);
        return memo.getId();
    }

}
