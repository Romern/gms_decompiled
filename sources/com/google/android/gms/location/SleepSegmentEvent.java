package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeit();

    /* renamed from: a */
    public final long f79390a;

    /* renamed from: b */
    public final long f79391b;

    /* renamed from: c */
    public final int f79392c;

    public SleepSegmentEvent(long j, long j2, int i) {
        sdo.m34975b(j <= j2, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f79390a = j;
        this.f79391b = j2;
        this.f79392c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            return this.f79390a == sleepSegmentEvent.f79390a && this.f79391b == sleepSegmentEvent.f79391b && this.f79392c == sleepSegmentEvent.f79392c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f79390a), Long.valueOf(this.f79391b), Integer.valueOf(this.f79392c)});
    }

    public final String toString() {
        long j = this.f79390a;
        long j2 = this.f79391b;
        int i = this.f79392c;
        StringBuilder sb = new StringBuilder(84);
        sb.append("startMillis=");
        sb.append(j);
        sb.append(", endMillis=");
        sb.append(j2);
        sb.append(", status=");
        sb.append(i);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f79390a);
        see.m35036a(parcel, 2, this.f79391b);
        see.m35063b(parcel, 3, this.f79392c);
        see.m35062b(parcel, a);
    }
}
