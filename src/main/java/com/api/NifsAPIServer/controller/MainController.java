package com.api.NifsAPIServer.controller;


import com.api.NifsAPIServer.aop.ApiKeyAuthenticated;
import com.api.NifsAPIServer.domain.RequestDataVO;
import com.api.NifsAPIServer.response.Header;
import com.api.NifsAPIServer.response.Item;
import com.api.NifsAPIServer.response.Response;
import com.api.NifsAPIServer.service.Nifs2DataDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/geosr/nifs")
public class MainController {

	private final Nifs2DataDAO service;

	@ApiKeyAuthenticated
	@GetMapping(value = "/data")
	public ResponseEntity<Response> getNifs2Data(@RequestParam("serviceKey") String serviceKey, @Validated final RequestDataVO requestDataVO){
		var result = service.nifs2DataList(requestDataVO);
		var response = createResponseOK(result);

		return new ResponseEntity<>(response,HttpStatus.OK);
	}

	@Transactional
	public ResponseEntity<String> importData(){
		var calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2023);
		calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
		calendar.set(Calendar.DATE, 0);
		calendar.set(Calendar.HOUR, 00);
		calendar.set(Calendar.MINUTE, 10);
		calendar.set(Calendar.SECOND, 0);
		while (calendar.get(Calendar.DATE) != 1) {
			service.importNifsAvgData(calendar);
			log.info("Success"+calendar.toString());
			calendar.add(Calendar.MINUTE, 10);
		}

		return ResponseEntity.ok("성공");
	}
	
	
	
	private Response createResponseOK(List<?> result) {
		var response = new Response();
        response.setHeader(new Header(200,"조회 성공"));
        response.setItems(result.stream()
            .map(r -> {
                Item item = new Item();
                item.setItem(r);
                return item;
            })
            .collect(Collectors.toList()));
        return response;
	}
}
