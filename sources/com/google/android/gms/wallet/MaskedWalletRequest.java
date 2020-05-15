package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awbe();

    /* renamed from: a */
    public String f109856a;

    /* renamed from: b */
    public boolean f109857b;

    /* renamed from: c */
    public boolean f109858c;

    /* renamed from: d */
    boolean f109859d;

    /* renamed from: e */
    public String f109860e;

    /* renamed from: f */
    public String f109861f;

    /* renamed from: g */
    public String f109862g;

    /* renamed from: h */
    public Cart f109863h;

    /* renamed from: i */
    boolean f109864i;

    /* renamed from: j */
    boolean f109865j;

    /* renamed from: k */
    CountrySpecification[] f109866k;

    /* renamed from: l */
    public boolean f109867l;

    /* renamed from: m */
    public boolean f109868m;

    /* renamed from: n */
    public ArrayList f109869n;

    /* renamed from: o */
    public PaymentMethodTokenizationParameters f109870o;

    /* renamed from: p */
    public ArrayList f109871p;

    /* renamed from: q */
    public String f109872q;

    public MaskedWalletRequest() {
        this.f109867l = true;
        this.f109868m = true;
    }

    public MaskedWalletRequest(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList arrayList2, String str5) {
        this.f109856a = str;
        this.f109857b = z;
        this.f109858c = z2;
        this.f109859d = z3;
        this.f109860e = str2;
        this.f109861f = str3;
        this.f109862g = str4;
        this.f109863h = cart;
        this.f109864i = z4;
        this.f109865j = z5;
        this.f109866k = countrySpecificationArr;
        this.f109867l = z6;
        this.f109868m = z7;
        this.f109869n = arrayList;
        this.f109870o = paymentMethodTokenizationParameters;
        this.f109871p = arrayList2;
        this.f109872q = str5;
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
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.ArrayList, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f109856a, false);
        see.m35051a(parcel, 3, this.f109857b);
        see.m35051a(parcel, 4, this.f109858c);
        see.m35051a(parcel, 5, this.f109859d);
        see.m35046a(parcel, 6, this.f109860e, false);
        see.m35046a(parcel, 7, this.f109861f, false);
        see.m35046a(parcel, 8, this.f109862g, false);
        see.m35040a(parcel, 9, this.f109863h, i, false);
        see.m35051a(parcel, 10, this.f109864i);
        see.m35051a(parcel, 11, this.f109865j);
        see.m35057a(parcel, 12, this.f109866k, i);
        see.m35051a(parcel, 13, this.f109867l);
        see.m35051a(parcel, 14, this.f109868m);
        see.m35066c(parcel, 15, this.f109869n, false);
        see.m35040a(parcel, 16, this.f109870o, i, false);
        see.m35049a(parcel, 17, (List) this.f109871p, false);
        see.m35046a(parcel, 18, this.f109872q, false);
        see.m35062b(parcel, a);
    }
}
