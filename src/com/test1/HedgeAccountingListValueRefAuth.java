package com.test1;

public class HedgeAccountingListValueRefAuth {
	private long authorizerId;
	private String accountingListValueCatCode;
	private String accountingListValueSubCatCode;
	private String codeOwner;
	private String codeVerifier;
	private String codeCompletionTeam;
	private String emailGroup;
	private long refDataId;
	private Integer sequence;
	private String modularData;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public HedgeAccountingListValueRefAuth() {

	}

	public HedgeAccountingListValueRefAuth(long authorizerId, String accountingListValueCatCode,
			String accountingListValueSubCatCode, String codeOwner, String codeVerifier, String codeCompletionTeam,
			String emailGroup, long refDataId, Integer sequence, String modularData, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.authorizerId = authorizerId;
		this.accountingListValueCatCode = accountingListValueCatCode;
		this.accountingListValueSubCatCode = accountingListValueSubCatCode;
		this.codeOwner = codeOwner;
		this.codeVerifier = codeVerifier;
		this.codeCompletionTeam = codeCompletionTeam;
		this.emailGroup = emailGroup;
		this.refDataId = refDataId;
		this.sequence = sequence;
		this.modularData = modularData;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getAccountingListValueCatCode() {
		return accountingListValueCatCode;
	}

	public void setAccountingListValueCatCode(String accountingListValueCatCode) {
		this.accountingListValueCatCode = accountingListValueCatCode;
	}

	public String getAccountingListValueSubCatCode() {
		return accountingListValueSubCatCode;
	}

	public void setAccountingListValueSubCatCode(String accountingListValueSubCatCode) {
		this.accountingListValueSubCatCode = accountingListValueSubCatCode;
	}

	public String getCodeOwner() {
		return codeOwner;
	}

	public void setCodeOwner(String codeOwner) {
		this.codeOwner = codeOwner;
	}

	public String getCodeVerifier() {
		return codeVerifier;
	}

	public void setCodeVerifier(String codeVerifier) {
		this.codeVerifier = codeVerifier;
	}

	public String getCodeCompletionTeam() {
		return codeCompletionTeam;
	}

	public void setCodeCompletionTeam(String codeCompletionTeam) {
		this.codeCompletionTeam = codeCompletionTeam;
	}

	public String getEmailGroup() {
		return emailGroup;
	}

	public void setEmailGroup(String emailGroup) {
		this.emailGroup = emailGroup;
	}

	public long getRefDataId() {
		return refDataId;
	}

	public void setRefDataId(long refDataId) {
		this.refDataId = refDataId;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
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
