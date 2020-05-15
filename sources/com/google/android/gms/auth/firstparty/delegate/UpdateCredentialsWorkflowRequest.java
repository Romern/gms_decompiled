package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateCredentialsWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iys();

    /* renamed from: a */
    final int f10821a;
    @Deprecated

    /* renamed from: b */
    String f10822b;

    /* renamed from: c */
    public AppDescription f10823c;

    /* renamed from: d */
    Bundle f10824d;

    /* renamed from: e */
    public Account f10825e;

    /* renamed from: f */
    public AccountAuthenticatorResponse f10826f;

    public UpdateCredentialsWorkflowRequest() {
        this.f10821a = 3;
        this.f10824d = new Bundle();
    }

    /* renamed from: a */
    public final Bundle mo7670a() {
        return new Bundle(this.f10824d);
    }

    /* renamed from: a */
    public final void mo7671a(Account account) {
        this.f10822b = account != null ? account.name : null;
        this.f10825e = account;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10821a);
        see.m35046a(parcel, 2, this.f10822b, false);
        see.m35040a(parcel, 3, this.f10823c, i, false);
        see.m35037a(parcel, 4, this.f10824d, false);
        see.m35040a(parcel, 5, this.f10825e, i, false);
        see.m35040a(parcel, 6, this.f10826f, i, false);
        see.m35062b(parcel, a);
    }

    public UpdateCredentialsWorkflowRequest(int i, String str, AppDescription appDescription, Bundle bundle, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.f10821a = i;
        this.f10822b = str;
        this.f10823c = appDescription;
        this.f10824d = bundle;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f10825e = account;
        } else {
            this.f10825e = new Account(str, "com.google");
        }
        this.f10826f = accountAuthenticatorResponse;
    }

    /* renamed from: a */
    public final void mo7672a(Bundle bundle) {
        this.f10824d.clear();
        if (bundle != null) {
            this.f10824d.putAll(bundle);
        }
    }
}
