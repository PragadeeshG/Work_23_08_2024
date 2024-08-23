package com.test1;

public class HedgeAccountingListValueCategory {
	private String accountingListValueCatCode;
	private String accouningListValueCatName;
	private String accountingListValueCatDescription;
	private String accountingListvalueCatDefinition;
	private long authorizerId;
	private String owner;
	private String psIds;
	private long serviceNameId;
	private String creationDate;
	private String modifiedDate;

	public HedgeAccountingListValueCategory() {

	}

	public HedgeAccountingListValueCategory(String accountingListValueCatCode, String accouningListValueCatName,
			String accountingListValueCatDescription, String accountingListvalueCatDefinition, long authorizerId,
			String owner, String psIds, long serviceNameId, String creationDate, String modifiedDate) {
		super();
		this.accountingListValueCatCode = accountingListValueCatCode;
		this.accouningListValueCatName = accouningListValueCatName;
		this.accountingListValueCatDescription = accountingListValueCatDescription;
		this.accountingListvalueCatDefinition = accountingListvalueCatDefinition;
		this.authorizerId = authorizerId;
		this.owner = owner;
		this.psIds = psIds;
		this.serviceNameId = serviceNameId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getAccountingListValueCatCode() {
		return accountingListValueCatCode;
	}

	public void setAccountingListValueCatCode(String accountingListValueCatCode) {
		this.accountingListValueCatCode = accountingListValueCatCode;
	}

	public String getAccouningListValueCatName() {
		return accouningListValueCatName;
	}

	public void setAccouningListValueCatName(String accouningListValueCatName) {
		this.accouningListValueCatName = accouningListValueCatName;
	}

	public String getAccountingListValueCatDescription() {
		return accountingListValueCatDescription;
	}

	public void setAccountingListValueCatDescription(String accountingListValueCatDescription) {
		this.accountingListValueCatDescription = accountingListValueCatDescription;
	}

	public String getAccountingListvalueCatDefinition() {
		return accountingListvalueCatDefinition;
	}

	public void setAccountingListvalueCatDefinition(String accountingListvalueCatDefinition) {
		this.accountingListvalueCatDefinition = accountingListvalueCatDefinition;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPsIds() {
		return psIds;
	}

	public void setPsIds(String psIds) {
		this.psIds = psIds;
	}

	public long getServiceNameId() {
		return serviceNameId;
	}

	public void setServiceNameId(long serviceNameId) {
		this.serviceNameId = serviceNameId;
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

}
