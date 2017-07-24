package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Series implements Serializable, Parcelable {

    private String resourceURI;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Series> CREATOR = new Creator<Series>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Series createFromParcel(Parcel in) {
            Series instance = new Series();
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Series[] newArray(int size) {
            return (new Series[size]);
        }

    };
    private final static long serialVersionUID = -3706744418898790864L;

    /**
     * No args constructor for use in serialization
     */
    public Series() {
    }

    /**
     * @param resourceURI
     * @param name
     */
    public Series(String resourceURI, String name) {
        super();
        this.resourceURI = resourceURI;
        this.name = name;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(resourceURI);
        dest.writeValue(name);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
