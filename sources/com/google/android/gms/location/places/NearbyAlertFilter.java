package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NearbyAlertFilter extends AbstractPlaceFilter {
    public static final Parcelable.Creator CREATOR = new aelb();

    /* renamed from: a */
    final List f79461a;

    /* renamed from: b */
    final List f79462b;

    /* renamed from: c */
    public final String f79463c;

    /* renamed from: d */
    public final boolean f79464d;

    /* renamed from: e */
    public final Set f79465e;

    /* renamed from: f */
    public final Set f79466f = m66901a(this.f79462b);

    public NearbyAlertFilter(List list, List list2, String str, boolean z) {
        this.f79461a = list;
        this.f79462b = list2;
        this.f79463c = str;
        this.f79464d = z;
        this.f79465e = m66901a(list);
    }

    /* renamed from: b */
    public static NearbyAlertFilter m66906b(Collection collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                return new NearbyAlertFilter(arrayList, null, null, false);
            }
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place ID to match results with.");
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place IDs to match results with.");
    }

    /* renamed from: c */
    public static NearbyAlertFilter m66907c(Collection collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num != null) {
                    arrayList.add(num);
                }
            }
            if (!arrayList.isEmpty()) {
                return new NearbyAlertFilter(null, arrayList, null, false);
            }
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place type to match results with.");
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place types to match results with.");
    }

    /* renamed from: b */
    public final Set mo43627b() {
        return this.f79465e;
    }

    /* renamed from: c */
    public final Set mo43628c() {
        return this.f79466f;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyAlertFilter) {
            NearbyAlertFilter nearbyAlertFilter = (NearbyAlertFilter) obj;
            if ((this.f79463c != null || nearbyAlertFilter.f79463c == null) && this.f79466f.equals(nearbyAlertFilter.f79466f) && this.f79465e.equals(nearbyAlertFilter.f79465e) && (((str = this.f79463c) == null || str.equals(nearbyAlertFilter.f79463c)) && this.f79464d == nearbyAlertFilter.f79464d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79466f, this.f79465e, this.f79463c, Boolean.valueOf(this.f79464d)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        if (!this.f79466f.isEmpty()) {
            a.mo25396a("types", this.f79466f);
        }
        if (!this.f79465e.isEmpty()) {
            a.mo25396a("placeIds", this.f79465e);
        }
        String str = this.f79463c;
        if (str != null) {
            a.mo25396a("chainName", str);
        }
        a.mo25396a("Beacon required: ", Boolean.valueOf(this.f79464d));
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
        see.m35065b(parcel, 1, this.f79461a, false);
        see.m35049a(parcel, 2, this.f79462b, false);
        see.m35046a(parcel, 4, this.f79463c, false);
        see.m35051a(parcel, 5, this.f79464d);
        see.m35062b(parcel, a);
    }
}
