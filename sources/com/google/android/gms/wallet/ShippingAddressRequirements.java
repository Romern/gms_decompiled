package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awbp();

    /* renamed from: a */
    public ArrayList f109903a;

    private ShippingAddressRequirements() {
    }

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.f109903a = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 1, this.f109903a, false);
        see.m35062b(parcel, a);
    }
}
