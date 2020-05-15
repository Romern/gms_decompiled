package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlacePhotoMetadataResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new aelv();

    /* renamed from: a */
    public final Status f79480a;

    /* renamed from: b */
    final DataHolder f79481b;

    /* renamed from: c */
    public final aelu f79482c;

    public PlacePhotoMetadataResult(Status status, DataHolder dataHolder) {
        this.f79480a = status;
        this.f79481b = dataHolder;
        this.f79482c = dataHolder != null ? new aelu(this.f79481b) : null;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f79480a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79480a, i, false);
        see.m35040a(parcel, 2, this.f79481b, i, false);
        see.m35062b(parcel, a);
    }
}
