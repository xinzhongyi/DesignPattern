package com.lifeccp.douhao.proxy.personalProxy;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/16
 * Time: 10:10
 * Description:
 * \
 */
public interface PersonBean {
    String getName() ;
    String getGender() ;
    String getInterests() ;
    int getHotOrNotRating() ;

    void setName(String name) ;
    void setGender(String gender) ;
    void setInterests(String interests) ;
    void setHotOrNotRating(int rating) ;
}
