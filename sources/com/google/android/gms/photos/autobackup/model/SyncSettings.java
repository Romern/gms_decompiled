package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anke();

    /* renamed from: a */
    public final int f82197a;

    /* renamed from: b */
    public boolean f82198b;

    /* renamed from: c */
    public boolean f82199c;

    public SyncSettings(int i, boolean z, boolean z2) {
        this.f82197a = i;
        this.f82198b = z;
        this.f82199c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f82197a);
        see.m35051a(parcel, 2, this.f82198b);
        see.m35051a(parcel, 3, this.f82199c);
        see.m35062b(parcel, a);
    }
}
