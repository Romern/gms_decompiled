package com.google.location.nearby.direct.client.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OperationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bvbg();

    /* renamed from: a */
    final byte[] f191768a;

    /* renamed from: b */
    public final bvbb f191769b;

    /* renamed from: c */
    public final bvax f191770c;

    /* renamed from: d */
    public final WorkSource f191771d;

    /* renamed from: e */
    public final BleFilter[] f191772e;

    public OperationRequest(bvbb bvbb, bvax bvax) {
        this(bvbb, bvax, (WorkSource) null, (BleFilter[]) null);
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
        see.m35052a(parcel, 1, this.f191768a, false);
        bvax bvax = this.f191770c;
        if (bvax != null) {
            iBinder = bvax.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35040a(parcel, 3, this.f191771d, i, false);
        see.m35057a(parcel, 4, this.f191772e, i);
        see.m35062b(parcel, a);
    }

    public OperationRequest(bvbb bvbb, bvax bvax, WorkSource workSource, BleFilter[] bleFilterArr) {
        this.f191769b = bvbb;
        this.f191768a = bvbb.mo73642k();
        this.f191770c = bvax;
        this.f191771d = workSource;
        this.f191772e = bleFilterArr;
    }

    public OperationRequest(byte[] bArr, IBinder iBinder, WorkSource workSource, BleFilter[] bleFilterArr) {
        bvax bvax;
        this.f191768a = bArr;
        try {
            this.f191769b = (bvbb) GeneratedMessageLite.m124014a(bvbb.f155510j, bArr);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.direct.client.internal.INearbyDirectCallback");
                if (queryLocalInterface instanceof bvax) {
                    bvax = (bvax) queryLocalInterface;
                } else {
                    bvax = new bvav(iBinder);
                }
            } else {
                bvax = null;
            }
            this.f191770c = bvax;
            this.f191771d = workSource;
            this.f191772e = bleFilterArr;
        } catch (bxwf e) {
            throw new IllegalArgumentException("Invalid proto bytes", e);
        }
    }
}
