package de.telran.dao;

import de.telran.data.Post;

public class Forum {
    private Post[] posts;
    private int size;

    public Forum(int capacity) {
        posts = new Post[capacity];
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public boolean addPost(Post post){
        if (size<posts.length){
            posts[size]= post;
            size++;
            return true;
        }
        return false;
    }
    public Post[] getLastPostByAuthor(String author, int numberOfPost){
        Post[] authorPosts = new Post[numberOfPost];
        int index= 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().getUserName().equalsIgnoreCase(author)&& index<numberOfPost) {
                authorPosts[index] = posts[i];
                index++;
            }

        }
        return authorPosts;
    }
}
