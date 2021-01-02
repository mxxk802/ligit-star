package com.mxxk.lightstar.entity;

import javax.persistence.*;

/**
 * Shares
 *
 * @auther zhang
 * @date 2020/6/19
 **/
@Entity
@Table(name="shares")
public class Shares {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="stock_name")
    private String stockName;

    @Column(name="stock_code")
    private String stockCode;

    @Column(name="ent_name")
    private String entName;

    @Column(name="industry")
    private String industry;

    @Column(name="stock_info")
    private String stockInfo;

    @Column(name="hold_share")
    private String holdShare;

    @Column(name="share_bonus")
    private String shareBonus;

    @Column(name="bonus_result")
    private String bonusResult;

    @Column(name="profit")
    private String profit;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getStockInfo() {
        return stockInfo;
    }

    public void setStockInfo(String stockInfo) {
        this.stockInfo = stockInfo;
    }

    public String getHoldShare() {
        return holdShare;
    }

    public void setHoldShare(String holdShare) {
        this.holdShare = holdShare;
    }

    public String getShareBonus() {
        return shareBonus;
    }

    public void setShareBonus(String shareBonus) {
        this.shareBonus = shareBonus;
    }

    public String getBonusResult() {
        return bonusResult;
    }

    public void setBonusResult(String bonusResult) {
        this.bonusResult = bonusResult;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Shares{" +
                "id=" + id +
                ", stockName='" + stockName + '\'' +
                ", stockCode='" + stockCode + '\'' +
                ", entName='" + entName + '\'' +
                ", industry='" + industry + '\'' +
                ", stockInfo='" + stockInfo + '\'' +
                ", holdShare='" + holdShare + '\'' +
                ", shareBonus='" + shareBonus + '\'' +
                ", bonusResult='" + bonusResult + '\'' +
                ", profit='" + profit + '\'' +
                '}';
    }
}
