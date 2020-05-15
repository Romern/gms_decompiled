package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axdt();

    /* renamed from: a */
    public long f110633a;

    /* renamed from: b */
    public long f110634b;

    TimeInterval() {
    }

    public TimeInterval(long j, long j2) {
        this.f110633a = j;
        this.f110634b = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f110633a);
        see.m35036a(parcel, 3, this.f110634b);
        see.m35062b(parcel, a);
    }
}
