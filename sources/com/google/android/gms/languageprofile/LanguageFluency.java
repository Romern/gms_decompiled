package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LanguageFluency extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adus();

    /* renamed from: a */
    public final Locale f79265a;

    /* renamed from: b */
    public final float f79266b;

    /* renamed from: c */
    public final float f79267c;

    public LanguageFluency(Locale locale, float f, float f2) {
        this.f79265a = locale;
        this.f79266b = f;
        this.f79267c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguageFluency) {
            LanguageFluency languageFluency = (LanguageFluency) obj;
            return sdg.m34949a(this.f79265a, languageFluency.f79265a) && sdg.m34949a(Float.valueOf(this.f79266b), Float.valueOf(languageFluency.f79266b)) && sdg.m34949a(Float.valueOf(this.f79267c), Float.valueOf(languageFluency.f79267c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79265a, Float.valueOf(this.f79266b), Float.valueOf(this.f79267c)});
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
        see.m35046a(parcel, 1, adwl.m51284b(this.f79265a), false);
        see.m35034a(parcel, 2, this.f79266b);
        see.m35034a(parcel, 3, this.f79267c);
        see.m35062b(parcel, a);
    }
}
