package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecondaryIdMatcher extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afkz();

    /* renamed from: c */
    private static final Charset f79992c = Charset.forName("UTF-8");

    /* renamed from: a */
    public final byte[] f79993a;

    /* renamed from: b */
    public final int f79994b;

    public SecondaryIdMatcher(byte[] bArr, int i) {
        sdo.m34959a(bArr);
        this.f79993a = bArr;
        this.f79994b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SecondaryIdMatcher secondaryIdMatcher = (SecondaryIdMatcher) obj;
            return this.f79994b == secondaryIdMatcher.f79994b && Arrays.equals(this.f79993a, secondaryIdMatcher.f79993a);
        }
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f79993a) * 31) + this.f79994b;
    }

    public final String toString() {
        int i = this.f79994b;
        String str = i != 1 ? i != 2 ? "__unknown__" : "MATCHING_TYPE_PREFIX" : "MATCHING_TYPE_EXACT";
        String str2 = new String(this.f79993a, f79992c);
        StringBuilder sb = new StringBuilder(str.length() + 2 + str2.length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
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
        int a = see.m35030a(parcel);
        see.m35052a(parcel, 1, this.f79993a, false);
        see.m35063b(parcel, 2, this.f79994b);
        see.m35062b(parcel, a);
    }
}
