package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RequestIndexingCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apou();

    /* renamed from: a */
    public Status f107408a;

    /* renamed from: b */
    public boolean f107409b;

    public RequestIndexingCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107408a;
    }

    public RequestIndexingCall$Response(Status status, boolean z) {
        this.f107408a = status;
        this.f107409b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107408a, i, false);
        see.m35051a(parcel, 2, this.f107409b);
        see.m35062b(parcel, a);
    }
}
