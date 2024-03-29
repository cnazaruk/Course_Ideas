package com.teamtreehouse.courses.model;

import java.util.Objects;

public class CourseIdea {
    private String title;
    private String creator;

    public CourseIdea(String title, String creator) {
        this.title = title;
        this.creator = creator; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CourseIdea that = (CourseIdea) o;
            return Objects.equals(title, that.title) &&
                    Objects.equals(creator, that.creator);
        }

        @Override
        public int hashCode() {

        return Objects.hash(title, creator);
    }




    }

