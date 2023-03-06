package com.api.NifsAPIServer.response.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    NOT_FOUND(404,"찾는 정보가 없습니다.","NOT FOUND"),
    WRONG_PATH(404,"잘못된 경로입니다.","WRONG PATH"),
    INTER_SERVER_ERROR(500,"서버가 응답에 실패하였습니다.","INTER SERVER ERROR"),
    BAD_REQUEST(400,"요청변수의 형식을 제대로 입력해주세요.","BAD REQUEST"),
    UNAUTHORIZED(401,"입력하신 API KEY의 정보가 틀렸습니다.","UNAUTHORIZED"),
    FORBIDDEN(403,"허용된 사용자가 아니거나, 요청이 거부되었습니다.","FORBIDDEN"),
    METHOD_NOT_ALLOWED(405,"해당 URL에 대한 정상적인 HTTP METHOD가 아닙니다.","METHOD NOT ALLOWED")
    ;

    private int status;
    private String errorCode;
    private String message;
}