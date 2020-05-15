package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.AuthFailureError;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AndroidAuthenticator implements Authenticator {

    /* renamed from: a */
    private final AccountManager f7310a;

    /* renamed from: b */
    private final Account f7311b;

    /* renamed from: c */
    private final String f7312c;

    /* renamed from: d */
    private final boolean f7313d;

    public AndroidAuthenticator(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    public Account getAccount() {
        return this.f7311b;
    }

    public String getAuthToken() {
        AccountManagerFuture<Bundle> authToken = this.f7310a.getAuthToken(this.f7311b, this.f7312c, this.f7313d, null, null);
        try {
            Bundle result = authToken.getResult();
            String str = null;
            if (authToken.isDone() && !authToken.isCancelled()) {
                if (!result.containsKey("intent")) {
                    str = result.getString("authtoken");
                } else {
                    throw new AuthFailureError((Intent) result.getParcelable("intent"));
                }
            }
            if (str != null) {
                return str;
            }
            String valueOf = String.valueOf(this.f7312c);
            throw new AuthFailureError(valueOf.length() == 0 ? new String("Got null auth token for type: ") : "Got null auth token for type: ".concat(valueOf));
        } catch (Exception e) {
            throw new AuthFailureError("Error while retrieving auth token", e);
        }
    }

    public String getAuthTokenType() {
        return this.f7312c;
    }

    public void invalidateAuthToken(String str) {
        this.f7310a.invalidateAuthToken(this.f7311b.type, str);
    }

    public AndroidAuthenticator(Context context, Account account, String str, boolean z) {
        this.f7310a = AccountManager.get(context);
        this.f7311b = account;
        this.f7312c = str;
        this.f7313d = z;
    }
}
