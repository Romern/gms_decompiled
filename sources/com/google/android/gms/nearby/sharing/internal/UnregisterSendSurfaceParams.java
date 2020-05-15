package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UnregisterSendSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akbp();

    /* renamed from: a */
    public ajyz f81136a;

    /* renamed from: b */
    public rnt f81137b;

    public UnregisterSendSurfaceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterSendSurfaceParams) {
            UnregisterSendSurfaceParams unregisterSendSurfaceParams = (UnregisterSendSurfaceParams) obj;
            return sdg.m34949a(this.f81136a, unregisterSendSurfaceParams.f81136a) && sdg.m34949a(this.f81137b, unregisterSendSurfaceParams.f81137b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81136a, this.f81137b});
    }

    public UnregisterSendSurfaceParams(IBinder iBinder, IBinder iBinder2) {
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
        this.f81136a = ajyz;
        this.f81137b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81136a.asBinder());
        see.m35038a(parcel, 2, this.f81137b.asBinder());
        see.m35062b(parcel, a);
    }
}
