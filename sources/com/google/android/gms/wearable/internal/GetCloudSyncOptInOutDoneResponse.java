package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetCloudSyncOptInOutDoneResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrg();

    /* renamed from: a */
    public final int f110927a;

    /* renamed from: b */
    public final boolean f110928b;

    public GetCloudSyncOptInOutDoneResponse(int i, boolean z) {
        this.f110927a = i;
        this.f110928b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110927a);
        see.m35051a(parcel, 3, this.f110928b);
        see.m35062b(parcel, a);
    }
}
