package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aheq();

    /* renamed from: a */
    final int f80429a;

    /* renamed from: b */
    public final Device f80430b;

    /* renamed from: c */
    public final byte[] f80431c;

    /* renamed from: d */
    public final ahdp f80432d;

    public SendDataRequest(int i, Device device, byte[] bArr, IBinder iBinder) {
        ahdp ahdp;
        this.f80429a = i;
        sdo.m34959a(device);
        this.f80430b = device;
        this.f80431c = (byte[]) sdo.m34959a(bArr);
        sdo.m34959a(iBinder);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            ahdp = queryLocalInterface instanceof ahdp ? (ahdp) queryLocalInterface : new ahdn(iBinder);
        } else {
            ahdp = null;
        }
        this.f80432d = ahdp;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f80430b, i, false);
        see.m35052a(parcel, 2, this.f80431c, false);
        ahdp ahdp = this.f80432d;
        if (ahdp != null) {
            iBinder = ahdp.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        see.m35063b(parcel, 1000, this.f80429a);
        see.m35062b(parcel, a);
    }

    public SendDataRequest(Device device, byte[] bArr, ahdp ahdp) {
        this.f80429a = 1;
        sdo.m34959a(device);
        this.f80430b = device;
        this.f80431c = (byte[]) sdo.m34959a(bArr);
        sdo.m34959a(ahdp);
        this.f80432d = ahdp;
    }
}
