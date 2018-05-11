package com.guideonline.example.android.guideonline.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ModelPoint  {

    @SerializedName("object_id")
    @Expose
    private Integer objectId;
    @SerializedName("object_table_num")
    @Expose
    private Integer objectTableNum;
    @SerializedName("object_type")
    @Expose
    private Integer objectType;
    @SerializedName("object_title")
    @Expose
    private String objectTitle;
    @SerializedName("object_adress")
    @Expose
    private String objectAdress;
    @SerializedName("object_contacts")
    @Expose
    private String objectContacts;
    @SerializedName("object_website")
    @Expose
    private String objectWebsite;
    @SerializedName("object_worktime")
    @Expose
    private String objectWorktime;
    @SerializedName("object_info")
    @Expose
    private String objectInfo;
    @SerializedName("object_transport")
    @Expose
    private String objectTransport;
    @SerializedName("object_creditcard")
    @Expose
    private Integer objectCreditcard;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getObjectTableNum() {
        return objectTableNum;
    }

    public void setObjectTableNum(Integer objectTableNum) {
        this.objectTableNum = objectTableNum;
    }

    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public String getObjectTitle() {
        return objectTitle;
    }

    public void setObjectTitle(String objectTitle) {
        this.objectTitle = objectTitle;
    }

    public String getObjectAdress() {
        return objectAdress;
    }

    public void setObjectAdress(String objectAdress) {
        this.objectAdress = objectAdress;
    }

    public String getObjectContacts() {
        return objectContacts;
    }

    public void setObjectContacts(String objectContacts) {
        this.objectContacts = objectContacts;
    }

    public String getObjectWebsite() {
        return objectWebsite;
    }

    public void setObjectWebsite(String objectWebsite) {
        this.objectWebsite = objectWebsite;
    }

    public String getObjectWorktime() {
        return objectWorktime;
    }

    public void setObjectWorktime(String objectWorktime) {
        this.objectWorktime = objectWorktime;
    }

    public String getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(String objectInfo) {
        this.objectInfo = objectInfo;
    }

    public String getObjectTransport() {
        return objectTransport;
    }

    public void setObjectTransport(String objectTransport) {
        this.objectTransport = objectTransport;
    }

    public Integer getObjectCreditcard() {
        return objectCreditcard;
    }

    public void setObjectCreditcard(Integer objectCreditcard) {
        this.objectCreditcard = objectCreditcard;
    }

}