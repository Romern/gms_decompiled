package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Query extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vfz();

    /* renamed from: a */
    public final LogicalFilter f31087a;

    /* renamed from: b */
    public final String f31088b;

    /* renamed from: c */
    public final SortOrder f31089c;

    /* renamed from: d */
    public final List f31090d;

    /* renamed from: e */
    public final boolean f31091e;

    /* renamed from: f */
    final List f31092f;

    /* renamed from: g */
    public final boolean f31093g;

    public Query(LogicalFilter logicalFilter, String str, SortOrder sortOrder, List list, boolean z, List list2, boolean z2) {
        this.f31087a = logicalFilter;
        this.f31088b = str;
        this.f31089c = sortOrder;
        this.f31090d = list;
        this.f31091e = z;
        this.f31092f = list2;
        this.f31093g = z2;
    }

    /* renamed from: a */
    public final Set mo18285a() {
        List list = this.f31092f;
        return list != null ? new HashSet(list) : new HashSet();
    }

    public final String toString() {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", this.f31087a, this.f31089c, this.f31088b, this.f31092f);
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
        see.m35040a(parcel, 1, this.f31087a, i, false);
        see.m35046a(parcel, 3, this.f31088b, false);
        see.m35040a(parcel, 4, this.f31089c, i, false);
        see.m35065b(parcel, 5, this.f31090d, false);
        see.m35051a(parcel, 6, this.f31091e);
        see.m35066c(parcel, 7, this.f31092f, false);
        see.m35051a(parcel, 8, this.f31093g);
        see.m35062b(parcel, a);
    }
}
