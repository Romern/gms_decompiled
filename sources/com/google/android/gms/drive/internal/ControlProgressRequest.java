package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ControlProgressRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new urm();

    /* renamed from: a */
    public final int f30826a;

    /* renamed from: b */
    public final int f30827b;

    /* renamed from: c */
    public final DriveId f30828c;

    public ControlProgressRequest(int i, int i2, DriveId driveId) {
        this.f30826a = i;
        this.f30827b = i2;
        this.f30828c = driveId;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30826a);
        see.m35063b(parcel, 3, this.f30827b);
        see.m35040a(parcel, 4, this.f30828c, i, false);
        see.m35062b(parcel, a);
    }
}
