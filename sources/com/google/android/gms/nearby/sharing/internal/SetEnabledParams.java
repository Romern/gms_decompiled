package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akba();

    /* renamed from: a */
    public boolean f81128a;

    /* renamed from: b */
    public rnt f81129b;

    public SetEnabledParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetEnabledParams) {
            SetEnabledParams setEnabledParams = (SetEnabledParams) obj;
            return sdg.m34949a(Boolean.valueOf(this.f81128a), Boolean.valueOf(setEnabledParams.f81128a)) && sdg.m34949a(this.f81129b, setEnabledParams.f81129b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f81128a), this.f81129b});
    }

    public SetEnabledParams(boolean z, IBinder iBinder) {
        rnt rnt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(iBinder);
        } else {
            rnt = null;
        }
        this.f81128a = z;
        this.f81129b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f81128a);
        see.m35038a(parcel, 2, this.f81129b.asBinder());
        see.m35062b(parcel, a);
    }
}
