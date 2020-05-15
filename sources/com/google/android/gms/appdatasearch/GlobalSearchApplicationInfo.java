package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlobalSearchApplicationInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new frj();

    /* renamed from: a */
    public final String f9562a;

    /* renamed from: b */
    public final String f9563b;

    /* renamed from: c */
    public final int f9564c;

    /* renamed from: d */
    public final int f9565d;

    /* renamed from: e */
    public final int f9566e;

    /* renamed from: f */
    public final String f9567f;

    /* renamed from: g */
    public final String f9568g;

    /* renamed from: h */
    public final String f9569h;

    public GlobalSearchApplicationInfo(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5) {
        this.f9562a = str;
        this.f9563b = str2;
        this.f9564c = i;
        this.f9565d = i2;
        this.f9566e = i3;
        this.f9567f = str3;
        this.f9568g = str4;
        this.f9569h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalSearchApplicationInfo) {
            GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) obj;
            return TextUtils.equals(this.f9562a, globalSearchApplicationInfo.f9562a) && TextUtils.equals(this.f9563b, globalSearchApplicationInfo.f9563b) && this.f9564c == globalSearchApplicationInfo.f9564c && this.f9565d == globalSearchApplicationInfo.f9565d && this.f9566e == globalSearchApplicationInfo.f9566e && TextUtils.equals(this.f9567f, globalSearchApplicationInfo.f9567f) && TextUtils.equals(this.f9568g, globalSearchApplicationInfo.f9568g) && TextUtils.equals(this.f9569h, globalSearchApplicationInfo.f9569h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9562a, this.f9563b, Integer.valueOf(this.f9564c), Integer.valueOf(this.f9565d), Integer.valueOf(this.f9566e), this.f9567f, this.f9568g, this.f9569h});
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + this.f9562a + ";sourceName=" + this.f9563b + ";labelId=" + Integer.toHexString(this.f9564c) + ";settingsDescriptionId=" + Integer.toHexString(this.f9565d) + ";iconId=" + Integer.toHexString(this.f9566e) + ";defaultIntentAction=" + this.f9567f + ";defaultIntentData=" + this.f9568g + ";defaultIntentActivity=" + this.f9569h + "}";
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
        see.m35046a(parcel, 1, this.f9562a, false);
        see.m35063b(parcel, 2, this.f9564c);
        see.m35063b(parcel, 3, this.f9565d);
        see.m35063b(parcel, 4, this.f9566e);
        see.m35046a(parcel, 5, this.f9567f, false);
        see.m35046a(parcel, 6, this.f9568g, false);
        see.m35046a(parcel, 7, this.f9569h, false);
        see.m35046a(parcel, 8, this.f9563b, false);
        see.m35062b(parcel, a);
    }
}
