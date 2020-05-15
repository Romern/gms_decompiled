package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CloseChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axqj();

    /* renamed from: a */
    public final int f110911a;

    public CloseChannelResponse(int i) {
        this.f110911a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110911a);
        see.m35062b(parcel, a);
    }
}
