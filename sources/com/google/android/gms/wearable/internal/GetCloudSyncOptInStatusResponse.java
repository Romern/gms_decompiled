package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetCloudSyncOptInStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrh();

    /* renamed from: a */
    public final int f110929a;

    /* renamed from: b */
    public final boolean f110930b;

    /* renamed from: c */
    public final boolean f110931c;

    public GetCloudSyncOptInStatusResponse(int i, boolean z, boolean z2) {
        this.f110929a = i;
        this.f110930b = z;
        this.f110931c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110929a);
        see.m35051a(parcel, 3, this.f110930b);
        see.m35051a(parcel, 4, this.f110931c);
        see.m35062b(parcel, a);
    }
}
