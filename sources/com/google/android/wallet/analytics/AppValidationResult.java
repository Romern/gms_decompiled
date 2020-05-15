package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppValidationResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bjen();

    /* renamed from: a */
    public final bmkd f151721a;

    /* renamed from: b */
    public final int f151722b;

    /* renamed from: c */
    public final long f151723c;

    public AppValidationResult(Parcel parcel) {
        this.f151721a = (bmkd) bjvp.m104731a(parcel, (bxxk) bmkd.f129781l.mo74142c(7));
        this.f151722b = parcel.readInt();
        this.f151723c = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("\npackageName: ");
        sb.append(this.f151721a.f129784b);
        sb.append("\nresultCode: ");
        sb.append(this.f151722b);
        sb.append("\ndurationMs: ");
        sb.append(this.f151723c);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bjvp.m104738a(this.f151721a, parcel);
        parcel.writeInt(this.f151722b);
        parcel.writeLong(this.f151723c);
    }

    public AppValidationResult(bmkd bmkd, int i, long j) {
        this.f151721a = bmkd;
        this.f151722b = i;
        this.f151723c = j;
    }
}
