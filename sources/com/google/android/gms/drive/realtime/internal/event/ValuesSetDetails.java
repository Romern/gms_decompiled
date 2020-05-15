package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ValuesSetDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vkp();

    /* renamed from: a */
    final int f31191a;

    /* renamed from: b */
    final int f31192b;

    /* renamed from: c */
    final int f31193c;

    public ValuesSetDetails(int i, int i2, int i3) {
        this.f31191a = i;
        this.f31192b = i2;
        this.f31193c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f31191a);
        see.m35063b(parcel, 3, this.f31192b);
        see.m35063b(parcel, 4, this.f31193c);
        see.m35062b(parcel, a);
    }
}
