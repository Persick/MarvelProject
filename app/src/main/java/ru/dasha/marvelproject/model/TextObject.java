package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class TextObject implements Serializable, Parcelable {

    private String type;
    private String language;
    private String text;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<TextObject> CREATOR = new Creator<TextObject>() {


        @SuppressWarnings({
                "unchecked"
        })
        public TextObject createFromParcel(Parcel in) {
            TextObject instance = new TextObject();
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.language = ((String) in.readValue((String.class.getClassLoader())));
            instance.text = ((String) in.readValue((String.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public TextObject[] newArray(int size) {
            return (new TextObject[size]);
        }

    };
    private final static long serialVersionUID = 2611988268254074677L;

    /**
     * No args constructor for use in serialization
     */
    public TextObject() {
    }

    /**
     * @param text
     * @param language
     * @param type
     */
    public TextObject(String type, String language, String text) {
        super();
        this.type = type;
        this.language = language;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(language);
        dest.writeValue(text);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}

