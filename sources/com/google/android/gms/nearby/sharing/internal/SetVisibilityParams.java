package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetVisibilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akbc();

    /* renamed from: a */
    public int f81130a;

    /* renamed from: b */
    public rnt f81131b;

    public SetVisibilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetVisibilityParams) {
            SetVisibilityParams setVisibilityParams = (SetVisibilityParams) obj;
            return sdg.m34949a(Integer.valueOf(this.f81130a), Integer.valueOf(setVisibilityParams.f81130a)) && sdg.m34949a(this.f81131b, setVisibilityParams.f81131b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81130a), this.f81131b});
    }

    public SetVisibilityParams(int i, IBinder iBinder) {
        rnt rnt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(iBinder);
        } else {
            rnt = null;
        }
        this.f81130a = i;
        this.f81131b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f81130a);
        see.m35038a(parcel, 2, this.f81131b.asBinder());
        see.m35062b(parcel, a);
    }
}
