package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableChangeInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vjx();

    /* renamed from: a */
    final long f31134a;

    /* renamed from: b */
    final List f31135b;

    public ParcelableChangeInfo(long j, List list) {
        this.f31134a = j;
        this.f31135b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f31134a);
        see.m35066c(parcel, 3, this.f31135b, false);
        see.m35062b(parcel, a);
    }
}
