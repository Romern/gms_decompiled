package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutocompleteFilter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aekv();

    /* renamed from: a */
    final int f79456a;

    /* renamed from: b */
    public final boolean f79457b;

    /* renamed from: c */
    final List f79458c;

    /* renamed from: d */
    public final String f79459d;

    /* renamed from: e */
    public final int f79460e;

    public AutocompleteFilter(int i, boolean z, List list, String str) {
        this.f79456a = i;
        this.f79458c = list;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            i2 = ((Integer) list.iterator().next()).intValue();
        }
        this.f79460e = i2;
        this.f79459d = str;
        if (this.f79456a <= 0) {
            this.f79457b = !z;
        } else {
            this.f79457b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutocompleteFilter) {
            AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
            return this.f79460e == autocompleteFilter.f79460e && this.f79457b == autocompleteFilter.f79457b && this.f79459d == autocompleteFilter.f79459d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f79457b), Integer.valueOf(this.f79460e), this.f79459d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("includeQueryPredictions", Boolean.valueOf(this.f79457b));
        a.mo25396a("typeFilter", Integer.valueOf(this.f79460e));
        a.mo25396a("country", this.f79459d);
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
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
        see.m35051a(parcel, 1, this.f79457b);
        see.m35049a(parcel, 2, this.f79458c, false);
        see.m35046a(parcel, 3, this.f79459d, false);
        see.m35063b(parcel, 1000, this.f79456a);
        see.m35062b(parcel, a);
    }
}
