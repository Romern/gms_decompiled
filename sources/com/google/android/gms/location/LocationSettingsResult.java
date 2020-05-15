package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationSettingsResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new aeii();

    /* renamed from: a */
    public final Status f79366a;

    /* renamed from: b */
    public final LocationSettingsStates f79367b;

    public LocationSettingsResult(Status status) {
        this(status, null);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f79366a;
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f79366a = status;
        this.f79367b = locationSettingsStates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79366a, i, false);
        see.m35040a(parcel, 2, this.f79367b, i, false);
        see.m35062b(parcel, a);
    }
}
