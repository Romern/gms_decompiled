package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClassifyAccountTypeResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alme();

    /* renamed from: a */
    public final String f81696a;

    /* renamed from: b */
    public final String f81697b;

    /* renamed from: c */
    public final allz f81698c;

    /* renamed from: d */
    private final almb f81699d;

    public ClassifyAccountTypeResult(String str, String str2, int i, int i2) {
        this.f81696a = str;
        this.f81697b = str2;
        this.f81698c = allz.m61245a(i);
        this.f81699d = almb.m61249a(i2);
    }

    /* renamed from: a */
    public static ClassifyAccountTypeResult m67785a(String str, String str2, allz allz, almb almb) {
        return new ClassifyAccountTypeResult(str, str2, allz.f73664j, almb.f73673g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeResult classifyAccountTypeResult = (ClassifyAccountTypeResult) obj;
            return bmxi.m108538a(this.f81696a, classifyAccountTypeResult.f81696a) && bmxi.m108538a(this.f81697b, classifyAccountTypeResult.f81697b) && this.f81698c == classifyAccountTypeResult.f81698c && this.f81699d == classifyAccountTypeResult.f81699d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81696a, this.f81697b, this.f81698c, this.f81699d});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("accountType", this.f81696a);
        a.mo66885a("dataSet", this.f81697b);
        a.mo66885a("category", this.f81698c);
        a.mo66885a("matchTag", this.f81699d);
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
        see.m35046a(parcel, 1, this.f81696a, false);
        see.m35046a(parcel, 2, this.f81697b, false);
        see.m35063b(parcel, 3, this.f81698c.f73664j);
        see.m35063b(parcel, 4, this.f81699d.f73673g);
        see.m35062b(parcel, a);
    }
}
