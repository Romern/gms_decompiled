package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RequestAppIndexingUpdateIndexCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apnc();

    /* renamed from: a */
    public Status f107383a;

    /* renamed from: b */
    public long f107384b;

    public RequestAppIndexingUpdateIndexCall$Response(Status status, long j) {
        this.f107383a = status;
        this.f107384b = j;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107383a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107383a, i, false);
        see.m35036a(parcel, 2, this.f107384b);
        see.m35062b(parcel, a);
    }
}
