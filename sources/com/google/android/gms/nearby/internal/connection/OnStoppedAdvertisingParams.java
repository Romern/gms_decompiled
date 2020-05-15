package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnStoppedAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aihy();

    /* renamed from: a */
    public int f80603a;

    private OnStoppedAdvertisingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnStoppedAdvertisingParams) {
            return sdg.m34949a(Integer.valueOf(this.f80603a), Integer.valueOf(((OnStoppedAdvertisingParams) obj).f80603a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80603a)});
    }

    public OnStoppedAdvertisingParams(int i) {
        this.f80603a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80603a);
        see.m35062b(parcel, a);
    }
}
