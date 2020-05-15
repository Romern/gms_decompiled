package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetAllCapabilitiesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrc();

    /* renamed from: a */
    public final int f110919a;

    /* renamed from: b */
    public final List f110920b;

    public GetAllCapabilitiesResponse(int i, List list) {
        this.f110919a = i;
        this.f110920b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110919a);
        see.m35066c(parcel, 3, this.f110920b, false);
        see.m35062b(parcel, a);
    }
}
