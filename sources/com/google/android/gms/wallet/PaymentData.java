package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awbi();

    /* renamed from: a */
    public String f109876a;

    /* renamed from: b */
    public CardInfo f109877b;

    /* renamed from: c */
    public UserAddress f109878c;

    /* renamed from: d */
    public PaymentMethodToken f109879d;

    /* renamed from: e */
    public String f109880e;

    /* renamed from: f */
    public Bundle f109881f;

    /* renamed from: g */
    String f109882g;

    /* renamed from: h */
    public Bundle f109883h;

    private PaymentData() {
    }

    /* renamed from: a */
    public static awbh m93791a() {
        return new awbh(new PaymentData());
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f109876a = str;
        this.f109877b = cardInfo;
        this.f109878c = userAddress;
        this.f109879d = paymentMethodToken;
        this.f109880e = str2;
        this.f109881f = bundle;
        this.f109882g = str3;
        this.f109883h = bundle2;
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
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
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
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f109876a, false);
        see.m35040a(parcel, 2, this.f109877b, i, false);
        see.m35040a(parcel, 3, this.f109878c, i, false);
        see.m35040a(parcel, 4, this.f109879d, i, false);
        see.m35046a(parcel, 5, this.f109880e, false);
        see.m35037a(parcel, 6, this.f109881f, false);
        see.m35046a(parcel, 7, this.f109882g, false);
        see.m35037a(parcel, 8, this.f109883h, false);
        see.m35062b(parcel, a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static PaymentData m93792a(String str) {
        awbh a = m93791a();
        sdo.checkIfNull((Object) str, (Object) "paymentDataJson cannot be null!");
        PaymentData paymentData = a.f94145a;
        paymentData.f109882g = str;
        return paymentData;
    }

    /* renamed from: a */
    public final void mo59766a(Intent intent) {
        sef.m35071a(this, intent, "com.google.android.gms.wallet.PaymentData");
    }
}
