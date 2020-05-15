package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Section extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsp();

    /* renamed from: a */
    public final String f9683a;

    /* renamed from: b */
    public final boolean f9684b;

    /* renamed from: c */
    public final int f9685c;

    public Section(String str) {
        this(str, false, 0);
    }

    /* renamed from: a */
    public static String m6156a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(str2).length());
        sb.append("semantic#");
        sb.append(str);
        sb.append(';');
        sb.append(str2);
        return sb.toString();
    }

    public Section(String str, boolean z, int i) {
        this.f9683a = str;
        this.f9684b = z;
        this.f9685c = i;
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
        see.m35046a(parcel, 1, this.f9683a, false);
        see.m35051a(parcel, 2, this.f9684b);
        see.m35063b(parcel, 3, this.f9685c);
        see.m35062b(parcel, a);
    }
}
