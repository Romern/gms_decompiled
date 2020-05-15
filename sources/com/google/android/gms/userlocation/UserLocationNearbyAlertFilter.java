package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UserLocationNearbyAlertFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avxa();

    /* renamed from: a */
    public final List f109588a;

    /* renamed from: b */
    public final List f109589b;

    /* renamed from: c */
    public final String f109590c;

    /* renamed from: d */
    public final boolean f109591d;

    public UserLocationNearbyAlertFilter(List list, List list2, String str, boolean z) {
        this.f109588a = list != null ? new ArrayList(new HashSet(list)) : Collections.emptyList();
        this.f109589b = list2 != null ? new ArrayList(new HashSet(list2)) : Collections.emptyList();
        Collections.sort(this.f109588a);
        Collections.sort(this.f109589b);
        this.f109590c = str;
        this.f109591d = z;
    }

    /* renamed from: a */
    public static UserLocationNearbyAlertFilter m93774a(Collection collection) {
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
                return new UserLocationNearbyAlertFilter(null, arrayList, null, false);
            }
            throw new IllegalArgumentException("Filter must contain at least one place type to match results with.");
        }
        throw new IllegalArgumentException("Filter must contain a list of place types to match results with.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserLocationNearbyAlertFilter) {
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = (UserLocationNearbyAlertFilter) obj;
            return this.f109589b.equals(userLocationNearbyAlertFilter.f109589b) && this.f109588a.equals(userLocationNearbyAlertFilter.f109588a) && sdg.m34949a(this.f109590c, userLocationNearbyAlertFilter.f109590c) && this.f109591d == userLocationNearbyAlertFilter.f109591d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f109589b, this.f109588a, this.f109590c, Boolean.valueOf(this.f109591d)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        if (!this.f109589b.isEmpty()) {
            a.mo25396a("types", this.f109589b);
        }
        if (!this.f109588a.isEmpty()) {
            a.mo25396a("placeIds", this.f109588a);
        }
        String str = this.f109590c;
        if (str != null) {
            a.mo25396a("chainName", str);
        }
        a.mo25396a("Beacon required: ", Boolean.valueOf(this.f109591d));
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
        see.m35065b(parcel, 1, this.f109588a, false);
        see.m35049a(parcel, 2, this.f109589b, false);
        see.m35046a(parcel, 4, this.f109590c, false);
        see.m35051a(parcel, 5, this.f109591d);
        see.m35062b(parcel, a);
    }
}
