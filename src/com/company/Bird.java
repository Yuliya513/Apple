package com.company;

public abstract class Bird {
private String feathers;
 private int eggs;

 public Bird(String feathers, int eggs) {
  this.feathers = feathers;
  this.eggs = eggs;
 }
public abstract void fly();


 public String getFeathers() {
  return feathers;
 }

 public void setFeathers(String feathers) {
  this.feathers = feathers;
 }

 public int getEggs() {
  return eggs;
 }

 public void setEggs(int eggs) {
  this.eggs = eggs;
 }
}


