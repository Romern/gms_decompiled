package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alee();

    /* renamed from: a */
    public Account f81505a;

    /* renamed from: b */
    public ProtoSafeParcelable f81506b;

    /* renamed from: c */
    public FetchMode f81507c;

    private GetSettingsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSettingsRequest) {
            GetSettingsRequest getSettingsRequest = (GetSettingsRequest) obj;
            return sdg.m34949a(this.f81505a, getSettingsRequest.f81505a) && sdg.m34949a(this.f81506b, getSettingsRequest.f81506b) && sdg.m34949a(this.f81507c, getSettingsRequest.f81507c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81505a, this.f81506b, this.f81507c});
    }

    public GetSettingsRequest(Account account, ProtoSafeParcelable protoSafeParcelable, FetchMode fetchMode) {
        this.f81505a = account;
        this.f81506b = protoSafeParcelable;
        this.f81507c = fetchMode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81505a, i, false);
        see.m35040a(parcel, 2, this.f81506b, i, false);
        see.m35040a(parcel, 3, this.f81507c, i, false);
        see.m35062b(parcel, a);
    }
}
