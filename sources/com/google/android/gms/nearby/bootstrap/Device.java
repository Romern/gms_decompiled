package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Device extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahcq();

    /* renamed from: a */
    final int f80396a;

    /* renamed from: b */
    public final String f80397b;

    /* renamed from: c */
    public final String f80398c;

    /* renamed from: d */
    public final String f80399d;

    /* renamed from: e */
    public final byte f80400e;

    public Device(int i, String str, String str2, String str3, byte b) {
        this.f80396a = i;
        sdo.m34977c(str);
        this.f80397b = str;
        sdo.m34959a((Object) str2);
        this.f80398c = str2;
        sdo.m34959a((Object) str3);
        this.f80399d = str3;
        sdo.m34975b(b <= 4, "Unknown device type");
        this.f80400e = b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Device) {
            Device device = (Device) obj;
            if (!this.f80397b.equals(device.f80397b) || !this.f80398c.equals(device.f80398c) || this.f80400e != device.f80400e || !this.f80399d.equals(device.f80399d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f80400e * 29791) + (this.f80399d.hashCode() * 961) + (this.f80397b.hashCode() * 31) + this.f80398c.hashCode();
    }

    public final String toString() {
        String str = this.f80397b;
        String str2 = this.f80398c;
        byte b = this.f80400e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.append("[");
        sb.append((int) b);
        sb.append("]");
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
        see.m35046a(parcel, 1, this.f80397b, false);
        see.m35046a(parcel, 2, this.f80398c, false);
        see.m35046a(parcel, 3, this.f80399d, false);
        see.m35032a(parcel, 4, this.f80400e);
        see.m35063b(parcel, 1000, this.f80396a);
        see.m35062b(parcel, a);
    }

    public Device(String str, String str2, String str3, byte b) {
        this(2, str, str2, str3, b);
    }
}
