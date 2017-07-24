package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Variant implements Serializable, Parcelable {

    private String resourceURI;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Variant> CREATOR = new Creator<Variant>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Variant createFromParcel(Parcel in) {
            Variant instance = new Variant();
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Variant[] newArray(int size) {
            return (new Variant[size]);
        }

    };
    private final static long serialVersionUID = 6085027221868224782L;

    /**
     * No args constructor for use in serialization
     */
    public Variant() {
    }

    /**
     * @param resourceURI
     * @param name
     */
    public Variant(String resourceURI, String name) {
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

