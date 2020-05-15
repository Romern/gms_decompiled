package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aege();

    /* renamed from: a */
    public final int f79307a;

    /* renamed from: b */
    public final int f79308b;

    /* renamed from: c */
    public final long f79309c;

    public ActivityTransitionEvent(int i, int i2, long j) {
        ActivityTransition.m66828a(i2);
        this.f79307a = i;
        this.f79308b = i2;
        this.f79309c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityTransitionEvent) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
            return this.f79307a == activityTransitionEvent.f79307a && this.f79308b == activityTransitionEvent.f79308b && this.f79309c == activityTransitionEvent.f79309c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79307a), Integer.valueOf(this.f79308b), Long.valueOf(this.f79309c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f79307a;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f79308b;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f79309c;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79307a);
        see.m35063b(parcel, 2, this.f79308b);
        see.m35036a(parcel, 3, this.f79309c);
        see.m35062b(parcel, a);
    }
}
