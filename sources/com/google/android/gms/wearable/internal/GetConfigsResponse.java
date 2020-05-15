package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrk();

    /* renamed from: a */
    public final int f110936a;

    /* renamed from: b */
    public final ConnectionConfiguration[] f110937b;

    public GetConfigsResponse(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f110936a = i;
        this.f110937b = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110936a);
        see.m35057a(parcel, 3, this.f110937b, i);
        see.m35062b(parcel, a);
    }
}
