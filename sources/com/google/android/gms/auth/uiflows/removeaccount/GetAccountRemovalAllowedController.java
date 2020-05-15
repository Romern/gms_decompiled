package com.google.android.gms.auth.uiflows.removeaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetAccountRemovalAllowedController implements Controller {
    public static final Parcelable.Creator CREATOR = new kak();

    /* renamed from: a */
    private static final sek f11567a = ght.m13171a("RemoveAccount", "GetAccountRemovalAllowedController");

    /* renamed from: b */
    private final Context f11568b = rpr.m34216b();

    /* renamed from: c */
    private final AccountAuthenticatorResponse f11569c;

    /* renamed from: d */
    private final Account f11570d;

    /* renamed from: e */
    private final boolean f11571e;

    /* renamed from: f */
    private final String f11572f;

    public GetAccountRemovalAllowedController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, String str) {
        this.f11569c = accountAuthenticatorResponse;
        this.f11570d = account;
        this.f11571e = z;
        this.f11572f = str;
    }

    /* renamed from: a */
    private final jxw m7099a() {
        if (this.f11571e) {
            return jxw.m17484a(20, ConfirmAccountDeletionChimeraActivity.m7097a(this.f11568b, this.f11572f));
        }
        return m7100a(true);
    }

    /* renamed from: b */
    public final String mo7863b() {
        return "GetAccountRemovalAllowedController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11569c, 0);
        parcel.writeParcelable(this.f11570d, 0);
        parcel.writeByte(this.f11571e ? (byte) 1 : 0);
        parcel.writeString(this.f11572f);
    }

    /* renamed from: a */
    private final jxw m7100a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", z);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11569c;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        return jxw.m17486b(-1, new Intent().putExtras(bundle));
    }

    /* renamed from: a */
    public final jxw mo7862a(jxy jxy) {
        if (jxy != null) {
            f11567a.mo25412b(String.format("Result with id=%d and resultCode=%d", Integer.valueOf(jxy.f23499a), Integer.valueOf(jxy.f23500b)), new Object[0]);
            int i = jxy.f23499a;
            if (i == 10) {
                int i2 = jxy.f23500b;
                if (i2 == -1) {
                    return m7099a();
                }
                if (i2 == 0) {
                    return m7100a(false);
                }
            } else if (i == 20) {
                int i3 = jxy.f23500b;
                if (i3 == -1) {
                    return m7100a(true);
                }
                if (i3 == 0) {
                    return m7100a(false);
                }
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(jxy.f23500b)));
        }
        Intent a = rrk.m34290a(this.f11568b, this.f11570d);
        if (a != null) {
            return jxw.m17484a(10, WrapperControlledChimeraActivity.m7009a(this.f11568b, false, null, a));
        }
        return m7099a();
    }
}
