package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetVisibilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajya();

    /* renamed from: a */
    public ajyn f81084a;

    public GetVisibilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetVisibilityParams) {
            return sdg.m34949a(this.f81084a, ((GetVisibilityParams) obj).f81084a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81084a});
    }

    public GetVisibilityParams(IBinder iBinder) {
        ajyn ajyn;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IIntResultListener");
            ajyn = queryLocalInterface instanceof ajyn ? (ajyn) queryLocalInterface : new ajyl(iBinder);
        } else {
            ajyn = null;
        }
        this.f81084a = ajyn;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81084a.asBinder());
        see.m35062b(parcel, a);
    }
}
