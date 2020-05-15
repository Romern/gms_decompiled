package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetGlobalSearchSourcesCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new appx();

    /* renamed from: a */
    public Status f107427a;

    /* renamed from: b */
    public GetGlobalSearchSourcesCall$GlobalSearchSource[] f107428b;

    public GetGlobalSearchSourcesCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107427a;
    }

    public GetGlobalSearchSourcesCall$Response(Status status, GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
        this.f107427a = status;
        this.f107428b = getGlobalSearchSourcesCall$GlobalSearchSourceArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107427a, i, false);
        see.m35057a(parcel, 2, this.f107428b, i);
        see.m35062b(parcel, a);
    }
}
