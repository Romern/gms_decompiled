package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataUpdateNotification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ywu();

    /* renamed from: a */
    public final long f32068a;

    /* renamed from: b */
    public final long f32069b;

    /* renamed from: c */
    public final int f32070c;

    /* renamed from: d */
    public final DataSource f32071d;

    /* renamed from: e */
    public final DataType f32072e;

    public DataUpdateNotification(long j, long j2, int i, DataSource dataSource, DataType dataType) {
        this.f32068a = j;
        this.f32069b = j2;
        this.f32070c = i;
        this.f32071d = dataSource;
        this.f32072e = dataType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataUpdateNotification) {
            DataUpdateNotification dataUpdateNotification = (DataUpdateNotification) obj;
            return this.f32068a == dataUpdateNotification.f32068a && this.f32069b == dataUpdateNotification.f32069b && this.f32070c == dataUpdateNotification.f32070c && sdg.m34949a(this.f32071d, dataUpdateNotification.f32071d) && sdg.m34949a(this.f32072e, dataUpdateNotification.f32072e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32068a), Long.valueOf(this.f32069b), Integer.valueOf(this.f32070c), this.f32071d, this.f32072e});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("updateStartTimeNanos", Long.valueOf(this.f32068a));
        a.mo25396a("updateEndTimeNanos", Long.valueOf(this.f32069b));
        a.mo25396a("operationType", Integer.valueOf(this.f32070c));
        a.mo25396a("dataSource", this.f32071d);
        a.mo25396a("dataType", this.f32072e);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f32068a);
        see.m35036a(parcel, 2, this.f32069b);
        see.m35063b(parcel, 3, this.f32070c);
        see.m35040a(parcel, 4, this.f32071d, i, false);
        see.m35040a(parcel, 5, this.f32072e, i, false);
        see.m35062b(parcel, a);
    }
}
