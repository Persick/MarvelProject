package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class ResponseModel implements Serializable, Parcelable {

    private String code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private Data data;
    private String etag;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<ResponseModel> CREATOR = new Creator<ResponseModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ResponseModel createFromParcel(Parcel in) {
            ResponseModel instance = new ResponseModel();
            instance.code = ((String) in.readValue((String.class.getClassLoader())));
            instance.status = ((String) in.readValue((String.class.getClassLoader())));
            instance.copyright = ((String) in.readValue((String.class.getClassLoader())));
            instance.attributionText = ((String) in.readValue((String.class.getClassLoader())));
            instance.attributionHTML = ((String) in.readValue((String.class.getClassLoader())));
            instance.data = ((Data) in.readValue((Data.class.getClassLoader())));
            instance.etag = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public ResponseModel[] newArray(int size) {
            return (new ResponseModel[size]);
        }

    };
    private final static long serialVersionUID = -7424860792391575592L;

    /**
     * No args constructor for use in serialization
     */
    public ResponseModel() {
    }

    /**
     * @param attributionText
     * @param etag
     * @param status
     * @param data
     * @param copyright
     * @param code
     * @param attributionHTML
     */
    public ResponseModel(String code, String status, String copyright, String attributionText, String attributionHTML, Data data, String etag) {
        super();
        this.code = code;
        this.status = status;
        this.copyright = copyright;
        this.attributionText = attributionText;
        this.attributionHTML = attributionHTML;
        this.data = data;
        this.etag = etag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(code);
        dest.writeValue(status);
        dest.writeValue(copyright);
        dest.writeValue(attributionText);
        dest.writeValue(attributionHTML);
        dest.writeValue(data);
        dest.writeValue(etag);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
