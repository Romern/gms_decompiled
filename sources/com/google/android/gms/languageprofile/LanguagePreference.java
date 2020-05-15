package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LanguagePreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aduu();

    /* renamed from: a */
    public final Locale f79271a;

    /* renamed from: b */
    public final float f79272b;

    /* renamed from: c */
    public final float f79273c;

    public LanguagePreference(Locale locale, float f, float f2) {
        this.f79271a = locale;
        this.f79272b = f;
        this.f79273c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguagePreference) {
            LanguagePreference languagePreference = (LanguagePreference) obj;
            return sdg.m34949a(this.f79271a, languagePreference.f79271a) && sdg.m34949a(Float.valueOf(this.f79272b), Float.valueOf(languagePreference.f79272b)) && sdg.m34949a(Float.valueOf(this.f79273c), Float.valueOf(languagePreference.f79273c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79271a, Float.valueOf(this.f79272b), Float.valueOf(this.f79273c)});
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
        see.m35046a(parcel, 1, adwl.m51284b(this.f79271a), false);
        see.m35034a(parcel, 2, this.f79272b);
        see.m35034a(parcel, 3, this.f79273c);
        see.m35062b(parcel, a);
    }
}
