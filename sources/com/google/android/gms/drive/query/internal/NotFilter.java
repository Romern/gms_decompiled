package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NotFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR = new vgu();

    /* renamed from: a */
    final FilterHolder f31121a;

    public NotFilter(FilterHolder filterHolder) {
        this.f31121a = filterHolder;
    }

    /* renamed from: a */
    public final Object mo18284a(vgn vgn) {
        return vgn.mo28320a(this.f31121a.f31112j.mo18284a(vgn));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31121a, i, false);
        see.m35062b(parcel, a);
    }
}
