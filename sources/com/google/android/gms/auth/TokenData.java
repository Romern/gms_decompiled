package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gir();

    /* renamed from: a */
    final int f9943a;

    /* renamed from: b */
    public final String f9944b;

    /* renamed from: c */
    public final Long f9945c;

    /* renamed from: d */
    public final boolean f9946d;

    /* renamed from: e */
    public final boolean f9947e;

    /* renamed from: f */
    public final List f9948f;

    /* renamed from: g */
    public final String f9949g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.f9943a = i;
        sdo.m34977c(str);
        this.f9944b = str;
        this.f9945c = l;
        this.f9946d = z;
        this.f9947e = z2;
        this.f9948f = list;
        this.f9949g = str2;
    }

    /* renamed from: a */
    public static TokenData m6261a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            if (!TextUtils.equals(this.f9944b, tokenData.f9944b) || !sdg.m34949a(this.f9945c, tokenData.f9945c) || this.f9946d != tokenData.f9946d || this.f9947e != tokenData.f9947e || !sdg.m34949a(this.f9948f, tokenData.f9948f) || !sdg.m34949a(this.f9949g, tokenData.f9949g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9944b, this.f9945c, Boolean.valueOf(this.f9946d), Boolean.valueOf(this.f9947e), this.f9948f, this.f9949g});
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
        see.m35063b(parcel, 1, this.f9943a);
        see.m35046a(parcel, 2, this.f9944b, false);
        see.m35045a(parcel, 3, this.f9945c);
        see.m35051a(parcel, 4, this.f9946d);
        see.m35051a(parcel, 5, this.f9947e);
        see.m35065b(parcel, 6, this.f9948f, false);
        see.m35046a(parcel, 7, this.f9949g, false);
        see.m35062b(parcel, a);
    }
}
