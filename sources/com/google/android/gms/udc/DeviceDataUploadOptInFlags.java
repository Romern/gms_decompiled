package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceDataUploadOptInFlags extends AbstractSafeParcelable implements avaa {
    public static final Parcelable.Creator CREATOR = new auzo();

    /* renamed from: a */
    public final boolean f109340a;

    /* renamed from: b */
    public final boolean f109341b;

    public DeviceDataUploadOptInFlags(boolean z, boolean z2) {
        this.f109340a = z;
        this.f109341b = z2;
    }

    /* renamed from: a */
    public final boolean mo51101a() {
        return this.f109340a;
    }

    /* renamed from: b */
    public final boolean mo51102b() {
        return this.f109341b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f109340a);
        see.m35051a(parcel, 3, this.f109341b);
        see.m35062b(parcel, a);
    }
}
