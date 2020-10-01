package de.telran.data;

public class Post {
    private User author;
    private int postID;
    private static int totalPosts= 0;
    private String title;
    private String content;
    private int likes = 0;
    private int disLikes = 0;

    public Post(User author, int postID, String title, String content) {
        this.author = author;
        this.postID = ++ totalPosts;
        this.title = title;
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public int getPostID() {
        return postID;
    }

    public static int getTotalPosts() {
        return totalPosts;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public int getDisLikes() {
        return disLikes;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post ID" + postID +
                "posted by" + author +
                ", " + title.toUpperCase() +
                "\n" + content + '\'' +
                "\nlikes: " + likes +
                ", disLikes: " + disLikes;
    }
    public int addLike(){
        return likes++;
    }
    public int addDisLike(){
        return disLikes;
    }
}
