package com.google.android.gms.auth.uiflows.updatecredentials;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.uiflows.addaccount.ErrorChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.FinishSessionChimeraActivity;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateCredentialsController implements Controller {
    public static final Parcelable.Creator CREATOR = new kan();

    /* renamed from: a */
    private static final sek f11589a = ght.m13171a("UpdateCredentials", "UpdateCredentialsController");

    /* renamed from: b */
    private static final imr f11590b = imr.m15727a("token_handle");

    /* renamed from: c */
    private final Context f11591c;

    /* renamed from: d */
    private final imw f11592d;

    /* renamed from: e */
    private final adyd f11593e;

    /* renamed from: f */
    private final AccountAuthenticatorResponse f11594f;

    /* renamed from: g */
    private final Account f11595g;

    /* renamed from: h */
    private String f11596h;

    /* renamed from: i */
    private String f11597i;

    /* renamed from: j */
    private final boolean f11598j;

    /* renamed from: k */
    private final rrq f11599k;

    /* renamed from: l */
    private final boolean f11600l;

    /* renamed from: m */
    private String f11601m;

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, rrq rrq, boolean z) {
        this(accountAuthenticatorResponse, account, false, rrq, z, null, null, null);
    }

    /* renamed from: a */
    private final jxw m7111a(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11594f;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return jxw.m17486b(0, putExtra);
    }

    /* renamed from: b */
    public final String mo7863b() {
        return "UpdateCredentialsController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11594f, 0);
        parcel.writeParcelable(this.f11595g, 0);
        parcel.writeByte(this.f11598j ? (byte) 1 : 0);
        rrq rrq = this.f11599k;
        parcel.writeParcelable(rrq != null ? rrq.mo25045a() : null, 0);
        parcel.writeByte(this.f11600l ? (byte) 1 : 0);
        parcel.writeString(this.f11597i);
        parcel.writeString(this.f11596h);
        parcel.writeString(this.f11601m);
    }

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, rrq rrq, boolean z2, String str, String str2, String str3) {
        imw imw = new imw(rpr.m34216b());
        adyd a = adyd.m51363a(rpr.m34216b());
        this.f11591c = rpr.m34216b();
        this.f11592d = imw;
        this.f11593e = a;
        this.f11594f = accountAuthenticatorResponse;
        this.f11595g = account;
        this.f11598j = z;
        this.f11599k = rrq;
        this.f11600l = z2;
        this.f11597i = str;
        this.f11596h = str2;
        this.f11601m = str3;
    }

    /* renamed from: a */
    public final jxw mo7862a(jxy jxy) {
        Bundle bundle;
        if (jxy != null) {
            f11589a.mo25412b(String.format("Result with id=%d and resultCode=%d", Integer.valueOf(jxy.f23499a), Integer.valueOf(jxy.f23500b)), new Object[0]);
            int i = jxy.f23499a;
            if (i == 10) {
                int i2 = jxy.f23500b;
                if (i2 == -1) {
                    ims ims = new ims(jxy.f23501c.getExtras());
                    this.f11597i = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11546b);
                    String str = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11548d);
                    if (this.f11595g != null && !TextUtils.isEmpty(str) && !this.f11595g.name.equalsIgnoreCase(str)) {
                        new grk(this.f11591c).mo12133a(7);
                    }
                    if (!this.f11600l) {
                        return jxw.m17485a(20, UpdateCredentialsChimeraActivity.m7035a(this.f11591c, this.f11595g, this.f11597i, false, this.f11599k), 0, 0);
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    this.f11596h = (String) ims.mo13146a(MinuteMaidChimeraActivity.f11549e);
                    Bundle a = FinishSessionChimeraActivity.m6984a(this.f11598j, this.f11599k, this.f11597i, this.f11595g);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBundle("accountSessionBundle", a);
                    bundle2.putString("password", this.f11596h);
                    Intent putExtras = new Intent().putExtras(bundle2);
                    AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11594f;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onResult(bundle2);
                    }
                    return jxw.m17486b(-1, putExtras);
                } else if (i2 == 0) {
                    return m7111a(4, "user canceled");
                } else {
                    if (i2 == 2) {
                        return m7111a(5, "something went wrong");
                    }
                }
            } else if (i == 20) {
                int i4 = jxy.f23500b;
                if (i4 == -1) {
                    Intent intent = jxy.f23501c;
                    if (intent != null) {
                        this.f11601m = (String) new ims(intent.getExtras()).mo13146a(f11590b);
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("authAccount", this.f11595g.name);
                    bundle3.putString("accountType", this.f11595g.type);
                    String str2 = this.f11601m;
                    if (str2 != null) {
                        bundle3.putString("accountStatusToken", str2);
                    }
                    AccountAuthenticatorResponse accountAuthenticatorResponse2 = this.f11594f;
                    if (accountAuthenticatorResponse2 != null) {
                        accountAuthenticatorResponse2.onResult(bundle3);
                    }
                    return jxw.m17486b(-1, new Intent().putExtras(bundle3));
                } else if (i4 == 0) {
                    return m7111a(5, "something went wrong");
                }
            } else if (i == 1001) {
                return m7111a(3, "no network");
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(jxy.f23500b)));
        } else if (!this.f11592d.mo13150a()) {
            ims ims2 = new ims();
            ims2.mo13148b(jwz.f23429j, Boolean.valueOf(this.f11598j));
            imr imr = jwz.f23428i;
            rrq rrq = this.f11599k;
            if (rrq != null) {
                bundle = rrq.mo25045a();
            } else {
                bundle = null;
            }
            ims2.mo13148b(imr, bundle);
            return jxw.m17484a(1001, ErrorChimeraActivity.m6967a(this.f11591c, (int) C0126R.string.common_no_network, (int) C0126R.string.auth_error_no_network).putExtras(ims2.f21367a));
        } else if (TextUtils.isEmpty(this.f11593e.mo33908a(this.f11595g))) {
            Context context = this.f11591c;
            Account account = this.f11595g;
            return jxw.m17484a(10, MinuteMaidChimeraActivity.m7074b(context, account, this.f11598j, this.f11599k, jvj.m17398a(context, true, account.type, this.f11599k, false)));
        } else {
            Context context2 = this.f11591c;
            Account account2 = this.f11595g;
            return jxw.m17484a(10, MinuteMaidChimeraActivity.m7072a(context2, account2, this.f11598j, this.f11599k, jvj.m17398a(context2, false, account2.type, this.f11599k, false)));
        }
    }
}
