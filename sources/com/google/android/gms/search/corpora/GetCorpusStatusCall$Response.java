package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetCorpusStatusCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apoo();

    /* renamed from: a */
    public Status f107398a;

    /* renamed from: b */
    public CorpusStatus f107399b;

    public GetCorpusStatusCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107398a;
    }

    public GetCorpusStatusCall$Response(Status status, CorpusStatus corpusStatus) {
        this.f107398a = status;
        this.f107399b = corpusStatus;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107398a, i, false);
        see.m35040a(parcel, 2, this.f107399b, i, false);
        see.m35062b(parcel, a);
    }
}
