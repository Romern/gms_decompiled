package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlacefencingFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aemn();

    /* renamed from: a */
    public final List f79507a;

    /* renamed from: b */
    public final List f79508b;

    /* renamed from: c */
    public final List f79509c;

    public PlacefencingFilter(List list, List list2, List list3) {
        List list4;
        List list5;
        this.f79507a = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        if (list2 != null) {
            list4 = Collections.unmodifiableList(list2);
        } else {
            list4 = Collections.emptyList();
        }
        this.f79508b = list4;
        if (list3 != null) {
            list5 = Collections.unmodifiableList(list3);
        } else {
            list5 = Collections.emptyList();
        }
        this.f79509c = list5;
        if (this.f79507a.isEmpty() && this.f79508b.isEmpty() && this.f79509c.isEmpty()) {
            throw new IllegalArgumentException("PlacefencingFilter must specify something to filter");
        }
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
        see.m35066c(parcel, 1, this.f79507a, false);
        see.m35049a(parcel, 2, this.f79508b, false);
        see.m35065b(parcel, 3, this.f79509c, false);
        see.m35062b(parcel, a);
    }
}
