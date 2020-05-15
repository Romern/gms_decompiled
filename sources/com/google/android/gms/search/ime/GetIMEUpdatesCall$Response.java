package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetIMEUpdatesCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apqy();

    /* renamed from: a */
    public Status f107442a;

    /* renamed from: b */
    public PIMEUpdateResponse f107443b;

    public GetIMEUpdatesCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107442a;
    }

    public GetIMEUpdatesCall$Response(Status status, PIMEUpdateResponse pIMEUpdateResponse) {
        this.f107442a = status;
        this.f107443b = pIMEUpdateResponse;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107442a, i, false);
        see.m35040a(parcel, 2, this.f107443b, i, false);
        see.m35062b(parcel, a);
    }
}
