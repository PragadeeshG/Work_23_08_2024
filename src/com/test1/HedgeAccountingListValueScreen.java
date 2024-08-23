package com.test1;

public class HedgeAccountingListValueScreen {
	private Integer recordId;
	private Integer haListValScreenId;
	private String haListValScreenName;
	private String haListValScreenUrl;
	private String haListValPageUrl;
	private String actionIds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public HedgeAccountingListValueScreen() {

	}

	public HedgeAccountingListValueScreen(Integer recordId, Integer haListValScreenId, String haListValScreenName,
			String haListValScreenUrl, String haListValPageUrl, String actionIds, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.recordId = recordId;
		this.haListValScreenId = haListValScreenId;
		this.haListValScreenName = haListValScreenName;
		this.haListValScreenUrl = haListValScreenUrl;
		this.haListValPageUrl = haListValPageUrl;
		this.actionIds = actionIds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getHaListValScreenId() {
		return haListValScreenId;
	}

	public void setHaListValScreenId(Integer haListValScreenId) {
		this.haListValScreenId = haListValScreenId;
	}

	public String getHaListValScreenName() {
		return haListValScreenName;
	}

	public void setHaListValScreenName(String haListValScreenName) {
		this.haListValScreenName = haListValScreenName;
	}

	public String getHaListValScreenUrl() {
		return haListValScreenUrl;
	}

	public void setHaListValScreenUrl(String haListValScreenUrl) {
		this.haListValScreenUrl = haListValScreenUrl;
	}

	public String getHaListValPageUrl() {
		return haListValPageUrl;
	}

	public void setHaListValPageUrl(String haListValPageUrl) {
		this.haListValPageUrl = haListValPageUrl;
	}

	public String getActionIds() {
		return actionIds;
	}

	public void setActionIds(String actionIds) {
		this.actionIds = actionIds;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
