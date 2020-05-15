package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitnessDataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zcw();

    /* renamed from: a */
    private final List f32193a;

    public FitnessDataSourcesRequest(List list) {
        this.f32193a = list;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("dataTypes", this.f32193a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, Collections.unmodifiableList(this.f32193a), false);
        see.m35062b(parcel, a);
    }
}
