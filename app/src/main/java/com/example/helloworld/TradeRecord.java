package com.example.helloworld;

public class TradeRecord {
    private int userImage;
    private String userName;
    private String recordType;
    private String moneyCount;

    public TradeRecord(int userImage, String userName, String recordType, String moneyCount) {
        this.userImage = userImage;
        this.userName = userName;
        this.recordType = recordType;
        this.moneyCount = moneyCount;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getMoneyCount() {
        return moneyCount;
    }

    public void setMoneyCount(String moneyCount) {
        this.moneyCount = moneyCount;
    }

    @Override
    public String toString() {
        return "TradeRecord{" +
                "userImage=" + userImage +
                ", userName='" + userName + '\'' +
                ", recordType='" + recordType + '\'' +
                ", moneyCount='" + moneyCount + '\'' +
                '}';
    }
}
