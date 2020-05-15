package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TextInsertedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vkl();

    /* renamed from: a */
    final int f31178a;

    /* renamed from: b */
    final int f31179b;

    public TextInsertedDetails(int i, int i2) {
        this.f31178a = i;
        this.f31179b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f31178a);
        see.m35063b(parcel, 3, this.f31179b);
        see.m35062b(parcel, a);
    }
}
