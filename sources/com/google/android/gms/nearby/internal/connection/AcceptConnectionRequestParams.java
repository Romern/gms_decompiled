package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AcceptConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aidh();

    /* renamed from: a */
    public aigr f80558a;

    /* renamed from: b */
    public aifv f80559b;

    /* renamed from: c */
    public String f80560c;

    /* renamed from: d */
    public byte[] f80561d;

    /* renamed from: e */
    public aigo f80562e;

    public AcceptConnectionRequestParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AcceptConnectionRequestParams) {
            AcceptConnectionRequestParams acceptConnectionRequestParams = (AcceptConnectionRequestParams) obj;
            return sdg.m34949a(this.f80558a, acceptConnectionRequestParams.f80558a) && sdg.m34949a(this.f80559b, acceptConnectionRequestParams.f80559b) && sdg.m34949a(this.f80560c, acceptConnectionRequestParams.f80560c) && Arrays.equals(this.f80561d, acceptConnectionRequestParams.f80561d) && sdg.m34949a(this.f80562e, acceptConnectionRequestParams.f80562e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80558a, this.f80559b, this.f80560c, Integer.valueOf(Arrays.hashCode(this.f80561d)), this.f80562e});
    }

    public AcceptConnectionRequestParams(IBinder iBinder, IBinder iBinder2, String str, byte[] bArr, IBinder iBinder3) {
        aigr aigr;
        aifv aifv;
        aigo aigo = null;
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
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            if (queryLocalInterface3 instanceof aigo) {
                aigo = (aigo) queryLocalInterface3;
            } else {
                aigo = new aigm(iBinder3);
            }
        }
        this.f80558a = aigr;
        this.f80559b = aifv;
        this.f80560c = str;
        this.f80561d = bArr;
        this.f80562e = aigo;
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
        int a = see.m35030a(parcel);
        aigr aigr = this.f80558a;
        IBinder iBinder3 = null;
        if (aigr != null) {
            iBinder = aigr.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        aifv aifv = this.f80559b;
        if (aifv != null) {
            iBinder2 = aifv.asBinder();
        } else {
            iBinder2 = null;
        }
        see.m35038a(parcel, 2, iBinder2);
        see.m35046a(parcel, 3, this.f80560c, false);
        see.m35052a(parcel, 4, this.f80561d, false);
        aigo aigo = this.f80562e;
        if (aigo != null) {
            iBinder3 = aigo.asBinder();
        }
        see.m35038a(parcel, 5, iBinder3);
        see.m35062b(parcel, a);
    }
}
