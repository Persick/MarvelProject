
package ru.dasha.marvelproject.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Item_ implements Serializable, Parcelable {

    private String resourceURI;
    private String name;
    private String role;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Item_> CREATOR = new Creator<Item_>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Item_ createFromParcel(Parcel in) {
            Item_ instance = new Item_();
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.role = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Item_[] newArray(int size) {
            return (new Item_[size]);
        }

    };
    private final static long serialVersionUID = -8257790321505684679L;

    /**
     * No args constructor for use in serialization
     */
    public Item_() {
    }

    /**
     * @param resourceURI
     * @param name
     * @param role
     */
    public Item_(String resourceURI, String name, String role) {
        super();
        this.resourceURI = resourceURI;
        this.name = name;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
        dest.writeValue(role);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
