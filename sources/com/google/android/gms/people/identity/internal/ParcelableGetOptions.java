package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ParcelableGetOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alxp();

    /* renamed from: a */
    public final boolean f81711a;

    /* renamed from: b */
    final boolean f81712b;

    /* renamed from: c */
    final String f81713c;

    /* renamed from: d */
    public final boolean f81714d;

    /* renamed from: e */
    final Bundle f81715e;

    public ParcelableGetOptions(boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.f81711a = z;
        this.f81712b = z2;
        this.f81713c = str;
        this.f81714d = z3;
        this.f81715e = bundle == null ? new Bundle() : bundle;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("useOfflineDatabase", Boolean.valueOf(this.f81711a));
        a.mo25396a("useWebData", Boolean.valueOf(this.f81712b));
        a.mo25396a("endpoint", this.f81713c);
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
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
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f81711a);
        see.m35051a(parcel, 2, this.f81712b);
        see.m35046a(parcel, 3, this.f81713c, false);
        see.m35051a(parcel, 4, this.f81714d);
        see.m35037a(parcel, 5, this.f81715e, false);
        see.m35062b(parcel, a);
    }
}
