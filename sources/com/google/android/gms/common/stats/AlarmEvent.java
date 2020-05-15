package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AlarmEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new sjz();

    /* renamed from: a */
    final int f30340a;

    /* renamed from: b */
    public final long f30341b;

    /* renamed from: c */
    public int f30342c;

    /* renamed from: d */
    public final String f30343d;

    /* renamed from: e */
    public final long f30344e;

    /* renamed from: f */
    public final long f30345f;

    /* renamed from: g */
    public final long f30346g;

    /* renamed from: h */
    public final List f30347h;

    /* renamed from: i */
    public final int f30348i;

    /* renamed from: j */
    public int f30349j;

    /* renamed from: k */
    public final String f30350k;

    /* renamed from: l */
    public final float f30351l;

    public AlarmEvent(int i, long j, int i2, String str, long j2, long j3, long j4, List list, int i3, int i4, String str2, float f) {
        this.f30340a = i;
        this.f30341b = j;
        this.f30342c = i2;
        this.f30343d = str;
        this.f30344e = j2;
        this.f30345f = j3;
        this.f30346g = j4;
        this.f30347h = list;
        this.f30348i = i3;
        this.f30349j = i4;
        this.f30350k = str2;
        this.f30351l = f;
    }

    public final String toString() {
        String str;
        long j = this.f30341b;
        int i = this.f30342c;
        String str2 = this.f30343d;
        long j2 = this.f30344e;
        long j3 = this.f30345f;
        long j4 = this.f30346g;
        int i2 = this.f30348i;
        List list = this.f30347h;
        String str3 = "";
        if (list != null) {
            str = TextUtils.join(",", list);
        } else {
            str = str3;
        }
        int i3 = this.f30349j;
        String str4 = this.f30350k;
        if (str4 != null) {
            str3 = str4;
        }
        float f = this.f30351l;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 138 + String.valueOf(str).length() + str3.length());
        sb.append(j);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(j2);
        sb.append("\t");
        sb.append(j3);
        sb.append("\t");
        sb.append(j4);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
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
        see.m35063b(parcel, 1, this.f30340a);
        see.m35036a(parcel, 2, this.f30341b);
        see.m35063b(parcel, 3, this.f30342c);
        see.m35046a(parcel, 4, this.f30343d, false);
        see.m35036a(parcel, 5, this.f30344e);
        see.m35036a(parcel, 6, this.f30345f);
        see.m35036a(parcel, 7, this.f30346g);
        see.m35065b(parcel, 8, this.f30347h, false);
        see.m35063b(parcel, 9, this.f30348i);
        see.m35063b(parcel, 10, this.f30349j);
        see.m35046a(parcel, 11, this.f30350k, false);
        see.m35034a(parcel, 12, this.f30351l);
        see.m35062b(parcel, a);
    }
}
