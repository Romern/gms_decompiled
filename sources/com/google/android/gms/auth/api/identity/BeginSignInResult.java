package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hut();

    /* renamed from: a */
    public final PendingIntent f10221a;

    public BeginSignInResult(PendingIntent pendingIntent) {
        sdo.m34959a(pendingIntent);
        this.f10221a = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f10221a, i, false);
        see.m35062b(parcel, a);
    }
}
