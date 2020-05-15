package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new peu();

    /* renamed from: a */
    public String f29713a;

    /* renamed from: b */
    public String f29714b;

    /* renamed from: c */
    public InetAddress f29715c;

    /* renamed from: d */
    public String f29716d;

    /* renamed from: e */
    public String f29717e;

    /* renamed from: f */
    public String f29718f;

    /* renamed from: g */
    public int f29719g;

    /* renamed from: h */
    public int f29720h;

    /* renamed from: i */
    public int f29721i;

    /* renamed from: j */
    public String f29722j;

    /* renamed from: k */
    public String f29723k;

    /* renamed from: l */
    public int f29724l;

    /* renamed from: m */
    public String f29725m;

    /* renamed from: n */
    public byte[] f29726n;

    /* renamed from: o */
    public String f29727o;

    /* renamed from: p */
    private List f29728p;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9) {
        List list2;
        this.f29713a = m22255a(str);
        String a = m22255a(str2);
        this.f29714b = a;
        if (!TextUtils.isEmpty(a)) {
            try {
                this.f29715c = InetAddress.getByName(this.f29714b);
            } catch (UnknownHostException e) {
                String str10 = this.f29714b;
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(str10).length() + 48 + String.valueOf(message).length());
                sb.append("Unable to convert host address (");
                sb.append(str10);
                sb.append(") to ipaddress: ");
                sb.append(message);
                Log.i("CastDevice", sb.toString());
            }
        }
        this.f29716d = m22255a(str3);
        this.f29717e = m22255a(str4);
        this.f29718f = m22255a(str5);
        this.f29719g = i;
        if (list == null) {
            list2 = new ArrayList();
        } else {
            list2 = list;
        }
        this.f29728p = list2;
        this.f29720h = i2;
        this.f29721i = i3;
        this.f29722j = m22255a(str6);
        this.f29723k = str7;
        this.f29724l = i4;
        this.f29725m = str8;
        this.f29726n = bArr;
        this.f29727o = str9;
    }

    /* renamed from: a */
    private static String m22255a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public static CastDevice m22257b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    /* renamed from: a */
    public final boolean mo17496a(int i) {
        return (this.f29720h & i) == i;
    }

    /* renamed from: c */
    public final boolean mo17498c() {
        InetAddress inetAddress = this.f29715c;
        return inetAddress != null && (inetAddress instanceof Inet6Address);
    }

    /* renamed from: d */
    public final List mo17499d() {
        return Collections.unmodifiableList(this.f29728p);
    }

    /* renamed from: e */
    public final boolean mo17500e() {
        return !this.f29713a.startsWith("__cast_nearby__");
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CastDevice) {
            CastDevice castDevice = (CastDevice) obj;
            String str = this.f29713a;
            return str == null ? castDevice.f29713a == null : ptk.m31236a(str, castDevice.f29713a) && ptk.m31236a(this.f29715c, castDevice.f29715c) && ptk.m31236a(this.f29717e, castDevice.f29717e) && ptk.m31236a(this.f29716d, castDevice.f29716d) && ptk.m31236a(this.f29718f, castDevice.f29718f) && this.f29719g == castDevice.f29719g && ptk.m31236a(this.f29728p, castDevice.f29728p) && this.f29720h == castDevice.f29720h && this.f29721i == castDevice.f29721i && ptk.m31236a(this.f29722j, castDevice.f29722j) && ptk.m31236a(Integer.valueOf(this.f29724l), Integer.valueOf(castDevice.f29724l)) && ptk.m31236a(this.f29725m, castDevice.f29725m) && ptk.m31236a(this.f29723k, castDevice.f29723k) && ptk.m31236a(this.f29718f, castDevice.f29718f) && this.f29719g == castDevice.f29719g && (((bArr = this.f29726n) == null && castDevice.f29726n == null) || Arrays.equals(bArr, castDevice.f29726n)) && ptk.m31236a(this.f29727o, castDevice.f29727o);
        }
    }

    public final int hashCode() {
        String str = this.f29713a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return String.format("\"%s\" (%s)", this.f29716d, this.f29713a);
    }

    /* renamed from: a */
    public static pet m22256a(String str, InetAddress inetAddress) {
        return new pet(str, inetAddress);
    }

    /* renamed from: b */
    public final boolean mo17497b() {
        InetAddress inetAddress = this.f29715c;
        return inetAddress != null && (inetAddress instanceof Inet4Address);
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f29713a, false);
        see.m35046a(parcel, 3, this.f29714b, false);
        see.m35046a(parcel, 4, this.f29716d, false);
        see.m35046a(parcel, 5, this.f29717e, false);
        see.m35046a(parcel, 6, this.f29718f, false);
        see.m35063b(parcel, 7, this.f29719g);
        see.m35066c(parcel, 8, mo17499d(), false);
        see.m35063b(parcel, 9, this.f29720h);
        see.m35063b(parcel, 10, this.f29721i);
        see.m35046a(parcel, 11, this.f29722j, false);
        see.m35046a(parcel, 12, this.f29723k, false);
        see.m35063b(parcel, 13, this.f29724l);
        see.m35046a(parcel, 14, this.f29725m, false);
        see.m35052a(parcel, 15, this.f29726n, false);
        see.m35046a(parcel, 16, this.f29727o, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final String mo17494a() {
        return this.f29713a.startsWith("__cast_nearby__") ? this.f29713a.substring(16) : this.f29713a;
    }

    /* renamed from: a */
    public final void mo17495a(Bundle bundle) {
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }
}
