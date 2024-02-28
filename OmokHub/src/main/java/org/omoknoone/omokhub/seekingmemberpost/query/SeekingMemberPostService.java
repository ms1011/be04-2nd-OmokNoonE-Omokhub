package org.omoknoone.omokhub.seekingmemberpost.query;

import org.omoknoone.omokhub.seekingmemberpost.query.repository.SeekingMemberPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeekingMemberPostService {

    private SeekingMemberPostMapper seekingMemberPostMapper;

    @Autowired
    public SeekingMemberPostService(SeekingMemberPostMapper seekingMemberPostMapper) {
        this.seekingMemberPostMapper = seekingMemberPostMapper;
    }

    public List<SeekingMemberPostDTO> findSeekingMemberPostList() {

        return seekingMemberPostMapper.selectSeekingMemberPostList();
    }

    public SeekingMemberPostDTO findSeekingMemberPostDetail(int seekingMemberPostId) {

        return seekingMemberPostMapper.selectSeekingMemberPostDetail(seekingMemberPostId);
    }

    public List<SeekingMemberPostDTO> findSeekingMemberPostByMyPost(String memberId) {

        return seekingMemberPostMapper.selectSeekingMemberPostByMyPost(memberId);
    }
}