package com.google.android.gms.search.nativeapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetNativeApiInfoCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apri();

    /* renamed from: a */
    public Status f107444a;

    /* renamed from: b */
    public NativeApiInfo f107445b;

    public GetNativeApiInfoCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107444a;
    }

    public GetNativeApiInfoCall$Response(Status status, NativeApiInfo nativeApiInfo) {
        this.f107444a = status;
        this.f107445b = nativeApiInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107444a, i, false);
        see.m35040a(parcel, 2, this.f107445b, i, false);
        see.m35062b(parcel, a);
    }
}
