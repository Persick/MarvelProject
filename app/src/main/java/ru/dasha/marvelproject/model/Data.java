package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Serializable, Parcelable {

    private String offset;
    private String limit;
    private String total;
    private String count;
    private List<Result> results = new ArrayList<Result>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Data> CREATOR = new Creator<Data>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Data createFromParcel(Parcel in) {
            Data instance = new Data();
            instance.offset = ((String) in.readValue((String.class.getClassLoader())));
            instance.limit = ((String) in.readValue((String.class.getClassLoader())));
            instance.total = ((String) in.readValue((String.class.getClassLoader())));
            instance.count = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.results, (Result.class.getClassLoader()));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    };
    private final static long serialVersionUID = 7671592002180717553L;

    /**
     * No args constructor for use in serialization
     */
    public Data() {
    }

    /**
     * @param total
     * @param limit
     * @param results
     * @param count
     * @param offset
     */
    public Data(String offset, String limit, String total, String count, List<Result> results) {
        super();
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(offset);
        dest.writeValue(limit);
        dest.writeValue(total);
        dest.writeValue(count);
        dest.writeList(results);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}