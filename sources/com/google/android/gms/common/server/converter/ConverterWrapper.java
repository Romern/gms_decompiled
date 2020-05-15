package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConverterWrapper extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sig();

    /* renamed from: a */
    final int f30305a;

    /* renamed from: b */
    public final StringToIntConverter f30306b;

    public ConverterWrapper(int i, StringToIntConverter stringToIntConverter) {
        this.f30305a = i;
        this.f30306b = stringToIntConverter;
    }

    public ConverterWrapper(StringToIntConverter stringToIntConverter) {
        this.f30305a = 1;
        this.f30306b = stringToIntConverter;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30305a);
        see.m35040a(parcel, 2, this.f30306b, i, false);
        see.m35062b(parcel, a);
    }
}
