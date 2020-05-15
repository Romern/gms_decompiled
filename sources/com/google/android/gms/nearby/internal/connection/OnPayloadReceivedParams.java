package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnPayloadReceivedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aiht();

    /* renamed from: a */
    public String f80596a;

    /* renamed from: b */
    public ParcelablePayload f80597b;

    /* renamed from: c */
    public boolean f80598c;

    public OnPayloadReceivedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPayloadReceivedParams) {
            OnPayloadReceivedParams onPayloadReceivedParams = (OnPayloadReceivedParams) obj;
            return sdg.m34949a(this.f80596a, onPayloadReceivedParams.f80596a) && sdg.m34949a(this.f80597b, onPayloadReceivedParams.f80597b) && sdg.m34949a(Boolean.valueOf(this.f80598c), Boolean.valueOf(onPayloadReceivedParams.f80598c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80596a, this.f80597b, Boolean.valueOf(this.f80598c)});
    }

    public OnPayloadReceivedParams(String str, ParcelablePayload parcelablePayload, boolean z) {
        this.f80596a = str;
        this.f80597b = parcelablePayload;
        this.f80598c = z;
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
        see.m35046a(parcel, 1, this.f80596a, false);
        see.m35040a(parcel, 2, this.f80597b, i, false);
        see.m35051a(parcel, 3, this.f80598c);
        see.m35062b(parcel, a);
    }
}
