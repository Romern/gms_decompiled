package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ListParentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new utt();

    /* renamed from: a */
    public final DriveId f30862a;

    public ListParentsRequest(DriveId driveId) {
        this.f30862a = driveId;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30862a, i, false);
        see.m35062b(parcel, a);
    }
}
