package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class EnablePayOnWearRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asww();

    /* renamed from: a */
    public long f108526a;

    public EnablePayOnWearRequest(long j) {
        this.f108526a = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f108526a);
        see.m35062b(parcel, a);
    }
}
