package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Date implements Serializable, Parcelable {

    private String type;
    private String date;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Date> CREATOR = new Creator<Date>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Date createFromParcel(Parcel in) {
            Date instance = new Date();
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.date = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Date[] newArray(int size) {
            return (new Date[size]);
        }

    };
    private final static long serialVersionUID = 3780423108203789926L;

    /**
     * No args constructor for use in serialization
     */
    public Date() {
    }

    /**
     * @param date
     * @param type
     */
    public Date(String type, String date) {
        super();
        this.type = type;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(date);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
