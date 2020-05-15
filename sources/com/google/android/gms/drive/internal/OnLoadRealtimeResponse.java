package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnLoadRealtimeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uui();

    /* renamed from: a */
    final boolean f30892a;

    public OnLoadRealtimeResponse(boolean z) {
        this.f30892a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f30892a);
        see.m35062b(parcel, a);
    }
}
