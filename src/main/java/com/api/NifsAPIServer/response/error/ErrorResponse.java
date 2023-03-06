package com.api.NifsAPIServer.response.error;

import com.api.NifsAPIServer.response.Header;
import com.api.NifsAPIServer.response.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
	private Header header;
	private Item items;
	
	public ErrorResponse(final ErrorCode errorCode) {
		this.header = new Header(errorCode.getStatus(), errorCode.getMessage());
		this.items = new Item(errorCode.getErrorCode());
	}

}
