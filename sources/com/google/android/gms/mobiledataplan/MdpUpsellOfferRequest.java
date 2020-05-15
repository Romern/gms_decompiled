package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpUpsellOfferRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agoz();

    /* renamed from: a */
    public final String f80218a;

    /* renamed from: b */
    public final Bundle f80219b;

    /* renamed from: c */
    public final Integer f80220c;

    /* renamed from: d */
    public final Long f80221d;
    @Deprecated

    /* renamed from: e */
    public final PaymentForm[] f80222e;

    public MdpUpsellOfferRequest(String str, Bundle bundle, Integer num, Long l, PaymentForm[] paymentFormArr) {
        this.f80218a = str;
        this.f80219b = bundle;
        this.f80220c = num;
        this.f80221d = l;
        this.f80222e = paymentFormArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpUpsellOfferRequest) {
            MdpUpsellOfferRequest mdpUpsellOfferRequest = (MdpUpsellOfferRequest) obj;
            return sdg.m34949a(this.f80218a, mdpUpsellOfferRequest.f80218a) && agns.m54671a(this.f80219b, mdpUpsellOfferRequest.f80219b) && sdg.m34949a(this.f80220c, mdpUpsellOfferRequest.f80220c) && sdg.m34949a(this.f80221d, mdpUpsellOfferRequest.f80221d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80218a, Integer.valueOf(agns.m54670a(this.f80219b)), this.f80220c, this.f80221d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("CarrierPlanId", this.f80218a);
        a.mo25396a("ExtraInfo", this.f80219b);
        a.mo25396a("EventFlowId", this.f80220c);
        a.mo25396a("UniqueRequestId", this.f80221d);
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
        see.m35046a(parcel, 1, this.f80218a, false);
        see.m35037a(parcel, 2, this.f80219b, false);
        see.m35044a(parcel, 3, this.f80220c);
        see.m35045a(parcel, 4, this.f80221d);
        see.m35057a(parcel, 5, this.f80222e, i);
        see.m35062b(parcel, a);
    }
}
