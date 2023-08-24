package com.shitalmoradiya.vantage_assign.modules;

import java.util.Objects;

public class Reviews {
    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "url='" + url + '\'' +
                ", topic='" + topic + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getTopic() {
        return topic;
    }

    //equal() override here
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reviews reviews)) return false;
        return url.equals(reviews.url) && topic.equals(reviews.topic) && title.equals(reviews.title) && author.equals(reviews.author) && date.equals(reviews.date);
    }

    //hashcode method override here
    @Override
    public int hashCode() {
        return Objects.hash(url, topic, title, author, date);
    }

    //setter methods
    public void setUrl(String url) {
        this.url = url;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    //variable declaration
    private String url;
    private String topic;
    private String title;
    private String author;
    private String date;

    //reviewing class all variable here using this
    public Reviews(String url,
                  String topic,
                  String title,
                  String author,
                  String date
    ) {
        this.url = url;
        this.topic = topic;
        this.title = title;
        this.author = author;
        this.date=this.convertDate(date);
    }

    //we need to convert formate of the date here
    private String convertDate(String date) {
        String[] breakdown = date.trim().split(" ");
        String delim = "-";
        String month = "";
        switch(breakdown[1]) {
            case "February": month = "02"; break;
            case "March": month = "03"; break;
            case "April": month = "04"; break;
            case "May": month = "05"; break;
            case "June": month = "06"; break;
            case "July": month = "07"; break;
            case "August": month = "08"; break;
            case "September": month = "09"; break;
            case "October": month = "10"; break;
            case "November": month = "11"; break;
            case "December": month = "12"; break;
            default: month = "01";
        }
        return String.join(delim, breakdown[2], month, breakdown[0]);

    }


}
