package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AuthStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahaf();

    /* renamed from: a */
    public int f80341a;

    private AuthStatus() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthStatus) {
            return sdg.m34949a(Integer.valueOf(this.f80341a), Integer.valueOf(((AuthStatus) obj).f80341a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80341a)});
    }

    public AuthStatus(int i) {
        this.f80341a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80341a);
        see.m35062b(parcel, a);
    }
}
