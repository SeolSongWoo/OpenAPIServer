package com.api.NifsAPIServer.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestDataVO {
	@NotNull
	@DateTimeFormat(pattern = "yyyyMMdd:HHmm")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd:HHmm", timezone = "Asia/Seoul")
	private LocalDateTime startDate;

	@NotNull
	@DateTimeFormat(pattern = "yyyyMMdd:HHmm")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd:HHmm", timezone = "Asia/Seoul")
	private LocalDateTime endDate;

	private List<String> stationName;
}
