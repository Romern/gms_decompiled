package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SendPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aiij();

    /* renamed from: a */
    public aigr f80624a;

    /* renamed from: b */
    public String[] f80625b;

    /* renamed from: c */
    public ParcelablePayload f80626c;

    /* renamed from: d */
    public boolean f80627d;

    public SendPayloadParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendPayloadParams) {
            SendPayloadParams sendPayloadParams = (SendPayloadParams) obj;
            return sdg.m34949a(this.f80624a, sendPayloadParams.f80624a) && Arrays.equals(this.f80625b, sendPayloadParams.f80625b) && sdg.m34949a(this.f80626c, sendPayloadParams.f80626c) && sdg.m34949a(Boolean.valueOf(this.f80627d), Boolean.valueOf(sendPayloadParams.f80627d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80624a, Integer.valueOf(Arrays.hashCode(this.f80625b)), this.f80626c, Boolean.valueOf(this.f80627d)});
    }

    public SendPayloadParams(IBinder iBinder, String[] strArr, ParcelablePayload parcelablePayload, boolean z) {
        aigr aigr;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            aigr = queryLocalInterface instanceof aigr ? (aigr) queryLocalInterface : new aigp(iBinder);
        } else {
            aigr = null;
        }
        this.f80624a = aigr;
        this.f80625b = strArr;
        this.f80626c = parcelablePayload;
        this.f80627d = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        aigr aigr = this.f80624a;
        if (aigr != null) {
            iBinder = aigr.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        see.m35058a(parcel, 2, this.f80625b, false);
        see.m35040a(parcel, 3, this.f80626c, i, false);
        see.m35051a(parcel, 4, this.f80627d);
        see.m35062b(parcel, a);
    }
}
