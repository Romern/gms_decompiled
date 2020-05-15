package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DisableTargetRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahen();

    /* renamed from: a */
    final int f80416a;

    /* renamed from: b */
    public final ahdp f80417b;

    public DisableTargetRequest(int i, IBinder iBinder) {
        ahdp ahdp;
        this.f80416a = i;
        sdo.m34959a(iBinder);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            ahdp = queryLocalInterface instanceof ahdp ? (ahdp) queryLocalInterface : new ahdn(iBinder);
        } else {
            ahdp = null;
        }
        this.f80417b = ahdp;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        ahdp ahdp = this.f80417b;
        if (ahdp != null) {
            iBinder = ahdp.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        see.m35063b(parcel, 1000, this.f80416a);
        see.m35062b(parcel, a);
    }
}
