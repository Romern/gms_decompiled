package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AcceptParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajxi();

    /* renamed from: a */
    public ShareTarget f81071a;

    /* renamed from: b */
    public rnt f81072b;

    public AcceptParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AcceptParams) {
            AcceptParams acceptParams = (AcceptParams) obj;
            return sdg.m34949a(this.f81071a, acceptParams.f81071a) && sdg.m34949a(this.f81072b, acceptParams.f81072b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81071a, this.f81072b});
    }

    public AcceptParams(ShareTarget shareTarget, IBinder iBinder) {
        rnt rnt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(iBinder);
        } else {
            rnt = null;
        }
        this.f81071a = shareTarget;
        this.f81072b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81071a, i, false);
        see.m35038a(parcel, 2, this.f81072b.asBinder());
        see.m35062b(parcel, a);
    }
}
