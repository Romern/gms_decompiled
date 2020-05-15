package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoveEventListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uuq();

    /* renamed from: a */
    public final DriveId f30911a;

    /* renamed from: b */
    public final int f30912b;

    /* renamed from: c */
    public final TransferProgressOptions f30913c;

    public RemoveEventListenerRequest(DriveId driveId, int i, TransferProgressOptions transferProgressOptions) {
        this.f30911a = driveId;
        this.f30912b = i;
        this.f30913c = transferProgressOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30911a, i, false);
        see.m35063b(parcel, 3, this.f30912b);
        see.m35040a(parcel, 4, this.f30913c, i, false);
        see.m35062b(parcel, a);
    }
}
