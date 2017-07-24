package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Url implements Serializable, Parcelable {

    private String type;
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Url> CREATOR = new Creator<Url>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Url createFromParcel(Parcel in) {
            Url instance = new Url();
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Url[] newArray(int size) {
            return (new Url[size]);
        }

    };
    private final static long serialVersionUID = 5436658517542353302L;

    /**
     * No args constructor for use in serialization
     */
    public Url() {
    }

    /**
     * @param type
     * @param url
     */
    public Url(String type, String url) {
        super();
        this.type = type;
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(url);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
