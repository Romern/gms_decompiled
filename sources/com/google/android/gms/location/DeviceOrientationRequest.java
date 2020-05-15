package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aegl();

    /* renamed from: a */
    boolean f79329a;

    /* renamed from: b */
    long f79330b;

    /* renamed from: c */
    float f79331c;

    /* renamed from: d */
    long f79332d;

    /* renamed from: e */
    int f79333e;

    public DeviceOrientationRequest() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceOrientationRequest) {
            DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
            return this.f79329a == deviceOrientationRequest.f79329a && this.f79330b == deviceOrientationRequest.f79330b && Float.compare(this.f79331c, deviceOrientationRequest.f79331c) == 0 && this.f79332d == deviceOrientationRequest.f79332d && this.f79333e == deviceOrientationRequest.f79333e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f79329a), Long.valueOf(this.f79330b), Float.valueOf(this.f79331c), Long.valueOf(this.f79332d), Integer.valueOf(this.f79333e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f79329a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f79330b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f79331c);
        long j = this.f79332d;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f79333e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f79333e);
        }
        sb.append(']');
        return sb.toString();
    }

    public DeviceOrientationRequest(boolean z, long j, float f, long j2, int i) {
        this.f79329a = z;
        this.f79330b = j;
        this.f79331c = f;
        this.f79332d = j2;
        this.f79333e = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f79329a);
        see.m35036a(parcel, 2, this.f79330b);
        see.m35034a(parcel, 3, this.f79331c);
        see.m35036a(parcel, 4, this.f79332d);
        see.m35063b(parcel, 5, this.f79333e);
        see.m35062b(parcel, a);
    }
}
