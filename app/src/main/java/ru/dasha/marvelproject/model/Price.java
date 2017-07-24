package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Price implements Serializable, Parcelable {

    private String type;
    private String price;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Price> CREATOR = new Creator<Price>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Price createFromParcel(Parcel in) {
            Price instance = new Price();
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.price = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Price[] newArray(int size) {
            return (new Price[size]);
        }

    };
    private final static long serialVersionUID = 5389043864522622909L;

    /**
     * No args constructor for use in serialization
     */
    public Price() {
    }

    /**
     * @param price
     * @param type
     */
    public Price(String type, String price) {
        super();
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(price);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}

