package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetDataItemResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrm();

    /* renamed from: a */
    public final int f110940a;

    /* renamed from: b */
    public final DataItemParcelable f110941b;

    public GetDataItemResponse(int i, DataItemParcelable dataItemParcelable) {
        this.f110940a = i;
        this.f110941b = dataItemParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110940a);
        see.m35040a(parcel, 3, this.f110941b, i, false);
        see.m35062b(parcel, a);
    }
}
