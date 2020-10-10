package com.TutorialsPoint.UserProfile.DAO;

import com.TutorialsPoint.UserProfile.model.UserProfile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
   private static Map<Long,UserProfile> messages = new HashMap<Long,UserProfile>();
   public static Map<Long,UserProfile> getUsers() {
      return messages; 
      // Each time this method will return entire map as an instance of database
   }
}