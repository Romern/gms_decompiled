package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aegd();

    /* renamed from: a */
    public final int f79305a;

    /* renamed from: b */
    public final int f79306b;

    public ActivityTransition(int i, int i2) {
        this.f79305a = i;
        this.f79306b = i2;
    }

    /* renamed from: a */
    public static void m66828a(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        sdo.m34975b(z, sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityTransition) {
            ActivityTransition activityTransition = (ActivityTransition) obj;
            return this.f79305a == activityTransition.f79305a && this.f79306b == activityTransition.f79306b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79305a), Integer.valueOf(this.f79306b)});
    }

    public final String toString() {
        int i = this.f79305a;
        int i2 = this.f79306b;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79305a);
        see.m35063b(parcel, 2, this.f79306b);
        see.m35062b(parcel, a);
    }
}
