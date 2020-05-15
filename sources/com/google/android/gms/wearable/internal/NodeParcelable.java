package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NodeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axsp();

    /* renamed from: a */
    public final String f110950a;

    /* renamed from: b */
    public final String f110951b;

    /* renamed from: c */
    public final int f110952c;

    /* renamed from: d */
    public final boolean f110953d;

    public NodeParcelable(String str, String str2, int i, boolean z) {
        this.f110950a = str;
        this.f110951b = str2;
        this.f110952c = i;
        this.f110953d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NodeParcelable) {
            return ((NodeParcelable) obj).f110950a.equals(this.f110950a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f110950a.hashCode();
    }

    public final String toString() {
        String str = this.f110951b;
        String str2 = this.f110950a;
        int i = this.f110952c;
        boolean z = this.f110953d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(str2).length());
        sb.append("Node{");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", hops=");
        sb.append(i);
        sb.append(", isNearby=");
        sb.append(z);
        sb.append("}");
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
        see.m35046a(parcel, 2, this.f110950a, false);
        see.m35046a(parcel, 3, this.f110951b, false);
        see.m35063b(parcel, 4, this.f110952c);
        see.m35051a(parcel, 5, this.f110953d);
        see.m35062b(parcel, a);
    }
}
