package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetFelicaTosAcceptanceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asys();

    /* renamed from: a */
    public boolean f108553a;

    public SetFelicaTosAcceptanceRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetFelicaTosAcceptanceRequest) {
            return sdg.m34949a(Boolean.valueOf(this.f108553a), Boolean.valueOf(((SetFelicaTosAcceptanceRequest) obj).f108553a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f108553a)});
    }

    public SetFelicaTosAcceptanceRequest(boolean z) {
        this.f108553a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f108553a);
        see.m35062b(parcel, a);
    }
}
