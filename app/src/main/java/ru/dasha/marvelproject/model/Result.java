package ru.dasha.marvelproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class Result implements Serializable, Parcelable {

    private String id;
    private String digitalId;
    private String title;
    private String issueNumber;
    private String variantDescription;
    private String description;
    private String modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private String pageCount;
    private List<TextObject> textObjects = new ArrayList<TextObject>();
    private String resourceURI;
    private List<Url> urls = new ArrayList<Url>();
    private Series series;
    private List<Variant> variants = new ArrayList<Variant>();
    private List<Collection> collections = new ArrayList<Collection>();
    private List<CollectedIssue> collectedIssues = new ArrayList<CollectedIssue>();
    private List<Date> dates = new ArrayList<Date>();
    private List<Price> prices = new ArrayList<Price>();
    private Thumbnail thumbnail;
    private List<Image> images = new ArrayList<Image>();
    private Creators creators;
    private Characters characters;
    private Stories stories;
    private Events events;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Result createFromParcel(Parcel in) {
            Result instance = new Result();
            instance.id = ((String) in.readValue((String.class.getClassLoader())));
            instance.digitalId = ((String) in.readValue((String.class.getClassLoader())));
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.issueNumber = ((String) in.readValue((String.class.getClassLoader())));
            instance.variantDescription = ((String) in.readValue((String.class.getClassLoader())));
            instance.description = ((String) in.readValue((String.class.getClassLoader())));
            instance.modified = ((String) in.readValue((String.class.getClassLoader())));
            instance.isbn = ((String) in.readValue((String.class.getClassLoader())));
            instance.upc = ((String) in.readValue((String.class.getClassLoader())));
            instance.diamondCode = ((String) in.readValue((String.class.getClassLoader())));
            instance.ean = ((String) in.readValue((String.class.getClassLoader())));
            instance.issn = ((String) in.readValue((String.class.getClassLoader())));
            instance.format = ((String) in.readValue((String.class.getClassLoader())));
            instance.pageCount = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.textObjects, (TextObject.class.getClassLoader()));
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.urls, (Url.class.getClassLoader()));
            instance.series = ((Series) in.readValue((Series.class.getClassLoader())));
            in.readList(instance.variants, (Variant.class.getClassLoader()));
            in.readList(instance.collections, (Collection.class.getClassLoader()));
            in.readList(instance.collectedIssues, (CollectedIssue.class.getClassLoader()));
            in.readList(instance.dates, (Date.class.getClassLoader()));
            in.readList(instance.prices, (Price.class.getClassLoader()));
            instance.thumbnail = ((Thumbnail) in.readValue((Thumbnail.class.getClassLoader())));
            in.readList(instance.images, (Image.class.getClassLoader()));
            instance.creators = ((Creators) in.readValue((Creators.class.getClassLoader())));
            instance.characters = ((Characters) in.readValue((Characters.class.getClassLoader())));
            instance.stories = ((Stories) in.readValue((Stories.class.getClassLoader())));
            instance.events = ((Events) in.readValue((Events.class.getClassLoader())));
            instance.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
            return instance;
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    };
    private final static long serialVersionUID = 5037685543408972530L;

    /**
     * No args constructor for use in serialization
     */
    public Result() {
    }

    /**
     * @param series
     * @param issn
     * @param events
     * @param id
     * @param title
     * @param dates
     * @param description
     * @param isbn
     * @param variants
     * @param digitalId
     * @param collections
     * @param pageCount
     * @param textObjects
     * @param urls
     * @param format
     * @param upc
     * @param modified
     * @param variantDescription
     * @param creators
     * @param ean
     * @param issueNumber
     * @param stories
     * @param thumbnail
     * @param resourceURI
     * @param images
     * @param collectedIssues
     * @param prices
     * @param characters
     * @param diamondCode
     */
    public Result(String id, String digitalId, String title, String issueNumber, String variantDescription, String description, String modified, String isbn, String upc, String diamondCode, String ean, String issn, String format, String pageCount, List<TextObject> textObjects, String resourceURI, List<Url> urls, Series series, List<Variant> variants, List<Collection> collections, List<CollectedIssue> collectedIssues, List<Date> dates, List<Price> prices, Thumbnail thumbnail, List<Image> images, Creators creators, Characters characters, Stories stories, Events events) {
        super();
        this.id = id;
        this.digitalId = digitalId;
        this.title = title;
        this.issueNumber = issueNumber;
        this.variantDescription = variantDescription;
        this.description = description;
        this.modified = modified;
        this.isbn = isbn;
        this.upc = upc;
        this.diamondCode = diamondCode;
        this.ean = ean;
        this.issn = issn;
        this.format = format;
        this.pageCount = pageCount;
        this.textObjects = textObjects;
        this.resourceURI = resourceURI;
        this.urls = urls;
        this.series = series;
        this.variants = variants;
        this.collections = collections;
        this.collectedIssues = collectedIssues;
        this.dates = dates;
        this.prices = prices;
        this.thumbnail = thumbnail;
        this.images = images;
        this.creators = creators;
        this.characters = characters;
        this.stories = stories;
        this.events = events;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDigitalId() {
        return digitalId;
    }

    public void setDigitalId(String digitalId) {
        this.digitalId = digitalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public List<TextObject> getTextObjects() {
        return textObjects;
    }

    public void setTextObjects(List<TextObject> textObjects) {
        this.textObjects = textObjects;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public List<CollectedIssue> getCollectedIssues() {
        return collectedIssues;
    }

    public void setCollectedIssues(List<CollectedIssue> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Creators getCreators() {
        return creators;
    }

    public void setCreators(Creators creators) {
        this.creators = creators;
    }

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    public Stories getStories() {
        return stories;
    }

    public void setStories(Stories stories) {
        this.stories = stories;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(digitalId);
        dest.writeValue(title);
        dest.writeValue(issueNumber);
        dest.writeValue(variantDescription);
        dest.writeValue(description);
        dest.writeValue(modified);
        dest.writeValue(isbn);
        dest.writeValue(upc);
        dest.writeValue(diamondCode);
        dest.writeValue(ean);
        dest.writeValue(issn);
        dest.writeValue(format);
        dest.writeValue(pageCount);
        dest.writeList(textObjects);
        dest.writeValue(resourceURI);
        dest.writeList(urls);
        dest.writeValue(series);
        dest.writeList(variants);
        dest.writeList(collections);
        dest.writeList(collectedIssues);
        dest.writeList(dates);
        dest.writeList(prices);
        dest.writeValue(thumbnail);
        dest.writeList(images);
        dest.writeValue(creators);
        dest.writeValue(characters);
        dest.writeValue(stories);
        dest.writeValue(events);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
