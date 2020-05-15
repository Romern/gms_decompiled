package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecognitionScreen extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new akpl();

    /* renamed from: a */
    public String f81255a;

    /* renamed from: b */
    public String f81256b;

    /* renamed from: c */
    public int f81257c;

    /* renamed from: d */
    public String f81258d;

    /* renamed from: e */
    public String f81259e;

    /* renamed from: f */
    public String f81260f;

    private RecognitionScreen() {
    }

    /* renamed from: a */
    public static akpk m67680a() {
        return new akpk(new RecognitionScreen());
    }

    public RecognitionScreen(String str, String str2, int i, String str3, String str4, String str5) {
        this.f81255a = str;
        this.f81256b = str2;
        this.f81257c = i;
        this.f81258d = str3;
        this.f81259e = str4;
        this.f81260f = str5;
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
        see.m35046a(parcel, 2, this.f81255a, false);
        see.m35046a(parcel, 3, this.f81256b, false);
        see.m35063b(parcel, 4, this.f81257c);
        see.m35046a(parcel, 5, this.f81258d, false);
        see.m35046a(parcel, 6, this.f81259e, false);
        see.m35046a(parcel, 7, this.f81260f, false);
        see.m35062b(parcel, a);
    }
}
