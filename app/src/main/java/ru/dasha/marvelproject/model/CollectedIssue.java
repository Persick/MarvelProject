package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class CollectedIssue implements Serializable, Parcelable {

    private String resourceURI;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<CollectedIssue> CREATOR = new Creator<CollectedIssue>() {


        @SuppressWarnings({
                "unchecked"
        })
        public CollectedIssue createFromParcel(Parcel in) {
            CollectedIssue instance = new CollectedIssue();
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public CollectedIssue[] newArray(int size) {
            return (new CollectedIssue[size]);
        }

    };
    private final static long serialVersionUID = 762688387802872593L;

    /**
     * No args constructor for use in serialization
     */
    public CollectedIssue() {
    }

    /**
     * @param resourceURI
     * @param name
     */
    public CollectedIssue(String resourceURI, String name) {
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
