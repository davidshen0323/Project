package com.example.demo.entity;

import java.sql.Time;

public class Acceptance {

 private int accept_id;
 private int accept_std_id;
 private int accept_hw_id;
 private int accept_score;
 private boolean accept_done;
 private Time accept_time;

 

 public int getAccept_id() {
  return accept_id;
 }

 public void setAccept_id(int accept_id) {
  this.accept_id = accept_id;
 }

 public int getAccept_std_id() {
  return accept_std_id;
 }

 public void setAccept_std_id(int accept_std_id) {
  this.accept_std_id = accept_std_id;
 }

 public int getAccept_hw_id() {
  return accept_hw_id;
 }

 public void setAccept_hw_id(int accept_hw_id) {
  this.accept_hw_id = accept_hw_id;
 }

 public Time getAccept_time() {
  return accept_time;
 }

 public void setAccept_time(Time accept_time) {
  this.accept_time = accept_time;
 }
 
 public int getAccept_score() {
  return accept_score;
 }

 public void setAccept_score(int accept_score) {
  this.accept_score = accept_score;
 }

 public boolean isAccept_done() {
  return accept_done;
 }

 public void setAccept_done(boolean accept_done) {
  this.accept_done = accept_done;
 }

}


