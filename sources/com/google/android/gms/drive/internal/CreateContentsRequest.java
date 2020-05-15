package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new urn();

    /* renamed from: a */
    public final int f30829a;

    public CreateContentsRequest(int i) {
        boolean z = true;
        if (!(i == 536870912 || i == 805306368)) {
            z = false;
        }
        sdo.m34975b(z, "Cannot create a new read-only contents!");
        this.f30829a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30829a);
        see.m35062b(parcel, a);
    }
}
