package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ContactFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajil();

    /* renamed from: a */
    public Boolean f80852a;

    /* renamed from: b */
    public Boolean f80853b;

    /* renamed from: c */
    public Boolean f80854c;

    /* renamed from: d */
    public String f80855d;

    public ContactFilter() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContactFilter) {
            ContactFilter contactFilter = (ContactFilter) obj;
            return sdg.m34949a(this.f80852a, contactFilter.f80852a) && sdg.m34949a(this.f80853b, contactFilter.f80853b) && sdg.m34949a(this.f80854c, contactFilter.f80854c) && sdg.m34949a(this.f80855d, contactFilter.f80855d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80852a, this.f80853b, this.f80854c, this.f80855d});
    }

    public ContactFilter(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.f80852a = bool;
        this.f80853b = bool2;
        this.f80854c = bool3;
        this.f80855d = str;
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
        see.m35041a(parcel, 1, this.f80852a);
        see.m35041a(parcel, 2, this.f80853b);
        see.m35041a(parcel, 3, this.f80854c);
        see.m35046a(parcel, 4, this.f80855d, false);
        see.m35062b(parcel, a);
    }
}
