package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChannelReceiveFileResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axqh();

    /* renamed from: a */
    public final int f110909a;

    public ChannelReceiveFileResponse(int i) {
        this.f110909a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110909a);
        see.m35062b(parcel, a);
    }
}
