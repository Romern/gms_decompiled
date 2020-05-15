package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Permission extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new txe();

    /* renamed from: a */
    public String f30741a;

    /* renamed from: b */
    public String f30742b;

    /* renamed from: c */
    public boolean f30743c;

    /* renamed from: d */
    private String f30744d;

    /* renamed from: e */
    private int f30745e;

    /* renamed from: f */
    private int f30746f;

    public Permission(String str, int i, String str2, String str3, int i2, boolean z) {
        this.f30744d = str;
        this.f30745e = i;
        this.f30741a = str2;
        this.f30742b = str3;
        this.f30746f = i2;
        this.f30743c = z;
    }

    /* renamed from: a */
    public static boolean m22930a(int i) {
        switch (i) {
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /*256*/:
            case 257:
            case 258:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m22931b(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    /* renamed from: c */
    public final int mo18125c() {
        if (m22931b(this.f30746f)) {
            return this.f30746f;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Permission permission = (Permission) obj;
        return sdg.m34949a(this.f30744d, permission.f30744d) && this.f30745e == permission.f30745e && this.f30746f == permission.f30746f && this.f30743c == permission.f30743c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30744d, Integer.valueOf(this.f30745e), Integer.valueOf(this.f30746f), Boolean.valueOf(this.f30743c)});
    }

    /* renamed from: a */
    public final String mo18123a() {
        if (m22930a(this.f30745e)) {
            return this.f30744d;
        }
        return null;
    }

    /* renamed from: b */
    public final int mo18124b() {
        if (m22930a(this.f30745e)) {
            return this.f30745e;
        }
        return -1;
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
        see.m35046a(parcel, 2, mo18123a(), false);
        see.m35063b(parcel, 3, mo18124b());
        see.m35046a(parcel, 4, this.f30741a, false);
        see.m35046a(parcel, 5, this.f30742b, false);
        see.m35063b(parcel, 6, mo18125c());
        see.m35051a(parcel, 7, this.f30743c);
        see.m35062b(parcel, a);
    }
}
