package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdsrParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcc();

    /* renamed from: a */
    public final long f9843a;

    /* renamed from: b */
    public final long f9844b;

    /* renamed from: c */
    public final long f9845c;

    /* renamed from: d */
    public final long f9846d;

    /* renamed from: e */
    public final float f9847e;

    public AdsrParams(long j, long j2, long j3, long j4, float f) {
        this.f9843a = j;
        this.f9844b = j2;
        this.f9845c = j3;
        this.f9846d = j4;
        this.f9847e = f;
    }

    /* renamed from: a */
    public final long mo7313a() {
        return this.f9843a + this.f9844b + this.f9845c + this.f9846d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdsrParams) {
            AdsrParams adsrParams = (AdsrParams) obj;
            return this.f9843a == adsrParams.f9843a && this.f9844b == adsrParams.f9844b && this.f9845c == adsrParams.f9845c && this.f9846d == adsrParams.f9846d && this.f9847e == adsrParams.f9847e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9843a), Long.valueOf(this.f9844b), Long.valueOf(this.f9845c), Long.valueOf(this.f9846d), Float.valueOf(this.f9847e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f9843a);
        see.m35036a(parcel, 3, this.f9844b);
        see.m35036a(parcel, 4, this.f9845c);
        see.m35036a(parcel, 5, this.f9846d);
        see.m35034a(parcel, 6, this.f9847e);
        see.m35062b(parcel, a);
    }
}
