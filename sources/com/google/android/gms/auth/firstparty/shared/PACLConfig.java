package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PACLConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new izg();

    /* renamed from: a */
    final int f10877a;

    /* renamed from: b */
    public String f10878b;

    /* renamed from: c */
    public String f10879c;

    public PACLConfig(int i, String str, String str2) {
        this.f10877a = i;
        this.f10878b = str;
        this.f10879c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PACLConfig) {
            PACLConfig pACLConfig = (PACLConfig) obj;
            return TextUtils.equals(this.f10878b, pACLConfig.f10878b) && TextUtils.equals(this.f10879c, pACLConfig.f10879c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10878b, this.f10879c});
    }

    public PACLConfig(String str, String str2) {
        this.f10877a = 1;
        this.f10878b = str;
        this.f10879c = str2;
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
        see.m35063b(parcel, 1, this.f10877a);
        see.m35046a(parcel, 2, this.f10878b, false);
        see.m35046a(parcel, 3, this.f10879c, false);
        see.m35062b(parcel, a);
    }
}
