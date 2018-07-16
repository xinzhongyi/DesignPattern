package com.lifeccp.douhao.proxy.personalProxy;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/16
 * Time: 10:12
 * Description:
 * \
 */
public class PersonalImpl implements PersonBean {
    private String name ;
    private String gender ;
    private String interests ;
    private int rating ;
    private int ratingCount = 0 ;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0) return  0 ;
        return (rating/ratingCount);
    }

    @Override
    public void setName(String name) {
        this.name = name ;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender ;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests ;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating ;
        ratingCount ++ ;
    }
}
