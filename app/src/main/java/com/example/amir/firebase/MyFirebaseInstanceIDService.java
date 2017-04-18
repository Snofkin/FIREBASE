package com.example.amir.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Amir on 4/17/2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService{
    private static final String TAG = "MyFirebaseInsIDService";

    @Override
    public void onTokenRefresh() {
        //get updated token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"New Token:" +refreshedToken);

    }
}
