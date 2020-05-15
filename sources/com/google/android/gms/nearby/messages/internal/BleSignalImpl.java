package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleSignalImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajbt();

    /* renamed from: a */
    final int f80719a;

    /* renamed from: b */
    public final int f80720b;

    /* renamed from: c */
    public final int f80721c;

    public BleSignalImpl(int i, int i2, int i3) {
        this.f80719a = i;
        this.f80720b = i2;
        this.f80721c = m67400a(i3);
    }

    /* renamed from: a */
    public static int m67400a(int i) {
        if (i <= -169 || i >= 87) {
            return Integer.MIN_VALUE;
        }
        return i;
    }

    /* renamed from: b */
    public static int m67401b(int i) {
        return m67400a(i - 41);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleSignalImpl) {
            BleSignalImpl bleSignalImpl = (BleSignalImpl) obj;
            return this.f80720b == bleSignalImpl.f80720b && this.f80721c == bleSignalImpl.f80721c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80720b), Integer.valueOf(this.f80721c)});
    }

    public final String toString() {
        int i = this.f80720b;
        int i2 = this.f80721c;
        StringBuilder sb = new StringBuilder(48);
        sb.append("BleSignal{rssi=");
        sb.append(i);
        sb.append(", txPower=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80719a);
        see.m35063b(parcel, 2, this.f80720b);
        see.m35063b(parcel, 3, this.f80721c);
        see.m35062b(parcel, a);
    }
}
