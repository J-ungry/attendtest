package com.attendtest.attendtest.controller;

import com.attendtest.attendtest.domain.Memo;
import com.attendtest.attendtest.domain.MemoRepository;
import com.attendtest.attendtest.domain.MemoRequestDto;
import com.attendtest.attendtest.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoController {

    //create, read , delete , update
    private final MemoRepository memoRepository;
    private final MemoService memoService;

    // create
    @PostMapping("/api/memos")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto){
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }
    // read
    @GetMapping("/api/memos")
    public List<Memo> readMemo(){ return memoRepository.findAllByOrderByModifiedAtDesc();}
    // delete
    @DeleteMapping("/api/memos/{id}")
    public Long deleteMemo(@PathVariable Long id){
        memoRepository.deleteById(id);
        return id;
    }
    // update
    @PutMapping("/api/memos/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto){
        memoService.update(id,requestDto);
        return id;
    }
}
