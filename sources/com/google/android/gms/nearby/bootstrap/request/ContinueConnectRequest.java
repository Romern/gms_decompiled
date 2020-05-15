package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContinueConnectRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahem();

    /* renamed from: a */
    final int f80413a;

    /* renamed from: b */
    public final String f80414b;

    /* renamed from: c */
    public final ahdp f80415c;

    public ContinueConnectRequest(int i, String str, IBinder iBinder) {
        ahdp ahdp;
        this.f80413a = i;
        sdo.m34959a((Object) str);
        this.f80414b = str;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            ahdp = queryLocalInterface instanceof ahdp ? (ahdp) queryLocalInterface : new ahdn(iBinder);
        } else {
            ahdp = null;
        }
        this.f80415c = ahdp;
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
        see.m35046a(parcel, 1, this.f80414b, false);
        ahdp ahdp = this.f80415c;
        if (ahdp != null) {
            iBinder = ahdp.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35063b(parcel, 1000, this.f80413a);
        see.m35062b(parcel, a);
    }

    public ContinueConnectRequest(String str, ahdp ahdp) {
        this.f80413a = 1;
        sdo.m34959a((Object) str);
        this.f80414b = str;
        sdo.m34959a(ahdp);
        this.f80415c = ahdp;
    }
}
