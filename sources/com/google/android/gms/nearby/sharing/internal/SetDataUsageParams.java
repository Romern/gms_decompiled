package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetDataUsageParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akaw();

    /* renamed from: a */
    public int f81124a;

    /* renamed from: b */
    public rnt f81125b;

    public SetDataUsageParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetDataUsageParams) {
            SetDataUsageParams setDataUsageParams = (SetDataUsageParams) obj;
            return sdg.m34949a(Integer.valueOf(this.f81124a), Integer.valueOf(setDataUsageParams.f81124a)) && sdg.m34949a(this.f81125b, setDataUsageParams.f81125b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81124a), this.f81125b});
    }

    public SetDataUsageParams(int i, IBinder iBinder) {
        rnt rnt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(iBinder);
        } else {
            rnt = null;
        }
        this.f81124a = i;
        this.f81125b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f81124a);
        see.m35038a(parcel, 2, this.f81125b.asBinder());
        see.m35062b(parcel, a);
    }
}
