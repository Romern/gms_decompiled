package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FetchMode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldh();

    /* renamed from: a */
    public int f81470a;

    private FetchMode() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FetchMode) {
            return sdg.m34949a(Integer.valueOf(this.f81470a), Integer.valueOf(((FetchMode) obj).f81470a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81470a)});
    }

    public FetchMode(int i) {
        this.f81470a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f81470a);
        see.m35062b(parcel, a);
    }
}
