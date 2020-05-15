package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ScreenStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lrw();

    /* renamed from: a */
    public final int f11718a;

    public ScreenStateImpl(int i) {
        this.f11718a = i;
    }

    public final String toString() {
        int i = this.f11718a;
        return i != 1 ? i != 2 ? "ScreenState: UNKNOWN" : "ScreenState: SCREEN_ON" : "ScreenState: SCREEN_OFF";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f11718a);
        see.m35062b(parcel, a);
    }
}
