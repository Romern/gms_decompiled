package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TokenReference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asoy();

    /* renamed from: a */
    public String f108456a;

    /* renamed from: b */
    public int f108457b;

    public TokenReference(String str, int i) {
        this.f108456a = str;
        this.f108457b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenReference) {
            TokenReference tokenReference = (TokenReference) obj;
            return sdg.m34949a(this.f108456a, tokenReference.f108456a) && this.f108457b == tokenReference.f108457b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108456a, Integer.valueOf(this.f108457b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("tokenReferenceId", this.f108456a);
        a.mo25396a("tokenProvider", Integer.valueOf(this.f108457b));
        return a.toString();
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
        see.m35046a(parcel, 2, this.f108456a, false);
        see.m35063b(parcel, 3, this.f108457b);
        see.m35062b(parcel, a);
    }
}
