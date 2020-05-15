package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetConsentStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agqs();

    /* renamed from: a */
    public String f80283a;

    /* renamed from: b */
    public ParcelUuid f80284b;

    /* renamed from: c */
    public ConsentStatus f80285c;

    /* renamed from: d */
    public Long f80286d;

    /* renamed from: e */
    public int f80287e;

    /* renamed from: f */
    public Integer f80288f;

    /* renamed from: g */
    public Long f80289g;

    /* renamed from: h */
    public Bundle f80290h;

    public SetConsentStatusRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetConsentStatusRequest) {
            SetConsentStatusRequest setConsentStatusRequest = (SetConsentStatusRequest) obj;
            return sdg.m34949a(this.f80283a, setConsentStatusRequest.f80283a) && sdg.m34949a(this.f80284b, setConsentStatusRequest.f80284b) && sdg.m34949a(this.f80285c, setConsentStatusRequest.f80285c) && sdg.m34949a(this.f80286d, setConsentStatusRequest.f80286d) && sdg.m34949a(Integer.valueOf(this.f80287e), Integer.valueOf(setConsentStatusRequest.f80287e)) && sdg.m34949a(this.f80288f, setConsentStatusRequest.f80288f) && sdg.m34949a(this.f80289g, setConsentStatusRequest.f80289g) && agns.m54671a(this.f80290h, setConsentStatusRequest.f80290h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80283a, this.f80284b, this.f80285c, this.f80286d, Integer.valueOf(this.f80287e), this.f80288f, this.f80289g, Integer.valueOf(agns.m54670a(this.f80290h))});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("clientCpid", this.f80283a);
        a.mo25396a("sessionId", this.f80284b);
        a.mo25396a("consentStatus", this.f80285c);
        a.mo25396a("consentTime", this.f80286d);
        a.mo25396a("textVersion", Integer.valueOf(this.f80287e));
        a.mo25396a("eventFlowId", this.f80288f);
        a.mo25396a("uniqueRequestId", this.f80289g);
        a.mo25396a("extraInfo", this.f80290h);
        return a.toString();
    }

    public SetConsentStatusRequest(String str, ParcelUuid parcelUuid, ConsentStatus consentStatus, Long l, int i, Integer num, Long l2, Bundle bundle) {
        this.f80283a = str;
        this.f80284b = parcelUuid;
        this.f80285c = consentStatus;
        this.f80286d = l;
        this.f80287e = i;
        this.f80288f = num;
        this.f80289g = l2;
        this.f80290h = bundle;
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
        see.m35046a(parcel, 1, this.f80283a, false);
        see.m35040a(parcel, 2, this.f80284b, i, false);
        see.m35040a(parcel, 3, this.f80285c, i, false);
        see.m35045a(parcel, 4, this.f80286d);
        see.m35063b(parcel, 5, this.f80287e);
        see.m35044a(parcel, 6, this.f80288f);
        see.m35045a(parcel, 7, this.f80289g);
        see.m35037a(parcel, 8, this.f80290h, false);
        see.m35062b(parcel, a);
    }
}
