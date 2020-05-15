package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpPurchaseOfferRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agov();

    /* renamed from: a */
    public final String f80198a;

    /* renamed from: b */
    public final String f80199b;

    /* renamed from: c */
    public final String f80200c;

    /* renamed from: d */
    public final String f80201d;

    /* renamed from: e */
    public final Bundle f80202e;

    /* renamed from: f */
    public final Integer f80203f;

    /* renamed from: g */
    public final Long f80204g;

    /* renamed from: h */
    public final int f80205h;

    /* renamed from: i */
    public final PaymentForm[] f80206i;

    /* renamed from: j */
    public final String f80207j;

    public MdpPurchaseOfferRequest(String str, String str2, String str3, String str4, Bundle bundle, Integer num, Long l, int i, PaymentForm[] paymentFormArr, String str5) {
        this.f80198a = str;
        this.f80199b = str2;
        this.f80200c = str3;
        this.f80201d = str4;
        this.f80202e = bundle;
        this.f80203f = num;
        this.f80204g = l;
        this.f80205h = i;
        this.f80206i = paymentFormArr;
        this.f80207j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpPurchaseOfferRequest) {
            MdpPurchaseOfferRequest mdpPurchaseOfferRequest = (MdpPurchaseOfferRequest) obj;
            return sdg.m34949a(this.f80198a, mdpPurchaseOfferRequest.f80198a) && sdg.m34949a(this.f80199b, mdpPurchaseOfferRequest.f80199b) && sdg.m34949a(this.f80200c, mdpPurchaseOfferRequest.f80200c) && sdg.m34949a(this.f80201d, mdpPurchaseOfferRequest.f80201d) && agns.m54671a(this.f80202e, mdpPurchaseOfferRequest.f80202e) && sdg.m34949a(this.f80203f, mdpPurchaseOfferRequest.f80203f) && sdg.m34949a(this.f80204g, mdpPurchaseOfferRequest.f80204g) && sdg.m34949a(Integer.valueOf(this.f80205h), Integer.valueOf(mdpPurchaseOfferRequest.f80205h)) && Arrays.equals(this.f80206i, mdpPurchaseOfferRequest.f80206i) && sdg.m34949a(this.f80207j, mdpPurchaseOfferRequest.f80207j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80198a, this.f80199b, this.f80200c, this.f80201d, Integer.valueOf(agns.m54670a(this.f80202e)), this.f80203f, this.f80204g, Integer.valueOf(this.f80205h), Integer.valueOf(Arrays.hashCode(this.f80206i)), this.f80207j});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("CarrierPlanId", this.f80198a);
        a.mo25396a("PlanId", this.f80199b);
        a.mo25396a("OfferContext", this.f80200c);
        a.mo25396a("TransactionId", this.f80201d);
        a.mo25396a("ExtraInfo", this.f80202e);
        a.mo25396a("EventFlowId", this.f80203f);
        a.mo25396a("UniqueRequestId", this.f80204g);
        a.mo25396a("OfferType", Integer.valueOf(this.f80205h));
        a.mo25396a("PaymentForms", Arrays.toString(this.f80206i));
        a.mo25396a("GooglePayPaymentDataSerialized", this.f80207j);
        return a.toString();
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
        see.m35046a(parcel, 1, this.f80198a, false);
        see.m35046a(parcel, 2, this.f80199b, false);
        see.m35046a(parcel, 3, this.f80200c, false);
        see.m35046a(parcel, 4, this.f80201d, false);
        see.m35037a(parcel, 5, this.f80202e, false);
        see.m35044a(parcel, 6, this.f80203f);
        see.m35045a(parcel, 7, this.f80204g);
        see.m35063b(parcel, 8, this.f80205h);
        see.m35057a(parcel, 9, this.f80206i, i);
        see.m35046a(parcel, 10, this.f80207j, false);
        see.m35062b(parcel, a);
    }
}
