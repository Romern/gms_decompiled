package com.google.android.gms.lockbox.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockboxSignedInStatus extends AbstractSafeParcelable implements aeyj {
    public static final Parcelable.Creator CREATOR = new aezm();

    /* renamed from: a */
    public final String f79799a;

    /* renamed from: b */
    public final String f79800b;

    /* renamed from: c */
    public final long f79801c;

    public LockboxSignedInStatus(String str, String str2, long j) {
        this.f79799a = str;
        this.f79800b = str2;
        this.f79801c = j;
    }

    /* renamed from: b */
    public final String mo34653b() {
        return this.f79799a;
    }

    /* renamed from: c */
    public final long mo34654c() {
        return this.f79801c;
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
        see.m35046a(parcel, 2, this.f79799a, false);
        see.m35046a(parcel, 3, this.f79800b, false);
        see.m35036a(parcel, 4, this.f79801c);
        see.m35062b(parcel, a);
    }
}
