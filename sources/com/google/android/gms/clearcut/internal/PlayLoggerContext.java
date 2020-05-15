package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbm();

    /* renamed from: a */
    public final String f30042a;

    /* renamed from: b */
    public final int f30043b;

    /* renamed from: c */
    public final int f30044c;

    /* renamed from: d */
    public final String f30045d;

    /* renamed from: e */
    public final String f30046e;

    /* renamed from: f */
    public final boolean f30047f;

    /* renamed from: g */
    public final String f30048g;

    /* renamed from: h */
    public final boolean f30049h;

    /* renamed from: i */
    public final int f30050i;

    /* renamed from: j */
    public final Integer f30051j;

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, String str4, boolean z, cagz cagz) {
        sdo.m34959a((Object) str);
        this.f30042a = str;
        this.f30043b = i;
        this.f30044c = i2;
        this.f30048g = str2;
        this.f30045d = str3;
        this.f30046e = str4;
        this.f30047f = !z;
        this.f30049h = z;
        this.f30050i = cagz.f174516f;
        this.f30051j = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            return sdg.m34949a(this.f30042a, playLoggerContext.f30042a) && this.f30043b == playLoggerContext.f30043b && this.f30044c == playLoggerContext.f30044c && sdg.m34949a(this.f30048g, playLoggerContext.f30048g) && sdg.m34949a(this.f30045d, playLoggerContext.f30045d) && sdg.m34949a(this.f30046e, playLoggerContext.f30046e) && this.f30047f == playLoggerContext.f30047f && this.f30049h == playLoggerContext.f30049h && this.f30050i == playLoggerContext.f30050i && this.f30051j == playLoggerContext.f30051j;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30042a, Integer.valueOf(this.f30043b), Integer.valueOf(this.f30044c), this.f30048g, this.f30045d, this.f30046e, Boolean.valueOf(this.f30047f), Boolean.valueOf(this.f30049h), Integer.valueOf(this.f30050i), this.f30051j});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f30042a + ",packageVersionCode=" + this.f30043b + ",logSource=" + this.f30044c + ",logSourceName=" + this.f30048g + ",uploadAccount=" + this.f30045d + ",loggingId=" + this.f30046e + ",logAndroidId=" + this.f30047f + ",isAnonymous=" + this.f30049h + ",qosTier=" + this.f30050i + ",appMobilespecId=" + this.f30051j + "]";
    }

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3, Integer num) {
        this.f30042a = str;
        this.f30043b = i;
        this.f30044c = i2;
        this.f30045d = str2;
        this.f30046e = str3;
        this.f30047f = z;
        this.f30048g = str4;
        this.f30049h = z2;
        this.f30050i = i3;
        this.f30051j = num;
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
        see.m35046a(parcel, 2, this.f30042a, false);
        see.m35063b(parcel, 3, this.f30043b);
        see.m35063b(parcel, 4, this.f30044c);
        see.m35046a(parcel, 5, this.f30045d, false);
        see.m35046a(parcel, 6, this.f30046e, false);
        see.m35051a(parcel, 7, this.f30047f);
        see.m35046a(parcel, 8, this.f30048g, false);
        see.m35051a(parcel, 9, this.f30049h);
        see.m35063b(parcel, 10, this.f30050i);
        see.m35044a(parcel, 11, this.f30051j);
        see.m35062b(parcel, a);
    }
}
