package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Events implements Serializable, Parcelable {

    private String available;
    private String returned;
    private String collectionURI;
    private List<Item___> items = new ArrayList<Item___>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Events> CREATOR = new Creator<Events>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Events createFromParcel(Parcel in) {
            Events instance = new Events();
            instance.available = ((String) in.readValue((String.class.getClassLoader())));
            instance.returned = ((String) in.readValue((String.class.getClassLoader())));
            instance.collectionURI = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.items, (Item___.class.getClassLoader()));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Events[] newArray(int size) {
            return (new Events[size]);
        }

    };
    private final static long serialVersionUID = -7387092279386209306L;

    /**
     * No args constructor for use in serialization
     */
    public Events() {
    }

    /**
     * @param items
     * @param collectionURI
     * @param available
     * @param returned
     */
    public Events(String available, String returned, String collectionURI, List<Item___> items) {
        super();
        this.available = available;
        this.returned = returned;
        this.collectionURI = collectionURI;
        this.items = items;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public List<Item___> getItems() {
        return items;
    }

    public void setItems(List<Item___> items) {
        this.items = items;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(available);
        dest.writeValue(returned);
        dest.writeValue(collectionURI);
        dest.writeList(items);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
