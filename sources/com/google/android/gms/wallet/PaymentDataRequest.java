package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awbj();

    /* renamed from: a */
    public boolean f109884a;

    /* renamed from: b */
    public boolean f109885b;

    /* renamed from: c */
    public CardRequirements f109886c;

    /* renamed from: d */
    public boolean f109887d;

    /* renamed from: e */
    public ShippingAddressRequirements f109888e;

    /* renamed from: f */
    public ArrayList f109889f;

    /* renamed from: g */
    public PaymentMethodTokenizationParameters f109890g;

    /* renamed from: h */
    public TransactionInfo f109891h;

    /* renamed from: i */
    public boolean f109892i;

    /* renamed from: j */
    public String f109893j;

    /* renamed from: k */
    public Bundle f109894k;

    private PaymentDataRequest() {
        this.f109892i = true;
    }

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
        see.m35051a(parcel, 1, this.f109884a);
        see.m35051a(parcel, 2, this.f109885b);
        see.m35040a(parcel, 3, this.f109886c, i, false);
        see.m35051a(parcel, 4, this.f109887d);
        see.m35040a(parcel, 5, this.f109888e, i, false);
        see.m35049a(parcel, 6, (List) this.f109889f, false);
        see.m35040a(parcel, 7, this.f109890g, i, false);
        see.m35040a(parcel, 8, this.f109891h, i, false);
        see.m35051a(parcel, 9, this.f109892i);
        see.m35046a(parcel, 10, this.f109893j, false);
        see.m35037a(parcel, 11, this.f109894k, false);
        see.m35062b(parcel, a);
    }

    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, Bundle bundle) {
        this.f109884a = z;
        this.f109885b = z2;
        this.f109886c = cardRequirements;
        this.f109887d = z3;
        this.f109888e = shippingAddressRequirements;
        this.f109889f = arrayList;
        this.f109890g = paymentMethodTokenizationParameters;
        this.f109891h = transactionInfo;
        this.f109892i = z4;
        this.f109893j = str;
        this.f109894k = bundle;
    }
}
