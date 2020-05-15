package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsc();

    /* renamed from: a */
    public final String f9646a;

    /* renamed from: b */
    public final String f9647b;

    /* renamed from: c */
    public final boolean f9648c;

    /* renamed from: d */
    public final int f9649d;

    /* renamed from: e */
    public final boolean f9650e;

    /* renamed from: f */
    public final String f9651f;

    /* renamed from: g */
    public final Feature[] f9652g;

    /* renamed from: h */
    public final String f9653h;

    /* renamed from: i */
    public final ScoringConfig f9654i;

    public RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, String str4, ScoringConfig scoringConfig) {
        this.f9646a = str;
        this.f9647b = str2;
        this.f9648c = z;
        this.f9649d = i;
        this.f9650e = z2;
        this.f9651f = str3;
        this.f9652g = featureArr;
        this.f9653h = str4;
        this.f9654i = scoringConfig;
    }

    /* renamed from: a */
    public static fsa m6151a(String str) {
        return new fsa(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSectionInfo) {
            RegisterSectionInfo registerSectionInfo = (RegisterSectionInfo) obj;
            return this.f9648c == registerSectionInfo.f9648c && this.f9649d == registerSectionInfo.f9649d && this.f9650e == registerSectionInfo.f9650e && sdg.m34949a(this.f9646a, registerSectionInfo.f9646a) && sdg.m34949a(this.f9647b, registerSectionInfo.f9647b) && sdg.m34949a(this.f9651f, registerSectionInfo.f9651f) && sdg.m34949a(this.f9653h, registerSectionInfo.f9653h) && sdg.m34949a(this.f9654i, registerSectionInfo.f9654i) && Arrays.equals(this.f9652g, registerSectionInfo.f9652g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9646a, this.f9647b, Boolean.valueOf(this.f9648c), Integer.valueOf(this.f9649d), Boolean.valueOf(this.f9650e), this.f9651f, Integer.valueOf(Arrays.hashCode(this.f9652g)), this.f9653h, this.f9654i});
    }

    /* renamed from: a */
    public final Feature mo7218a(int i) {
        return Feature.m6140a(i, this.f9652g);
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
        see.m35046a(parcel, 1, this.f9646a, false);
        see.m35046a(parcel, 2, this.f9647b, false);
        see.m35051a(parcel, 3, this.f9648c);
        see.m35063b(parcel, 4, this.f9649d);
        see.m35051a(parcel, 5, this.f9650e);
        see.m35046a(parcel, 6, this.f9651f, false);
        see.m35057a(parcel, 7, this.f9652g, i);
        see.m35046a(parcel, 11, this.f9653h, false);
        see.m35040a(parcel, 12, this.f9654i, i, false);
        see.m35062b(parcel, a);
    }
}
