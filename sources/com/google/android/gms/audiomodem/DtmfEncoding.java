package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DtmfEncoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdo();

    /* renamed from: a */
    public static final float[] f9871a = {740.0f, 830.622f, 932.342f, 1108.75f, 1244.53f, 1480.0f, 1661.24f, 1864.68f, 2217.49f, 2489.05f};

    /* renamed from: b */
    public static final AdsrParams f9872b = new gcb().mo11635a();

    /* renamed from: c */
    public final int f9873c;

    /* renamed from: d */
    public final boolean f9874d;

    /* renamed from: e */
    public final float f9875e;

    /* renamed from: f */
    public final int f9876f;

    /* renamed from: g */
    public final int f9877g;

    /* renamed from: h */
    public final int f9878h;

    /* renamed from: i */
    public final int f9879i;

    /* renamed from: j */
    private final AdsrParams f9880j;

    /* renamed from: k */
    private final float[] f9881k;

    public DtmfEncoding(int i, boolean z, float f, int i2, int i3, int i4, int i5, AdsrParams adsrParams, float[] fArr) {
        this.f9873c = i;
        this.f9874d = z;
        this.f9875e = f;
        this.f9876f = i2;
        this.f9877g = i3;
        this.f9878h = i4;
        this.f9879i = i5;
        this.f9880j = adsrParams;
        this.f9881k = fArr;
    }

    /* renamed from: a */
    public final AdsrParams mo7325a() {
        AdsrParams adsrParams = this.f9880j;
        return adsrParams == null ? f9872b : adsrParams;
    }

    /* renamed from: b */
    public final float[] mo7326b() {
        float[] fArr = this.f9881k;
        return fArr == null ? f9871a : fArr;
    }

    /* renamed from: c */
    public final int mo7327c() {
        return this.f9873c + this.f9879i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DtmfEncoding) {
            DtmfEncoding dtmfEncoding = (DtmfEncoding) obj;
            return this.f9873c == dtmfEncoding.f9873c && this.f9874d == dtmfEncoding.f9874d && this.f9875e == dtmfEncoding.f9875e && this.f9876f == dtmfEncoding.f9876f && this.f9877g == dtmfEncoding.f9877g && this.f9878h == dtmfEncoding.f9878h && this.f9879i == dtmfEncoding.f9879i && sdg.m34949a(mo7325a(), dtmfEncoding.mo7325a()) && sdg.m34949a(mo7326b(), dtmfEncoding.mo7326b());
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9873c), Boolean.valueOf(this.f9874d), Float.valueOf(this.f9875e), Integer.valueOf(this.f9876f), Integer.valueOf(this.f9877g), Integer.valueOf(this.f9878h), Integer.valueOf(this.f9879i), this.f9880j, this.f9881k});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, float[], boolean):void
     arg types: [android.os.Parcel, int, float[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f9873c);
        see.m35051a(parcel, 3, this.f9874d);
        see.m35034a(parcel, 4, this.f9875e);
        see.m35063b(parcel, 5, this.f9876f);
        see.m35063b(parcel, 6, this.f9877g);
        see.m35063b(parcel, 7, this.f9878h);
        see.m35063b(parcel, 8, this.f9879i);
        see.m35040a(parcel, 9, mo7325a(), i, false);
        see.m35054a(parcel, 10, mo7326b(), false);
        see.m35062b(parcel, a);
    }
}
