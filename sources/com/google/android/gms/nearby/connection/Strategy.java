package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahiu();

    /* renamed from: a */
    public static final Strategy f80480a = new Strategy(1, 3);

    /* renamed from: b */
    public static final Strategy f80481b = new Strategy(1, 2);

    /* renamed from: c */
    public static final Strategy f80482c = new Strategy(1, 1);

    /* renamed from: d */
    public final int f80483d;

    /* renamed from: e */
    public final int f80484e;

    public Strategy(int i, int i2) {
        this.f80483d = i;
        this.f80484e = i2;
    }

    /* renamed from: a */
    public final String mo44188a() {
        if (f80480a.equals(this)) {
            return "P2P_CLUSTER";
        }
        if (!f80481b.equals(this)) {
            return !f80482c.equals(this) ? "UNKNOWN" : "P2P_POINT_TO_POINT";
        }
        return "P2P_STAR";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Strategy) {
            Strategy strategy = (Strategy) obj;
            return this.f80483d == strategy.f80483d && this.f80484e == strategy.f80484e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80483d), Integer.valueOf(this.f80484e)});
    }

    public final String toString() {
        return String.format(Locale.US, "Strategy(%s){connectionType=%d, topology=%d}", mo44188a(), Integer.valueOf(this.f80483d), Integer.valueOf(this.f80484e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 3, this.f80483d);
        see.m35063b(parcel, 4, this.f80484e);
        see.m35062b(parcel, a);
    }
}
