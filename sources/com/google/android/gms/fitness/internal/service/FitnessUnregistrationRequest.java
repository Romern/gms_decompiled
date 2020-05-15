package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitnessUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zcx();

    /* renamed from: a */
    public final DataSource f32194a;

    public FitnessUnregistrationRequest(DataSource dataSource) {
        this.f32194a = dataSource;
    }

    public final String toString() {
        return String.format("ApplicationUnregistrationRequest{%s}", this.f32194a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32194a, i, false);
        see.m35062b(parcel, a);
    }
}
