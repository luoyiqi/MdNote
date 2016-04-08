package com.xdsjs.mdnote.model.bean;

/**
 * 作者: hzsongjinsheng on 2016-04-08 10:51
 * 邮箱: hzsongjinsheng@corp.netease.com
 */
public class Note {
    private String title;//文章标题
    private String date;//更新时间
    private String review;//内容预览
    private String image;//文章中的图像

    public Note(String title, String date, String review) {
        this.title = title;
        this.date = date;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
