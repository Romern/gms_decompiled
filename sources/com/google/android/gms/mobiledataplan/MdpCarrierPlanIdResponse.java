package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpCarrierPlanIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agom();

    /* renamed from: a */
    public final String f80151a;

    /* renamed from: b */
    public final long f80152b;

    /* renamed from: c */
    public String f80153c;

    /* renamed from: d */
    public String f80154d;

    /* renamed from: e */
    public long f80155e;

    /* renamed from: f */
    public String f80156f;

    /* renamed from: g */
    public int f80157g;

    /* renamed from: h */
    public CarrierSupportInfo f80158h;

    /* renamed from: i */
    public Integer f80159i;

    /* renamed from: j */
    public Long f80160j;

    @Deprecated
    public MdpCarrierPlanIdResponse(String str, long j) {
        this.f80151a = str;
        this.f80152b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpCarrierPlanIdResponse) {
            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = (MdpCarrierPlanIdResponse) obj;
            return sdg.m34949a(this.f80151a, mdpCarrierPlanIdResponse.f80151a) && sdg.m34949a(Long.valueOf(this.f80152b), Long.valueOf(mdpCarrierPlanIdResponse.f80152b)) && sdg.m34949a(this.f80153c, mdpCarrierPlanIdResponse.f80153c) && sdg.m34949a(this.f80154d, mdpCarrierPlanIdResponse.f80154d) && sdg.m34949a(Long.valueOf(this.f80155e), Long.valueOf(mdpCarrierPlanIdResponse.f80155e)) && sdg.m34949a(this.f80156f, mdpCarrierPlanIdResponse.f80156f) && sdg.m34949a(Integer.valueOf(this.f80157g), Integer.valueOf(mdpCarrierPlanIdResponse.f80157g)) && sdg.m34949a(this.f80158h, mdpCarrierPlanIdResponse.f80158h) && sdg.m34949a(this.f80159i, mdpCarrierPlanIdResponse.f80159i) && sdg.m34949a(this.f80160j, mdpCarrierPlanIdResponse.f80160j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80151a, Long.valueOf(this.f80152b), this.f80153c, this.f80154d, Long.valueOf(this.f80155e), Integer.valueOf(this.f80157g), this.f80158h, this.f80159i, this.f80160j});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("CarrierPlanId", this.f80151a);
        a.mo25396a("TTL-in-Seconds", Long.valueOf(this.f80152b));
        a.mo25396a("CarrierName", this.f80153c);
        a.mo25396a("CarrierLogoImageURL", this.f80154d);
        a.mo25396a("CarrierId", Long.valueOf(this.f80155e));
        a.mo25396a("CarrierCpid", this.f80156f);
        a.mo25396a("ResponseSource", Integer.valueOf(this.f80157g));
        a.mo25396a("CarrierSupportInfo", this.f80158h);
        a.mo25396a("EventFlowId", this.f80159i);
        a.mo25396a("UniqueRequestId", this.f80160j);
        return a.toString();
    }

    public MdpCarrierPlanIdResponse(String str, long j, String str2, String str3, long j2, String str4, int i, CarrierSupportInfo carrierSupportInfo, Integer num, Long l) {
        this.f80151a = str;
        this.f80152b = j;
        this.f80153c = str2;
        this.f80154d = str3;
        this.f80155e = j2;
        this.f80156f = str4;
        if (i == 0 || i == 1 || i == 2) {
            this.f80157g = i;
            this.f80158h = carrierSupportInfo;
            this.f80159i = num;
            this.f80160j = l;
            return;
        }
        throw new IllegalArgumentException("Response source must be a value in CpidResponseSource");
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
        see.m35046a(parcel, 1, this.f80151a, false);
        see.m35036a(parcel, 2, this.f80152b);
        see.m35046a(parcel, 3, this.f80153c, false);
        see.m35046a(parcel, 4, this.f80154d, false);
        see.m35036a(parcel, 5, this.f80155e);
        see.m35046a(parcel, 6, this.f80156f, false);
        see.m35063b(parcel, 7, this.f80157g);
        see.m35040a(parcel, 8, this.f80158h, i, false);
        see.m35044a(parcel, 9, this.f80159i);
        see.m35045a(parcel, 10, this.f80160j);
        see.m35062b(parcel, a);
    }
}
