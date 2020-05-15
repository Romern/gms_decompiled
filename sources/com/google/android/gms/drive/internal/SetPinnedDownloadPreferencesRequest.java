package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetPinnedDownloadPreferencesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uut();

    /* renamed from: a */
    public final ParcelableTransferPreferences f30919a;

    public SetPinnedDownloadPreferencesRequest(ParcelableTransferPreferences parcelableTransferPreferences) {
        this.f30919a = parcelableTransferPreferences;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30919a, i, false);
        see.m35062b(parcel, a);
    }
}
