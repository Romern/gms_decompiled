package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfs();

    /* renamed from: a */
    public final String f30071a;

    /* renamed from: b */
    public final rfl f30072b;

    /* renamed from: c */
    public final boolean f30073c;

    /* renamed from: d */
    public final boolean f30074d;

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        sch sch;
        byte[] bArr;
        this.f30071a = str;
        rfm rfm = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (!(queryLocalInterface instanceof sch)) {
                    sch = new scf(iBinder);
                } else {
                    sch = (sch) queryLocalInterface;
                }
                vzr b = sch.mo24595b();
                if (b != null) {
                    bArr = (byte[]) vzs.m41641a(b);
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                } else {
                    rfm = new rfm(bArr);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f30072b = rfm;
        this.f30073c = z;
        this.f30074d = z2;
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
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f30071a, false);
        rfl rfl = this.f30072b;
        if (rfl == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            rfl = null;
        }
        see.m35038a(parcel, 2, rfl);
        see.m35051a(parcel, 3, this.f30073c);
        see.m35051a(parcel, 4, this.f30074d);
        see.m35062b(parcel, a);
    }

    public GoogleCertificatesQuery(String str, rfl rfl, boolean z, boolean z2) {
        this.f30071a = str;
        this.f30072b = rfl;
        this.f30073c = z;
        this.f30074d = z2;
    }
}
