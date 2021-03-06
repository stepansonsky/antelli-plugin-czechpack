
package io.antelli.plugin.idnes.zpravy.response.entity;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Section {

    @SerializedName("idSection")
    private String mIdSection;
    @SerializedName("idSectionParent")
    private String mIdSectionParent;
    @SerializedName("namePublic")
    private String mNamePublic;
    @SerializedName("order")
    private Long mOrder;
    @SerializedName("views")
    private Long mViews;

    public String getIdSection() {
        return mIdSection;
    }

    public void setIdSection(String idSection) {
        mIdSection = idSection;
    }

    public String getIdSectionParent() {
        return mIdSectionParent;
    }

    public void setIdSectionParent(String idSectionParent) {
        mIdSectionParent = idSectionParent;
    }

    public String getNamePublic() {
        return mNamePublic;
    }

    public void setNamePublic(String namePublic) {
        mNamePublic = namePublic;
    }

    public Long getOrder() {
        return mOrder;
    }

    public void setOrder(Long order) {
        mOrder = order;
    }

    public Long getViews() {
        return mViews;
    }

    public void setViews(Long views) {
        mViews = views;
    }

}
