package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserQuota extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ankf();

    /* renamed from: a */
    public final int f82200a;

    /* renamed from: b */
    public long f82201b;

    /* renamed from: c */
    public long f82202c;

    /* renamed from: d */
    public boolean f82203d;

    /* renamed from: e */
    public boolean f82204e;

    public UserQuota() {
        this.f82200a = 1;
    }

    public UserQuota(int i, long j, long j2, boolean z, boolean z2) {
        this.f82200a = i;
        this.f82201b = j;
        this.f82202c = j2;
        this.f82203d = z;
        this.f82204e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f82200a);
        see.m35036a(parcel, 2, this.f82201b);
        see.m35036a(parcel, 3, this.f82202c);
        see.m35051a(parcel, 4, this.f82203d);
        see.m35051a(parcel, 5, this.f82204e);
        see.m35062b(parcel, a);
    }
}
