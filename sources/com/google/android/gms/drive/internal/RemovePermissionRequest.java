package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemovePermissionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uur();

    /* renamed from: a */
    public final DriveId f30914a;

    /* renamed from: b */
    public final String f30915b;

    /* renamed from: c */
    public final boolean f30916c;

    /* renamed from: d */
    public final String f30917d;

    public RemovePermissionRequest(DriveId driveId, String str, boolean z, String str2) {
        this.f30914a = driveId;
        this.f30915b = str;
        this.f30916c = z;
        this.f30917d = str2;
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
        see.m35040a(parcel, 2, this.f30914a, i, false);
        see.m35046a(parcel, 3, this.f30915b, false);
        see.m35051a(parcel, 4, this.f30916c);
        see.m35046a(parcel, 5, this.f30917d, false);
        see.m35062b(parcel, a);
    }
}
