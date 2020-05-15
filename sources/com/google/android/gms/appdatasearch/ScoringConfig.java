package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScoringConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsk();

    /* renamed from: a */
    public final boolean f9663a;

    public ScoringConfig(boolean z) {
        this.f9663a = z;
    }

    /* renamed from: a */
    public static fsj m6153a() {
        return new fsj();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ScoringConfig) && this.f9663a == ((ScoringConfig) obj).f9663a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9663a ? 1 : 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f9663a);
        see.m35062b(parcel, a);
    }
}
