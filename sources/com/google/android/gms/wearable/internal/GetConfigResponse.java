package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrj();

    /* renamed from: a */
    public final int f110934a;

    /* renamed from: b */
    public final ConnectionConfiguration f110935b;

    public GetConfigResponse(int i, ConnectionConfiguration connectionConfiguration) {
        this.f110934a = i;
        this.f110935b = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110934a);
        see.m35040a(parcel, 3, this.f110935b, i, false);
        see.m35062b(parcel, a);
    }
}
