package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class IsOptedInParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajzd();

    /* renamed from: a */
    public ajyg f81086a;

    public IsOptedInParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsOptedInParams) {
            return sdg.m34949a(this.f81086a, ((IsOptedInParams) obj).f81086a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81086a});
    }

    public IsOptedInParams(IBinder iBinder) {
        ajyg ajyg;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IBooleanResultListener");
            ajyg = queryLocalInterface instanceof ajyg ? (ajyg) queryLocalInterface : new ajye(iBinder);
        } else {
            ajyg = null;
        }
        this.f81086a = ajyg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81086a.asBinder());
        see.m35062b(parcel, a);
    }
}
