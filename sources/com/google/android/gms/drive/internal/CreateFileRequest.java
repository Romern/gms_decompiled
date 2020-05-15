package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateFileRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new urp();

    /* renamed from: a */
    public final DriveId f30835a;

    /* renamed from: b */
    public final MetadataBundle f30836b;

    /* renamed from: c */
    final Contents f30837c;

    /* renamed from: d */
    final Integer f30838d;

    /* renamed from: e */
    public final boolean f30839e;

    /* renamed from: f */
    public final String f30840f;

    /* renamed from: g */
    public final int f30841g;

    /* renamed from: h */
    final int f30842h;

    public CreateFileRequest(DriveId driveId, MetadataBundle metadataBundle, Contents contents, int i, boolean z, String str, int i2, int i3) {
        boolean z2;
        if (!(contents == null || i3 == 0)) {
            if (contents.f30721b == i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34975b(z2, "inconsistent contents reference");
        }
        if (i == 0 && contents == null && i3 == 0) {
            throw new IllegalArgumentException("Need a valid contents");
        }
        sdo.m34959a(driveId);
        this.f30835a = driveId;
        sdo.m34959a(metadataBundle);
        this.f30836b = metadataBundle;
        this.f30837c = contents;
        this.f30838d = Integer.valueOf(i);
        this.f30840f = str;
        this.f30841g = i2;
        this.f30839e = z;
        this.f30842h = i3;
    }

    /* renamed from: a */
    public final int mo18184a() {
        Contents contents = this.f30837c;
        return contents != null ? contents.f30721b : this.f30842h;
    }

    /* renamed from: b */
    public final int mo18185b() {
        Integer num = this.f30838d;
        if (num != null) {
            return num.intValue();
        }
        return 0;
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
        see.m35040a(parcel, 2, this.f30835a, i, false);
        see.m35040a(parcel, 3, this.f30836b, i, false);
        see.m35040a(parcel, 4, this.f30837c, i, false);
        see.m35044a(parcel, 5, this.f30838d);
        see.m35051a(parcel, 6, this.f30839e);
        see.m35046a(parcel, 7, this.f30840f, false);
        see.m35063b(parcel, 8, this.f30841g);
        see.m35063b(parcel, 9, this.f30842h);
        see.m35062b(parcel, a);
    }
}
