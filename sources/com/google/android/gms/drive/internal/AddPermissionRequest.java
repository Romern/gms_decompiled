package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddPermissionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new urf();

    /* renamed from: a */
    public final DriveId f30801a;

    /* renamed from: b */
    public final Permission f30802b;

    /* renamed from: c */
    public final boolean f30803c;

    /* renamed from: d */
    public final String f30804d;

    /* renamed from: e */
    public final boolean f30805e;

    /* renamed from: f */
    public final String f30806f;

    public AddPermissionRequest(DriveId driveId, Permission permission, boolean z, String str, boolean z2, String str2) {
        this.f30801a = driveId;
        this.f30802b = permission;
        this.f30803c = z;
        this.f30804d = str;
        this.f30805e = z2;
        this.f30806f = str2;
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
        see.m35040a(parcel, 2, this.f30801a, i, false);
        see.m35040a(parcel, 3, this.f30802b, i, false);
        see.m35051a(parcel, 4, this.f30803c);
        see.m35046a(parcel, 5, this.f30804d, false);
        see.m35051a(parcel, 6, this.f30805e);
        see.m35046a(parcel, 7, this.f30806f, false);
        see.m35062b(parcel, a);
    }
}
