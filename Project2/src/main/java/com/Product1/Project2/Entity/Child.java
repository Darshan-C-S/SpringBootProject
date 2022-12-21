package com.Product1.Project2.Entity;

import org.hibernate.ScrollableResults;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "ProductChild")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String appName;
    private String  url;
    @Lob
    private byte [] image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id" , nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Parent parent;

    public Child() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }


    // Getter and setter for parent
    public Long getParentId(){
        return parent.getId();
    }
    public String getParentName(){
        return parent.getAppName();
    }
    public String getParentUrl(){
        return parent.getUrl();
    }
    public byte[] getParentImage(){
        return parent.getImage();
    }
    public Parent getParent(){
        return parent;
    }
    public void setParent(){
        this.parent = parent;
    }

}
