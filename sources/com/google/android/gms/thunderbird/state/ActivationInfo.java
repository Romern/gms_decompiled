package com.google.android.gms.thunderbird.state;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivationInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auhj();

    /* renamed from: a */
    public final String f109071a;

    /* renamed from: b */
    public final String f109072b;

    /* renamed from: c */
    public final boolean f109073c;

    /* renamed from: d */
    public final long f109074d;

    /* renamed from: e */
    public final long f109075e;

    /* renamed from: f */
    public final Location f109076f;

    public ActivationInfo(String str, String str2, boolean z, long j, long j2, Location location) {
        bmxy.m108581a(str);
        this.f109071a = str;
        this.f109072b = str2;
        this.f109073c = z;
        this.f109074d = j;
        this.f109075e = j2;
        this.f109076f = location != null ? new Location(location) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f109072b);
        if (this.f109073c) {
            sb.append(":MOCK");
        }
        sb.append(":");
        sb.append(this.f109071a);
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
        see.m35046a(parcel, 1, this.f109071a, false);
        see.m35046a(parcel, 2, this.f109072b, false);
        see.m35051a(parcel, 3, this.f109073c);
        see.m35036a(parcel, 4, this.f109074d);
        see.m35036a(parcel, 5, this.f109075e);
        see.m35040a(parcel, 6, this.f109076f, i, false);
        see.m35062b(parcel, a);
    }
}
