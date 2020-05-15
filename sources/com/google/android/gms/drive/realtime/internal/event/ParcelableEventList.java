package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableEventList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vki();

    /* renamed from: a */
    final List f31167a;

    /* renamed from: b */
    public final DataHolder f31168b;

    /* renamed from: c */
    final boolean f31169c;

    /* renamed from: d */
    final List f31170d;

    /* renamed from: e */
    final ParcelableChangeInfo f31171e;

    public ParcelableEventList(List list, DataHolder dataHolder, boolean z, List list2, ParcelableChangeInfo parcelableChangeInfo) {
        this.f31167a = list;
        this.f31168b = dataHolder;
        this.f31169c = z;
        this.f31170d = list2;
        this.f31171e = parcelableChangeInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f31167a, false);
        see.m35040a(parcel, 3, this.f31168b, i, false);
        see.m35051a(parcel, 4, this.f31169c);
        see.m35065b(parcel, 5, this.f31170d, false);
        see.m35040a(parcel, 6, this.f31171e, i, false);
        see.m35062b(parcel, a);
    }
}
