package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpCarrierPlanIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agok();

    /* renamed from: a */
    public String f80147a;

    /* renamed from: b */
    public Bundle f80148b;

    /* renamed from: c */
    public Integer f80149c;

    /* renamed from: d */
    public Long f80150d;

    public MdpCarrierPlanIdRequest() {
    }

    /* renamed from: a */
    public final boolean mo44019a() {
        String string;
        Bundle bundle = this.f80148b;
        if (bundle == null || bundle.size() <= 0 || (string = this.f80148b.getString("bypass_local_cache")) == null || !string.equalsIgnoreCase("true")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo44020b() {
        String string;
        Bundle bundle = this.f80148b;
        return (bundle == null || (string = bundle.getString("return_test_cpid")) == null) ? "" : string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpCarrierPlanIdRequest) {
            MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = (MdpCarrierPlanIdRequest) obj;
            return sdg.m34949a(this.f80147a, mdpCarrierPlanIdRequest.f80147a) && agns.m54671a(this.f80148b, mdpCarrierPlanIdRequest.f80148b) && sdg.m34949a(this.f80149c, mdpCarrierPlanIdRequest.f80149c) && sdg.m34949a(this.f80150d, mdpCarrierPlanIdRequest.f80150d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80147a, Integer.valueOf(agns.m54670a(this.f80148b)), this.f80149c, this.f80150d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        String str = this.f80147a;
        a.mo25396a("apiKey", str.substring(Math.max(str.length() - 5, 0)));
        a.mo25396a("ExtraInfo", this.f80148b);
        a.mo25396a("EventFlowId", this.f80149c);
        a.mo25396a("UniqueRequestId", this.f80150d);
        return a.toString();
    }

    public MdpCarrierPlanIdRequest(String str, Bundle bundle, Integer num, Long l) {
        this.f80147a = str;
        this.f80148b = bundle;
        this.f80149c = num;
        this.f80150d = l;
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
        see.m35046a(parcel, 1, this.f80147a, false);
        see.m35037a(parcel, 2, this.f80148b, false);
        see.m35044a(parcel, 3, this.f80149c);
        see.m35045a(parcel, 4, this.f80150d);
        see.m35062b(parcel, a);
    }
}
