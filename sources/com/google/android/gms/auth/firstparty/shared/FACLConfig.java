package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FACLConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new izc();

    /* renamed from: a */
    final int f10857a;

    /* renamed from: b */
    public boolean f10858b;

    /* renamed from: c */
    public String f10859c;

    /* renamed from: d */
    public boolean f10860d;

    /* renamed from: e */
    public boolean f10861e;

    /* renamed from: f */
    public boolean f10862f;

    /* renamed from: g */
    public boolean f10863g;

    public FACLConfig(int i, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f10857a = i;
        this.f10858b = z;
        this.f10859c = str;
        this.f10860d = z2;
        this.f10861e = z3;
        this.f10862f = z4;
        this.f10863g = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FACLConfig) {
            FACLConfig fACLConfig = (FACLConfig) obj;
            return this.f10858b == fACLConfig.f10858b && TextUtils.equals(this.f10859c, fACLConfig.f10859c) && this.f10860d == fACLConfig.f10860d && this.f10861e == fACLConfig.f10861e && this.f10862f == fACLConfig.f10862f && this.f10863g == fACLConfig.f10863g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10858b), this.f10859c, Boolean.valueOf(this.f10860d), Boolean.valueOf(this.f10861e), Boolean.valueOf(this.f10862f), Boolean.valueOf(this.f10863g)});
    }

    public FACLConfig(boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f10857a = 1;
        this.f10858b = z;
        if (z) {
            this.f10859c = "";
        } else {
            this.f10859c = str;
        }
        this.f10860d = z2;
        this.f10861e = z3;
        this.f10862f = z4;
        this.f10863g = z5;
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
        see.m35063b(parcel, 1, this.f10857a);
        see.m35051a(parcel, 2, this.f10858b);
        see.m35046a(parcel, 3, this.f10859c, false);
        see.m35051a(parcel, 4, this.f10860d);
        see.m35051a(parcel, 5, this.f10861e);
        see.m35051a(parcel, 6, this.f10862f);
        see.m35051a(parcel, 7, this.f10863g);
        see.m35062b(parcel, a);
    }
}
