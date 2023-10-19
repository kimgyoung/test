package com.example.login_test.user;

import com.example.login_test.core.utils.ApiUitls;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostRemove;
import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    /* @Valid = 받아온 폼의 데이터 유효성을 검사하는 역할을 수행.
     *  - @RequestBody, @ModelAttribute 와 함께 사용한다.
     *  - DTO에서 작성된  @Size, @Pattern, @NotEmpty 등등을 검사.
     *  - 필드에 'NOT NULL' 조건이 있거나, 'UNIQUE' 조건이 설정되어 있는 경우도 확인.
     *
     * @RequestBody
     * JSON 으로 넘어오는 데이터를 UserRequest.LoginDTO 형태로 변경 해주는 역할.
     * */

    @PostMapping("/join")
    public ResponseEntity<?> join (@RequestBody @Valid UserRequest.LoginDTO requestDTO) {

        userService.join(requestDTO);

        return ResponseEntity.ok(ApiUitls.success(null) );
    }

}
























