package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataSourceQueryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zei();

    /* renamed from: a */
    public final DataSource f32230a;

    /* renamed from: b */
    public final long f32231b;

    /* renamed from: c */
    public final long f32232c;

    /* renamed from: d */
    public final int f32233d;

    /* renamed from: e */
    public final int f32234e;

    public DataSourceQueryParams(DataSource dataSource, long j, long j2, int i, int i2) {
        this.f32230a = dataSource;
        this.f32231b = j;
        this.f32232c = j2;
        this.f32233d = i;
        this.f32234e = i2;
    }

    public final String toString() {
        return String.format(Locale.US, "{%1$s, %2$tF %2$tT - %3$tF %3$tT (%4$s %5$s)}", this.f32230a.mo18911a(), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.f32231b)), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.f32232c)), Integer.valueOf(this.f32233d), Integer.valueOf(this.f32234e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32230a, i, false);
        see.m35036a(parcel, 3, this.f32231b);
        see.m35036a(parcel, 4, this.f32232c);
        see.m35063b(parcel, 5, this.f32233d);
        see.m35063b(parcel, 6, this.f32234e);
        see.m35062b(parcel, a);
    }
}
