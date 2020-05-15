package com.google.android.gms.auth.managed;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jfo();

    /* renamed from: a */
    final int f11049a;

    /* renamed from: b */
    public int f11050b;

    /* renamed from: c */
    public int f11051c;

    public DownloadStatusResponse() {
        this(1, 0, 0);
    }

    public DownloadStatusResponse(int i, int i2, int i3) {
        this.f11049a = i;
        this.f11050b = i2;
        this.f11051c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f11049a);
        see.m35063b(parcel, 2, this.f11050b);
        see.m35063b(parcel, 3, this.f11051c);
        see.m35062b(parcel, a);
    }
}
