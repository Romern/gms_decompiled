package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Device extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ywv();

    /* renamed from: a */
    public final String f32073a;

    /* renamed from: b */
    public final String f32074b;

    /* renamed from: c */
    public final String f32075c;

    /* renamed from: d */
    public final int f32076d;

    /* renamed from: e */
    public final int f32077e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public Device(String str, String str2, String str3, int i, int i2) {
        sdo.m34959a((Object) str);
        this.f32073a = str;
        sdo.m34959a((Object) str2);
        this.f32074b = str2;
        if (str3 != null) {
            this.f32075c = str3;
            this.f32076d = i;
            this.f32077e = i2;
            return;
        }
        sdo.m34971a(true, (Object) "Device UID is null.  Did you forget to use LocalDeviceRule?");
        throw new IllegalStateException("Device UID is null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo18925a() {
        return String.format("%s:%s:%s", this.f32073a, this.f32074b, this.f32075c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Device) {
            Device device = (Device) obj;
            return sdg.m34949a(this.f32073a, device.f32073a) && sdg.m34949a(this.f32074b, device.f32074b) && sdg.m34949a(this.f32075c, device.f32075c) && this.f32076d == device.f32076d && this.f32077e == device.f32077e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32073a, this.f32074b, this.f32075c, Integer.valueOf(this.f32076d)});
    }

    public final String toString() {
        return String.format("Device{%s:%s:%s}", mo18925a(), Integer.valueOf(this.f32076d), Integer.valueOf(this.f32077e));
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
        see.m35046a(parcel, 1, this.f32073a, false);
        see.m35046a(parcel, 2, this.f32074b, false);
        see.m35046a(parcel, 4, this.f32075c, false);
        see.m35063b(parcel, 5, this.f32076d);
        see.m35063b(parcel, 6, this.f32077e);
        see.m35062b(parcel, a);
    }
}
