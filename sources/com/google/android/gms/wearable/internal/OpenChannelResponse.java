package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axsq();

    /* renamed from: a */
    public final int f110954a;

    /* renamed from: b */
    public final ChannelImpl f110955b;

    public OpenChannelResponse(int i, ChannelImpl channelImpl) {
        this.f110954a = i;
        this.f110955b = channelImpl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110954a);
        see.m35040a(parcel, 3, this.f110955b, i, false);
        see.m35062b(parcel, a);
    }
}
