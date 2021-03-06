
package net.chenxiy.bilimusic.network.biliapi.pojo.av;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Subtitle {

    @SerializedName("allow_submit")
    @Expose
    private Boolean allowSubmit;
    @SerializedName("list")
    @Expose
    private List<Object> list = null;

    public Boolean getAllowSubmit() {
        return allowSubmit;
    }

    public void setAllowSubmit(Boolean allowSubmit) {
        this.allowSubmit = allowSubmit;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

}
