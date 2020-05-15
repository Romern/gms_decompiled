package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RegisterReceiveSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akal();

    /* renamed from: a */
    public ajyz f81108a;

    /* renamed from: b */
    public int f81109b;

    /* renamed from: c */
    public rnt f81110c;

    public RegisterReceiveSurfaceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterReceiveSurfaceParams) {
            RegisterReceiveSurfaceParams registerReceiveSurfaceParams = (RegisterReceiveSurfaceParams) obj;
            return sdg.m34949a(this.f81108a, registerReceiveSurfaceParams.f81108a) && sdg.m34949a(Integer.valueOf(this.f81109b), Integer.valueOf(registerReceiveSurfaceParams.f81109b)) && sdg.m34949a(this.f81110c, registerReceiveSurfaceParams.f81110c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81108a, Integer.valueOf(this.f81109b), this.f81110c});
    }

    public RegisterReceiveSurfaceParams(IBinder iBinder, int i, IBinder iBinder2) {
        ajyz ajyz;
        rnt rnt = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            ajyz = queryLocalInterface instanceof ajyz ? (ajyz) queryLocalInterface : new ajyx(iBinder);
        } else {
            ajyz = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface2 instanceof rnt) {
                rnt = (rnt) queryLocalInterface2;
            } else {
                rnt = new rnr(iBinder2);
            }
        }
        this.f81108a = ajyz;
        this.f81109b = i;
        this.f81110c = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81108a.asBinder());
        see.m35063b(parcel, 2, this.f81109b);
        see.m35038a(parcel, 3, this.f81110c.asBinder());
        see.m35062b(parcel, a);
    }
}
