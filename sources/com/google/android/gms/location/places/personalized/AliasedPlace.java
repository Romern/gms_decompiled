package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AliasedPlace extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeon();

    /* renamed from: a */
    public final String f79578a;

    /* renamed from: b */
    public final List f79579b;

    public AliasedPlace(String str, List list) {
        this.f79578a = str;
        this.f79579b = list;
    }

    /* renamed from: a */
    public static AliasedPlace m66969a(String str, List list) {
        return new AliasedPlace(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AliasedPlace) {
            AliasedPlace aliasedPlace = (AliasedPlace) obj;
            return this.f79578a.equals(aliasedPlace.f79578a) && this.f79579b.equals(aliasedPlace.f79579b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79578a, this.f79579b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("placeId", this.f79578a);
        a.mo25396a("placeAliases", this.f79579b);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f79578a, false);
        see.m35065b(parcel, 2, this.f79579b, false);
        see.m35062b(parcel, a);
    }
}
