package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aark();

    /* renamed from: a */
    public GoogleHelp f78784a;

    /* renamed from: b */
    public String f78785b;

    /* renamed from: c */
    public String f78786c;

    /* renamed from: d */
    public int f78787d;

    /* renamed from: e */
    public String f78788e;

    /* renamed from: f */
    public int f78789f;

    public InProductHelp(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2) {
        this.f78784a = googleHelp;
        this.f78785b = str;
        this.f78786c = str2;
        this.f78787d = i;
        this.f78788e = str3;
        this.f78789f = i2;
    }

    /* renamed from: a */
    public final void mo43199a() {
        this.f78789f = 0;
    }

    /* renamed from: b */
    public final void mo43200b() {
        this.f78787d = 0;
    }

    /* renamed from: c */
    public final void mo43201c() {
        this.f78788e = null;
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
        see.m35040a(parcel, 1, this.f78784a, i, false);
        see.m35046a(parcel, 2, this.f78785b, false);
        see.m35046a(parcel, 3, this.f78786c, false);
        see.m35063b(parcel, 4, this.f78787d);
        see.m35046a(parcel, 5, this.f78788e, false);
        see.m35063b(parcel, 6, this.f78789f);
        see.m35062b(parcel, a);
    }
}
