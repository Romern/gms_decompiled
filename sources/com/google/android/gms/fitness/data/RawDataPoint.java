package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RawDataPoint extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxl();

    /* renamed from: a */
    public final long f32157a;

    /* renamed from: b */
    public final long f32158b;

    /* renamed from: c */
    public final Value[] f32159c;

    /* renamed from: d */
    public final int f32160d;

    /* renamed from: e */
    public final int f32161e;

    /* renamed from: f */
    public final long f32162f;

    public RawDataPoint(long j, long j2, Value[] valueArr, int i, int i2, long j3) {
        this.f32157a = j;
        this.f32158b = j2;
        this.f32160d = i;
        this.f32161e = i2;
        this.f32162f = j3;
        this.f32159c = valueArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RawDataPoint) {
            RawDataPoint rawDataPoint = (RawDataPoint) obj;
            return this.f32157a == rawDataPoint.f32157a && this.f32158b == rawDataPoint.f32158b && Arrays.equals(this.f32159c, rawDataPoint.f32159c) && this.f32160d == rawDataPoint.f32160d && this.f32161e == rawDataPoint.f32161e && this.f32162f == rawDataPoint.f32162f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32157a), Long.valueOf(this.f32158b)});
    }

    public final String toString() {
        return String.format(Locale.US, "RawDataPoint{%s@[%s, %s](%d,%d)}", Arrays.toString(this.f32159c), Long.valueOf(this.f32158b), Long.valueOf(this.f32157a), Integer.valueOf(this.f32160d), Integer.valueOf(this.f32161e));
    }

    public RawDataPoint(DataPoint dataPoint, List list) {
        this.f32157a = dataPoint.mo18894a(TimeUnit.NANOSECONDS);
        this.f32158b = dataPoint.mo18896b(TimeUnit.NANOSECONDS);
        this.f32159c = dataPoint.f31995d;
        this.f32160d = yue.m44849a(dataPoint.f31992a, list);
        this.f32161e = yue.m44849a(dataPoint.f31996e, list);
        this.f32162f = dataPoint.f31997f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f32157a);
        see.m35036a(parcel, 2, this.f32158b);
        see.m35057a(parcel, 3, this.f32159c, i);
        see.m35063b(parcel, 4, this.f32160d);
        see.m35063b(parcel, 5, this.f32161e);
        see.m35036a(parcel, 6, this.f32162f);
        see.m35062b(parcel, a);
    }
}
