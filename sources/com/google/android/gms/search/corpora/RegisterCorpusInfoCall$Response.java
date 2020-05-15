package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegisterCorpusInfoCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apor();

    /* renamed from: a */
    public Status f107403a;

    /* renamed from: b */
    public boolean f107404b;

    public RegisterCorpusInfoCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107403a;
    }

    public RegisterCorpusInfoCall$Response(Status status, boolean z) {
        this.f107403a = status;
        this.f107404b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107403a, i, false);
        see.m35051a(parcel, 2, this.f107404b);
        see.m35062b(parcel, a);
    }
}
