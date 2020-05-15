package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpUpsellPlan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agpd();

    /* renamed from: a */
    public final String f80232a;

    /* renamed from: b */
    public final String f80233b;

    /* renamed from: c */
    public final String f80234c;

    /* renamed from: d */
    public final long f80235d;

    /* renamed from: e */
    public final String f80236e;

    /* renamed from: f */
    public final String f80237f;

    /* renamed from: g */
    public final long f80238g;

    /* renamed from: h */
    public final long f80239h;

    /* renamed from: i */
    public final String f80240i;

    /* renamed from: j */
    public final String f80241j;

    /* renamed from: k */
    public final int f80242k;

    public MdpUpsellPlan(String str, String str2, String str3, long j, String str4, String str5, long j2, long j3, String str6, String str7, int i) {
        this.f80232a = str;
        this.f80233b = str2;
        this.f80234c = str3;
        this.f80235d = j;
        this.f80236e = str4;
        this.f80237f = str5;
        this.f80238g = j2;
        this.f80239h = j3;
        this.f80240i = str6;
        this.f80241j = str7;
        this.f80242k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpUpsellPlan) {
            MdpUpsellPlan mdpUpsellPlan = (MdpUpsellPlan) obj;
            return sdg.m34949a(this.f80232a, mdpUpsellPlan.f80232a) && sdg.m34949a(this.f80233b, mdpUpsellPlan.f80233b) && sdg.m34949a(this.f80234c, mdpUpsellPlan.f80234c) && sdg.m34949a(Long.valueOf(this.f80235d), Long.valueOf(mdpUpsellPlan.f80235d)) && sdg.m34949a(this.f80236e, mdpUpsellPlan.f80236e) && sdg.m34949a(this.f80237f, mdpUpsellPlan.f80237f) && sdg.m34949a(Long.valueOf(this.f80238g), Long.valueOf(mdpUpsellPlan.f80238g)) && sdg.m34949a(Long.valueOf(this.f80239h), Long.valueOf(mdpUpsellPlan.f80239h)) && sdg.m34949a(this.f80240i, mdpUpsellPlan.f80240i) && sdg.m34949a(this.f80241j, mdpUpsellPlan.f80241j) && sdg.m34949a(Integer.valueOf(this.f80242k), Integer.valueOf(mdpUpsellPlan.f80242k));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80232a, this.f80233b, this.f80234c, Long.valueOf(this.f80235d), this.f80236e, this.f80237f, Long.valueOf(this.f80238g), Long.valueOf(this.f80239h), this.f80240i, this.f80241j, Integer.valueOf(this.f80242k)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("PlanId", this.f80232a);
        a.mo25396a("PlanName", this.f80233b);
        a.mo25396a("PlanType", this.f80234c);
        a.mo25396a("Cost", Long.valueOf(this.f80235d));
        a.mo25396a("CostCurrency", this.f80236e);
        a.mo25396a("ConnectionType", this.f80237f);
        a.mo25396a("DurationInSeconds", Long.valueOf(this.f80238g));
        a.mo25396a("mQuotaBytes", Long.valueOf(this.f80239h));
        a.mo25396a("mOfferContext", this.f80240i);
        a.mo25396a("planDescription", this.f80241j);
        a.mo25396a("offerType", Integer.valueOf(this.f80242k));
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f80232a, false);
        see.m35046a(parcel, 2, this.f80233b, false);
        see.m35046a(parcel, 3, this.f80234c, false);
        see.m35036a(parcel, 4, this.f80235d);
        see.m35046a(parcel, 5, this.f80236e, false);
        see.m35046a(parcel, 6, this.f80237f, false);
        see.m35036a(parcel, 7, this.f80238g);
        see.m35036a(parcel, 8, this.f80239h);
        see.m35046a(parcel, 9, this.f80240i, false);
        see.m35046a(parcel, 10, this.f80241j, false);
        see.m35063b(parcel, 11, this.f80242k);
        see.m35062b(parcel, a);
    }
}
