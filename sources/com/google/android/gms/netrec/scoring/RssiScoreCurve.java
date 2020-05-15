package com.google.android.gms.netrec.scoring;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RssiScoreCurve extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akkt();

    /* renamed from: a */
    public final int f81190a;

    /* renamed from: b */
    public final int f81191b;

    /* renamed from: c */
    public final byte[] f81192c;

    /* renamed from: d */
    public final int f81193d;

    public RssiScoreCurve(int i, int i2, byte[] bArr, int i3) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("rssiBuckets must contain at least one element.");
        }
        this.f81190a = i;
        this.f81191b = i2;
        this.f81192c = bArr;
        this.f81193d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RssiScoreCurve rssiScoreCurve = (RssiScoreCurve) obj;
            return this.f81190a == rssiScoreCurve.f81190a && this.f81191b == rssiScoreCurve.f81191b && Arrays.equals(this.f81192c, rssiScoreCurve.f81192c) && this.f81193d == rssiScoreCurve.f81193d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81190a), Integer.valueOf(this.f81191b), Integer.valueOf(this.f81193d)}) ^ Arrays.hashCode(this.f81192c);
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("start", Integer.valueOf(this.f81190a));
        a.mo25396a("bucketWidth", Integer.valueOf(this.f81191b));
        a.mo25396a("rssiBuckets", Arrays.toString(this.f81192c));
        a.mo25396a("activeNetworkRssiBoost", Integer.valueOf(this.f81193d));
        return a.toString();
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
        see.m35063b(parcel, 1, this.f81190a);
        see.m35063b(parcel, 2, this.f81191b);
        see.m35052a(parcel, 3, this.f81192c, false);
        see.m35063b(parcel, 4, this.f81193d);
        see.m35062b(parcel, a);
    }
}
