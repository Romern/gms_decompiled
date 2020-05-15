package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awat();

    /* renamed from: a */
    public CommonWalletObject f109798a;

    /* renamed from: b */
    public String f109799b;

    /* renamed from: c */
    public String f109800c;
    @Deprecated

    /* renamed from: d */
    String f109801d;

    /* renamed from: e */
    public long f109802e;

    /* renamed from: f */
    public String f109803f;

    /* renamed from: g */
    public long f109804g;

    /* renamed from: h */
    public String f109805h;

    GiftCardWalletObject() {
        this.f109798a = CommonWalletObject.m94305a().f95841a;
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
        see.m35040a(parcel, 2, this.f109798a, i, false);
        see.m35046a(parcel, 3, this.f109799b, false);
        see.m35046a(parcel, 4, this.f109800c, false);
        see.m35046a(parcel, 5, this.f109801d, false);
        see.m35036a(parcel, 6, this.f109802e);
        see.m35046a(parcel, 7, this.f109803f, false);
        see.m35036a(parcel, 8, this.f109804g);
        see.m35046a(parcel, 9, this.f109805h, false);
        see.m35062b(parcel, a);
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        CommonWalletObject.m94305a();
        this.f109798a = commonWalletObject;
        this.f109799b = str;
        this.f109800c = str2;
        this.f109802e = j;
        this.f109803f = str4;
        this.f109804g = j2;
        this.f109805h = str5;
        this.f109801d = str3;
    }
}
