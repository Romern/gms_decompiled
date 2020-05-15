package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApplicationBackupStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lsf();

    /* renamed from: a */
    public final String f28974a;

    /* renamed from: b */
    public final int f28975b;

    /* renamed from: c */
    public final int f28976c;

    /* renamed from: d */
    public final long f28977d;

    public ApplicationBackupStats(String str, int i, int i2, long j) {
        this.f28974a = str;
        this.f28975b = i;
        this.f28976c = i2;
        this.f28977d = j;
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
        see.m35046a(parcel, 1, this.f28974a, false);
        see.m35063b(parcel, 2, this.f28975b);
        see.m35063b(parcel, 3, this.f28976c);
        see.m35036a(parcel, 4, this.f28977d);
        see.m35062b(parcel, a);
    }
}
