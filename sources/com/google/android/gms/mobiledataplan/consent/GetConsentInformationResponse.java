package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetConsentInformationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agqo();

    /* renamed from: a */
    public ConsentStatus f80276a;

    /* renamed from: b */
    public ConsentAgreementText f80277b;

    /* renamed from: c */
    public Long f80278c;

    /* renamed from: d */
    public Integer f80279d;

    /* renamed from: e */
    public Long f80280e;

    /* renamed from: f */
    public Integer f80281f;

    public GetConsentInformationResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetConsentInformationResponse) {
            GetConsentInformationResponse getConsentInformationResponse = (GetConsentInformationResponse) obj;
            return sdg.m34949a(this.f80276a, getConsentInformationResponse.f80276a) && sdg.m34949a(this.f80277b, getConsentInformationResponse.f80277b) && sdg.m34949a(this.f80278c, getConsentInformationResponse.f80278c) && sdg.m34949a(this.f80279d, getConsentInformationResponse.f80279d) && sdg.m34949a(this.f80280e, getConsentInformationResponse.f80280e) && sdg.m34949a(this.f80281f, getConsentInformationResponse.f80281f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80276a, this.f80277b, this.f80278c, this.f80279d, this.f80280e, this.f80281f});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("ConsentStatus", this.f80276a);
        a.mo25396a("ConsentAgreementText", this.f80277b);
        a.mo25396a("ConsentChangeTime", this.f80278c);
        a.mo25396a("EventFlowId", this.f80279d);
        a.mo25396a("UniqueRequestId", this.f80280e);
        a.mo25396a("ConsentResponseSource", this.f80281f);
        return a.toString();
    }

    public GetConsentInformationResponse(ConsentStatus consentStatus, ConsentAgreementText consentAgreementText, Long l, Integer num, Long l2, Integer num2) {
        this.f80276a = consentStatus;
        this.f80277b = consentAgreementText;
        this.f80278c = l;
        this.f80279d = num;
        this.f80280e = l2;
        this.f80281f = num2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f80276a, i, false);
        see.m35040a(parcel, 2, this.f80277b, i, false);
        see.m35045a(parcel, 3, this.f80278c);
        see.m35044a(parcel, 4, this.f80279d);
        see.m35045a(parcel, 5, this.f80280e);
        see.m35044a(parcel, 6, this.f80281f);
        see.m35062b(parcel, a);
    }
}
