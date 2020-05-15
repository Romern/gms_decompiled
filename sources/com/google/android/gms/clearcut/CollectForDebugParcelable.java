package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CollectForDebugParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qwy();

    /* renamed from: a */
    public final boolean f30027a;

    /* renamed from: b */
    public final long f30028b;

    /* renamed from: c */
    public final long f30029c;

    public CollectForDebugParcelable(boolean z, long j, long j2) {
        this.f30027a = z;
        this.f30028b = j;
        this.f30029c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollectForDebugParcelable) {
            CollectForDebugParcelable collectForDebugParcelable = (CollectForDebugParcelable) obj;
            return this.f30027a == collectForDebugParcelable.f30027a && this.f30028b == collectForDebugParcelable.f30028b && this.f30029c == collectForDebugParcelable.f30029c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f30027a), Long.valueOf(this.f30028b), Long.valueOf(this.f30029c)});
    }

    public final String toString() {
        return "CollectForDebugParcelable[" + "skipPersistentStorage: " + this.f30027a + ",collectForDebugStartTimeMillis: " + this.f30028b + ",collectForDebugExpiryTimeMillis: " + this.f30029c + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f30027a);
        see.m35036a(parcel, 2, this.f30029c);
        see.m35036a(parcel, 3, this.f30028b);
        see.m35062b(parcel, a);
    }
}
