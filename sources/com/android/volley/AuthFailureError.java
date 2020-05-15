package com.android.volley;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthFailureError extends VolleyError {

    /* renamed from: b */
    private Intent f7260b;

    public AuthFailureError() {
    }

    public String getMessage() {
        return this.f7260b == null ? super.getMessage() : "User needs to (re)enter credentials.";
    }

    public Intent getResolutionIntent() {
        return this.f7260b;
    }

    public AuthFailureError(Intent intent) {
        this.f7260b = intent;
    }

    public AuthFailureError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public AuthFailureError(String str) {
        super(str);
    }

    public AuthFailureError(String str, Exception exc) {
        super(str, exc);
    }
}
