package com.api.NifsAPIServer.mapper;

import com.api.NifsAPIServer.domain.Nifs2DTO;
import com.api.NifsAPIServer.domain.RequestDataVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Mapper
public interface Nifs2DataMapper {
	List<Nifs2DTO> nifs2DataList(RequestDataVO requestDataVO);

	List<Nifs2DTO> nifs2DataListTemp(RequestDataVO requestDataVO);


	int keyAuthenticate(String apikey);
	void importNifsAvgData(Date time);
}
