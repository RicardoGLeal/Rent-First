package com.example.rentingapp.Controllers;

import android.util.Log;

import com.example.rentingapp.Models.Item;
import com.example.rentingapp.Models.User;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SendCallback;

import org.json.JSONException;
import org.json.JSONObject;

public class SendPushNotification {

    /**
     * Stores all the data needed to target push notifications.
      */
    public static void configurePushNotifications() {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put("GCMSenderId", "373500207550");
        // Associate the device with a user
        installation.put("user", ParseUser.getCurrentUser());
        installation.saveInBackground();
    }

    public static void sendRentPush(Item item) {
        ParseQuery userQuery = ParseUser.getQuery();
        String objectId = item.getOwner().getObjectId();
        userQuery.whereEqualTo("objectId", objectId);

        ParseQuery pushQuery = ParseInstallation.getQuery();
        pushQuery.whereMatchesQuery("user", userQuery);

        // Send push notification to query
        ParsePush push = new ParsePush();
        push.setQuery(pushQuery); // Set our Installation query
        String originUser = ParseUser.getCurrentUser().getString(User.KEY_NAME);
        push.setMessage("Congratulations! "+originUser + " has rented your item "+item.getTitle());
        push.sendInBackground(new SendCallback() {
            @Override
            public void done(ParseException e) {
                if(e != null) {
                    Log.i("PUSH", e.getMessage());
                }
                else {
                    Log.e("PUSH", "successfull");
                }
            }
        });
    }
}
