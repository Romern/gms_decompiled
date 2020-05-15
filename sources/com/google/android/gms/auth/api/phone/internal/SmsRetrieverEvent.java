package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SmsRetrieverEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hzy();

    /* renamed from: a */
    public int f10265a;

    /* renamed from: b */
    public String f10266b;

    /* renamed from: c */
    public int f10267c;

    /* renamed from: d */
    public int f10268d;

    /* renamed from: e */
    public String f10269e;

    /* renamed from: f */
    public String f10270f;

    /* renamed from: g */
    public int f10271g;

    /* renamed from: h */
    public int f10272h;

    /* renamed from: i */
    public int f10273i;

    /* renamed from: j */
    public int f10274j;

    /* renamed from: k */
    public boolean f10275k;

    /* renamed from: l */
    public int f10276l;

    public SmsRetrieverEvent() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmsRetrieverEvent) {
            SmsRetrieverEvent smsRetrieverEvent = (SmsRetrieverEvent) obj;
            return sdg.m34949a(Integer.valueOf(this.f10265a), Integer.valueOf(smsRetrieverEvent.f10265a)) && sdg.m34949a(this.f10266b, smsRetrieverEvent.f10266b) && sdg.m34949a(Integer.valueOf(this.f10267c), Integer.valueOf(smsRetrieverEvent.f10267c)) && sdg.m34949a(Integer.valueOf(this.f10268d), Integer.valueOf(smsRetrieverEvent.f10268d)) && sdg.m34949a(this.f10269e, smsRetrieverEvent.f10269e) && sdg.m34949a(this.f10270f, smsRetrieverEvent.f10270f) && sdg.m34949a(Integer.valueOf(this.f10271g), Integer.valueOf(smsRetrieverEvent.f10271g)) && sdg.m34949a(Integer.valueOf(this.f10272h), Integer.valueOf(smsRetrieverEvent.f10272h)) && sdg.m34949a(Integer.valueOf(this.f10273i), Integer.valueOf(smsRetrieverEvent.f10273i)) && sdg.m34949a(Integer.valueOf(this.f10274j), Integer.valueOf(smsRetrieverEvent.f10274j)) && sdg.m34949a(Boolean.valueOf(this.f10275k), Boolean.valueOf(smsRetrieverEvent.f10275k)) && sdg.m34949a(Integer.valueOf(this.f10276l), Integer.valueOf(smsRetrieverEvent.f10276l));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10265a), bmxx.m108578b(this.f10266b), Integer.valueOf(this.f10267c), Integer.valueOf(this.f10268d), bmxx.m108578b(this.f10269e), bmxx.m108578b(this.f10270f), Integer.valueOf(this.f10271g), Integer.valueOf(this.f10272h), Integer.valueOf(this.f10273i), Integer.valueOf(this.f10274j), Boolean.valueOf(this.f10275k), Integer.valueOf(this.f10276l)});
    }

    public SmsRetrieverEvent(int i, String str, int i2, int i3, String str2, String str3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        this.f10265a = i;
        this.f10266b = str;
        this.f10267c = i2;
        this.f10268d = i3;
        this.f10269e = str2;
        this.f10270f = str3;
        this.f10271g = i4;
        this.f10272h = i5;
        this.f10273i = i6;
        this.f10274j = i7;
        this.f10275k = z;
        this.f10276l = i8;
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
        see.m35063b(parcel, 1, this.f10265a);
        see.m35046a(parcel, 2, this.f10266b, false);
        see.m35063b(parcel, 3, this.f10267c);
        see.m35063b(parcel, 4, this.f10268d);
        see.m35046a(parcel, 5, this.f10269e, false);
        see.m35046a(parcel, 6, this.f10270f, false);
        see.m35063b(parcel, 7, this.f10271g);
        see.m35063b(parcel, 8, this.f10272h);
        see.m35063b(parcel, 9, this.f10273i);
        see.m35063b(parcel, 10, this.f10274j);
        see.m35051a(parcel, 11, this.f10275k);
        see.m35063b(parcel, 65535, this.f10276l);
        see.m35062b(parcel, a);
    }
}
