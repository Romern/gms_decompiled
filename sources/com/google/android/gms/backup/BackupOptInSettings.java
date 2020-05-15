package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupOptInSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lsv();

    /* renamed from: a */
    public final boolean f28984a;

    /* renamed from: b */
    public final boolean f28985b;

    /* renamed from: c */
    public final boolean f28986c;

    /* renamed from: d */
    public final boolean f28987d;

    public BackupOptInSettings(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f28984a = z;
        this.f28985b = z2;
        this.f28986c = z3;
        this.f28987d = z4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f28984a);
        see.m35051a(parcel, 2, this.f28985b);
        see.m35051a(parcel, 3, this.f28986c);
        see.m35051a(parcel, 4, this.f28987d);
        see.m35062b(parcel, a);
    }
}
