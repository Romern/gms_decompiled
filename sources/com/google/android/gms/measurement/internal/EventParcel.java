package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class EventParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agdu();

    /* renamed from: a */
    public final String f80132a;

    /* renamed from: b */
    public final EventParams f80133b;

    /* renamed from: c */
    public final String f80134c;

    /* renamed from: d */
    public final long f80135d;

    public EventParcel(EventParcel eventParcel, long j) {
        sdo.m34959a(eventParcel);
        this.f80132a = eventParcel.f80132a;
        this.f80133b = eventParcel.f80133b;
        this.f80134c = eventParcel.f80134c;
        this.f80135d = j;
    }

    public final String toString() {
        String str = this.f80134c;
        String str2 = this.f80132a;
        String valueOf = String.valueOf(this.f80133b);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        agdu.m54111a(this, parcel, i);
    }

    public EventParcel(String str, EventParams eventParams, String str2, long j) {
        this.f80132a = str;
        this.f80133b = eventParams;
        this.f80134c = str2;
        this.f80135d = j;
    }
}
