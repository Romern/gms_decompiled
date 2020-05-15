package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimedEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bjtb();

    /* renamed from: a */
    public final bwfr f151807a;

    /* renamed from: b */
    public final long f151808b;

    public TimedEvent(Parcel parcel) {
        this.f151807a = (bwfr) bjvp.m104731a(parcel, (bxxk) bwfr.f159113m.mo74142c(7));
        this.f151808b = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bjvp.m104738a(this.f151807a, parcel);
        parcel.writeLong(this.f151808b);
    }

    public TimedEvent(bwfr bwfr) {
        this.f151807a = bwfr;
        this.f151808b = SystemClock.elapsedRealtime();
    }
}
