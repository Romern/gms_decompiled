package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransferProgressOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uqx();

    /* renamed from: a */
    public final int f30788a;

    public TransferProgressOptions(int i) {
        this.f30788a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30788a);
        see.m35062b(parcel, a);
    }
}
