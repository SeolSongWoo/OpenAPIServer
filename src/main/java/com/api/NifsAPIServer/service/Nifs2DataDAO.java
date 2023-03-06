package com.api.NifsAPIServer.service;

import com.api.NifsAPIServer.aop.ExecutionTime;
import com.api.NifsAPIServer.domain.RequestDataVO;
import com.api.NifsAPIServer.exception.CustomAuthenticationException;
import com.api.NifsAPIServer.mapper.Nifs2DataMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class Nifs2DataDAO {
	
	private final Nifs2DataMapper nifs2DataMapper;

	


	@ExecutionTime
	public List<LinkedHashMap<String,Object>> nifs2DataList(final RequestDataVO requestDataVO) {
		var result = nifs2DataMapper.nifs2DataList(requestDataVO);

		var linkedList = new LinkedList<LinkedHashMap<String,Object>>();
		if(result.size() == 0) {
			//var result2 = nifs2DataMapper.nifs2DataListTemp(requestDataVO);
//			if(result2.size() == 0) {
				throw new NullPointerException();
//		}
/*			else {
				for(var nifs2DTO2 : result2) {
					linkedList.add(nifs2DTO2.nifs2DTOLinkedList());
				}
			}*/
		}
		else {
			for(var nifs2DTO : result) {
				linkedList.add(nifs2DTO.nifs2DTOLinkedList());
			}
		}

		return linkedList;
	}

	public void keyAuthenticate(final String apikey) {
		final int result = nifs2DataMapper.keyAuthenticate(apikey);
		if(result == 0) {
			throw new CustomAuthenticationException("UNAUTHORIZED API KEY");
		}
	}

	public void importNifsAvgData(final Calendar calendar) {
		Date time = calendar.getTime();
		nifs2DataMapper.importNifsAvgData(time);
	}
	

}
