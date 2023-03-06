package com.api.NifsAPIServer.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Header {
	private int httpStatus;
	private String message;
}
