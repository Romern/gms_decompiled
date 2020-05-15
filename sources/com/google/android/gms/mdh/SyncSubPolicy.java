package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncSubPolicy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afle();

    /* renamed from: a */
    public boolean f80006a;

    /* renamed from: b */
    public int f80007b;

    public SyncSubPolicy(boolean z, int i) {
        this.f80006a = z;
        this.f80007b = i;
    }

    /* renamed from: a */
    public static afld m67179a() {
        return new afld();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncSubPolicy syncSubPolicy = (SyncSubPolicy) obj;
            return this.f80006a == syncSubPolicy.f80006a && this.f80007b == syncSubPolicy.f80007b;
        }
    }

    public final int hashCode() {
        return ((this.f80006a ? 1 : 0) * true) + this.f80007b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f80006a);
        see.m35063b(parcel, 2, this.f80007b);
        see.m35062b(parcel, a);
    }
}
