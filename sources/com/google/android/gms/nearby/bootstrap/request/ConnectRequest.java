package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahel();

    /* renamed from: a */
    final int f80401a;

    /* renamed from: b */
    public final Device f80402b;

    /* renamed from: c */
    public final String f80403c;

    /* renamed from: d */
    public final String f80404d;

    /* renamed from: e */
    public final ahdj f80405e;

    /* renamed from: f */
    public final ahdm f80406f;

    /* renamed from: g */
    public final ahdp f80407g;

    /* renamed from: h */
    public final byte f80408h;

    /* renamed from: i */
    public final long f80409i;

    /* renamed from: j */
    public final String f80410j;

    /* renamed from: k */
    public final byte f80411k;

    /* renamed from: l */
    public final byte f80412l;

    public ConnectRequest(int i, Device device, String str, String str2, byte b, long j, String str3, byte b2, byte b3, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        ahdj ahdj;
        ahdm ahdm;
        this.f80401a = i;
        sdo.m34959a(device);
        this.f80402b = device;
        sdo.m34977c(str);
        this.f80403c = str;
        sdo.m34959a((Object) str2);
        this.f80404d = str2;
        this.f80408h = b;
        this.f80409i = j;
        this.f80411k = b2;
        this.f80412l = b3;
        this.f80410j = str3;
        sdo.m34959a(iBinder);
        ahdp ahdp = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            ahdj = queryLocalInterface instanceof ahdj ? (ahdj) queryLocalInterface : new ahdh(iBinder);
        } else {
            ahdj = null;
        }
        this.f80405e = ahdj;
        sdo.m34959a(iBinder2);
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
            ahdm = queryLocalInterface2 instanceof ahdm ? (ahdm) queryLocalInterface2 : new ahdk(iBinder2);
        } else {
            ahdm = null;
        }
        this.f80406f = ahdm;
        sdo.m34959a(iBinder3);
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            if (queryLocalInterface3 instanceof ahdp) {
                ahdp = (ahdp) queryLocalInterface3;
            } else {
                ahdp = new ahdn(iBinder3);
            }
        }
        this.f80407g = ahdp;
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
        IBinder iBinder2;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f80402b, i, false);
        see.m35046a(parcel, 2, this.f80403c, false);
        see.m35046a(parcel, 3, this.f80404d, false);
        ahdj ahdj = this.f80405e;
        IBinder iBinder3 = null;
        if (ahdj != null) {
            iBinder = ahdj.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 4, iBinder);
        ahdm ahdm = this.f80406f;
        if (ahdm != null) {
            iBinder2 = ahdm.asBinder();
        } else {
            iBinder2 = null;
        }
        see.m35038a(parcel, 5, iBinder2);
        ahdp ahdp = this.f80407g;
        if (ahdp != null) {
            iBinder3 = ahdp.asBinder();
        }
        see.m35038a(parcel, 6, iBinder3);
        see.m35032a(parcel, 7, this.f80408h);
        see.m35036a(parcel, 8, this.f80409i);
        see.m35046a(parcel, 9, this.f80410j, false);
        see.m35032a(parcel, 10, this.f80411k);
        see.m35032a(parcel, 11, this.f80412l);
        see.m35063b(parcel, 1000, this.f80401a);
        see.m35062b(parcel, a);
    }

    public ConnectRequest(Device device, String str, String str2, byte b, String str3, byte b2, ahdj ahdj, ahdm ahdm, ahdp ahdp) {
        this.f80401a = 1;
        sdo.m34959a(device);
        this.f80402b = device;
        sdo.m34977c(str);
        this.f80403c = str;
        sdo.m34959a((Object) str2);
        this.f80404d = str2;
        this.f80408h = b;
        this.f80409i = 10000;
        this.f80410j = str3;
        this.f80411k = b2;
        this.f80412l = 1;
        sdo.m34959a(ahdj);
        this.f80405e = ahdj;
        sdo.m34959a(ahdm);
        this.f80406f = ahdm;
        sdo.m34959a(ahdp);
        this.f80407g = ahdp;
    }
}
