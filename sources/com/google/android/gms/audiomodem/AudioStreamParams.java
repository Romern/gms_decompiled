package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioStreamParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdi();

    /* renamed from: a */
    public final ParcelFileDescriptor f9853a;

    /* renamed from: b */
    public final float f9854b;

    /* renamed from: c */
    public final int f9855c;

    /* renamed from: d */
    public final int f9856d;

    public AudioStreamParams(ParcelFileDescriptor parcelFileDescriptor, float f, int i, int i2) {
        this.f9853a = parcelFileDescriptor;
        this.f9854b = f;
        this.f9855c = i;
        this.f9856d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f9853a, i, false);
        see.m35034a(parcel, 2, this.f9854b);
        see.m35063b(parcel, 3, this.f9855c);
        see.m35063b(parcel, 4, this.f9856d);
        see.m35062b(parcel, a);
    }
}
