package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetIncludeInGlobalSearchCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apqi();

    /* renamed from: a */
    public Status f107437a;

    public SetIncludeInGlobalSearchCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107437a;
    }

    public SetIncludeInGlobalSearchCall$Response(Status status) {
        this.f107437a = status;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107437a, i, false);
        see.m35062b(parcel, a);
    }
}
