package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnShareTargetDistanceChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajzj();

    /* renamed from: a */
    public ShareTarget f81090a;

    /* renamed from: b */
    public int f81091b;

    public OnShareTargetDistanceChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnShareTargetDistanceChangedParams) {
            OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams = (OnShareTargetDistanceChangedParams) obj;
            return sdg.m34949a(this.f81090a, onShareTargetDistanceChangedParams.f81090a) && sdg.m34949a(Integer.valueOf(this.f81091b), Integer.valueOf(onShareTargetDistanceChangedParams.f81091b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81090a, Integer.valueOf(this.f81091b)});
    }

    public OnShareTargetDistanceChangedParams(ShareTarget shareTarget, int i) {
        this.f81090a = shareTarget;
        this.f81091b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81090a, i, false);
        see.m35063b(parcel, 2, this.f81091b);
        see.m35062b(parcel, a);
    }
}
