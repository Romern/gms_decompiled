package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetConnectedNodesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrl();

    /* renamed from: a */
    public final int f110938a;

    /* renamed from: b */
    public final List f110939b;

    public GetConnectedNodesResponse(int i, List list) {
        this.f110938a = i;
        this.f110939b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110938a);
        see.m35066c(parcel, 3, this.f110939b, false);
        see.m35062b(parcel, a);
    }
}
