package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awbc();

    /* renamed from: a */
    public String f109845a;

    /* renamed from: b */
    public String f109846b;

    /* renamed from: c */
    public String[] f109847c;

    /* renamed from: d */
    public String f109848d;

    /* renamed from: e */
    public Address f109849e;

    /* renamed from: f */
    public Address f109850f;

    /* renamed from: g */
    LoyaltyWalletObject[] f109851g;

    /* renamed from: h */
    OfferWalletObject[] f109852h;

    /* renamed from: i */
    public UserAddress f109853i;

    /* renamed from: j */
    public UserAddress f109854j;

    /* renamed from: k */
    public InstrumentInfo[] f109855k;

    private MaskedWallet() {
    }

    /* renamed from: a */
    public static awbb m93790a() {
        return new awbb(new MaskedWallet());
    }

    public MaskedWallet(String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f109845a = str;
        this.f109846b = str2;
        this.f109847c = strArr;
        this.f109848d = str3;
        this.f109849e = address;
        this.f109850f = address2;
        this.f109851g = loyaltyWalletObjectArr;
        this.f109852h = offerWalletObjectArr;
        this.f109853i = userAddress;
        this.f109854j = userAddress2;
        this.f109855k = instrumentInfoArr;
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
        see.m35046a(parcel, 2, this.f109845a, false);
        see.m35046a(parcel, 3, this.f109846b, false);
        see.m35058a(parcel, 4, this.f109847c, false);
        see.m35046a(parcel, 5, this.f109848d, false);
        see.m35040a(parcel, 6, this.f109849e, i, false);
        see.m35040a(parcel, 7, this.f109850f, i, false);
        see.m35057a(parcel, 8, this.f109851g, i);
        see.m35057a(parcel, 9, this.f109852h, i);
        see.m35040a(parcel, 10, this.f109853i, i, false);
        see.m35040a(parcel, 11, this.f109854j, i, false);
        see.m35057a(parcel, 12, this.f109855k, i);
        see.m35062b(parcel, a);
    }
}
