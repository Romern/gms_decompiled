package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppDescription extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new iyx();

    /* renamed from: g */
    private static final String f10836g;

    /* renamed from: a */
    final int f10837a;

    /* renamed from: b */
    public int f10838b;

    /* renamed from: c */
    String f10839c;

    /* renamed from: d */
    String f10840d;

    /* renamed from: e */
    public String f10841e;

    /* renamed from: f */
    boolean f10842f;

    static {
        String simpleName = AppDescription.class.getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2);
        sb.append("[");
        sb.append(simpleName);
        sb.append("]");
        f10836g = sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public AppDescription(int i, int i2, String str, String str2, String str3, boolean z) {
        boolean z2;
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 14);
        sb.append("[");
        sb.append(simpleName);
        sb.append("] %s - %s: %s");
        sb.toString();
        this.f10837a = i;
        this.f10839c = str;
        this.f10840d = str2;
        sdo.m34969a(str3, (Object) String.valueOf(f10836g).concat(" callingPkg cannot be null or empty!"));
        this.f10841e = str3;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "Invalid callingUid! Cannot be 0!");
        this.f10838b = i2;
        this.f10842f = z;
    }

    public final String toString() {
        return getClass().getSimpleName() + "<" + this.f10841e + ", " + this.f10838b + ">";
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
        see.m35063b(parcel, 1, this.f10837a);
        see.m35063b(parcel, 2, this.f10838b);
        see.m35046a(parcel, 3, this.f10839c, false);
        see.m35046a(parcel, 4, this.f10840d, false);
        see.m35046a(parcel, 5, this.f10841e, false);
        see.m35051a(parcel, 6, this.f10842f);
        see.m35062b(parcel, a);
    }

    public AppDescription(String str, int i, String str2, String str3) {
        this(1, i, str2, str3, str, false);
    }
}
