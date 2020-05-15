package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeleteDataItemsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrb();

    /* renamed from: a */
    public final int f110917a;

    /* renamed from: b */
    public final int f110918b;

    public DeleteDataItemsResponse(int i, int i2) {
        this.f110917a = i;
        this.f110918b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110917a);
        see.m35063b(parcel, 3, this.f110918b);
        see.m35062b(parcel, a);
    }
}
