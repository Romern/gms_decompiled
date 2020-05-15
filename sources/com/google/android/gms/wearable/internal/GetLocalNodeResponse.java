package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetLocalNodeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axro();

    /* renamed from: a */
    public final int f110944a;

    /* renamed from: b */
    public final NodeParcelable f110945b;

    public GetLocalNodeResponse(int i, NodeParcelable nodeParcelable) {
        this.f110944a = i;
        this.f110945b = nodeParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110944a);
        see.m35040a(parcel, 3, this.f110945b, i, false);
        see.m35062b(parcel, a);
    }
}
