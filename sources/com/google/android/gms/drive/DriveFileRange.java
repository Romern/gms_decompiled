package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DriveFileRange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new twp();

    /* renamed from: a */
    final long f30726a;

    /* renamed from: b */
    final long f30727b;

    public DriveFileRange(long j, long j2) {
        this.f30726a = j;
        this.f30727b = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f30726a);
        see.m35036a(parcel, 3, this.f30727b);
        see.m35062b(parcel, a);
    }
}
