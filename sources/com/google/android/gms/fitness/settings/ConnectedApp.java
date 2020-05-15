package com.google.android.gms.fitness.settings;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectedApp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new zpg();

    /* renamed from: a */
    public final String f32442a;

    /* renamed from: b */
    public final String f32443b;

    /* renamed from: c */
    private final int[] f32444c;

    public ConnectedApp(String str, String str2, int[] iArr) {
        this.f32442a = str;
        this.f32443b = str2;
        this.f32444c = iArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32442a);
        parcel.writeString(this.f32443b);
        parcel.writeIntArray(this.f32444c);
    }
}
