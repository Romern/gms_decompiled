package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SupportRequestHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aarm();

    /* renamed from: a */
    public GoogleHelp f78795a;

    /* renamed from: b */
    public String f78796b;

    /* renamed from: c */
    public String f78797c;

    /* renamed from: d */
    public String f78798d;

    /* renamed from: e */
    public String f78799e;

    public SupportRequestHelp(GoogleHelp googleHelp, String str, String str2, String str3, String str4) {
        this.f78795a = googleHelp;
        this.f78796b = str;
        this.f78797c = str2;
        this.f78798d = str3;
        this.f78799e = str4;
    }

    /* renamed from: a */
    public static SupportRequestHelp m66346a(GoogleHelp googleHelp) {
        return new SupportRequestHelp(googleHelp, null, null, null, null);
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
        see.m35040a(parcel, 1, this.f78795a, i, false);
        see.m35046a(parcel, 2, this.f78796b, false);
        see.m35046a(parcel, 3, this.f78797c, false);
        see.m35046a(parcel, 4, this.f78798d, false);
        see.m35046a(parcel, 5, this.f78799e, false);
        see.m35062b(parcel, a);
    }
}
