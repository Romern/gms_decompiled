package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfe();

    /* renamed from: a */
    public final String f30068a;
    @Deprecated

    /* renamed from: b */
    public final int f30069b;

    /* renamed from: c */
    private final long f30070c;

    public Feature(String str, int i, long j) {
        this.f30068a = str;
        this.f30069b = i;
        this.f30070c = j;
    }

    /* renamed from: a */
    public final long mo17676a() {
        long j = this.f30070c;
        return j == -1 ? (long) this.f30069b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f30068a;
            if (((str == null || !str.equals(feature.f30068a)) && (this.f30068a != null || feature.f30068a != null)) || mo17676a() != feature.mo17676a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30068a, Long.valueOf(mo17676a())});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("name", this.f30068a);
        a.mo25396a("version", Long.valueOf(mo17676a()));
        return a.toString();
    }

    public Feature(String str, long j) {
        this.f30068a = str;
        this.f30070c = j;
        this.f30069b = -1;
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
        see.m35046a(parcel, 1, this.f30068a, false);
        see.m35063b(parcel, 2, this.f30069b);
        see.m35036a(parcel, 3, mo17676a());
        see.m35062b(parcel, a);
    }
}
