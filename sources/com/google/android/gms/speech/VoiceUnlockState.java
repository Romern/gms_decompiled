package com.google.android.gms.speech;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VoiceUnlockState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asdz();

    /* renamed from: a */
    public boolean f108277a;

    /* renamed from: b */
    public boolean f108278b;

    public VoiceUnlockState(boolean z, boolean z2) {
        this.f108277a = z;
        this.f108278b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f108277a);
        see.m35051a(parcel, 2, this.f108278b);
        see.m35062b(parcel, a);
    }
}
