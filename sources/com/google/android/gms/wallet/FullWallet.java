package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awaq();

    /* renamed from: a */
    public String f109784a;

    /* renamed from: b */
    public String f109785b;

    /* renamed from: c */
    ProxyCard f109786c;

    /* renamed from: d */
    public String f109787d;

    /* renamed from: e */
    public Address f109788e;

    /* renamed from: f */
    public Address f109789f;

    /* renamed from: g */
    public String[] f109790g;

    /* renamed from: h */
    public UserAddress f109791h;

    /* renamed from: i */
    public UserAddress f109792i;

    /* renamed from: j */
    public InstrumentInfo[] f109793j;

    /* renamed from: k */
    public PaymentMethodToken f109794k;

    private FullWallet() {
    }

    /* renamed from: a */
    public static awap m93786a() {
        return new awap(new FullWallet());
    }

    public FullWallet(String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.f109784a = str;
        this.f109785b = str2;
        this.f109786c = proxyCard;
        this.f109787d = str3;
        this.f109788e = address;
        this.f109789f = address2;
        this.f109790g = strArr;
        this.f109791h = userAddress;
        this.f109792i = userAddress2;
        this.f109793j = instrumentInfoArr;
        this.f109794k = paymentMethodToken;
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
        see.m35046a(parcel, 2, this.f109784a, false);
        see.m35046a(parcel, 3, this.f109785b, false);
        see.m35040a(parcel, 4, this.f109786c, i, false);
        see.m35046a(parcel, 5, this.f109787d, false);
        see.m35040a(parcel, 6, this.f109788e, i, false);
        see.m35040a(parcel, 7, this.f109789f, i, false);
        see.m35058a(parcel, 8, this.f109790g, false);
        see.m35040a(parcel, 9, this.f109791h, i, false);
        see.m35040a(parcel, 10, this.f109792i, i, false);
        see.m35057a(parcel, 11, this.f109793j, i);
        see.m35040a(parcel, 12, this.f109794k, i, false);
        see.m35062b(parcel, a);
    }
}
