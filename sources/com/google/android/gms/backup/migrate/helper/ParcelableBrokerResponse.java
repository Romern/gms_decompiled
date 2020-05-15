package com.google.android.gms.backup.migrate.helper;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableBrokerResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mqh();

    /* renamed from: a */
    private final mpy f29060a;

    public ParcelableBrokerResponse(Parcel parcel) {
        mpy mpy;
        try {
            mpy = (mpy) bxvk.m124016a(mpy.f34225c, parcel.createByteArray(), bxus.m123744c());
        } catch (bxwf e) {
            mpy = null;
        }
        this.f29060a = mpy;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f29060a.mo73642k());
    }

    public ParcelableBrokerResponse(mpy mpy) {
        this.f29060a = mpy;
    }
}
