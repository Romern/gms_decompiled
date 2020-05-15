package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class HandleClientLifecycleEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajbz();

    /* renamed from: a */
    public final int f80735a;
    @Deprecated

    /* renamed from: b */
    public final ClientAppContext f80736b;

    /* renamed from: c */
    public final int f80737c;

    public HandleClientLifecycleEventRequest(int i, ClientAppContext clientAppContext, int i2) {
        this.f80735a = i;
        this.f80736b = clientAppContext;
        this.f80737c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80735a);
        see.m35040a(parcel, 2, this.f80736b, i, false);
        see.m35063b(parcel, 3, this.f80737c);
        see.m35062b(parcel, a);
    }
}
