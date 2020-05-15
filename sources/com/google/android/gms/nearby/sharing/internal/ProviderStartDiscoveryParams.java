package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ProviderStartDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akaf();

    /* renamed from: a */
    public ajyt f81107a;

    public ProviderStartDiscoveryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderStartDiscoveryParams) {
            return sdg.m34949a(this.f81107a, ((ProviderStartDiscoveryParams) obj).f81107a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81107a});
    }

    public ProviderStartDiscoveryParams(IBinder iBinder) {
        ajyt ajyt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback");
            ajyt = queryLocalInterface instanceof ajyt ? (ajyt) queryLocalInterface : new ajyr(iBinder);
        } else {
            ajyt = null;
        }
        this.f81107a = ajyt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81107a.asBinder());
        see.m35062b(parcel, a);
    }
}
