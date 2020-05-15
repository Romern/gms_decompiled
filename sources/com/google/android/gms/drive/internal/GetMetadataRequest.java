package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new utg();

    /* renamed from: a */
    public final DriveId f30857a;

    /* renamed from: b */
    public final boolean f30858b;

    public GetMetadataRequest(DriveId driveId, boolean z) {
        this.f30857a = driveId;
        this.f30858b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30857a, i, false);
        see.m35051a(parcel, 3, this.f30858b);
        see.m35062b(parcel, a);
    }
}
