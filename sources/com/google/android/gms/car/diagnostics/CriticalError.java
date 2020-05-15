package com.google.android.gms.car.diagnostics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CriticalError extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nzq();

    /* renamed from: a */
    public final int f29486a;

    /* renamed from: b */
    public final int f29487b;

    public CriticalError(int i, int i2) {
        this.f29486a = i;
        this.f29487b = i2;
    }

    /* renamed from: a */
    public static CriticalError m22086a(bpdn bpdn, bpdo bpdo) {
        return new CriticalError(bpdn.f136282v, bpdo.f136351ap);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CriticalError) {
            CriticalError criticalError = (CriticalError) obj;
            return criticalError.f29486a == this.f29486a && criticalError.f29487b == this.f29487b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29486a), Integer.valueOf(this.f29487b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29486a);
        see.m35063b(parcel, 2, this.f29487b);
        see.m35062b(parcel, a);
    }
}
