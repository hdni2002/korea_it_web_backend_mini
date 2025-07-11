package com.korit.BoardStudy.controller;

import com.korit.BoardStudy.dto.account.ChangePasswordReqDto;
import com.korit.BoardStudy.security.model.PrincipalUser;
import com.korit.BoardStudy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/change/password")
    public ResponseEntity<?> changePassword(@RequestBody ChangePasswordReqDto changePasswordReqDto, @AuthenticationPrincipal PrincipalUser principalUser){
        return ResponseEntity.ok(accountService.changePassword(changePasswordReqDto, principalUser));
    }

}
