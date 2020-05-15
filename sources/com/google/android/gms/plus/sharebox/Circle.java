package com.google.android.gms.plus.sharebox;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Circle extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aolb();

    /* renamed from: a */
    public static int f83440a = -1;

    /* renamed from: b */
    public static Circle f83441b = new Circle("", "", f83440a);

    /* renamed from: g */
    private static Circle f83442g;

    /* renamed from: h */
    private static String f83443h = "create_circle";

    /* renamed from: c */
    public final int f83444c;

    /* renamed from: d */
    public final String f83445d;

    /* renamed from: e */
    public final String f83446e;

    /* renamed from: f */
    public final int f83447f;

    public Circle(int i, String str, String str2, int i2) {
        this.f83444c = i;
        this.f83445d = str;
        this.f83446e = str2;
        this.f83447f = i2;
    }

    /* renamed from: a */
    public static Circle m69350a(Context context) {
        if (f83442g == null) {
            f83442g = new Circle(f83443h, context.getString(C0126R.string.plus_sharebox_circles_create_option), f83440a);
        }
        return f83442g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Circle.class.getSimpleName());
        sb.append("<");
        sb.append(this.f83446e);
        if (this.f83447f > 0) {
            sb.append(" (");
            sb.append(this.f83447f);
            sb.append(") ");
        }
        sb.append(">");
        return sb.toString();
    }

    private Circle(String str, String str2, int i) {
        this(1, str, str2, i);
    }

    /* renamed from: a */
    public static boolean m69351a(Circle circle) {
        return circle != null && f83443h.equals(circle.f83445d);
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
        see.m35046a(parcel, 1, this.f83445d, false);
        see.m35046a(parcel, 2, this.f83446e, false);
        see.m35063b(parcel, 3, this.f83447f);
        see.m35063b(parcel, 1000, this.f83444c);
        see.m35062b(parcel, a);
    }
}
