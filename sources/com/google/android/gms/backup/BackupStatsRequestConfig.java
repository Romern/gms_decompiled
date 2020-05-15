package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupStatsRequestConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lts();

    /* renamed from: a */
    public final boolean f28988a;

    /* renamed from: b */
    public final boolean f28989b;

    public BackupStatsRequestConfig(boolean z, boolean z2) {
        this.f28988a = z;
        this.f28989b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f28988a);
        see.m35051a(parcel, 2, this.f28989b);
        see.m35062b(parcel, a);
    }
}
