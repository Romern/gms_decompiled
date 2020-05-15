package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegisterCorpusIMEInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0999frx();

    /* renamed from: a */
    public final int f9629a;

    /* renamed from: b */
    public final String[] f9630b;

    /* renamed from: c */
    public final String f9631c;

    /* renamed from: d */
    public final String f9632d;

    /* renamed from: e */
    public final String[] f9633e;

    /* renamed from: f */
    public final String f9634f;

    public RegisterCorpusIMEInfo(int i, String[] strArr, String str, String str2, String[] strArr2, String str3) {
        this.f9629a = i;
        this.f9630b = strArr;
        this.f9631c = str;
        this.f9632d = str2;
        this.f9633e = strArr2;
        this.f9634f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterCorpusIMEInfo) {
            RegisterCorpusIMEInfo registerCorpusIMEInfo = (RegisterCorpusIMEInfo) obj;
            return this.f9629a == registerCorpusIMEInfo.f9629a && Arrays.equals(this.f9630b, registerCorpusIMEInfo.f9630b) && sdg.m34949a(this.f9631c, registerCorpusIMEInfo.f9631c) && sdg.m34949a(this.f9632d, registerCorpusIMEInfo.f9632d) && Arrays.equals(this.f9633e, registerCorpusIMEInfo.f9633e) && sdg.m34949a(this.f9634f, registerCorpusIMEInfo.f9634f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9629a), Integer.valueOf(Arrays.hashCode(this.f9630b)), this.f9631c, this.f9632d, Integer.valueOf(Arrays.hashCode(this.f9633e)), this.f9634f});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
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
        see.m35063b(parcel, 1, this.f9629a);
        see.m35058a(parcel, 2, this.f9630b, false);
        see.m35046a(parcel, 3, this.f9631c, false);
        see.m35046a(parcel, 4, this.f9632d, false);
        see.m35046a(parcel, 6, this.f9634f, false);
        see.m35058a(parcel, 7, this.f9633e, false);
        see.m35062b(parcel, a);
    }
}
