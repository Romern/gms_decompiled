package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WeatherImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lse();

    /* renamed from: a */
    public final float f11735a;

    /* renamed from: b */
    public final float f11736b;

    /* renamed from: c */
    public final float f11737c;

    /* renamed from: d */
    public final int f11738d;

    /* renamed from: e */
    public final int[] f11739e;

    public WeatherImpl(float f, float f2, float f3, int i, int[] iArr) {
        this.f11735a = f;
        this.f11736b = f2;
        this.f11737c = f3;
        this.f11738d = i;
        this.f11739e = iArr;
    }

    /* renamed from: a */
    static float m7216a(int i, float f) {
        return i != 1 ? ((f - 0.125f) * 5.0f) / 9.0f : f;
    }

    /* renamed from: b */
    public final float mo8062b(int i) {
        return m7216a(i, this.f11736b);
    }

    /* renamed from: c */
    public final float mo8063c(int i) {
        return m7216a(i, this.f11735a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temp=");
        boolean z = true;
        sb.append(mo8063c(1));
        sb.append("F/");
        sb.append(mo8063c(2));
        sb.append("C, Feels=");
        sb.append(mo8062b(1));
        sb.append("F/");
        sb.append(mo8062b(2));
        sb.append("C, Dew=");
        sb.append(mo8061a(1));
        sb.append("F/");
        sb.append(mo8061a(2));
        sb.append("C, Humidity=");
        sb.append(this.f11738d);
        sb.append(", Condition=");
        if (this.f11739e == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] iArr = this.f11739e;
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(",");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final float mo8061a(int i) {
        return m7216a(i, this.f11737c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35034a(parcel, 2, this.f11735a);
        see.m35034a(parcel, 3, this.f11736b);
        see.m35034a(parcel, 4, this.f11737c);
        see.m35063b(parcel, 5, this.f11738d);
        see.m35055a(parcel, 6, this.f11739e, false);
        see.m35062b(parcel, a);
    }
}
