package com.Product1.Project2.Entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.BinaryOperator;

@Entity
@Table(name = "ProductParent")
public class Parent implements Serializable
{
    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String appName;
    private String  url;
    @Lob
    private byte [] image;

    @OneToMany(mappedBy = "parent" , fetch = FetchType.LAZY)
    private HashSet<Child> children = new HashSet<>();


    public Parent() {
    }

    public String getAppName() {
        return appName;
    }

    public String getUrl() {
        return url;
    }

    public byte[] getImage() {
        return image;
    }

    public HashSet<Child> getChildren() {
        return children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setChildren(HashSet<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", appName='" + appName + '\'' +
                ", url='" + url + '\'' +
                ", image=" + Arrays.toString(image) +
                ", children=" + children +
                '}';
    }
}
