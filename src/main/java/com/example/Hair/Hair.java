package com.example.Hair;

public class Hair {
    private Integer id;
    private String name;
    // private Double price;
    // private String description;
    // private String photo;
    private String style;
    private Integer phone;
    private String email;

    public Hair(Integer id, String name, String style, Integer phone, String email){
        this.id=id;
        this.name=name;
        // this.price=price;
        // this.description=description;
        // this.photo=photo;
        this.style=style;
        this.phone=phone;
        this.email=email;

    }

    public void setId(Integer id){
        this.id=id;
    }

    public Integer getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setStyle(String style){
        this.style=style;
    }
    
    public String getStyle(){
        return style;
    }

    public void setPhone(Integer phone){
        this.phone=phone;
    }

    public Integer getPhone(){
        return phone;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }
    // public void setPrice(Double price){
    //     this.price=price;
    // }

    // public Double getPrice(){
    //     return price;
    // } 

    // public void setDescription(String description){
    //     this.description=description;
    // }

    // public String getDescription(){
    //     return description;
    // }

    // public void setPhoto(String photo){
    //     this.photo=photo;
    // }
    // public String getPhoto(){
    //     return photo;
    // }
}
