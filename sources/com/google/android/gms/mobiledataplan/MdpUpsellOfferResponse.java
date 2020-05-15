package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpUpsellOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agpb();

    /* renamed from: a */
    public final String f80223a;

    /* renamed from: b */
    public final String f80224b;

    /* renamed from: c */
    public final String f80225c;

    /* renamed from: d */
    public final String f80226d;

    /* renamed from: e */
    public final MdpUpsellPlan[] f80227e;

    /* renamed from: f */
    public final Bundle f80228f;

    /* renamed from: g */
    public final Integer f80229g;

    /* renamed from: h */
    public final Long f80230h;

    /* renamed from: i */
    public final PaymentForm[] f80231i;

    public MdpUpsellOfferResponse(String str, String str2, String str3, String str4, MdpUpsellPlan[] mdpUpsellPlanArr, Bundle bundle, Integer num, Long l, PaymentForm[] paymentFormArr) {
        this.f80223a = str;
        this.f80224b = str2;
        this.f80225c = str3;
        this.f80226d = str4;
        this.f80227e = mdpUpsellPlanArr;
        this.f80228f = bundle;
        this.f80229g = num;
        this.f80230h = l;
        this.f80231i = paymentFormArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpUpsellOfferResponse) {
            MdpUpsellOfferResponse mdpUpsellOfferResponse = (MdpUpsellOfferResponse) obj;
            return sdg.m34949a(this.f80223a, mdpUpsellOfferResponse.f80223a) && sdg.m34949a(this.f80224b, mdpUpsellOfferResponse.f80224b) && sdg.m34949a(this.f80225c, mdpUpsellOfferResponse.f80225c) && sdg.m34949a(this.f80226d, mdpUpsellOfferResponse.f80226d) && Arrays.equals(this.f80227e, mdpUpsellOfferResponse.f80227e) && agns.m54671a(this.f80228f, mdpUpsellOfferResponse.f80228f) && sdg.m34949a(this.f80229g, mdpUpsellOfferResponse.f80229g) && sdg.m34949a(this.f80230h, mdpUpsellOfferResponse.f80230h) && Arrays.equals(this.f80231i, mdpUpsellOfferResponse.f80231i);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80223a, this.f80224b, this.f80225c, this.f80226d, Integer.valueOf(agns.m54670a(this.f80228f)), this.f80229g, this.f80230h, Integer.valueOf(Arrays.hashCode(this.f80227e)), Integer.valueOf(Arrays.hashCode(this.f80231i))});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("CarrierName", this.f80223a);
        a.mo25396a("CarrierLogoUrl", this.f80224b);
        a.mo25396a("PromoMessage", this.f80225c);
        a.mo25396a("Info", this.f80226d);
        a.mo25396a("UpsellPlans", Arrays.toString(this.f80227e));
        a.mo25396a("ExtraInfo", this.f80228f);
        a.mo25396a("EventFlowId", this.f80229g);
        a.mo25396a("UniqueRequestId", this.f80230h);
        a.mo25396a("PaymentForms", Arrays.toString(this.f80231i));
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
        see.m35046a(parcel, 1, this.f80223a, false);
        see.m35046a(parcel, 2, this.f80224b, false);
        see.m35046a(parcel, 3, this.f80225c, false);
        see.m35046a(parcel, 4, this.f80226d, false);
        see.m35057a(parcel, 5, this.f80227e, i);
        see.m35037a(parcel, 6, this.f80228f, false);
        see.m35044a(parcel, 7, this.f80229g);
        see.m35045a(parcel, 8, this.f80230h);
        see.m35057a(parcel, 9, this.f80231i, i);
        see.m35062b(parcel, a);
    }
}
