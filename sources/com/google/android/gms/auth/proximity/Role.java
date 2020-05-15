package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Role extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new jnn();

    /* renamed from: a */
    public final int f11145a;

    /* renamed from: b */
    public final String f11146b;

    /* renamed from: c */
    public final int f11147c;

    public Role(int i, String str, int i2) {
        this.f11145a = i;
        this.f11146b = str;
        this.f11147c = i2;
    }

    /* renamed from: a */
    public static boolean m6770a(int i) {
        return i > 0 && i < 256;
    }

    /* renamed from: b */
    public static boolean m6772b(int i) {
        return (i & 4) > 0 || (i & 8) > 0;
    }

    /* renamed from: c */
    public static boolean m6773c(int i) {
        return (i & 4) > 0;
    }

    /* renamed from: d */
    public static boolean m6774d(int i) {
        return (i & 8) > 0;
    }

    /* renamed from: e */
    public static boolean m6775e(int i) {
        return (i & 16) > 0 || (i & 32) > 0;
    }

    /* renamed from: f */
    public static boolean m6776f(int i) {
        return (i & 64) > 0;
    }

    /* renamed from: g */
    public static boolean m6777g(int i) {
        return (i & 128) > 0;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Role role = (Role) obj;
        int compareTo = this.f11146b.compareTo(role.f11146b);
        return compareTo == 0 ? this.f11147c - role.f11147c : compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(getClass())) {
            Role role = (Role) obj;
            if (role.f11145a == this.f11145a && role.f11146b.equals(this.f11146b) && role.f11147c == this.f11147c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11145a), Integer.valueOf(this.f11146b.hashCode()), Integer.valueOf(this.f11147c)});
    }

    public final String toString() {
        return String.format(Locale.US, "Role{featureName=%s, connectionMode=%d}", this.f11146b, Integer.valueOf(this.f11147c));
    }

    public Role(String str, int i) {
        this(2, str, i);
    }

    /* renamed from: a */
    public static boolean m6771a(int i, int i2) {
        if (i2 == 1) {
            return m6772b(i);
        }
        if (i2 == 2) {
            return m6775e(i);
        }
        if (i2 != 4) {
            return false;
        }
        return m6777g(i) || m6776f(i);
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
        see.m35046a(parcel, 1, this.f11146b, false);
        see.m35063b(parcel, 2, this.f11147c);
        see.m35063b(parcel, 1000, this.f11145a);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final int mo7789a() {
        if (Long.bitCount((long) this.f11147c) != 1) {
            return 0;
        }
        int i = this.f11147c;
        if (i == 4 || i == 8) {
            return 1;
        }
        if (i == 16 || i == 32) {
            return 2;
        }
        return (i == 64 || i == 128) ? 4 : 0;
    }
}
