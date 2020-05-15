package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnShareTargetLostParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajzl();

    /* renamed from: a */
    public ShareTarget f81092a;

    public OnShareTargetLostParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnShareTargetLostParams) {
            return sdg.m34949a(this.f81092a, ((OnShareTargetLostParams) obj).f81092a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81092a});
    }

    public OnShareTargetLostParams(ShareTarget shareTarget) {
        this.f81092a = shareTarget;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81092a, i, false);
        see.m35062b(parcel, a);
    }
}
