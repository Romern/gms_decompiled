package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SendVerificationCodeRequest extends AbstractSafeParcelable implements brpy {
    public static final Parcelable.Creator CREATOR = new brqy();

    /* renamed from: a */
    public final String f152548a;

    /* renamed from: b */
    public final long f152549b;

    /* renamed from: c */
    public final boolean f152550c;

    /* renamed from: d */
    public final String f152551d;

    /* renamed from: e */
    public final String f152552e;

    /* renamed from: f */
    public final String f152553f;

    public SendVerificationCodeRequest(String str, long j, boolean z, String str2, String str3) {
        this(str, j, z, str2, str3, null);
    }

    public SendVerificationCodeRequest(String str, long j, boolean z, String str2, String str3, String str4) {
        sdo.m34977c(str);
        this.f152548a = str;
        this.f152549b = j;
        this.f152550c = z;
        this.f152551d = str2;
        this.f152552e = str3;
        this.f152553f = str4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        bxvd da = bkkr.f124611e.mo74144da();
        String str = this.f152548a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkkr bkkr = (bkkr) da.f164949b;
        str.getClass();
        int i = bkkr.f124613a | 1;
        bkkr.f124613a = i;
        bkkr.f124614b = str;
        String str2 = this.f152552e;
        if (str2 != null) {
            str2.getClass();
            i |= 16;
            bkkr.f124613a = i;
            bkkr.f124616d = str2;
        }
        String str3 = this.f152553f;
        if (str3 != null) {
            str3.getClass();
            bkkr.f124613a = i | 8;
            bkkr.f124615c = str3;
        }
        return (bkkr) da.mo74062i();
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
        see.m35046a(parcel, 1, this.f152548a, false);
        see.m35036a(parcel, 2, this.f152549b);
        see.m35051a(parcel, 3, this.f152550c);
        see.m35046a(parcel, 4, this.f152551d, false);
        see.m35046a(parcel, 5, this.f152552e, false);
        see.m35046a(parcel, 6, this.f152553f, false);
        see.m35062b(parcel, a);
    }
}
