package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeih();

    /* renamed from: a */
    public final boolean f79362a;

    /* renamed from: b */
    public final boolean f79363b;

    /* renamed from: c */
    public LocationSettingsConfiguration f79364c;

    /* renamed from: d */
    private final List f79365d;

    public LocationSettingsRequest(List list, boolean z, boolean z2, LocationSettingsConfiguration locationSettingsConfiguration) {
        this.f79365d = list;
        this.f79362a = z;
        this.f79363b = z2;
        this.f79364c = locationSettingsConfiguration;
    }

    /* renamed from: a */
    public final List mo43567a() {
        return Collections.unmodifiableList(this.f79365d);
    }

    @Deprecated
    /* renamed from: b */
    public final void mo43568b() {
        this.f79364c = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, mo43567a(), false);
        see.m35051a(parcel, 2, this.f79362a);
        see.m35051a(parcel, 3, this.f79363b);
        see.m35040a(parcel, 5, this.f79364c, i, false);
        see.m35062b(parcel, a);
    }
}
