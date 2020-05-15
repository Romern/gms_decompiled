package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnDriveIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uub();

    /* renamed from: a */
    public DriveId f30880a;

    public OnDriveIdResponse(DriveId driveId) {
        this.f30880a = driveId;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30880a, i, false);
        see.m35062b(parcel, a);
    }
}
