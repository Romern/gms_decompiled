package com.google.android.gms.ocr;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CreditCardOcrResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new akpb();

    /* renamed from: a */
    public String f81228a;

    /* renamed from: b */
    public int f81229b;

    /* renamed from: c */
    public int f81230c;

    /* renamed from: d */
    public int f81231d;

    /* renamed from: e */
    public String f81232e;

    /* renamed from: f */
    public String f81233f;

    /* renamed from: g */
    public boolean f81234g;

    /* renamed from: h */
    public String f81235h;

    /* renamed from: i */
    public String f81236i;

    /* renamed from: j */
    public String f81237j;

    /* renamed from: k */
    public String f81238k;

    /* renamed from: l */
    public int[] f81239l;

    /* renamed from: m */
    public int[] f81240m;

    /* renamed from: n */
    public String[] f81241n;

    /* renamed from: o */
    public String[] f81242o;

    /* renamed from: p */
    public int f81243p;

    /* renamed from: q */
    public int f81244q;

    private CreditCardOcrResult() {
    }

    /* renamed from: a */
    public static CreditCardOcrResult m67675a(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT")) {
            return null;
        }
        intent.setExtrasClassLoader(CreditCardOcrResult.class.getClassLoader());
        return (CreditCardOcrResult) intent.getParcelableExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT");
    }

    /* renamed from: b */
    public static akpa m67676b() {
        return new akpa(new CreditCardOcrResult());
    }

    /* renamed from: a */
    public final boolean mo44703a() {
        return this.f81230c >= 0 && this.f81229b != 0;
    }

    public CreditCardOcrResult(String str, int i, int i2, int i3, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, int[] iArr, int[] iArr2, String[] strArr, String[] strArr2, int i4, int i5) {
        this.f81228a = str;
        this.f81229b = i;
        this.f81230c = i2;
        this.f81231d = i3;
        this.f81232e = str2;
        this.f81233f = str3;
        this.f81234g = z;
        this.f81235h = str4;
        this.f81236i = str5;
        this.f81237j = str6;
        this.f81238k = str7;
        this.f81240m = iArr2;
        this.f81239l = iArr;
        this.f81241n = strArr;
        this.f81242o = strArr2;
        this.f81243p = i4;
        this.f81244q = i5;
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
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f81228a, false);
        see.m35063b(parcel, 3, this.f81229b);
        see.m35063b(parcel, 4, this.f81230c);
        see.m35063b(parcel, 5, this.f81231d);
        see.m35046a(parcel, 6, this.f81232e, false);
        see.m35046a(parcel, 7, this.f81233f, false);
        see.m35051a(parcel, 8, this.f81234g);
        see.m35046a(parcel, 9, this.f81235h, false);
        see.m35046a(parcel, 10, this.f81236i, false);
        see.m35046a(parcel, 11, this.f81237j, false);
        see.m35046a(parcel, 12, this.f81238k, false);
        see.m35055a(parcel, 13, this.f81239l, false);
        see.m35055a(parcel, 14, this.f81240m, false);
        see.m35058a(parcel, 15, this.f81241n, false);
        see.m35058a(parcel, 16, this.f81242o, false);
        see.m35063b(parcel, 17, this.f81243p);
        see.m35063b(parcel, 18, this.f81244q);
        see.m35062b(parcel, a);
    }
}
