package com.google.android.gms.droidguard.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DroidGuardInitReply implements Parcelable {
    public static final Parcelable.Creator CREATOR = new vxf();

    /* renamed from: a */
    public final ParcelFileDescriptor f31253a;

    /* renamed from: b */
    public final Parcelable f31254b;

    public DroidGuardInitReply(ParcelFileDescriptor parcelFileDescriptor, Parcelable parcelable) {
        this.f31253a = parcelFileDescriptor;
        this.f31254b = parcelable;
    }

    public final int describeContents() {
        int i = 0;
        int i2 = this.f31253a != null ? 1 : 0;
        Parcelable parcelable = this.f31254b;
        if (parcelable != null) {
            i = parcelable.describeContents();
        }
        return i2 | i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f31253a, i);
        parcel.writeParcelable(this.f31254b, i);
    }
}
