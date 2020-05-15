package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetDeviceNameParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajxy();

    /* renamed from: a */
    public ajyw f81083a;

    public GetDeviceNameParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDeviceNameParams) {
            return sdg.m34949a(this.f81083a, ((GetDeviceNameParams) obj).f81083a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81083a});
    }

    public GetDeviceNameParams(IBinder iBinder) {
        ajyw ajyw;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IStringResultListener");
            ajyw = queryLocalInterface instanceof ajyw ? (ajyw) queryLocalInterface : new ajyu(iBinder);
        } else {
            ajyw = null;
        }
        this.f81083a = ajyw;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81083a.asBinder());
        see.m35062b(parcel, a);
    }
}
