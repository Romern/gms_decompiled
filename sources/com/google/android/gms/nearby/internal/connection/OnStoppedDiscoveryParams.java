package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnStoppedDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aihz();

    /* renamed from: a */
    public int f80604a;

    private OnStoppedDiscoveryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnStoppedDiscoveryParams) {
            return sdg.m34949a(Integer.valueOf(this.f80604a), Integer.valueOf(((OnStoppedDiscoveryParams) obj).f80604a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80604a)});
    }

    public OnStoppedDiscoveryParams(int i) {
        this.f80604a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80604a);
        see.m35062b(parcel, a);
    }
}
