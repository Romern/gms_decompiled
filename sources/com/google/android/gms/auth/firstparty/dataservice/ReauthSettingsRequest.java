package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReauthSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ixz();

    /* renamed from: a */
    final int f10696a;
    @Deprecated

    /* renamed from: b */
    public final String f10697b;

    /* renamed from: c */
    public final boolean f10698c;

    /* renamed from: d */
    public final Account f10699d;

    /* renamed from: e */
    public String f10700e;

    public ReauthSettingsRequest(int i, String str, boolean z, Account account, String str2) {
        this.f10696a = i;
        this.f10697b = str;
        this.f10698c = z;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f10699d = account;
        } else {
            this.f10699d = new Account(str, "com.google");
        }
        this.f10700e = str2;
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10696a);
        see.m35046a(parcel, 2, this.f10697b, false);
        see.m35051a(parcel, 3, this.f10698c);
        see.m35040a(parcel, 4, this.f10699d, i, false);
        see.m35046a(parcel, 5, this.f10700e, false);
        see.m35062b(parcel, a);
    }

    public ReauthSettingsRequest(Account account, boolean z) {
        this(3, null, z, account, null);
    }
}
