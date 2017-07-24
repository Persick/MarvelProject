package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Image implements Serializable, Parcelable {

    private String path;
    private String extension;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Image> CREATOR = new Creator<Image>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Image createFromParcel(Parcel in) {
            Image instance = new Image();
            instance.path = ((String) in.readValue((String.class.getClassLoader())));
            instance.extension = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Image[] newArray(int size) {
            return (new Image[size]);
        }

    };
    private final static long serialVersionUID = -8561532738420278600L;

    /**
     * No args constructor for use in serialization
     */
    public Image() {
    }

    /**
     * @param extension
     * @param path
     */
    public Image(String path, String extension) {
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
