package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SortItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algm();

    /* renamed from: a */
    public String f81606a;

    /* renamed from: b */
    public long f81607b;

    /* renamed from: c */
    public String f81608c;

    private SortItem() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SortItem) {
            SortItem sortItem = (SortItem) obj;
            return sdg.m34949a(this.f81606a, sortItem.f81606a) && sdg.m34949a(Long.valueOf(this.f81607b), Long.valueOf(sortItem.f81607b)) && sdg.m34949a(this.f81608c, sortItem.f81608c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81606a, Long.valueOf(this.f81607b), this.f81608c});
    }

    public SortItem(String str, long j, String str2) {
        this.f81606a = str;
        this.f81607b = j;
        this.f81608c = str2;
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
        see.m35046a(parcel, 1, this.f81606a, false);
        see.m35036a(parcel, 2, this.f81607b);
        see.m35046a(parcel, 3, this.f81608c, false);
        see.m35062b(parcel, a);
    }
}
