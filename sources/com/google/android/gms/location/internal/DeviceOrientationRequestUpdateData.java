package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeje();

    /* renamed from: a */
    public int f79413a;

    /* renamed from: b */
    public DeviceOrientationRequestInternal f79414b;

    /* renamed from: c */
    public aehq f79415c;

    /* renamed from: d */
    public aejv f79416d;

    public DeviceOrientationRequestUpdateData(int i, DeviceOrientationRequestInternal deviceOrientationRequestInternal, IBinder iBinder, IBinder iBinder2) {
        aehq aehq;
        this.f79413a = i;
        this.f79414b = deviceOrientationRequestInternal;
        aejv aejv = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            aehq = queryLocalInterface instanceof aehq ? (aehq) queryLocalInterface : new aeho(iBinder);
        } else {
            aehq = null;
        }
        this.f79415c = aehq;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof aejv) {
                aejv = (aejv) queryLocalInterface2;
            } else {
                aejv = new aejt(iBinder2);
            }
        }
        this.f79416d = aejv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79413a);
        see.m35040a(parcel, 2, this.f79414b, i, false);
        aehq aehq = this.f79415c;
        IBinder iBinder2 = null;
        if (aehq != null) {
            iBinder = aehq.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        aejv aejv = this.f79416d;
        if (aejv != null) {
            iBinder2 = aejv.asBinder();
        }
        see.m35038a(parcel, 4, iBinder2);
        see.m35062b(parcel, a);
    }
}
