package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SendConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aiih();

    /* renamed from: a */
    public aigr f80615a;

    /* renamed from: b */
    public aifv f80616b;

    /* renamed from: c */
    public aigb f80617c;

    /* renamed from: d */
    public String f80618d;

    /* renamed from: e */
    public String f80619e;

    /* renamed from: f */
    public byte[] f80620f;

    /* renamed from: g */
    public aify f80621g;

    /* renamed from: h */
    public byte[] f80622h;

    /* renamed from: i */
    public ConnectionOptions f80623i;

    public SendConnectionRequestParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendConnectionRequestParams) {
            SendConnectionRequestParams sendConnectionRequestParams = (SendConnectionRequestParams) obj;
            return sdg.m34949a(this.f80615a, sendConnectionRequestParams.f80615a) && sdg.m34949a(this.f80616b, sendConnectionRequestParams.f80616b) && sdg.m34949a(this.f80617c, sendConnectionRequestParams.f80617c) && sdg.m34949a(this.f80618d, sendConnectionRequestParams.f80618d) && sdg.m34949a(this.f80619e, sendConnectionRequestParams.f80619e) && Arrays.equals(this.f80620f, sendConnectionRequestParams.f80620f) && sdg.m34949a(this.f80621g, sendConnectionRequestParams.f80621g) && Arrays.equals(this.f80622h, sendConnectionRequestParams.f80622h) && sdg.m34949a(this.f80623i, sendConnectionRequestParams.f80623i);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80615a, this.f80616b, this.f80617c, this.f80618d, this.f80619e, Integer.valueOf(Arrays.hashCode(this.f80620f)), this.f80621g, Integer.valueOf(Arrays.hashCode(this.f80622h)), this.f80623i});
    }

    public SendConnectionRequestParams(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, String str, String str2, byte[] bArr, IBinder iBinder4, byte[] bArr2, ConnectionOptions connectionOptions) {
        aigr aigr;
        aifv aifv;
        aigb aigb;
        aify aify = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            aigr = queryLocalInterface instanceof aigr ? (aigr) queryLocalInterface : new aigp(iBinder);
        } else {
            aigr = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            aifv = queryLocalInterface2 instanceof aifv ? (aifv) queryLocalInterface2 : new aift(iBinder2);
        } else {
            aifv = null;
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            aigb = queryLocalInterface3 instanceof aigb ? (aigb) queryLocalInterface3 : new aifz(iBinder3);
        } else {
            aigb = null;
        }
        if (iBinder4 != null) {
            IInterface queryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            if (queryLocalInterface4 instanceof aify) {
                aify = (aify) queryLocalInterface4;
            } else {
                aify = new aifw(iBinder4);
            }
        }
        this.f80615a = aigr;
        this.f80616b = aifv;
        this.f80617c = aigb;
        this.f80618d = str;
        this.f80619e = str2;
        this.f80620f = bArr;
        this.f80621g = aify;
        this.f80622h = bArr2;
        this.f80623i = connectionOptions;
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
        IBinder iBinder2;
        IBinder iBinder3;
        int a = see.m35030a(parcel);
        aigr aigr = this.f80615a;
        IBinder iBinder4 = null;
        if (aigr != null) {
            iBinder = aigr.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        aifv aifv = this.f80616b;
        if (aifv != null) {
            iBinder2 = aifv.asBinder();
        } else {
            iBinder2 = null;
        }
        see.m35038a(parcel, 2, iBinder2);
        aigb aigb = this.f80617c;
        if (aigb != null) {
            iBinder3 = aigb.asBinder();
        } else {
            iBinder3 = null;
        }
        see.m35038a(parcel, 3, iBinder3);
        see.m35046a(parcel, 4, this.f80618d, false);
        see.m35046a(parcel, 5, this.f80619e, false);
        see.m35052a(parcel, 6, this.f80620f, false);
        aify aify = this.f80621g;
        if (aify != null) {
            iBinder4 = aify.asBinder();
        }
        see.m35038a(parcel, 7, iBinder4);
        see.m35052a(parcel, 8, this.f80622h, false);
        see.m35040a(parcel, 9, this.f80623i, i, false);
        see.m35062b(parcel, a);
    }
}
