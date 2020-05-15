package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoadRealtimeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new utu();

    /* renamed from: a */
    public final DriveId f30863a;

    /* renamed from: b */
    public final boolean f30864b;

    /* renamed from: c */
    public final boolean f30865c;

    /* renamed from: d */
    public final DataHolder f30866d;

    /* renamed from: e */
    public final String f30867e;

    public LoadRealtimeRequest(DriveId driveId, boolean z, boolean z2, DataHolder dataHolder, String str) {
        this.f30863a = driveId;
        this.f30864b = z;
        this.f30865c = z2;
        this.f30866d = dataHolder;
        this.f30867e = str;
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
        see.m35040a(parcel, 2, this.f30863a, i, false);
        see.m35051a(parcel, 3, this.f30864b);
        see.m35051a(parcel, 5, this.f30865c);
        see.m35040a(parcel, 6, this.f30866d, i, false);
        see.m35046a(parcel, 7, this.f30867e, false);
        see.m35062b(parcel, a);
    }
}
