package com.google.android.gms.facs.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FacsInternalSyncCallOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wfb();

    /* renamed from: a */
    public final boolean f31270a;

    public FacsInternalSyncCallOptions(boolean z) {
        this.f31270a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f31270a);
        see.m35062b(parcel, a);
    }
}
