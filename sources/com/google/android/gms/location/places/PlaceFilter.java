package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlaceFilter extends AbstractPlaceFilter {
    public static final Parcelable.Creator CREATOR = new aelo();

    /* renamed from: a */
    final List f79473a;

    /* renamed from: b */
    public final boolean f79474b;

    /* renamed from: c */
    final List f79475c;

    /* renamed from: d */
    final List f79476d;

    /* renamed from: e */
    public final Set f79477e;

    /* renamed from: f */
    public final Set f79478f;

    /* renamed from: g */
    public final Set f79479g;

    static {
        new PlaceFilter();
    }

    @Deprecated
    /* renamed from: d */
    public static aeln m66912d() {
        return new aeln();
    }

    @Deprecated
    /* renamed from: e */
    public static PlaceFilter m66913e() {
        return new aeln().mo34303a();
    }

    /* renamed from: a */
    public final boolean mo43625a() {
        return this.f79474b;
    }

    /* renamed from: b */
    public final Set mo43627b() {
        return this.f79479g;
    }

    /* renamed from: c */
    public final Set mo43628c() {
        return this.f79477e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceFilter) {
            PlaceFilter placeFilter = (PlaceFilter) obj;
            return this.f79477e.equals(placeFilter.f79477e) && this.f79474b == placeFilter.f79474b && this.f79478f.equals(placeFilter.f79478f) && this.f79479g.equals(placeFilter.f79479g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79477e, Boolean.valueOf(this.f79474b), this.f79478f, this.f79479g});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        if (!this.f79477e.isEmpty()) {
            a.mo25396a("types", this.f79477e);
        }
        a.mo25396a("requireOpenNow", Boolean.valueOf(this.f79474b));
        if (!this.f79479g.isEmpty()) {
            a.mo25396a("placeIds", this.f79479g);
        }
        if (!this.f79478f.isEmpty()) {
            a.mo25396a("requestedUserDataTypes", this.f79478f);
        }
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.location.places.PlaceFilter.<init>(java.util.Collection, boolean, java.util.Collection, java.util.Collection):void
     arg types: [?[OBJECT, ARRAY], int, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY]]
     candidates:
      com.google.android.gms.location.places.PlaceFilter.<init>(java.util.List, boolean, java.util.List, java.util.List):void
      com.google.android.gms.location.places.PlaceFilter.<init>(java.util.Collection, boolean, java.util.Collection, java.util.Collection):void */
    public PlaceFilter() {
        this((Collection) null, false, (Collection) null, (Collection) null);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35049a(parcel, 1, this.f79473a, false);
        see.m35051a(parcel, 3, this.f79474b);
        see.m35066c(parcel, 4, this.f79475c, false);
        see.m35065b(parcel, 6, this.f79476d, false);
        see.m35062b(parcel, a);
    }

    public PlaceFilter(Collection collection, boolean z, Collection collection2, Collection collection3) {
        this(m66900a(collection), z, m66900a(collection2), m66900a(collection3));
    }

    public PlaceFilter(List list, boolean z, List list2, List list3) {
        this.f79473a = list;
        this.f79474b = z;
        this.f79475c = list3;
        this.f79476d = list2;
        this.f79477e = m66901a(list);
        this.f79478f = m66901a(this.f79475c);
        this.f79479g = m66901a(this.f79476d);
    }
}
