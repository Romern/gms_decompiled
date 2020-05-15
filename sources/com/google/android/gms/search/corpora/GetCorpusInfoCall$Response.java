package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetCorpusInfoCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apol();

    /* renamed from: a */
    public Status f107394a;

    /* renamed from: b */
    public RegisterCorpusInfo f107395b;

    public GetCorpusInfoCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107394a;
    }

    public GetCorpusInfoCall$Response(Status status, RegisterCorpusInfo registerCorpusInfo) {
        this.f107394a = status;
        this.f107395b = registerCorpusInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107394a, i, false);
        see.m35040a(parcel, 2, this.f107395b, i, false);
        see.m35062b(parcel, a);
    }
}
