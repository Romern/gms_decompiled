package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axsx();

    /* renamed from: a */
    public final int f110966a;

    /* renamed from: b */
    public final long f110967b;

    /* renamed from: c */
    public final List f110968c;

    public StorageInfoResponse(int i, long j, List list) {
        this.f110966a = i;
        this.f110967b = j;
        this.f110968c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110966a);
        see.m35036a(parcel, 3, this.f110967b);
        see.m35066c(parcel, 4, this.f110968c, false);
        see.m35062b(parcel, a);
    }
}
