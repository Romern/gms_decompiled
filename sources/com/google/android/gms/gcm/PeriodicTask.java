package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeriodicTask extends Task {
    public static final Parcelable.Creator CREATOR = new aalw();

    /* renamed from: a */
    public long f32803a = -1;

    /* renamed from: b */
    public long f32804b = -1;

    @Deprecated
    public PeriodicTask(Parcel parcel) {
        super(parcel);
        this.f32803a = parcel.readLong();
        this.f32804b = Math.min(parcel.readLong(), this.f32803a);
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.f32803a;
        long j2 = this.f32804b;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 54);
        sb.append(obj);
        sb.append(" period=");
        sb.append(j);
        sb.append(" flex=");
        sb.append(j2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f32803a);
        parcel.writeLong(this.f32804b);
    }
}
