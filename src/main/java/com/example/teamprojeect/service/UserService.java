package com.example.teamprojeect.service;

import com.example.teamprojeect.domain.dao.user.LikeDAO;
import com.example.teamprojeect.domain.dao.user.UserDAO;
import com.example.teamprojeect.domain.dao.user.UserFileDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private UserDAO userDAO;
    private UserFileDAO userFileDAO;
    private LikeDAO likeDAO;
}
