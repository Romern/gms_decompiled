package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetPassesUpdateNotificationsEnabledRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algh();

    /* renamed from: a */
    public Account f81595a;

    /* renamed from: b */
    public boolean f81596b;

    private SetPassesUpdateNotificationsEnabledRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetPassesUpdateNotificationsEnabledRequest) {
            SetPassesUpdateNotificationsEnabledRequest setPassesUpdateNotificationsEnabledRequest = (SetPassesUpdateNotificationsEnabledRequest) obj;
            return sdg.m34949a(this.f81595a, setPassesUpdateNotificationsEnabledRequest.f81595a) && sdg.m34949a(Boolean.valueOf(this.f81596b), Boolean.valueOf(setPassesUpdateNotificationsEnabledRequest.f81596b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81595a, Boolean.valueOf(this.f81596b)});
    }

    public SetPassesUpdateNotificationsEnabledRequest(Account account, boolean z) {
        this.f81595a = account;
        this.f81596b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81595a, i, false);
        see.m35051a(parcel, 2, this.f81596b);
        see.m35062b(parcel, a);
    }
}
