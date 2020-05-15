package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetConsentInformationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agqm();

    /* renamed from: a */
    public String f80271a;

    /* renamed from: b */
    public boolean f80272b;

    /* renamed from: c */
    public Integer f80273c;

    /* renamed from: d */
    public Long f80274d;

    /* renamed from: e */
    public Bundle f80275e;

    public GetConsentInformationRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetConsentInformationRequest) {
            GetConsentInformationRequest getConsentInformationRequest = (GetConsentInformationRequest) obj;
            return sdg.m34949a(this.f80271a, getConsentInformationRequest.f80271a) && sdg.m34949a(Boolean.valueOf(this.f80272b), Boolean.valueOf(getConsentInformationRequest.f80272b)) && sdg.m34949a(this.f80273c, getConsentInformationRequest.f80273c) && sdg.m34949a(this.f80274d, getConsentInformationRequest.f80274d) && agns.m54671a(this.f80275e, getConsentInformationRequest.f80275e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80271a, Boolean.valueOf(this.f80272b), this.f80273c, this.f80274d, Integer.valueOf(agns.m54670a(this.f80275e))});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("clientCpid", this.f80271a);
        a.mo25396a("includeConsentTexts", Boolean.valueOf(this.f80272b));
        a.mo25396a("eventFlowId", this.f80273c);
        a.mo25396a("uniqueRequestId", this.f80274d);
        a.mo25396a("extraInfo", this.f80275e);
        return a.toString();
    }

    public GetConsentInformationRequest(String str, boolean z, Integer num, Long l, Bundle bundle) {
        this.f80271a = str;
        this.f80272b = z;
        this.f80273c = num;
        this.f80274d = l;
        this.f80275e = bundle;
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
        see.m35046a(parcel, 1, this.f80271a, false);
        see.m35051a(parcel, 2, this.f80272b);
        see.m35044a(parcel, 3, this.f80273c);
        see.m35045a(parcel, 4, this.f80274d);
        see.m35037a(parcel, 5, this.f80275e, false);
        see.m35062b(parcel, a);
    }
}
