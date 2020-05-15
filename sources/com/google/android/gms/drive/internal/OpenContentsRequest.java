package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uum();

    /* renamed from: a */
    public final DriveId f30900a;

    /* renamed from: b */
    public final int f30901b;

    /* renamed from: c */
    public final int f30902c;

    public OpenContentsRequest(DriveId driveId, int i, int i2) {
        this.f30900a = driveId;
        this.f30901b = i;
        this.f30902c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30900a, i, false);
        see.m35063b(parcel, 3, this.f30901b);
        see.m35063b(parcel, 4, this.f30902c);
        see.m35062b(parcel, a);
    }
}
