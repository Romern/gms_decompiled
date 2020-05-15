package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnResourceIdSetResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uuj();

    /* renamed from: a */
    public final List f30895a;

    public OnResourceIdSetResponse(List list) {
        this.f30895a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 2, this.f30895a, false);
        see.m35062b(parcel, a);
    }
}
