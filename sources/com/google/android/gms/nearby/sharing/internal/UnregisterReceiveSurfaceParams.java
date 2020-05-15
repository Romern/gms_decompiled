package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UnregisterReceiveSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akbn();

    /* renamed from: a */
    public ajyz f81134a;

    /* renamed from: b */
    public rnt f81135b;

    public UnregisterReceiveSurfaceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterReceiveSurfaceParams) {
            UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams = (UnregisterReceiveSurfaceParams) obj;
            return sdg.m34949a(this.f81134a, unregisterReceiveSurfaceParams.f81134a) && sdg.m34949a(this.f81135b, unregisterReceiveSurfaceParams.f81135b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81134a, this.f81135b});
    }

    public UnregisterReceiveSurfaceParams(IBinder iBinder, IBinder iBinder2) {
        ajyz ajyz;
        rnt rnt = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            ajyz = queryLocalInterface instanceof ajyz ? (ajyz) queryLocalInterface : new ajyx(iBinder);
        } else {
            ajyz = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface2 instanceof rnt) {
                rnt = (rnt) queryLocalInterface2;
            } else {
                rnt = new rnr(iBinder2);
            }
        }
        this.f81134a = ajyz;
        this.f81135b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81134a.asBinder());
        see.m35038a(parcel, 2, this.f81135b.asBinder());
        see.m35062b(parcel, a);
    }
}
