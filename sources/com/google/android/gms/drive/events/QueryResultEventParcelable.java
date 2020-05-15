package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class QueryResultEventParcelable extends WriteAwareParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new uqn();

    /* renamed from: b */
    public final DataHolder f30784b;

    /* renamed from: c */
    public final boolean f30785c;

    /* renamed from: d */
    public final int f30786d;

    public QueryResultEventParcelable(DataHolder dataHolder, boolean z, int i) {
        this.f30784b = dataHolder;
        this.f30785c = z;
        this.f30786d = i;
    }

    /* renamed from: a */
    public final int mo18144a() {
        return 3;
    }

    /* renamed from: a */
    public final void mo18132a(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30784b, i, false);
        see.m35051a(parcel, 3, this.f30785c);
        see.m35063b(parcel, 4, this.f30786d);
        see.m35062b(parcel, a);
    }
}
