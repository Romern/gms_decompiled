package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RequestPayModuleRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfx();

    /* renamed from: a */
    public int f81570a;

    public RequestPayModuleRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestPayModuleRequest) {
            return sdg.m34949a(Integer.valueOf(this.f81570a), Integer.valueOf(((RequestPayModuleRequest) obj).f81570a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81570a)});
    }

    public RequestPayModuleRequest(int i) {
        this.f81570a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f81570a);
        see.m35062b(parcel, a);
    }
}
