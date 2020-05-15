package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CorpusScoringInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fqt();

    /* renamed from: a */
    public final CorpusId f9520a;

    /* renamed from: b */
    public final int f9521b;

    /* renamed from: c */
    public final int f9522c;

    public CorpusScoringInfo(CorpusId corpusId, int i, int i2) {
        this.f9520a = corpusId;
        this.f9521b = i;
        this.f9522c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f9520a, i, false);
        see.m35063b(parcel, 2, this.f9521b);
        see.m35063b(parcel, 3, this.f9522c);
        see.m35062b(parcel, a);
    }
}
