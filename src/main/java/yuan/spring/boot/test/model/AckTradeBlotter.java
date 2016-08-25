package yuan.spring.boot.test.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yuanxin on 16/8/18.
 */
public class AckTradeBlotter {


    /**
     *
     *
     */
    private static final long serialVersionUID = 3685746878376593405L;

    private Long id;

    private String applyNo;

    private String ackOuterTransId;

    private String ackNo;

    private String taNo;

    private String customerNo;

    private String seatNo;

    private String fromBranchCode;

    private String regionCode;

    private String accptMode;

    private String investType;

    private String fundAcct;

    private String tradeAcct;

    private String bankNo;

    private String bankAcct;

    private String apKind;

    private String fundId;

    private BigDecimal subQuty;

    private BigDecimal subAmount;

    private String applyDate;

    private String applyTime;

    private BigDecimal ackQuty;

    private BigDecimal ackAmount;

    private String ackDate;

    private BigDecimal ackNav;

    private String navDate;

    private String shareType;

    private BigDecimal balance;

    private String currencyType;

    private BigDecimal discountRate;

    private String origAppNo;

    private String origAckNo;

    private String oppositeSeatNo;

    private String oppositeBranchCode;

    private String oppositeRegionCode;

    private String oppositeFundAcct;

    private String oppositeTradeAcct;

    private String oppositeFundId;

    private String oppositeShareType;

    private String finishFlag;

    private BigDecimal fee;

    private BigDecimal agencyFee;

    private BigDecimal redeemFee;

    private BigDecimal transfermFee;

    private BigDecimal tradeFee;

    private BigDecimal otherFee;

    private BigDecimal backendTotalFee;

    private BigDecimal tax;

    private BigDecimal stampDuty;

    private BigDecimal interest;

    private BigDecimal interestTax;

    private String melonMode;

    private BigDecimal dividendRate;

    private BigDecimal unitProfit;

    private String bookingDate;

    private Integer validDays;

    private String frozenCause;

    private BigDecimal frozenBalance;

    private BigDecimal frozenAmount;

    private BigDecimal unfrozenBalance;

    private String detailFlag;

    private String registerDate;

    private String taAckNo;

    private String protocolNo;

    private String profailFlag;

    private BigDecimal gainBalance;

    private String taFlag;

    private BigDecimal income;

    private BigDecimal investIncome;

    private BigDecimal investShare;

    private String retCode;

    private String retMsg;

    private BigDecimal targetFundAckQuty;

    private String transDirection;

    private BigDecimal targetFundNav;

    private String branchCode;

    private Integer bonusUnit;

    private Byte isDelete;

    private Date createdAt;

    private Date updatedAt;

    private BigDecimal changeFee;

    private BigDecimal recuperateFee;

    private BigDecimal changeAgencyFee;

    private BigDecimal recuperateAgencyFee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    public String getAckOuterTransId() {
        return ackOuterTransId;
    }

    public void setAckOuterTransId(String ackOuterTransId) {
        this.ackOuterTransId = ackOuterTransId == null ? null : ackOuterTransId.trim();
    }

    public String getAckNo() {
        return ackNo;
    }

    public void setAckNo(String ackNo) {
        this.ackNo = ackNo == null ? null : ackNo.trim();
    }

    public String getTaNo() {
        return taNo;
    }

    public void setTaNo(String taNo) {
        this.taNo = taNo == null ? null : taNo.trim();
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo == null ? null : seatNo.trim();
    }

    public String getFromBranchCode() {
        return fromBranchCode;
    }

    public void setFromBranchCode(String fromBranchCode) {
        this.fromBranchCode = fromBranchCode == null ? null : fromBranchCode.trim();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getAccptMode() {
        return accptMode;
    }

    public void setAccptMode(String accptMode) {
        this.accptMode = accptMode == null ? null : accptMode.trim();
    }

    public String getInvestType() {
        return investType;
    }

    public void setInvestType(String investType) {
        this.investType = investType == null ? null : investType.trim();
    }

    public String getFundAcct() {
        return fundAcct;
    }

    public void setFundAcct(String fundAcct) {
        this.fundAcct = fundAcct == null ? null : fundAcct.trim();
    }

    public String getTradeAcct() {
        return tradeAcct;
    }

    public void setTradeAcct(String tradeAcct) {
        this.tradeAcct = tradeAcct == null ? null : tradeAcct.trim();
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    public String getBankAcct() {
        return bankAcct;
    }

    public void setBankAcct(String bankAcct) {
        this.bankAcct = bankAcct == null ? null : bankAcct.trim();
    }

    public String getApKind() {
        return apKind;
    }

    public void setApKind(String apKind) {
        this.apKind = apKind == null ? null : apKind.trim();
    }

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    public BigDecimal getSubQuty() {
        return subQuty;
    }

    public void setSubQuty(BigDecimal subQuty) {
        this.subQuty = subQuty;
    }

    public BigDecimal getSubAmount() {
        return subAmount;
    }

    public void setSubAmount(BigDecimal subAmount) {
        this.subAmount = subAmount;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    public BigDecimal getAckQuty() {
        return ackQuty;
    }

    public void setAckQuty(BigDecimal ackQuty) {
        this.ackQuty = ackQuty;
    }

    public BigDecimal getAckAmount() {
        return ackAmount;
    }

    public void setAckAmount(BigDecimal ackAmount) {
        this.ackAmount = ackAmount;
    }

    public String getAckDate() {
        return ackDate;
    }

    public void setAckDate(String ackDate) {
        this.ackDate = ackDate == null ? null : ackDate.trim();
    }

    public BigDecimal getAckNav() {
        return ackNav;
    }

    public void setAckNav(BigDecimal ackNav) {
        this.ackNav = ackNav;
    }

    public String getNavDate() {
        return navDate;
    }

    public void setNavDate(String navDate) {
        this.navDate = navDate == null ? null : navDate.trim();
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public String getOrigAppNo() {
        return origAppNo;
    }

    public void setOrigAppNo(String origAppNo) {
        this.origAppNo = origAppNo == null ? null : origAppNo.trim();
    }

    public String getOrigAckNo() {
        return origAckNo;
    }

    public void setOrigAckNo(String origAckNo) {
        this.origAckNo = origAckNo == null ? null : origAckNo.trim();
    }

    public String getOppositeSeatNo() {
        return oppositeSeatNo;
    }

    public void setOppositeSeatNo(String oppositeSeatNo) {
        this.oppositeSeatNo = oppositeSeatNo == null ? null : oppositeSeatNo.trim();
    }

    public String getOppositeBranchCode() {
        return oppositeBranchCode;
    }

    public void setOppositeBranchCode(String oppositeBranchCode) {
        this.oppositeBranchCode = oppositeBranchCode == null ? null : oppositeBranchCode.trim();
    }

    public String getOppositeRegionCode() {
        return oppositeRegionCode;
    }

    public void setOppositeRegionCode(String oppositeRegionCode) {
        this.oppositeRegionCode = oppositeRegionCode == null ? null : oppositeRegionCode.trim();
    }

    public String getOppositeFundAcct() {
        return oppositeFundAcct;
    }

    public void setOppositeFundAcct(String oppositeFundAcct) {
        this.oppositeFundAcct = oppositeFundAcct == null ? null : oppositeFundAcct.trim();
    }

    public String getOppositeTradeAcct() {
        return oppositeTradeAcct;
    }

    public void setOppositeTradeAcct(String oppositeTradeAcct) {
        this.oppositeTradeAcct = oppositeTradeAcct == null ? null : oppositeTradeAcct.trim();
    }

    public String getOppositeFundId() {
        return oppositeFundId;
    }

    public void setOppositeFundId(String oppositeFundId) {
        this.oppositeFundId = oppositeFundId == null ? null : oppositeFundId.trim();
    }

    public String getOppositeShareType() {
        return oppositeShareType;
    }

    public void setOppositeShareType(String oppositeShareType) {
        this.oppositeShareType = oppositeShareType == null ? null : oppositeShareType.trim();
    }

    public String getFinishFlag() {
        return finishFlag;
    }

    public void setFinishFlag(String finishFlag) {
        this.finishFlag = finishFlag == null ? null : finishFlag.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getAgencyFee() {
        return agencyFee;
    }

    public void setAgencyFee(BigDecimal agencyFee) {
        this.agencyFee = agencyFee;
    }

    public BigDecimal getRedeemFee() {
        return redeemFee;
    }

    public void setRedeemFee(BigDecimal redeemFee) {
        this.redeemFee = redeemFee;
    }

    public BigDecimal getTransfermFee() {
        return transfermFee;
    }

    public void setTransfermFee(BigDecimal transfermFee) {
        this.transfermFee = transfermFee;
    }

    public BigDecimal getTradeFee() {
        return tradeFee;
    }

    public void setTradeFee(BigDecimal tradeFee) {
        this.tradeFee = tradeFee;
    }

    public BigDecimal getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(BigDecimal otherFee) {
        this.otherFee = otherFee;
    }

    public BigDecimal getBackendTotalFee() {
        return backendTotalFee;
    }

    public void setBackendTotalFee(BigDecimal backendTotalFee) {
        this.backendTotalFee = backendTotalFee;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getStampDuty() {
        return stampDuty;
    }

    public void setStampDuty(BigDecimal stampDuty) {
        this.stampDuty = stampDuty;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getInterestTax() {
        return interestTax;
    }

    public void setInterestTax(BigDecimal interestTax) {
        this.interestTax = interestTax;
    }

    public String getMelonMode() {
        return melonMode;
    }

    public void setMelonMode(String melonMode) {
        this.melonMode = melonMode == null ? null : melonMode.trim();
    }

    public BigDecimal getDividendRate() {
        return dividendRate;
    }

    public void setDividendRate(BigDecimal dividendRate) {
        this.dividendRate = dividendRate;
    }

    public BigDecimal getUnitProfit() {
        return unitProfit;
    }

    public void setUnitProfit(BigDecimal unitProfit) {
        this.unitProfit = unitProfit;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate == null ? null : bookingDate.trim();
    }

    public Integer getValidDays() {
        return validDays;
    }

    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    public String getFrozenCause() {
        return frozenCause;
    }

    public void setFrozenCause(String frozenCause) {
        this.frozenCause = frozenCause == null ? null : frozenCause.trim();
    }

    public BigDecimal getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(BigDecimal frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public BigDecimal getUnfrozenBalance() {
        return unfrozenBalance;
    }

    public void setUnfrozenBalance(BigDecimal unfrozenBalance) {
        this.unfrozenBalance = unfrozenBalance;
    }

    public String getDetailFlag() {
        return detailFlag;
    }

    public void setDetailFlag(String detailFlag) {
        this.detailFlag = detailFlag == null ? null : detailFlag.trim();
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate == null ? null : registerDate.trim();
    }

    public String getTaAckNo() {
        return taAckNo;
    }

    public void setTaAckNo(String taAckNo) {
        this.taAckNo = taAckNo == null ? null : taAckNo.trim();
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo == null ? null : protocolNo.trim();
    }

    public String getProfailFlag() {
        return profailFlag;
    }

    public void setProfailFlag(String profailFlag) {
        this.profailFlag = profailFlag == null ? null : profailFlag.trim();
    }

    public BigDecimal getGainBalance() {
        return gainBalance;
    }

    public void setGainBalance(BigDecimal gainBalance) {
        this.gainBalance = gainBalance;
    }

    public String getTaFlag() {
        return taFlag;
    }

    public void setTaFlag(String taFlag) {
        this.taFlag = taFlag == null ? null : taFlag.trim();
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getInvestIncome() {
        return investIncome;
    }

    public void setInvestIncome(BigDecimal investIncome) {
        this.investIncome = investIncome;
    }

    public BigDecimal getInvestShare() {
        return investShare;
    }

    public void setInvestShare(BigDecimal investShare) {
        this.investShare = investShare;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode == null ? null : retCode.trim();
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg == null ? null : retMsg.trim();
    }

    public BigDecimal getTargetFundAckQuty() {
        return targetFundAckQuty;
    }

    public void setTargetFundAckQuty(BigDecimal targetFundAckQuty) {
        this.targetFundAckQuty = targetFundAckQuty;
    }

    public String getTransDirection() {
        return transDirection;
    }

    public void setTransDirection(String transDirection) {
        this.transDirection = transDirection == null ? null : transDirection.trim();
    }

    public BigDecimal getTargetFundNav() {
        return targetFundNav;
    }

    public void setTargetFundNav(BigDecimal targetFundNav) {
        this.targetFundNav = targetFundNav;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode == null ? null : branchCode.trim();
    }

    public Integer getBonusUnit() {
        return bonusUnit;
    }

    public void setBonusUnit(Integer bonusUnit) {
        this.bonusUnit = bonusUnit;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;

    }

    public BigDecimal getChangeFee() {
        return changeFee;
    }

    public void setChangeFee(BigDecimal changeFee) {
        this.changeFee = changeFee;
    }

    public BigDecimal getRecuperateFee() {
        return recuperateFee;
    }

    public void setRecuperateFee(BigDecimal recuperateFee) {
        this.recuperateFee = recuperateFee;
    }

    public BigDecimal getChangeAgencyFee() {
        return changeAgencyFee;
    }

    public void setChangeAgencyFee(BigDecimal changeAgencyFee) {
        this.changeAgencyFee = changeAgencyFee;
    }

    public BigDecimal getRecuperateAgencyFee() {
        return recuperateAgencyFee;
    }

    public void setRecuperateAgencyFee(BigDecimal recuperateAgencyFee) {
        this.recuperateAgencyFee = recuperateAgencyFee;
    }

}
