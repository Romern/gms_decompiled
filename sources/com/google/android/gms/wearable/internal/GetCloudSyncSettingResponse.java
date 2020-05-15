package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetCloudSyncSettingResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axri();

    /* renamed from: a */
    public final int f110932a;

    /* renamed from: b */
    public final boolean f110933b;

    public GetCloudSyncSettingResponse(int i, boolean z) {
        this.f110932a = i;
        this.f110933b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110932a);
        see.m35051a(parcel, 3, this.f110933b);
        see.m35062b(parcel, a);
    }
}
