
package ru.dasha.marvelproject.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Item__ implements Serializable, Parcelable {

    private String resourceURI;
    private String name;
    private String type;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Item__> CREATOR = new Creator<Item__>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Item__ createFromParcel(Parcel in) {
            Item__ instance = new Item__();
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Item__[] newArray(int size) {
            return (new Item__[size]);
        }

    };
    private final static long serialVersionUID = -8789819067111042772L;

    /**
     * No args constructor for use in serialization
     */
    public Item__() {
    }

    /**
     * @param resourceURI
     * @param name
     * @param type
     */
    public Item__(String resourceURI, String name, String type) {
        super();
        this.resourceURI = resourceURI;
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        dest.writeValue(type);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
