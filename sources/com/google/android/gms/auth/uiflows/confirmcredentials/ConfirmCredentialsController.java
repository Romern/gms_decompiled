package com.google.android.gms.auth.uiflows.confirmcredentials;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.uiflows.addaccount.ErrorChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfirmCredentialsController implements Controller {
    public static final Parcelable.Creator CREATOR = new jxm();

    /* renamed from: a */
    private static final sek f11470a = ght.m13171a("ConfirmCredentials", "ConfirmCredentialsController");

    /* renamed from: b */
    private final Context f11471b = rpr.m34216b();

    /* renamed from: c */
    private final imw f11472c;

    /* renamed from: d */
    private final AccountAuthenticatorResponse f11473d;

    /* renamed from: e */
    private final Account f11474e;

    /* renamed from: f */
    private final boolean f11475f;

    /* renamed from: g */
    private final rrq f11476g;

    public ConfirmCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, rrq rrq) {
        imw imw = new imw(rpr.m34216b());
        this.f11472c = imw;
        this.f11473d = accountAuthenticatorResponse;
        this.f11474e = account;
        this.f11475f = z;
        this.f11476g = rrq;
    }

    /* renamed from: a */
    private final jxw m7038a(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11473d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return jxw.m17486b(0, putExtra);
    }

    /* renamed from: b */
    public final String mo7863b() {
        return "ConfirmCredentialsController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11473d, 0);
        parcel.writeParcelable(this.f11474e, 0);
        parcel.writeByte(this.f11475f ? (byte) 1 : 0);
        parcel.writeParcelable(this.f11476g.mo25045a(), 0);
    }

    /* renamed from: a */
    private final jxw m7039a(boolean z) {
        int i;
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", z);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11473d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        if (!z) {
            i = 0;
        } else {
            i = -1;
        }
        return jxw.m17486b(i, new Intent().putExtras(bundle));
    }

    /* renamed from: a */
    public final jxw mo7862a(jxy jxy) {
        if (jxy != null) {
            f11470a.mo25412b(String.format("Result with id=%d and resultCode=%d", Integer.valueOf(jxy.f23499a), Integer.valueOf(jxy.f23500b)), new Object[0]);
            int i = jxy.f23499a;
            if (i == 10) {
                int i2 = jxy.f23500b;
                if (i2 == -1) {
                    return m7039a(true);
                }
                if (i2 == 0) {
                    return m7039a(false);
                }
                if (i2 == 2) {
                    return m7038a(5, "something went wrong");
                }
            } else if (i != 1001) {
                throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(jxy.f23500b)));
            }
            return m7038a(3, "no network");
        } else if (this.f11472c.mo13150a()) {
            Context context = this.f11471b;
            Account account = this.f11474e;
            return jxw.m17484a(10, MinuteMaidChimeraActivity.m7072a(context, account, this.f11475f, this.f11476g, jvj.m17398a(context, false, account.type, this.f11476g, false)));
        } else {
            ims ims = new ims();
            ims.mo13148b(jwz.f23429j, Boolean.valueOf(this.f11475f));
            ims.mo13148b(jwz.f23428i, this.f11476g.mo25045a());
            return jxw.m17484a(1001, ErrorChimeraActivity.m6967a(this.f11471b, (int) C0126R.string.common_no_network, (int) C0126R.string.auth_error_no_network).putExtras(ims.f21367a));
        }
    }
}
