package com.google.android.gms.auth;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserRecoverableAuthException extends gid {

    /* renamed from: a */
    private final Intent f9950a;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.f9950a = intent;
    }

    /* renamed from: a */
    public final Intent mo7366a() {
        Intent intent = this.f9950a;
        if (intent != null) {
            return new Intent(intent);
        }
        return null;
    }
}
