package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateFileIntentSenderRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uro();

    /* renamed from: a */
    public final MetadataBundle f30830a;

    /* renamed from: b */
    public final int f30831b;

    /* renamed from: c */
    public final String f30832c;

    /* renamed from: d */
    public final DriveId f30833d;

    /* renamed from: e */
    public final Integer f30834e;

    public CreateFileIntentSenderRequest(MetadataBundle metadataBundle, int i, String str, DriveId driveId, Integer num) {
        this.f30830a = metadataBundle;
        this.f30831b = i;
        this.f30832c = str;
        this.f30833d = driveId;
        this.f30834e = num;
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
        see.m35040a(parcel, 2, this.f30830a, i, false);
        see.m35063b(parcel, 3, this.f30831b);
        see.m35046a(parcel, 4, this.f30832c, false);
        see.m35040a(parcel, 5, this.f30833d, i, false);
        see.m35044a(parcel, 6, this.f30834e);
        see.m35062b(parcel, a);
    }
}
