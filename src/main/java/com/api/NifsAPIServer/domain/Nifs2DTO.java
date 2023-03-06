package com.api.NifsAPIServer.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;


@Data
public class Nifs2DTO {
	private String STATION_NAME;

	private String MMSI;
	private LocalDateTime DATETIME;
	private double VOL;
	private double LATITUDE;
	private double LONGITUDE;
	private double WT1;
	private double WD1;
	private double WT2;
	private double WD2;
	private double WT3;
	private double WD3;
	private double CT1_WT;
	private double CT1_CT;
	private double CT1_SAL;
	private double DO1_WT;
	private double DO1_SAT;
	private double DO1_OXY;
	private double CNT;
	private double CT2_WT;
	private double CT2_CT;
	private double CT2_SAL;
	private double CT3_WT;
	private double CT3_CT;
	private double CT3_SAL;
	private double DO2_WT;
	private double DO2_SAT;
	private double DO2_OXY;
	private double DO3_WT;
	private double DO3_SAT;
	private double DO3_OXY;

	private LinkedHashMap<String,Object> nifs2DTOLinked;

	private static final List<Double> UNWANTED_VALUES = Arrays.asList(0.0, -102.5);
	private static final List<Double> TO_NULL = Arrays.asList(-99.0);

	public LinkedHashMap<String,Object> nifs2DTOLinkedList() {
		nifs2DTOLinked = new LinkedHashMap<>();
		nifs2DTOLinked.put("MMSI",this.MMSI);
		nifs2DTOLinked.put("STATION_NAME",this.STATION_NAME);
		nifs2DTOLinked.put("DATETIME",this.DATETIME);
		nifs2DTOLinked.put("VOL",this.VOL);
		nifs2DTOLinked.put("LATITUDE",this.LATITUDE);
		nifs2DTOLinked.put("LONGITUDE",this.LONGITUDE);

		if(!UNWANTED_VALUES.contains(this.WT1)) {
			nifs2DTOLinked.put("WT1", this.WT1);
		}
		else if(TO_NULL.contains(this.WT1)) {
			nifs2DTOLinked.put("WT1", "");
		}

		if(!UNWANTED_VALUES.contains(this.WD1)) {

			nifs2DTOLinked.put("WD1", this.WD1);
		}
		else if(TO_NULL.contains(this.WD1)) {
			nifs2DTOLinked.put("WD1", "");
		}

		if(!UNWANTED_VALUES.contains(this.WT2)) {

			nifs2DTOLinked.put("WT2", this.WT2);
		}
		else if(TO_NULL.contains(this.WT2)) {
			nifs2DTOLinked.put("WT2", "");
		}

		if(!UNWANTED_VALUES.contains(this.WD2)) {

			nifs2DTOLinked.put("WD2", this.WD2);
		}
		else if(TO_NULL.contains(this.WD2)) {
			nifs2DTOLinked.put("WD2", "");
		}

		if(!UNWANTED_VALUES.contains(this.WT3)) {

			nifs2DTOLinked.put("WT3", this.WT3);
		}
		else if(TO_NULL.contains(this.WT3)) {
			nifs2DTOLinked.put("WT3", "");
		}

		if(!UNWANTED_VALUES.contains(this.WD3)) {
			nifs2DTOLinked.put("WD3", this.WD3);
		}
		else if(TO_NULL.contains(this.WD3)) {
			nifs2DTOLinked.put("WD3", "");
		}

		if(!UNWANTED_VALUES.contains(this.CT1_WT)) {
			nifs2DTOLinked.put("CT1_WT", this.CT1_WT);
		}
		else if(TO_NULL.contains(this.CT1_WT)) {
			nifs2DTOLinked.put("CT1_WT", "");
		}

		if(!UNWANTED_VALUES.contains(this.CT1_CT)) {
			nifs2DTOLinked.put("CT1_CT", this.CT1_CT);
		}
		else if(TO_NULL.contains(this.CT1_CT)) {
			nifs2DTOLinked.put("CT1_CT", "");
		}

		if(!UNWANTED_VALUES.contains(this.CT1_SAL)) {
			nifs2DTOLinked.put("CT1_SAL", this.CT1_SAL);
		}
		else if(TO_NULL.contains(this.CT1_SAL)) {
			nifs2DTOLinked.put("CT1_SAL", "");
		}

		if(!UNWANTED_VALUES.contains(this.DO1_WT)) {
			nifs2DTOLinked.put("DO1_WT", this.DO1_WT);
		}
		else if(TO_NULL.contains(this.DO1_WT)) {
			nifs2DTOLinked.put("DO1_WT", "");
		}

		if(!UNWANTED_VALUES.contains(this.DO1_SAT)) {
			nifs2DTOLinked.put("DO1_SAT", this.DO1_SAT);
		}
		else if(TO_NULL.contains(this.DO1_SAT)) {
			nifs2DTOLinked.put("DO1_SAT", "");
		}

		if(!UNWANTED_VALUES.contains(this.DO1_OXY)) {
			nifs2DTOLinked.put("DO1_OXY", this.DO1_OXY);
		}
		else if(TO_NULL.contains(this.DO1_OXY)) {
			nifs2DTOLinked.put("DO1_OXY", "");
		}

		if(!UNWANTED_VALUES.contains(this.CNT)) {
			nifs2DTOLinked.put("CNT", this.CNT);
		}
		else if(TO_NULL.contains(this.CNT)) {
			nifs2DTOLinked.put("CNT", "");
		}

		if(!UNWANTED_VALUES.contains(this.CT2_WT)) {
			nifs2DTOLinked.put("CT1_WT", this.CT2_WT);
		}
		else if(TO_NULL.contains(this.CT1_WT)) {
			nifs2DTOLinked.put("CT1_WT", "");
		}

		if(!UNWANTED_VALUES.contains(this.CT2_CT)) {
			nifs2DTOLinked.put("CT1_CT", this.CT2_CT);
		}
		else if(TO_NULL.contains(this.CT1_CT)) {
			nifs2DTOLinked.put("CT1_CT", "");
		}

		if(!UNWANTED_VALUES.contains(this.CT2_SAL)) {
			nifs2DTOLinked.put("CT1_SAL", this.CT2_SAL);
		}
		else if(TO_NULL.contains(this.CT1_SAL)) {
			nifs2DTOLinked.put("CT1_SAL", "");
		}

		if(!UNWANTED_VALUES.contains(this.CT3_WT)) {
			nifs2DTOLinked.put("CT3_WT", this.CT3_WT);
		}
		else if(TO_NULL.contains(this.CT3_WT)) {
			nifs2DTOLinked.put("CT3_WT", "");
		}

		if(!UNWANTED_VALUES.contains(this.CT3_CT)) {
			nifs2DTOLinked.put("CT3_CT", this.CT3_CT);
		}
		else if(TO_NULL.contains(this.CT3_CT)) {
			nifs2DTOLinked.put("CT3_CT", "");
		}

		if(!UNWANTED_VALUES.contains(this.CT3_SAL)) {
			nifs2DTOLinked.put("CT3_SAL", this.CT3_SAL);
		}
		else if(TO_NULL.contains(this.CT3_SAL)) {
			nifs2DTOLinked.put("CT3_SAL", "");
		}

		if(!UNWANTED_VALUES.contains(this.DO2_WT)) {
			nifs2DTOLinked.put("DO2_WT", this.DO2_WT);
		}
		else if(TO_NULL.contains(this.DO2_WT)) {
			nifs2DTOLinked.put("DO2_WT", "");
		}

		if(!UNWANTED_VALUES.contains(this.DO2_SAT)) {
			nifs2DTOLinked.put("DO2_SAT", this.DO2_SAT);
		}
		else if(TO_NULL.contains(this.DO2_SAT)) {
			nifs2DTOLinked.put("DO2_SAT", "");
		}

		if(!UNWANTED_VALUES.contains(this.DO2_OXY)) {
			nifs2DTOLinked.put("DO2_OXY", this.DO2_OXY);
		}
		else if(TO_NULL.contains(this.DO2_OXY)) {
			nifs2DTOLinked.put("DO2_OXY", "");
		}

		if(!UNWANTED_VALUES.contains(this.DO3_WT)) {
			nifs2DTOLinked.put("DO3_WT", this.DO3_WT);
		}
		else if(TO_NULL.contains(this.DO3_WT)) {
			nifs2DTOLinked.put("DO3_WT", "");
		}

		if(!UNWANTED_VALUES.contains(this.DO3_SAT)) {
			nifs2DTOLinked.put("DO3_SAT", this.DO3_SAT);
		}
		else if(TO_NULL.contains(this.DO3_SAT)) {
			nifs2DTOLinked.put("DO3_SAT", "");
		}

		if(!UNWANTED_VALUES.contains(this.DO3_OXY)) {
			nifs2DTOLinked.put("DO3_OXY", this.DO3_OXY);
		}
		else if(TO_NULL.contains(this.DO3_OXY)) {
			nifs2DTOLinked.put("DO3_OXY", "");
		}

		return nifs2DTOLinked;
	}
}
