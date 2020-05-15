package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ParcelableListOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alxq();

    /* renamed from: a */
    final boolean f81716a;

    /* renamed from: b */
    final boolean f81717b;

    /* renamed from: c */
    public final String f81718c;

    /* renamed from: d */
    final boolean f81719d;

    /* renamed from: e */
    public final Bundle f81720e;

    public ParcelableListOptions(boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.f81716a = z;
        this.f81717b = z2;
        this.f81718c = str;
        this.f81719d = z3;
        this.f81720e = bundle == null ? new Bundle() : bundle;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("useOfflineDatabase", Boolean.valueOf(this.f81716a));
        a.mo25396a("useWebData", Boolean.valueOf(this.f81717b));
        a.mo25396a("useCP2", Boolean.valueOf(this.f81719d));
        a.mo25396a("endpoint", this.f81718c);
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
        see.m35051a(parcel, 1, this.f81716a);
        see.m35051a(parcel, 2, this.f81717b);
        see.m35046a(parcel, 3, this.f81718c, false);
        see.m35051a(parcel, 4, this.f81719d);
        see.m35037a(parcel, 5, this.f81720e, false);
        see.m35062b(parcel, a);
    }
}
