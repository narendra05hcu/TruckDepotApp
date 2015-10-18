package com.truckdepot.web.beans;

import java.util.List;

public class SearchLoadResponseMO extends ResponseMO{
	private List<SearchLoadMO> searchLoadSOs;

	public List<SearchLoadMO> getSearchLoadSOs() {
		return searchLoadSOs;
	}

	public void setSearchLoadSOs(List<SearchLoadMO> searchLoadSOs) {
		this.searchLoadSOs = searchLoadSOs;
	}
	
}
