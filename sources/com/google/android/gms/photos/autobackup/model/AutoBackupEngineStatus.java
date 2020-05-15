package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutoBackupEngineStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anjx();

    /* renamed from: a */
    public final int f82162a;

    /* renamed from: b */
    public boolean f82163b;

    public AutoBackupEngineStatus(int i, boolean z) {
        this.f82162a = i;
        this.f82163b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f82162a);
        see.m35051a(parcel, 2, this.f82163b);
        see.m35062b(parcel, a);
    }
}
