package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CancelParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajxk();

    /* renamed from: a */
    public ShareTarget f81073a;

    /* renamed from: b */
    public rnt f81074b;

    public CancelParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CancelParams) {
            CancelParams cancelParams = (CancelParams) obj;
            return sdg.m34949a(this.f81073a, cancelParams.f81073a) && sdg.m34949a(this.f81074b, cancelParams.f81074b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81073a, this.f81074b});
    }

    public CancelParams(ShareTarget shareTarget, IBinder iBinder) {
        rnt rnt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(iBinder);
        } else {
            rnt = null;
        }
        this.f81073a = shareTarget;
        this.f81074b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81073a, i, false);
        see.m35038a(parcel, 2, this.f81074b.asBinder());
        see.m35062b(parcel, a);
    }
}
