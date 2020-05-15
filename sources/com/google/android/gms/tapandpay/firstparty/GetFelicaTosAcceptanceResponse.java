package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetFelicaTosAcceptanceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asnt();

    /* renamed from: a */
    public boolean f108375a;

    public GetFelicaTosAcceptanceResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetFelicaTosAcceptanceResponse) {
            return sdg.m34949a(Boolean.valueOf(this.f108375a), Boolean.valueOf(((GetFelicaTosAcceptanceResponse) obj).f108375a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f108375a)});
    }

    public GetFelicaTosAcceptanceResponse(boolean z) {
        this.f108375a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f108375a);
        see.m35062b(parcel, a);
    }
}
