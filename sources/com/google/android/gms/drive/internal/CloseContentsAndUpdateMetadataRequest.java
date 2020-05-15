package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CloseContentsAndUpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new urk();

    /* renamed from: a */
    public final DriveId f30814a;

    /* renamed from: b */
    public final MetadataBundle f30815b;

    /* renamed from: c */
    public final Contents f30816c;

    /* renamed from: d */
    public final boolean f30817d;

    /* renamed from: e */
    public final String f30818e;

    /* renamed from: f */
    public final int f30819f;

    /* renamed from: g */
    public final int f30820g;

    /* renamed from: h */
    public final boolean f30821h;

    /* renamed from: i */
    public final boolean f30822i;

    public CloseContentsAndUpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle, Contents contents, boolean z, String str, int i, int i2, boolean z2, boolean z3) {
        this.f30814a = driveId;
        this.f30815b = metadataBundle;
        this.f30816c = contents;
        this.f30817d = z;
        this.f30818e = str;
        this.f30819f = i;
        this.f30820g = i2;
        this.f30821h = z2;
        this.f30822i = z3;
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
        see.m35040a(parcel, 2, this.f30814a, i, false);
        see.m35040a(parcel, 3, this.f30815b, i, false);
        see.m35040a(parcel, 4, this.f30816c, i, false);
        see.m35051a(parcel, 5, this.f30817d);
        see.m35046a(parcel, 6, this.f30818e, false);
        see.m35063b(parcel, 7, this.f30819f);
        see.m35063b(parcel, 8, this.f30820g);
        see.m35051a(parcel, 9, this.f30821h);
        see.m35051a(parcel, 10, this.f30822i);
        see.m35062b(parcel, a);
    }
}
