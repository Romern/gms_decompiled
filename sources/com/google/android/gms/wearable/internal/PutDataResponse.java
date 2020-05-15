package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PutDataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axss();

    /* renamed from: a */
    public final int f110959a;

    /* renamed from: b */
    public final DataItemParcelable f110960b;

    public PutDataResponse(int i, DataItemParcelable dataItemParcelable) {
        this.f110959a = i;
        this.f110960b = dataItemParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110959a);
        see.m35040a(parcel, 3, this.f110960b, i, false);
        see.m35062b(parcel, a);
    }
}
