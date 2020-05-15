package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ListClaimedBleDevicesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zex();

    /* renamed from: a */
    public final zcv f32264a;

    public ListClaimedBleDevicesRequest(IBinder iBinder) {
        zcv zcv;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
            zcv = queryLocalInterface instanceof zcv ? (zcv) queryLocalInterface : new zct(iBinder);
        } else {
            zcv = null;
        }
        this.f32264a = zcv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32264a.asBinder());
        see.m35062b(parcel, a);
    }

    public ListClaimedBleDevicesRequest(zcv zcv) {
        this.f32264a = zcv;
    }
}
