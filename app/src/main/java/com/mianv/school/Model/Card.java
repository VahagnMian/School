package com.mianv.school.Model;

public class Card {

    private int imageResId;
    private String cardTitle;
    private String cardDescription;
    private int completeQuestions;
    private int allSectionQuestions;

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }


    public int getCompleteQuestions() {
        return completeQuestions;
    }

    public void setCompleteQuestions(int completeQuestions) {
        this.completeQuestions = completeQuestions;
    }

    public int getAllSectionQuestions() {
        return allSectionQuestions;
    }

    public void setAllSectionQuestions(int allSectionQuestions) {
        this.allSectionQuestions = allSectionQuestions;
    }

    public Card(int imageResId, int completeQuestions, int allSectionQuestions) {
        this.imageResId = imageResId;
        this.completeQuestions = completeQuestions;
        this.allSectionQuestions = allSectionQuestions;
    }
}
