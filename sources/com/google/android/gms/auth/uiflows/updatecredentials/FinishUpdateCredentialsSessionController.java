package com.google.android.gms.auth.uiflows.updatecredentials;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FinishUpdateCredentialsSessionController implements Controller {
    public static final Parcelable.Creator CREATOR = new kam();

    /* renamed from: a */
    private static final imr f11580a = imr.m15727a("token_handle");

    /* renamed from: b */
    private final Context f11581b = rpr.m34216b();

    /* renamed from: c */
    private final imw f11582c;

    /* renamed from: d */
    private final AccountAuthenticatorResponse f11583d;

    /* renamed from: e */
    private final Account f11584e;

    /* renamed from: f */
    private String f11585f;

    /* renamed from: g */
    private final boolean f11586g;

    /* renamed from: h */
    private final rrq f11587h;

    /* renamed from: i */
    private String f11588i;

    public FinishUpdateCredentialsSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, rrq rrq, String str, String str2) {
        imw imw = new imw(rpr.m34216b());
        this.f11582c = imw;
        this.f11583d = accountAuthenticatorResponse;
        this.f11584e = account;
        this.f11586g = z;
        this.f11587h = rrq;
        this.f11585f = str;
        this.f11588i = str2;
    }

    /* renamed from: a */
    private final jxw m7108a(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11583d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return jxw.m17486b(0, putExtra);
    }

    /* renamed from: b */
    public final String mo7863b() {
        return "FinishUpdateCredentialsSessionController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11583d, 0);
        parcel.writeParcelable(this.f11584e, 0);
        parcel.writeByte(this.f11586g ? (byte) 1 : 0);
        parcel.writeParcelable(this.f11587h.mo25045a(), 0);
        parcel.writeString(this.f11585f);
        parcel.writeString(this.f11588i);
    }

    /* renamed from: a */
    public final jxw mo7862a(jxy jxy) {
        if (jxy != null) {
            int i = jxy.f23499a;
            if (i == 10) {
                int i2 = jxy.f23500b;
                if (i2 == -1) {
                    Intent intent = jxy.f23501c;
                    if (intent != null) {
                        this.f11588i = (String) new ims(intent.getExtras()).mo13146a(f11580a);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("authAccount", this.f11584e.name);
                    bundle.putString("accountType", this.f11584e.type);
                    bundle.putString("accountStatusToken", this.f11588i);
                    AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11583d;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onResult(bundle);
                    }
                    return jxw.m17486b(-1, new Intent().putExtras(bundle));
                } else if (i2 == 0) {
                    return m7108a(5, "something went wrong");
                }
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(jxy.f23500b)));
        } else if (!this.f11582c.mo13150a()) {
            return m7108a(3, "no network");
        } else {
            return jxw.m17485a(10, UpdateCredentialsChimeraActivity.m7035a(this.f11581b, this.f11584e, this.f11585f, false, this.f11587h), 0, 0);
        }
    }
}
