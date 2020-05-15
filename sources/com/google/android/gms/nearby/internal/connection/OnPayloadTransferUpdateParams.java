package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnPayloadTransferUpdateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aihv();

    /* renamed from: a */
    public String f80599a;

    /* renamed from: b */
    public PayloadTransferUpdate f80600b;

    public OnPayloadTransferUpdateParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPayloadTransferUpdateParams) {
            OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = (OnPayloadTransferUpdateParams) obj;
            return sdg.m34949a(this.f80599a, onPayloadTransferUpdateParams.f80599a) && sdg.m34949a(this.f80600b, onPayloadTransferUpdateParams.f80600b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80599a, this.f80600b});
    }

    public OnPayloadTransferUpdateParams(String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.f80599a = str;
        this.f80600b = payloadTransferUpdate;
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
        see.m35046a(parcel, 1, this.f80599a, false);
        see.m35040a(parcel, 2, this.f80600b, i, false);
        see.m35062b(parcel, a);
    }
}
