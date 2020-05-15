package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RestoreData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new luw();

    /* renamed from: a */
    public final long f28993a;

    /* renamed from: b */
    public final long f28994b;

    public RestoreData(long j, long j2) {
        this.f28993a = j;
        this.f28994b = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f28993a);
        see.m35036a(parcel, 2, this.f28994b);
        see.m35062b(parcel, a);
    }
}
