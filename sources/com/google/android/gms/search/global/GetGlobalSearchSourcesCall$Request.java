package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetGlobalSearchSourcesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new appw();

    /* renamed from: a */
    public boolean f107426a;

    public GetGlobalSearchSourcesCall$Request() {
    }

    public GetGlobalSearchSourcesCall$Request(boolean z) {
        this.f107426a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f107426a);
        see.m35062b(parcel, a);
    }
}
