package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RegisterSendSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akan();

    /* renamed from: a */
    public ajyz f81111a;

    /* renamed from: b */
    public ajyt f81112b;

    /* renamed from: c */
    public int f81113c;

    /* renamed from: d */
    public rnt f81114d;

    public RegisterSendSurfaceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSendSurfaceParams) {
            RegisterSendSurfaceParams registerSendSurfaceParams = (RegisterSendSurfaceParams) obj;
            return sdg.m34949a(this.f81111a, registerSendSurfaceParams.f81111a) && sdg.m34949a(this.f81112b, registerSendSurfaceParams.f81112b) && sdg.m34949a(Integer.valueOf(this.f81113c), Integer.valueOf(registerSendSurfaceParams.f81113c)) && sdg.m34949a(this.f81114d, registerSendSurfaceParams.f81114d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81111a, this.f81112b, Integer.valueOf(this.f81113c), this.f81114d});
    }

    public RegisterSendSurfaceParams(IBinder iBinder, IBinder iBinder2, int i, IBinder iBinder3) {
        ajyz ajyz;
        ajyt ajyt;
        rnt rnt = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            ajyz = queryLocalInterface instanceof ajyz ? (ajyz) queryLocalInterface : new ajyx(iBinder);
        } else {
            ajyz = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback");
            ajyt = queryLocalInterface2 instanceof ajyt ? (ajyt) queryLocalInterface2 : new ajyr(iBinder2);
        } else {
            ajyt = null;
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface3 instanceof rnt) {
                rnt = (rnt) queryLocalInterface3;
            } else {
                rnt = new rnr(iBinder3);
            }
        }
        this.f81111a = ajyz;
        this.f81112b = ajyt;
        this.f81113c = i;
        this.f81114d = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81111a.asBinder());
        see.m35038a(parcel, 2, this.f81112b.asBinder());
        see.m35063b(parcel, 3, this.f81113c);
        see.m35038a(parcel, 4, this.f81114d.asBinder());
        see.m35062b(parcel, a);
    }
}
