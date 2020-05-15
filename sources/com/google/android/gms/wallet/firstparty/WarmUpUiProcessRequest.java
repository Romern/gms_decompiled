package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WarmUpUiProcessRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awkr();

    /* renamed from: a */
    long f110171a;

    public WarmUpUiProcessRequest() {
        this(SystemClock.elapsedRealtime());
    }

    public WarmUpUiProcessRequest(long j) {
        this.f110171a = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f110171a);
        see.m35062b(parcel, a);
    }
}
