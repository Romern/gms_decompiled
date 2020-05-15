package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MfaInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brqt();

    /* renamed from: a */
    public final String f152531a;

    /* renamed from: b */
    public final String f152532b;

    /* renamed from: c */
    public final String f152533c;

    /* renamed from: d */
    public final long f152534d;

    /* renamed from: e */
    public String f152535e;

    public MfaInfo(String str, String str2, String str3, long j) {
        this.f152531a = str;
        sdo.m34977c(str2);
        this.f152532b = str2;
        this.f152533c = str3;
        this.f152534d = j;
    }

    /* renamed from: a */
    public static MfaInfo m118902a(bkll bkll) {
        String str;
        String str2 = "";
        if (bkll.f124792a != 1) {
            str = str2;
        } else {
            str = (String) bkll.f124793b;
        }
        String str3 = bkll.f124796e;
        String str4 = bkll.f124797f;
        bxyk bxyk = bkll.f124798g;
        if (bxyk == null) {
            bxyk = bxyk.f165095c;
        }
        MfaInfo mfaInfo = new MfaInfo(str, str3, str4, bxyk.f165097a);
        if (bkll.f124794c == 5) {
            str2 = (String) bkll.f124795d;
        }
        mfaInfo.f152535e = str2;
        return mfaInfo;
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
        see.m35046a(parcel, 1, this.f152531a, false);
        see.m35046a(parcel, 2, this.f152532b, false);
        see.m35046a(parcel, 3, this.f152533c, false);
        see.m35036a(parcel, 4, this.f152534d);
        see.m35062b(parcel, a);
    }
}
