package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceUserData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeoy();

    /* renamed from: a */
    public final String f79585a;

    /* renamed from: b */
    public final String f79586b;

    /* renamed from: c */
    public final List f79587c;

    public PlaceUserData(String str, String str2, List list) {
        this.f79585a = str;
        this.f79586b = str2;
        this.f79587c = list;
    }

    /* renamed from: a */
    public static PlaceUserData m66971a(String str, String str2, List list) {
        return new PlaceUserData(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceUserData) {
            PlaceUserData placeUserData = (PlaceUserData) obj;
            return this.f79585a.equals(placeUserData.f79585a) && this.f79586b.equals(placeUserData.f79586b) && this.f79587c.equals(placeUserData.f79587c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79585a, this.f79586b, this.f79587c});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("accountName", this.f79585a);
        a.mo25396a("placeId", this.f79586b);
        a.mo25396a("placeAliases", this.f79587c);
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
        see.m35046a(parcel, 1, this.f79585a, false);
        see.m35046a(parcel, 2, this.f79586b, false);
        see.m35066c(parcel, 6, this.f79587c, false);
        see.m35062b(parcel, a);
    }
}
