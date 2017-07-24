
package ru.dasha.marvelproject.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Item___ implements Serializable, Parcelable {

    private String resourceURI;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Item___> CREATOR = new Creator<Item___>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Item___ createFromParcel(Parcel in) {
            Item___ instance = new Item___();
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Item___[] newArray(int size) {
            return (new Item___[size]);
        }

    };
    private final static long serialVersionUID = 4304506597021169913L;

    /**
     * No args constructor for use in serialization
     */
    public Item___() {
    }

    /**
     * @param resourceURI
     * @param name
     */
    public Item___(String resourceURI, String name) {
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
