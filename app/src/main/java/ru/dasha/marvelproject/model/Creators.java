
package ru.dasha.marvelproject.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Creators implements Serializable, Parcelable {

    private String available;
    private String returned;
    private String collectionURI;
    private List<Item> items = new ArrayList<Item>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Creators> CREATOR = new Creator<Creators>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Creators createFromParcel(Parcel in) {
            Creators instance = new Creators();
            instance.available = ((String) in.readValue((String.class.getClassLoader())));
            instance.returned = ((String) in.readValue((String.class.getClassLoader())));
            instance.collectionURI = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.items, (Item.class.getClassLoader()));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Creators[] newArray(int size) {
            return (new Creators[size]);
        }

    };
    private final static long serialVersionUID = -4477599300883037625L;

    /**
     * No args constructor for use in serialization
     */
    public Creators() {
    }

    /**
     * @param items
     * @param collectionURI
     * @param available
     * @param returned
     */
    public Creators(String available, String returned, String collectionURI, List<Item> items) {
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
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
