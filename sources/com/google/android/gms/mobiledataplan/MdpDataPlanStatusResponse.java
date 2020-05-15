package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MdpDataPlanStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agos();

    /* renamed from: a */
    public final String f80186a;

    /* renamed from: b */
    public final MdpDataPlanStatus[] f80187b;

    /* renamed from: c */
    public final Bundle f80188c;

    /* renamed from: d */
    public final String f80189d;

    /* renamed from: e */
    public final WalletBalanceInfo f80190e;

    /* renamed from: f */
    public final Integer f80191f;

    /* renamed from: g */
    public final Long f80192g;

    /* renamed from: h */
    public final Long f80193h;

    public MdpDataPlanStatusResponse(String str, MdpDataPlanStatus[] mdpDataPlanStatusArr, Bundle bundle, String str2, WalletBalanceInfo walletBalanceInfo, Integer num, Long l, Long l2) {
        this.f80186a = str;
        this.f80187b = mdpDataPlanStatusArr;
        this.f80188c = bundle;
        this.f80189d = str2;
        this.f80190e = walletBalanceInfo;
        this.f80191f = num;
        this.f80192g = l;
        this.f80193h = l2;
    }

    /* renamed from: a */
    public final bxyk mo44037a() {
        Long l = this.f80193h;
        if (l != null) {
            return bxzt.m124580a(l.longValue());
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpDataPlanStatusResponse) {
            MdpDataPlanStatusResponse mdpDataPlanStatusResponse = (MdpDataPlanStatusResponse) obj;
            return sdg.m34949a(this.f80186a, mdpDataPlanStatusResponse.f80186a) && Arrays.equals(this.f80187b, mdpDataPlanStatusResponse.f80187b) && agns.m54671a(this.f80188c, mdpDataPlanStatusResponse.f80188c) && sdg.m34949a(this.f80189d, mdpDataPlanStatusResponse.f80189d) && sdg.m34949a(this.f80190e, mdpDataPlanStatusResponse.f80190e) && sdg.m34949a(this.f80191f, mdpDataPlanStatusResponse.f80191f) && sdg.m34949a(this.f80192g, mdpDataPlanStatusResponse.f80192g) && sdg.m34949a(this.f80193h, mdpDataPlanStatusResponse.f80193h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80186a, Integer.valueOf(agns.m54670a(this.f80188c)), this.f80189d, this.f80190e, this.f80191f, this.f80192g, this.f80193h}) ^ Arrays.hashCode(this.f80187b);
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("CarrierPlanId", this.f80186a);
        a.mo25396a("DataPlans", Arrays.toString(this.f80187b));
        a.mo25396a("ExtraInfo", this.f80188c);
        a.mo25396a("Title", this.f80189d);
        a.mo25396a("WalletBalanceInfo", this.f80190e);
        a.mo25396a("EventFlowId", this.f80191f);
        a.mo25396a("UniqueRequestId", this.f80192g);
        Long l = this.f80193h;
        a.mo25396a("UpdateTime", l != null ? bxzt.m124580a(l.longValue()) : null);
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
        see.m35046a(parcel, 1, this.f80186a, false);
        see.m35057a(parcel, 2, this.f80187b, i);
        see.m35037a(parcel, 3, this.f80188c, false);
        see.m35046a(parcel, 4, this.f80189d, false);
        see.m35040a(parcel, 5, this.f80190e, i, false);
        see.m35044a(parcel, 6, this.f80191f);
        see.m35045a(parcel, 7, this.f80192g);
        see.m35045a(parcel, 8, this.f80193h);
        see.m35062b(parcel, a);
    }
}
