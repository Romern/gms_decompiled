package com.google.android.gms.mobiledataplan.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class EventListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agrb();

    /* renamed from: a */
    public int f80295a;

    /* renamed from: b */
    public String f80296b;

    /* renamed from: c */
    public boolean f80297c;

    /* renamed from: d */
    public Integer f80298d;

    /* renamed from: e */
    public Long f80299e;

    /* renamed from: f */
    public Bundle f80300f;

    public EventListenerRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventListenerRequest) {
            EventListenerRequest eventListenerRequest = (EventListenerRequest) obj;
            return sdg.m34949a(Integer.valueOf(this.f80295a), Integer.valueOf(eventListenerRequest.f80295a)) && sdg.m34949a(this.f80296b, eventListenerRequest.f80296b) && sdg.m34949a(Boolean.valueOf(this.f80297c), Boolean.valueOf(eventListenerRequest.f80297c)) && sdg.m34949a(this.f80298d, eventListenerRequest.f80298d) && sdg.m34949a(this.f80299e, eventListenerRequest.f80299e) && agns.m54671a(this.f80300f, eventListenerRequest.f80300f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80295a), this.f80296b, Boolean.valueOf(this.f80297c), this.f80298d, this.f80299e, Integer.valueOf(agns.m54670a(this.f80300f))});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("type", Integer.valueOf(this.f80295a));
        a.mo25396a("packageName", this.f80296b);
        a.mo25396a("requestToRegister", Boolean.valueOf(this.f80297c));
        a.mo25396a("eventFlowId", this.f80298d);
        a.mo25396a("uniqueRequestId", this.f80299e);
        a.mo25396a("extraInfo", this.f80300f);
        return a.toString();
    }

    public EventListenerRequest(int i, String str, boolean z, Integer num, Long l, Bundle bundle) {
        this.f80295a = i;
        this.f80296b = str;
        this.f80297c = z;
        this.f80298d = num;
        this.f80299e = l;
        this.f80300f = bundle;
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
        see.m35063b(parcel, 1, this.f80295a);
        see.m35046a(parcel, 2, this.f80296b, false);
        see.m35051a(parcel, 3, this.f80297c);
        see.m35044a(parcel, 4, this.f80298d);
        see.m35045a(parcel, 5, this.f80299e);
        see.m35037a(parcel, 6, this.f80300f, false);
        see.m35062b(parcel, a);
    }
}
