package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new iyr();

    /* renamed from: a */
    final int f10811a;

    /* renamed from: b */
    public String f10812b;
    @Deprecated

    /* renamed from: c */
    public String f10813c;

    /* renamed from: d */
    Bundle f10814d;

    /* renamed from: e */
    public FACLConfig f10815e;

    /* renamed from: f */
    public PACLConfig f10816f;

    /* renamed from: g */
    public boolean f10817g;

    /* renamed from: h */
    public AppDescription f10818h;

    /* renamed from: i */
    public Account f10819i;

    /* renamed from: j */
    public AccountAuthenticatorResponse f10820j;

    public TokenWorkflowRequest() {
        this.f10811a = 2;
        this.f10814d = new Bundle();
    }

    /* renamed from: a */
    public final Bundle mo7665a() {
        return new Bundle(this.f10814d);
    }

    /* renamed from: b */
    public final void mo7668b() {
        this.f10815e = null;
    }

    /* renamed from: a */
    public final void mo7666a(Account account) {
        this.f10813c = account != null ? account.name : null;
        this.f10819i = account;
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
        see.m35063b(parcel, 1, this.f10811a);
        see.m35046a(parcel, 2, this.f10812b, false);
        see.m35046a(parcel, 3, this.f10813c, false);
        see.m35037a(parcel, 4, this.f10814d, false);
        see.m35040a(parcel, 5, this.f10815e, i, false);
        see.m35040a(parcel, 6, this.f10816f, i, false);
        see.m35051a(parcel, 7, this.f10817g);
        see.m35040a(parcel, 8, this.f10818h, i, false);
        see.m35040a(parcel, 9, this.f10819i, i, false);
        see.m35040a(parcel, 10, this.f10820j, i, false);
        see.m35062b(parcel, a);
    }

    public TokenWorkflowRequest(int i, String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, AppDescription appDescription, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.f10811a = i;
        this.f10812b = str;
        this.f10813c = str2;
        this.f10814d = bundle;
        this.f10815e = fACLConfig;
        this.f10816f = pACLConfig;
        this.f10817g = z;
        this.f10818h = appDescription;
        if (account != null || TextUtils.isEmpty(str2)) {
            this.f10819i = account;
        } else {
            this.f10819i = new Account(str2, "com.google");
        }
        this.f10820j = accountAuthenticatorResponse;
    }

    /* renamed from: a */
    public final void mo7667a(Bundle bundle) {
        this.f10814d.clear();
        if (bundle != null) {
            this.f10814d.putAll(bundle);
        }
    }
}
