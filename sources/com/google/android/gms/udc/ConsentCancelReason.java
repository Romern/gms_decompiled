package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConsentCancelReason extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new auzk();

    /* renamed from: a */
    public final int f109329a;

    /* renamed from: b */
    public final boolean f109330b;

    public ConsentCancelReason(int i, boolean z) {
        this.f109329a = i;
        this.f109330b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConsentCancelReason) {
            ConsentCancelReason consentCancelReason = (ConsentCancelReason) obj;
            return this.f109329a == consentCancelReason.f109329a && this.f109330b == consentCancelReason.f109330b;
        }
    }

    public final int hashCode() {
        return this.f109329a;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("CancelAction", Integer.valueOf(this.f109329a));
        a.mo25396a("HadErrors", Boolean.valueOf(this.f109330b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f109329a);
        see.m35051a(parcel, 3, this.f109330b);
        see.m35062b(parcel, a);
    }
}
