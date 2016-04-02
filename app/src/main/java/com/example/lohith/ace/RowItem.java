package com.example.lohith.ace;

public class RowItem {
    private int imageId;
    private int len;
    private int imageId2;
    private int imageId3;
    private int imageId4;
    private int imageId5;

    public RowItem(int imageId,int imageId2,int imageId3,int imageId4,int imageId5,int n ) {
        this.imageId = imageId;
        this.imageId2 = imageId2;
        this.imageId3 = imageId3;
        this.imageId4 = imageId4;
        this.imageId5 = imageId5;
        this.len=n;

    }

    public int getLen(){
        return len;
    }
    public int getImageId() {
        return imageId;
    }
    public int getImageId2() {
        return imageId2;
    }
    public int getImageId3() {
        return imageId3;
    }
    public int getImageId4() {
        return imageId4;
    }
    public int getImageId5() {
        return imageId5;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


}
