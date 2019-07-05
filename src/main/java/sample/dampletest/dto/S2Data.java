package sample.dampletest.dto;

public class S2Data {
	
	private String jobNo = null;
	
	private String accNo;
	private String policyNo;
	private String IssueDate;
	private String closeDate;
	private String effectiveDate;
	private String updateDate;
	private String productCode;
	private String producerCodeId;
	private int pcLoadFlag;
	
	public String getJobNo() {
		return jobNo;
	}
	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getIssueDate() {
		return IssueDate;
	}
	public void setIssueDate(String issueDate) {
		IssueDate = issueDate;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProducerCodeId() {
		return producerCodeId;
	}
	public void setProducerCodeId(String producerCodeId) {
		this.producerCodeId = producerCodeId;
	}
	public int getPcLoadFlag() {
		return pcLoadFlag;
	}
	public void setPcLoadFlag(int pcLoadFlag) {
		this.pcLoadFlag = pcLoadFlag;
	}
	
}
