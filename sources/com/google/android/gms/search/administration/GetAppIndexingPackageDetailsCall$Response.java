package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetAppIndexingPackageDetailsCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apms();

    /* renamed from: a */
    public final Status f107363a;

    /* renamed from: b */
    public final CorpusConfigParcelable[] f107364b;

    /* renamed from: c */
    public final long f107365c;

    /* renamed from: d */
    public final AppIndexingErrorInfo[] f107366d;

    /* renamed from: e */
    public final AppIndexingUserActionInfo[] f107367e;

    /* renamed from: f */
    public final boolean f107368f;

    /* renamed from: g */
    public final boolean f107369g;

    public GetAppIndexingPackageDetailsCall$Response(Status status, CorpusConfigParcelable[] corpusConfigParcelableArr, long j, AppIndexingErrorInfo[] appIndexingErrorInfoArr, AppIndexingUserActionInfo[] appIndexingUserActionInfoArr, boolean z, boolean z2) {
        this.f107363a = status;
        this.f107364b = corpusConfigParcelableArr;
        this.f107365c = j;
        this.f107366d = appIndexingErrorInfoArr;
        this.f107367e = appIndexingUserActionInfoArr;
        this.f107368f = z;
        this.f107369g = z2;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107363a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107363a, i, false);
        see.m35057a(parcel, 2, this.f107364b, i);
        see.m35036a(parcel, 3, this.f107365c);
        see.m35057a(parcel, 4, this.f107366d, i);
        see.m35057a(parcel, 5, this.f107367e, i);
        see.m35051a(parcel, 6, this.f107368f);
        see.m35051a(parcel, 7, this.f107369g);
        see.m35062b(parcel, a);
    }
}
