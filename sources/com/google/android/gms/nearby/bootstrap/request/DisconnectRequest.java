package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DisconnectRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aheo();

    /* renamed from: a */
    final int f80418a;

    /* renamed from: b */
    public final Device f80419b;

    /* renamed from: c */
    public final ahdp f80420c;

    public DisconnectRequest(int i, Device device, IBinder iBinder) {
        ahdp ahdp;
        this.f80418a = i;
        sdo.m34959a(device);
        this.f80419b = device;
        sdo.m34959a(iBinder);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            ahdp = queryLocalInterface instanceof ahdp ? (ahdp) queryLocalInterface : new ahdn(iBinder);
        } else {
            ahdp = null;
        }
        this.f80420c = ahdp;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f80419b, i, false);
        see.m35038a(parcel, 2, this.f80420c.asBinder());
        see.m35063b(parcel, 1000, this.f80418a);
        see.m35062b(parcel, a);
    }

    public DisconnectRequest(Device device, ahdp ahdp) {
        this.f80418a = 1;
        sdo.m34959a(device);
        this.f80419b = device;
        sdo.m34959a(ahdp);
        this.f80420c = ahdp;
    }
}
