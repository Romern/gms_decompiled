package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PassInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asoi();

    /* renamed from: a */
    public int f108416a;

    /* renamed from: b */
    public String f108417b;

    /* renamed from: c */
    public int f108418c;

    private PassInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PassInfo) {
            PassInfo passInfo = (PassInfo) obj;
            return sdg.m34949a(Integer.valueOf(this.f108416a), Integer.valueOf(passInfo.f108416a)) && sdg.m34949a(this.f108417b, passInfo.f108417b) && sdg.m34949a(Integer.valueOf(this.f108418c), Integer.valueOf(passInfo.f108418c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108416a), this.f108417b, Integer.valueOf(this.f108418c)});
    }

    public PassInfo(int i, String str, int i2) {
        this.f108416a = i;
        this.f108417b = str;
        this.f108418c = i2;
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
        see.m35063b(parcel, 1, this.f108416a);
        see.m35046a(parcel, 2, this.f108417b, false);
        see.m35063b(parcel, 3, this.f108418c);
        see.m35062b(parcel, a);
    }
}
