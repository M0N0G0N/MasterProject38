package com.example.abilit_skeleton.object.association;

import android.graphics.drawable.Drawable;

import com.example.abilit_skeleton.object.tag.Tag;

import java.util.List;

public class Association {

    public int id;

    public String legal_id;

    public String name;

    public String phone_number;

    public String region;

    public int logo;

    public String desc;

    public List<Integer> images;

    public List<Tag> tags;

    public int getId() {
        return id;
    }

    public String getLegal_id() {
        return legal_id;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getRegion() {
        return region;
    }

    public int getLogo() {
        return logo;
    }

    public List<Integer> getImages() {
        return images;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public String getDesc() {return desc;}


    public Association(int id, String legal_id, String name, String phone_number, String region, int logo, String desc, List<Integer> images, List<Tag> tags) {
        this.id = id;
        this.legal_id = legal_id;
        this.name = name;
        this.phone_number = phone_number;
        this.region = region;
        this.logo = logo;
        this.desc = desc;
        this.images = images;
        this.tags = tags;
    }
}


