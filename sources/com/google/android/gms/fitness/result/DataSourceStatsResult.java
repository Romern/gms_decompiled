package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataSourceStatsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfs();

    /* renamed from: a */
    public final DataSource f32334a;

    /* renamed from: b */
    public final long f32335b;

    /* renamed from: c */
    public final boolean f32336c;

    /* renamed from: d */
    public final long f32337d;

    /* renamed from: e */
    public final long f32338e;

    /* renamed from: f */
    public final long f32339f;

    public DataSourceStatsResult(DataSource dataSource, long j, boolean z, long j2, long j3, long j4) {
        this.f32334a = dataSource;
        this.f32335b = j;
        this.f32336c = z;
        this.f32337d = j2;
        this.f32338e = j3;
        this.f32339f = j4;
    }

    public final String toString() {
        return String.format("DataSourceStatsResult{dataSource=%s, id=%s, isRemote=%s, minEndTimeNanos=%s, maxEndTimeNanos=%s, minContiguousTimeNanos=%s}", this.f32334a, Long.valueOf(this.f32335b), Boolean.valueOf(this.f32336c), Long.valueOf(this.f32337d), Long.valueOf(this.f32338e), Long.valueOf(this.f32339f));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32334a, i, false);
        see.m35036a(parcel, 2, this.f32335b);
        see.m35051a(parcel, 3, this.f32336c);
        see.m35036a(parcel, 4, this.f32337d);
        see.m35036a(parcel, 5, this.f32338e);
        see.m35036a(parcel, 6, this.f32339f);
        see.m35062b(parcel, a);
    }
}
