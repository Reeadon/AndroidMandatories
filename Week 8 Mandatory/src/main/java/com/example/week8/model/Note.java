package com.example.week8.model;

public class Note {
   public String headline;
   public String body;

   public Note (String headline, String body) {
      this.headline = headline;
      this.body = body;
   }

   public String getHeadline() {
      return headline;
   }

   public void setHeadline() {
      this.headline = headline;
   }

   public String getBody() {
      return body;
   }

   public void setBody() {
      this.body = body;
   }
}
