package com.google.android.location.quake;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShakeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgsa();

    /* renamed from: a */
    public final long f150846a;

    /* renamed from: b */
    public final ShakeVettingHints f150847b;

    public ShakeEvent(long j, ShakeVettingHints shakeVettingHints) {
        this.f150846a = j;
        this.f150847b = shakeVettingHints;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f150846a);
        see.m35040a(parcel, 2, this.f150847b, i, false);
        see.m35062b(parcel, a);
    }
}
