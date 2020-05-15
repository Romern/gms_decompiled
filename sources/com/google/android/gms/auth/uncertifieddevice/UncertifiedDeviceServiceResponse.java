package com.google.android.gms.auth.uncertifieddevice;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UncertifiedDeviceServiceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kas();

    /* renamed from: a */
    final int f11602a;

    /* renamed from: b */
    public boolean f11603b;

    /* renamed from: c */
    public PendingIntent f11604c;

    public UncertifiedDeviceServiceResponse() {
        this(1, true, null);
    }

    public UncertifiedDeviceServiceResponse(int i, boolean z, PendingIntent pendingIntent) {
        this.f11602a = i;
        this.f11603b = z;
        this.f11604c = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f11602a);
        see.m35051a(parcel, 2, this.f11603b);
        see.m35040a(parcel, 3, this.f11604c, i, false);
        see.m35062b(parcel, a);
    }
}
