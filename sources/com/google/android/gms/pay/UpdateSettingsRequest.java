package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UpdateSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alhe();

    /* renamed from: a */
    public Account f81645a;

    /* renamed from: b */
    public ProtoSafeParcelable f81646b;

    /* renamed from: c */
    public ProtoSafeParcelable f81647c;

    private UpdateSettingsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateSettingsRequest) {
            UpdateSettingsRequest updateSettingsRequest = (UpdateSettingsRequest) obj;
            return sdg.m34949a(this.f81645a, updateSettingsRequest.f81645a) && sdg.m34949a(this.f81646b, updateSettingsRequest.f81646b) && sdg.m34949a(this.f81647c, updateSettingsRequest.f81647c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81645a, this.f81646b, this.f81647c});
    }

    public UpdateSettingsRequest(Account account, ProtoSafeParcelable protoSafeParcelable, ProtoSafeParcelable protoSafeParcelable2) {
        this.f81645a = account;
        this.f81646b = protoSafeParcelable;
        this.f81647c = protoSafeParcelable2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81645a, i, false);
        see.m35040a(parcel, 2, this.f81646b, i, false);
        see.m35040a(parcel, 3, this.f81647c, i, false);
        see.m35062b(parcel, a);
    }
}
