package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetAccountParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajxq();

    /* renamed from: a */
    public ajyd f81075a;

    public GetAccountParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetAccountParams) {
            return sdg.m34949a(this.f81075a, ((GetAccountParams) obj).f81075a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81075a});
    }

    public GetAccountParams(IBinder iBinder) {
        ajyd ajyd;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IAccountResultListener");
            ajyd = queryLocalInterface instanceof ajyd ? (ajyd) queryLocalInterface : new ajyb(iBinder);
        } else {
            ajyd = null;
        }
        this.f81075a = ajyd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81075a.asBinder());
        see.m35062b(parcel, a);
    }
}
