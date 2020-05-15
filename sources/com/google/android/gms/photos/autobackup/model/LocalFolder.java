package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocalFolder extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anka();

    /* renamed from: a */
    public final int f82186a;

    /* renamed from: b */
    public String f82187b;

    /* renamed from: c */
    public String f82188c;

    /* renamed from: d */
    public boolean f82189d;

    public LocalFolder(int i, String str, String str2, boolean z) {
        this.f82186a = i;
        this.f82187b = str;
        this.f82188c = str2;
        this.f82189d = z;
    }

    public final String toString() {
        String str = this.f82187b;
        boolean z = this.f82189d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append(str);
        sb.append(" (enabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
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
        see.m35063b(parcel, 1, this.f82186a);
        see.m35046a(parcel, 2, this.f82187b, false);
        see.m35046a(parcel, 3, this.f82188c, false);
        see.m35051a(parcel, 4, this.f82189d);
        see.m35062b(parcel, a);
    }
}
