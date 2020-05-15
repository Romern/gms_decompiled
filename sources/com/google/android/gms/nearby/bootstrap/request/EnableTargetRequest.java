package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EnableTargetRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahep();

    /* renamed from: a */
    final int f80421a;

    /* renamed from: b */
    public final String f80422b;

    /* renamed from: c */
    public final String f80423c;

    /* renamed from: d */
    public final ahdj f80424d;

    /* renamed from: e */
    public final ahdm f80425e;

    /* renamed from: f */
    public final ahdp f80426f;

    /* renamed from: g */
    public final byte f80427g;

    /* renamed from: h */
    public final byte f80428h;

    public EnableTargetRequest(int i, String str, String str2, byte b, byte b2, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        ahdj ahdj;
        ahdm ahdm;
        this.f80421a = i;
        sdo.m34977c(str);
        this.f80422b = str;
        sdo.m34959a((Object) str2);
        this.f80423c = str2;
        this.f80427g = b;
        this.f80428h = b2;
        sdo.m34959a(iBinder);
        ahdp ahdp = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            ahdj = queryLocalInterface instanceof ahdj ? (ahdj) queryLocalInterface : new ahdh(iBinder);
        } else {
            ahdj = null;
        }
        this.f80424d = ahdj;
        sdo.m34959a(iBinder2);
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
            ahdm = queryLocalInterface2 instanceof ahdm ? (ahdm) queryLocalInterface2 : new ahdk(iBinder2);
        } else {
            ahdm = null;
        }
        this.f80425e = ahdm;
        sdo.m34959a(iBinder3);
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            if (queryLocalInterface3 instanceof ahdp) {
                ahdp = (ahdp) queryLocalInterface3;
            } else {
                ahdp = new ahdn(iBinder3);
            }
        }
        this.f80426f = ahdp;
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
        see.m35046a(parcel, 1, this.f80422b, false);
        see.m35046a(parcel, 2, this.f80423c, false);
        ahdj ahdj = this.f80424d;
        IBinder iBinder3 = null;
        if (ahdj != null) {
            iBinder = ahdj.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        ahdm ahdm = this.f80425e;
        if (ahdm != null) {
            iBinder2 = ahdm.asBinder();
        } else {
            iBinder2 = null;
        }
        see.m35038a(parcel, 4, iBinder2);
        ahdp ahdp = this.f80426f;
        if (ahdp != null) {
            iBinder3 = ahdp.asBinder();
        }
        see.m35038a(parcel, 5, iBinder3);
        see.m35032a(parcel, 6, this.f80427g);
        see.m35032a(parcel, 7, this.f80428h);
        see.m35063b(parcel, 1000, this.f80421a);
        see.m35062b(parcel, a);
    }
}
