package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdatePermissionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uvc();

    /* renamed from: a */
    public final DriveId f30929a;

    /* renamed from: b */
    public final String f30930b;

    /* renamed from: c */
    public final int f30931c;

    /* renamed from: d */
    public final boolean f30932d;

    /* renamed from: e */
    public final String f30933e;

    public UpdatePermissionRequest(DriveId driveId, String str, int i, boolean z, String str2) {
        this.f30929a = driveId;
        this.f30930b = str;
        this.f30931c = i;
        this.f30932d = z;
        this.f30933e = str2;
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
        see.m35040a(parcel, 2, this.f30929a, i, false);
        see.m35046a(parcel, 3, this.f30930b, false);
        see.m35063b(parcel, 4, this.f30931c);
        see.m35051a(parcel, 5, this.f30932d);
        see.m35046a(parcel, 6, this.f30933e, false);
        see.m35062b(parcel, a);
    }
}
