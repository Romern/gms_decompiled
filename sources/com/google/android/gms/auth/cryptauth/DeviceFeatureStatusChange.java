package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceFeatureStatusChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iow();

    /* renamed from: a */
    final int f10521a;

    /* renamed from: b */
    public final DeviceFeatureStatus f10522b;

    /* renamed from: c */
    public final boolean f10523c;

    public DeviceFeatureStatusChange(int i, DeviceFeatureStatus deviceFeatureStatus, boolean z) {
        this.f10521a = i;
        this.f10522b = deviceFeatureStatus;
        this.f10523c = z;
    }

    public DeviceFeatureStatusChange(DeviceFeatureStatus deviceFeatureStatus, boolean z) {
        this(1, deviceFeatureStatus, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10521a);
        see.m35040a(parcel, 2, this.f10522b, i, false);
        see.m35051a(parcel, 3, this.f10523c);
        see.m35062b(parcel, a);
    }
}
