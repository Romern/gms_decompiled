package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MigrateSmartTapRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alff();

    /* renamed from: a */
    public AccountSmartTapData[] f81531a;

    private MigrateSmartTapRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MigrateSmartTapRequest) {
            return Arrays.equals(this.f81531a, ((MigrateSmartTapRequest) obj).f81531a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f81531a))});
    }

    public MigrateSmartTapRequest(AccountSmartTapData[] accountSmartTapDataArr) {
        this.f81531a = accountSmartTapDataArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f81531a, i);
        see.m35062b(parcel, a);
    }
}
