package com.google.android.gms.backup.migrate.helper;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableBrokerRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mqg();

    /* renamed from: a */
    public final mpw f29058a;

    /* renamed from: b */
    public final bxwf f29059b;

    public ParcelableBrokerRequest(Parcel parcel) {
        try {
            this.f29058a = (mpw) GeneratedMessageLite.m124016a(mpw.f34222b, parcel.createByteArray(), bxus.m123744c());
            this.f29059b = null;
        } catch (bxwf e) {
            this.f29058a = null;
            this.f29059b = e;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f29058a.mo73642k());
    }
}
