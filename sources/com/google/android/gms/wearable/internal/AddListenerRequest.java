package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axpq();

    /* renamed from: a */
    public final axrv f110878a;

    /* renamed from: b */
    public final IntentFilter[] f110879b;

    /* renamed from: c */
    public final String f110880c;

    /* renamed from: d */
    public final String f110881d;

    public AddListenerRequest(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        axrv axrv;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (queryLocalInterface instanceof axrv) {
                axrv = (axrv) queryLocalInterface;
            } else {
                axrv = new axrt(iBinder);
            }
            this.f110878a = axrv;
        } else {
            this.f110878a = null;
        }
        this.f110879b = intentFilterArr;
        this.f110880c = str;
        this.f110881d = str2;
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
        axrv axrv = this.f110878a;
        if (axrv != null) {
            iBinder = axrv.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35057a(parcel, 3, this.f110879b, i);
        see.m35046a(parcel, 4, this.f110880c, false);
        see.m35046a(parcel, 5, this.f110881d, false);
        see.m35062b(parcel, a);
    }

    public AddListenerRequest(axtn axtn) {
        this.f110878a = axtn;
        this.f110879b = axtn.f96327b;
        this.f110880c = null;
        this.f110881d = null;
    }
}
