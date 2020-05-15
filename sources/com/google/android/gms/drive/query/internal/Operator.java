package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Operator extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vgv();

    /* renamed from: a */
    public static final Operator f31122a = new Operator("=");

    /* renamed from: b */
    public static final Operator f31123b = new Operator("<");

    /* renamed from: c */
    public static final Operator f31124c = new Operator("<=");

    /* renamed from: d */
    public static final Operator f31125d = new Operator(">");

    /* renamed from: e */
    public static final Operator f31126e = new Operator(">=");

    /* renamed from: f */
    public static final Operator f31127f = new Operator("and");

    /* renamed from: g */
    public static final Operator f31128g = new Operator("or");

    /* renamed from: h */
    public static final Operator f31129h = new Operator("contains");

    /* renamed from: i */
    public final String f31130i;

    static {
        new Operator("not");
    }

    public Operator(String str) {
        this.f31130i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Operator operator = (Operator) obj;
        String str = this.f31130i;
        if (str != null) {
            if (!str.equals(operator.f31130i)) {
                return false;
            }
        } else if (operator.f31130i != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f31130i;
        return (str != null ? str.hashCode() : 0) + 31;
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
        see.m35046a(parcel, 1, this.f31130i, false);
        see.m35062b(parcel, a);
    }
}
