package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Contents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new twg();

    /* renamed from: a */
    public final ParcelFileDescriptor f30720a;

    /* renamed from: b */
    public final int f30721b;

    /* renamed from: c */
    final int f30722c;

    /* renamed from: d */
    public final DriveId f30723d;

    /* renamed from: e */
    public final boolean f30724e;

    /* renamed from: f */
    final String f30725f;

    public Contents(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, DriveId driveId, boolean z, String str) {
        this.f30720a = parcelFileDescriptor;
        this.f30721b = i;
        this.f30722c = i2;
        this.f30723d = driveId;
        this.f30724e = z;
        this.f30725f = str;
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
        see.m35040a(parcel, 2, this.f30720a, i, false);
        see.m35063b(parcel, 3, this.f30721b);
        see.m35063b(parcel, 4, this.f30722c);
        see.m35040a(parcel, 5, this.f30723d, i, false);
        see.m35051a(parcel, 7, this.f30724e);
        see.m35046a(parcel, 8, this.f30725f, false);
        see.m35062b(parcel, a);
    }
}
