package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetIndexableResponse extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new brir();

    /* renamed from: a */
    public final Status f152360a;

    /* renamed from: b */
    public final Thing f152361b;

    public GetIndexableResponse(Status status, Thing thing) {
        this.f152360a = status;
        this.f152361b = thing;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f152360a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f152360a, i, false);
        see.m35040a(parcel, 2, this.f152361b, i, false);
        see.m35062b(parcel, a);
    }
}
