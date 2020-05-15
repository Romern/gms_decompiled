package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OpenParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajzp();

    /* renamed from: a */
    public ShareTarget f81095a;

    /* renamed from: b */
    public rnt f81096b;

    public OpenParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenParams) {
            OpenParams openParams = (OpenParams) obj;
            return sdg.m34949a(this.f81095a, openParams.f81095a) && sdg.m34949a(this.f81096b, openParams.f81096b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81095a, this.f81096b});
    }

    public OpenParams(ShareTarget shareTarget, IBinder iBinder) {
        rnt rnt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(iBinder);
        } else {
            rnt = null;
        }
        this.f81095a = shareTarget;
        this.f81096b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81095a, i, false);
        see.m35038a(parcel, 2, this.f81096b.asBinder());
        see.m35062b(parcel, a);
    }
}
