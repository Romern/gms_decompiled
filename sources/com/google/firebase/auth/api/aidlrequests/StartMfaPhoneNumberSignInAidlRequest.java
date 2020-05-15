package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StartMfaPhoneNumberSignInAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brkq();

    /* renamed from: a */
    public PhoneMultiFactorInfo f152471a;

    /* renamed from: b */
    public final String f152472b;

    /* renamed from: c */
    public final String f152473c;

    /* renamed from: d */
    public final long f152474d;

    /* renamed from: e */
    public final boolean f152475e;

    /* renamed from: f */
    public final boolean f152476f;

    public StartMfaPhoneNumberSignInAidlRequest(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, String str2, long j, boolean z, boolean z2) {
        this.f152471a = phoneMultiFactorInfo;
        this.f152472b = str;
        this.f152473c = str2;
        this.f152474d = j;
        this.f152475e = z;
        this.f152476f = z2;
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
        see.m35040a(parcel, 1, this.f152471a, i, false);
        see.m35046a(parcel, 2, this.f152472b, false);
        see.m35046a(parcel, 3, this.f152473c, false);
        see.m35036a(parcel, 4, this.f152474d);
        see.m35051a(parcel, 5, this.f152475e);
        see.m35051a(parcel, 6, this.f152476f);
        see.m35062b(parcel, a);
    }
}
