package com.google.android.gms.wallet.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WarmUpUiProcessResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awks();

    /* renamed from: a */
    PendingIntent f110172a;

    public WarmUpUiProcessResponse(PendingIntent pendingIntent) {
        this.f110172a = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f110172a, i, false);
        see.m35062b(parcel, a);
    }
}
