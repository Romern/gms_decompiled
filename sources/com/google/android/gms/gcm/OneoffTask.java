package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OneoffTask extends Task {
    public static final Parcelable.Creator CREATOR = new aalu();

    /* renamed from: a */
    public final long f32800a;

    /* renamed from: b */
    public final long f32801b;

    @Deprecated
    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.f32800a = parcel.readLong();
        this.f32801b = parcel.readLong();
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.f32800a;
        long j2 = this.f32801b;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 64);
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(j);
        sb.append(" windowEnd=");
        sb.append(j2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f32800a);
        parcel.writeLong(this.f32801b);
    }
}
