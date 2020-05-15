package com.google.android.gms.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReadStateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akoi();

    /* renamed from: a */
    final int f81225a;

    /* renamed from: b */
    public final int f81226b;

    /* renamed from: c */
    public final Identifier f81227c;

    public ReadStateUpdate(int i, int i2, Identifier identifier) {
        this.f81225a = i;
        this.f81226b = i2;
        this.f81227c = identifier;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f81225a);
        see.m35063b(parcel, 2, this.f81226b);
        see.m35040a(parcel, 3, this.f81227c, i, false);
        see.m35062b(parcel, a);
    }
}
