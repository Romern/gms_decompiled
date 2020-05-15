package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StartMfaPhoneNumberEnrollmentAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brkp();

    /* renamed from: a */
    public final String f152465a;

    /* renamed from: b */
    public final String f152466b;

    /* renamed from: c */
    public final String f152467c;

    /* renamed from: d */
    public final long f152468d;

    /* renamed from: e */
    public final boolean f152469e;

    /* renamed from: f */
    public final boolean f152470f;

    public StartMfaPhoneNumberEnrollmentAidlRequest(String str, String str2, String str3, long j, boolean z, boolean z2) {
        this.f152465a = str;
        this.f152466b = str2;
        this.f152467c = str3;
        this.f152468d = j;
        this.f152469e = z;
        this.f152470f = z2;
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
        see.m35046a(parcel, 1, this.f152465a, false);
        see.m35046a(parcel, 2, this.f152466b, false);
        see.m35046a(parcel, 3, this.f152467c, false);
        see.m35036a(parcel, 4, this.f152468d);
        see.m35051a(parcel, 5, this.f152469e);
        see.m35051a(parcel, 6, this.f152470f);
        see.m35062b(parcel, a);
    }
}
