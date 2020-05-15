package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StopBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfl();

    /* renamed from: a */
    public final zcl f32315a;

    /* renamed from: b */
    public final zew f32316b;

    public StopBleScanRequest(IBinder iBinder, IBinder iBinder2) {
        zew zew;
        zcl zcl = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            zew = queryLocalInterface instanceof zew ? (zew) queryLocalInterface : new zew(iBinder);
        } else {
            zew = null;
        }
        this.f32316b = zew;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            if (queryLocalInterface2 instanceof zcl) {
                zcl = (zcl) queryLocalInterface2;
            } else {
                zcl = new zcj(iBinder2);
            }
        }
        this.f32315a = zcl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32316b.f12819a);
        zcl zcl = this.f32315a;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35062b(parcel, a);
    }

    public StopBleScanRequest(zew zew, zcl zcl) {
        this.f32316b = zew;
        this.f32315a = zcl;
    }
}
