package com.chaiyakornkhunthong.pilotassistant_android;

import com.google.firebase.auth.FirebaseAuth;

public class valu {
    private FirebaseAuth Auth = FirebaseAuth.getInstance();

    public FirebaseAuth getAuth() {
        return Auth;
    }

    public void setAuth(FirebaseAuth auth) {
        Auth = auth;
    }
}
