package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpDataPlanStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agoq();

    /* renamed from: a */
    public String f80182a;

    /* renamed from: b */
    public Bundle f80183b;

    /* renamed from: c */
    public Integer f80184c;

    /* renamed from: d */
    public Long f80185d;

    public MdpDataPlanStatusRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdpDataPlanStatusRequest) {
            MdpDataPlanStatusRequest mdpDataPlanStatusRequest = (MdpDataPlanStatusRequest) obj;
            return sdg.m34949a(this.f80182a, mdpDataPlanStatusRequest.f80182a) && agns.m54671a(this.f80183b, mdpDataPlanStatusRequest.f80183b) && sdg.m34949a(this.f80184c, mdpDataPlanStatusRequest.f80184c) && sdg.m34949a(this.f80185d, mdpDataPlanStatusRequest.f80185d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80182a, Integer.valueOf(agns.m54670a(this.f80183b)), this.f80184c, this.f80185d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("CarrierPlanId", this.f80182a);
        a.mo25396a("ExtraInfo", this.f80183b);
        a.mo25396a("EventFlowId", this.f80184c);
        a.mo25396a("UniqueRequestId", this.f80185d);
        return a.toString();
    }

    public MdpDataPlanStatusRequest(String str, Bundle bundle, Integer num, Long l) {
        this.f80182a = str;
        this.f80183b = bundle;
        this.f80184c = num;
        this.f80185d = l;
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
        see.m35046a(parcel, 1, this.f80182a, false);
        see.m35037a(parcel, 2, this.f80183b, false);
        see.m35044a(parcel, 3, this.f80184c);
        see.m35045a(parcel, 4, this.f80185d);
        see.m35062b(parcel, a);
    }
}
