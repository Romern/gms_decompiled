package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zed();

    /* renamed from: a */
    public final String f32196a;

    /* renamed from: b */
    public final BleDevice f32197b;

    /* renamed from: c */
    public final zcl f32198c;

    public ClaimBleDeviceRequest(String str, BleDevice bleDevice, IBinder iBinder) {
        zcl zcl;
        this.f32196a = str;
        this.f32197b = bleDevice;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32198c = zcl;
    }

    public final String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", this.f32196a, this.f32197b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f32196a, false);
        see.m35040a(parcel, 2, this.f32197b, i, false);
        zcl zcl = this.f32198c;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        see.m35062b(parcel, a);
    }

    public ClaimBleDeviceRequest(String str, BleDevice bleDevice, zcl zcl) {
        this.f32196a = str;
        this.f32197b = bleDevice;
        this.f32198c = zcl;
    }
}
