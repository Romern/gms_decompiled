package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegisteredPackageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsd();

    /* renamed from: a */
    public final String f9655a;

    /* renamed from: b */
    public final long f9656b;

    /* renamed from: c */
    public final boolean f9657c;

    /* renamed from: d */
    public final long f9658d;

    public RegisteredPackageInfo(String str, long j, boolean z, long j2) {
        this.f9655a = str;
        this.f9656b = j;
        this.f9657c = z;
        this.f9658d = j2;
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
        see.m35046a(parcel, 1, this.f9655a, false);
        see.m35036a(parcel, 2, this.f9656b);
        see.m35051a(parcel, 3, this.f9657c);
        see.m35036a(parcel, 4, this.f9658d);
        see.m35062b(parcel, a);
    }
}
