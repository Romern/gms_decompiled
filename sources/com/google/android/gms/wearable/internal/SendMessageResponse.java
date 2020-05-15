package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axsv();

    /* renamed from: a */
    public final int f110964a;

    /* renamed from: b */
    public final int f110965b;

    public SendMessageResponse(int i, int i2) {
        this.f110964a = i;
        this.f110965b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110964a);
        see.m35063b(parcel, 3, this.f110965b);
        see.m35062b(parcel, a);
    }
}
