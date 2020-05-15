package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddEventListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ure();

    /* renamed from: a */
    public final DriveId f30796a;

    /* renamed from: b */
    public final int f30797b;

    /* renamed from: c */
    public final ChangesAvailableOptions f30798c;

    /* renamed from: d */
    public final TransferStateOptions f30799d;

    /* renamed from: e */
    public final TransferProgressOptions f30800e;

    public AddEventListenerRequest(DriveId driveId, int i, ChangesAvailableOptions changesAvailableOptions, TransferStateOptions transferStateOptions, TransferProgressOptions transferProgressOptions) {
        this.f30796a = driveId;
        this.f30797b = i;
        this.f30798c = changesAvailableOptions;
        this.f30799d = transferStateOptions;
        this.f30800e = transferProgressOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30796a, i, false);
        see.m35063b(parcel, 3, this.f30797b);
        see.m35040a(parcel, 4, this.f30798c, i, false);
        see.m35040a(parcel, 5, this.f30799d, i, false);
        see.m35040a(parcel, 6, this.f30800e, i, false);
        see.m35062b(parcel, a);
    }
}
