package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountNameCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iwe();

    /* renamed from: a */
    final int f10581a;

    /* renamed from: b */
    String f10582b;

    /* renamed from: c */
    List f10583c;

    /* renamed from: d */
    String f10584d;

    /* renamed from: e */
    CaptchaChallenge f10585e;

    public AccountNameCheckResponse(int i, String str, List list, String str2, CaptchaChallenge captchaChallenge) {
        this.f10581a = i;
        this.f10582b = str;
        this.f10583c = list;
        this.f10584d = str2;
        this.f10585e = captchaChallenge;
    }

    public AccountNameCheckResponse(izj izj) {
        this(izj, null, null, Collections.EMPTY_LIST);
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
        see.m35063b(parcel, 1, this.f10581a);
        see.m35046a(parcel, 2, this.f10582b, false);
        see.m35065b(parcel, 3, this.f10583c, false);
        see.m35046a(parcel, 4, this.f10584d, false);
        see.m35040a(parcel, 5, this.f10585e, i, false);
        see.m35062b(parcel, a);
    }

    public AccountNameCheckResponse(izj izj, String str, CaptchaChallenge captchaChallenge, List list) {
        this.f10581a = 1;
        sdo.m34959a(izj);
        this.f10582b = izj.f22000ac;
        this.f10584d = str;
        this.f10585e = captchaChallenge;
        this.f10583c = Collections.unmodifiableList(new ArrayList(list));
    }
}
