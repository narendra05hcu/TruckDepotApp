package com.truckdepot.service.beans;

import java.util.List;

public class SearchLoadResponseSO extends ResponseSO{
	private List<SearchLoadSO> searchLoadSOs;

	public List<SearchLoadSO> getSearchLoadSOs() {
		return searchLoadSOs;
	}

	public void setSearchLoadSOs(List<SearchLoadSO> searchLoadSOs) {
		this.searchLoadSOs = searchLoadSOs;
	}
	
}
