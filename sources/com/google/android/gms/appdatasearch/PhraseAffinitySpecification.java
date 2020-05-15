package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhraseAffinitySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fru();

    /* renamed from: a */
    final PhraseAffinityCorpusSpec[] f9613a;

    public PhraseAffinitySpecification(PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr) {
        this.f9613a = phraseAffinityCorpusSpecArr;
    }

    /* renamed from: a */
    public final PhraseAffinityCorpusSpec[] mo7208a() {
        return (PhraseAffinityCorpusSpec[]) this.f9613a.clone();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f9613a, i);
        see.m35062b(parcel, a);
    }
}
