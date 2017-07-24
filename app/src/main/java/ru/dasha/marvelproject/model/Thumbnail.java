package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Thumbnail implements Serializable, Parcelable {

    private String path;
    private String extension;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Thumbnail> CREATOR = new Creator<Thumbnail>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Thumbnail createFromParcel(Parcel in) {
            Thumbnail instance = new Thumbnail();
            instance.path = ((String) in.readValue((String.class.getClassLoader())));
            instance.extension = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Thumbnail[] newArray(int size) {
            return (new Thumbnail[size]);
        }

    };
    private final static long serialVersionUID = 3150020781910213253L;

    /**
     * No args constructor for use in serialization
     */
    public Thumbnail() {
    }

    /**
     * @param extension
     * @param path
     */
    public Thumbnail(String path, String extension) {
        super();
        this.path = path;
        this.extension = extension;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(path);
        dest.writeValue(extension);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}

