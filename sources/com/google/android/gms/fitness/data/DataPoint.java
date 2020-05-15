package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DataPoint extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ywn();

    /* renamed from: a */
    public final DataSource f31992a;

    /* renamed from: b */
    public long f31993b;

    /* renamed from: c */
    public long f31994c;

    /* renamed from: d */
    public final Value[] f31995d;

    /* renamed from: e */
    public DataSource f31996e;

    /* renamed from: f */
    public final long f31997f;

    public DataPoint(DataSource dataSource, long j, long j2, Value[] valueArr, DataSource dataSource2, long j3) {
        this.f31992a = dataSource;
        this.f31996e = dataSource2;
        this.f31993b = j;
        this.f31994c = j2;
        this.f31995d = valueArr;
        this.f31997f = j3;
    }

    /* renamed from: a */
    private static DataSource m23668a(List list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (DataSource) list.get(i);
    }

    /* renamed from: a */
    public final DataSource mo18895a() {
        DataSource dataSource = this.f31996e;
        return dataSource == null ? this.f31992a : dataSource;
    }

    /* renamed from: b */
    public final long mo18896b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f31994c, TimeUnit.NANOSECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataPoint) {
            DataPoint dataPoint = (DataPoint) obj;
            return sdg.m34949a(this.f31992a, dataPoint.f31992a) && this.f31993b == dataPoint.f31993b && this.f31994c == dataPoint.f31994c && Arrays.equals(this.f31995d, dataPoint.f31995d) && sdg.m34949a(mo18895a(), dataPoint.mo18895a());
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31992a, Long.valueOf(this.f31993b), Long.valueOf(this.f31994c)});
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[6];
        objArr[0] = Arrays.toString(this.f31995d);
        objArr[1] = Long.valueOf(this.f31994c);
        objArr[2] = Long.valueOf(this.f31993b);
        objArr[3] = Long.valueOf(this.f31997f);
        objArr[4] = this.f31992a.mo18911a();
        DataSource dataSource = this.f31996e;
        if (dataSource != null) {
            str = dataSource.mo18911a();
        } else {
            str = "N/A";
        }
        objArr[5] = str;
        return String.format("DataPoint{%s@[%s, %s,raw=%s](%s %s)}", objArr);
    }

    public DataPoint(DataSource dataSource, DataSource dataSource2, RawDataPoint rawDataPoint) {
        this(dataSource, rawDataPoint.f32157a, rawDataPoint.f32158b, rawDataPoint.f32159c, dataSource2, rawDataPoint.f32162f);
    }

    /* renamed from: a */
    public final long mo18894a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f31993b, TimeUnit.NANOSECONDS);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31992a, i, false);
        see.m35036a(parcel, 3, this.f31993b);
        see.m35036a(parcel, 4, this.f31994c);
        see.m35057a(parcel, 5, this.f31995d, i);
        see.m35040a(parcel, 6, this.f31996e, i, false);
        see.m35036a(parcel, 7, this.f31997f);
        see.m35062b(parcel, a);
    }

    public DataPoint(List list, RawDataPoint rawDataPoint) {
        this(m23668a(list, rawDataPoint.f32160d), m23668a(list, rawDataPoint.f32161e), rawDataPoint);
    }
}
