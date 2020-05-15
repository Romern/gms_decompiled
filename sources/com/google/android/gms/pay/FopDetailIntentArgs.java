package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FopDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldj();

    /* renamed from: a */
    public String f81471a;

    /* renamed from: b */
    public String f81472b;

    /* renamed from: c */
    public String f81473c;

    public FopDetailIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FopDetailIntentArgs) {
            FopDetailIntentArgs fopDetailIntentArgs = (FopDetailIntentArgs) obj;
            return sdg.m34949a(this.f81471a, fopDetailIntentArgs.f81471a) && sdg.m34949a(this.f81472b, fopDetailIntentArgs.f81472b) && sdg.m34949a(this.f81473c, fopDetailIntentArgs.f81473c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81471a, this.f81472b, this.f81473c});
    }

    public FopDetailIntentArgs(String str, String str2, String str3) {
        this.f81471a = str;
        this.f81472b = str2;
        this.f81473c = str3;
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
        see.m35046a(parcel, 1, this.f81471a, false);
        see.m35046a(parcel, 2, this.f81472b, false);
        see.m35046a(parcel, 3, this.f81473c, false);
        see.m35062b(parcel, a);
    }
}
