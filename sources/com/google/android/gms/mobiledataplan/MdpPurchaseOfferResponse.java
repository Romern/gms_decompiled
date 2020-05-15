package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpPurchaseOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agox();

    /* renamed from: a */
    public final String f80208a;

    /* renamed from: b */
    public final String f80209b;

    /* renamed from: c */
    public final String f80210c;

    /* renamed from: d */
    public final String f80211d;

    /* renamed from: e */
    public final long f80212e;

    /* renamed from: f */
    public final String f80213f;

    /* renamed from: g */
    public final String f80214g;

    /* renamed from: h */
    public Bundle f80215h;

    /* renamed from: i */
    public final Integer f80216i;

    /* renamed from: j */
    public final Long f80217j;

    public MdpPurchaseOfferResponse(String str, String str2, String str3, String str4, long j, String str5, String str6, Bundle bundle, Integer num, Long l) {
        this.f80208a = str;
        this.f80209b = str2;
        this.f80210c = str3;
        this.f80211d = str4;
        this.f80212e = j;
        this.f80213f = str5;
        this.f80214g = str6;
        this.f80215h = bundle;
        this.f80216i = num;
        this.f80217j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpPurchaseOfferResponse) {
            MdpPurchaseOfferResponse mdpPurchaseOfferResponse = (MdpPurchaseOfferResponse) obj;
            return sdg.m34949a(this.f80208a, mdpPurchaseOfferResponse.f80208a) && sdg.m34949a(this.f80209b, mdpPurchaseOfferResponse.f80209b) && sdg.m34949a(this.f80210c, mdpPurchaseOfferResponse.f80210c) && sdg.m34949a(this.f80211d, mdpPurchaseOfferResponse.f80211d) && sdg.m34949a(Long.valueOf(this.f80212e), Long.valueOf(mdpPurchaseOfferResponse.f80212e)) && sdg.m34949a(this.f80213f, mdpPurchaseOfferResponse.f80213f) && sdg.m34949a(this.f80214g, mdpPurchaseOfferResponse.f80214g) && agns.m54671a(this.f80215h, mdpPurchaseOfferResponse.f80215h) && sdg.m34949a(this.f80216i, mdpPurchaseOfferResponse.f80216i) && sdg.m34949a(this.f80217j, mdpPurchaseOfferResponse.f80217j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80208a, this.f80209b, this.f80210c, this.f80211d, Long.valueOf(this.f80212e), this.f80213f, this.f80214g, this.f80215h, this.f80216i, this.f80217j});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("CarrierName", this.f80208a);
        a.mo25396a("TransactionId", this.f80209b);
        a.mo25396a("ConfirmationCode", this.f80210c);
        a.mo25396a("TransactionMsg", this.f80211d);
        a.mo25396a("RemainingBalance", Long.valueOf(this.f80212e));
        a.mo25396a("CostCurrency", this.f80213f);
        a.mo25396a("PlanActivationTime", this.f80214g);
        a.mo25396a("ExtraInfo", this.f80215h);
        a.mo25396a("EventFlowId", this.f80216i);
        a.mo25396a("UniqueRequestId", this.f80217j);
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
        see.m35046a(parcel, 1, this.f80208a, false);
        see.m35046a(parcel, 2, this.f80209b, false);
        see.m35046a(parcel, 3, this.f80210c, false);
        see.m35046a(parcel, 4, this.f80211d, false);
        see.m35036a(parcel, 5, this.f80212e);
        see.m35046a(parcel, 6, this.f80213f, false);
        see.m35046a(parcel, 7, this.f80214g, false);
        see.m35037a(parcel, 8, this.f80215h, false);
        see.m35044a(parcel, 9, this.f80216i);
        see.m35045a(parcel, 10, this.f80217j);
        see.m35062b(parcel, a);
    }
}
