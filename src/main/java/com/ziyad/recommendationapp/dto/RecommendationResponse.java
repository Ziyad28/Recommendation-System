package com.ziyad.recommendationapp.dto;

public class RecommendationResponse {
    private String recommendation;
    private String pros;
    private String cons;

    public RecommendationResponse() {}

    public RecommendationResponse(String recommendation, String pros, String cons) {
        this.recommendation = recommendation;
        this.pros = pros;
        this.cons = cons;
    }

    public String getRecommendation() { return recommendation; }
    public void setRecommendation(String recommendation) { this.recommendation = recommendation; }

    public String getPros() { return pros; }
    public void setPros(String pros) { this.pros = pros; }

    public String getCons() { return cons; }
    public void setCons(String cons) { this.cons = cons; }
}