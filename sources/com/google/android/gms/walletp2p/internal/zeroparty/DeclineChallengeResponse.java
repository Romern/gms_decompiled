package com.google.android.gms.walletp2p.internal.zeroparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DeclineChallengeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axni();

    /* renamed from: a */
    public ErrorDetails f110803a;

    public DeclineChallengeResponse(ErrorDetails errorDetails) {
        this.f110803a = errorDetails;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f110803a, i, false);
        see.m35062b(parcel, a);
    }
}
