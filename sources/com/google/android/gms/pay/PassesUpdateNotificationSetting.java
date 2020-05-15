package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PassesUpdateNotificationSetting extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfh();

    /* renamed from: a */
    public Account f81532a;

    /* renamed from: b */
    public boolean f81533b;

    private PassesUpdateNotificationSetting() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PassesUpdateNotificationSetting) {
            PassesUpdateNotificationSetting passesUpdateNotificationSetting = (PassesUpdateNotificationSetting) obj;
            return sdg.m34949a(this.f81532a, passesUpdateNotificationSetting.f81532a) && sdg.m34949a(Boolean.valueOf(this.f81533b), Boolean.valueOf(passesUpdateNotificationSetting.f81533b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81532a, Boolean.valueOf(this.f81533b)});
    }

    public PassesUpdateNotificationSetting(Account account, boolean z) {
        this.f81532a = account;
        this.f81533b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81532a, i, false);
        see.m35051a(parcel, 2, this.f81533b);
        see.m35062b(parcel, a);
    }
}
