package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aeia();

    /* renamed from: a */
    public int f79349a;

    /* renamed from: b */
    public long f79350b;

    /* renamed from: c */
    public long f79351c;

    /* renamed from: d */
    public boolean f79352d;

    /* renamed from: e */
    public long f79353e;

    /* renamed from: f */
    public int f79354f;

    /* renamed from: g */
    public float f79355g;

    /* renamed from: h */
    long f79356h;

    public LocationRequest() {
        this.f79349a = 102;
        this.f79350b = 3600000;
        this.f79351c = 600000;
        this.f79352d = false;
        this.f79353e = Long.MAX_VALUE;
        this.f79354f = Integer.MAX_VALUE;
        this.f79355g = 0.0f;
        this.f79356h = 0;
    }

    /* renamed from: a */
    public static LocationRequest m66854a() {
        return new LocationRequest();
    }

    /* renamed from: a */
    public static String m66855a(int i) {
        return i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY";
    }

    /* renamed from: e */
    private static void m66856e(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public final long mo43550b() {
        long j = this.f79356h;
        long j2 = this.f79350b;
        return j < j2 ? j2 : j;
    }

    /* renamed from: c */
    public final void mo43553c(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.f79349a = i;
            return;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public final boolean mo43555c() {
        long j = this.f79356h;
        return j / 2 >= this.f79350b && j > 0;
    }

    /* renamed from: d */
    public final void mo43556d(long j) {
        m66856e(j);
        this.f79356h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            return this.f79349a == locationRequest.f79349a && this.f79350b == locationRequest.f79350b && this.f79351c == locationRequest.f79351c && this.f79352d == locationRequest.f79352d && this.f79353e == locationRequest.f79353e && this.f79354f == locationRequest.f79354f && this.f79355g == locationRequest.f79355g && mo43550b() == locationRequest.mo43550b();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79349a), Long.valueOf(this.f79350b), Float.valueOf(this.f79355g), Long.valueOf(this.f79356h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        sb.append(m66855a(this.f79349a));
        if (this.f79349a != 105) {
            sb.append(" requested=");
            sb.append(this.f79350b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f79351c);
        sb.append("ms");
        if (this.f79356h > this.f79350b) {
            sb.append(" maxWait=");
            sb.append(this.f79356h);
            sb.append("ms");
        }
        if (this.f79355g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f79355g);
            sb.append("m");
        }
        long j = this.f79353e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f79354f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f79354f);
        }
        sb.append(']');
        return sb.toString();
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f79349a = i;
        this.f79350b = j;
        this.f79351c = j2;
        this.f79352d = z;
        this.f79353e = j3;
        this.f79354f = i2;
        this.f79355g = f;
        this.f79356h = j4;
    }

    /* renamed from: b */
    public final void mo43551b(int i) {
        if (i > 0) {
            this.f79354f = i;
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79349a);
        see.m35036a(parcel, 2, this.f79350b);
        see.m35036a(parcel, 3, this.f79351c);
        see.m35051a(parcel, 4, this.f79352d);
        see.m35036a(parcel, 5, this.f79353e);
        see.m35063b(parcel, 6, this.f79354f);
        see.m35034a(parcel, 7, this.f79355g);
        see.m35036a(parcel, 8, this.f79356h);
        see.m35062b(parcel, a);
    }

    public LocationRequest(LocationRequest locationRequest) {
        this.f79349a = locationRequest.f79349a;
        this.f79350b = locationRequest.f79350b;
        this.f79351c = locationRequest.f79351c;
        this.f79352d = locationRequest.f79352d;
        this.f79353e = locationRequest.f79353e;
        this.f79354f = locationRequest.f79354f;
        this.f79355g = locationRequest.f79355g;
        this.f79356h = locationRequest.f79356h;
    }

    /* renamed from: a */
    public final void mo43549a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = Long.MAX_VALUE;
        if (j <= Long.MAX_VALUE - elapsedRealtime) {
            j2 = j + elapsedRealtime;
        }
        this.f79353e = j2;
        if (j2 < 0) {
            this.f79353e = 0;
        }
    }

    /* renamed from: b */
    public final void mo43552b(long j) {
        m66856e(j);
        this.f79352d = true;
        this.f79351c = j;
    }

    /* renamed from: c */
    public final void mo43554c(long j) {
        m66856e(j);
        this.f79350b = j;
        if (!this.f79352d) {
            double d = (double) j;
            Double.isNaN(d);
            this.f79351c = (long) (d / 6.0d);
        }
    }
}
