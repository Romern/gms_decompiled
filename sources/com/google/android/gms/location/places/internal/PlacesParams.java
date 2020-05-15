package com.google.android.gms.location.places.internal;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlacesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeol();

    /* renamed from: a */
    public static final PlacesParams f79571a = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);

    /* renamed from: b */
    public final String f79572b;

    /* renamed from: c */
    public final String f79573c;

    /* renamed from: d */
    public final String f79574d;

    /* renamed from: e */
    public final String f79575e;

    /* renamed from: f */
    public final int f79576f;

    /* renamed from: g */
    public final int f79577g;

    public PlacesParams(String str, String str2, String str3, String str4, int i, int i2) {
        this.f79572b = str;
        this.f79573c = str2;
        this.f79574d = str3;
        this.f79575e = str4;
        this.f79576f = i;
        this.f79577g = i2;
    }

    /* renamed from: a */
    private static String m66968a(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof PlacesParams)) {
            PlacesParams placesParams = (PlacesParams) obj;
            return this.f79576f == placesParams.f79576f && this.f79577g == placesParams.f79577g && this.f79573c.equals(placesParams.f79573c) && this.f79572b.equals(placesParams.f79572b) && sdg.m34949a(this.f79574d, placesParams.f79574d) && sdg.m34949a(this.f79575e, placesParams.f79575e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79572b, this.f79573c, this.f79574d, this.f79575e, Integer.valueOf(this.f79576f), Integer.valueOf(this.f79577g)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("clientPackageName", this.f79572b);
        a.mo25396a("locale", this.f79573c);
        a.mo25396a("accountName", this.f79574d);
        a.mo25396a("gCoreClientName", this.f79575e);
        return a.toString();
    }

    public PlacesParams(String str, Locale locale, String str2) {
        this(str, m66968a(locale), str2, null, rfi.f42869b, 0);
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
        see.m35046a(parcel, 1, this.f79572b, false);
        see.m35046a(parcel, 2, this.f79573c, false);
        see.m35046a(parcel, 3, this.f79574d, false);
        see.m35046a(parcel, 4, this.f79575e, false);
        see.m35063b(parcel, 6, this.f79576f);
        see.m35063b(parcel, 7, this.f79577g);
        see.m35062b(parcel, a);
    }

    public PlacesParams(String str, Locale locale, String str2, String str3, int i) {
        this(str, m66968a(locale), str2, str3, rfi.f42869b, i);
    }
}
