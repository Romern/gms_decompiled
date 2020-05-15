package com.google.android.gms.carsetup.fsm.impl;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new oxl();

    /* renamed from: a */
    public final int f29663a;

    /* renamed from: b */
    public final Intent f29664b;

    public ActivityResult(int i, Intent intent) {
        this.f29663a = i;
        this.f29664b = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29663a);
        if (this.f29664b == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        this.f29664b.writeToParcel(parcel, i);
    }

    public ActivityResult(Parcel parcel) {
        this.f29663a = parcel.readInt();
        this.f29664b = parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null;
    }
}
