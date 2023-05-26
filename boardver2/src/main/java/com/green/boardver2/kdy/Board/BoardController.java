package com.green.boardver2.kdy.Board;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*

    /user
    (post) 회원가입
    (get)로그인
    (patch) /pw 비밀번호 수정
    (patch) /pic 프로필 사진 수정
    (delete) 삭제 , 쓴 게시물 모두 삭제되야함

    /board
    (get) /maxpage?row=40 마지막 page값
    (get) ?page=1&row=40 리스트
    (get) /{iboard} 디테일 (댓글5, 댓글maxpage값)
    (post) 글등록
    (put) 글수정
    (delete) 글삭제


    /board/cmt
    (post) 댓글 등록
    (get) /{iboard}?page=2 (갯수 5개씩)
    (put) 수정
    (delete) 삭제


 */

@RestController
@RequestMapping("/board")
public class BoardController {

}
