package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RawBucket extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxk();

    /* renamed from: a */
    public final long f32150a;

    /* renamed from: b */
    public final long f32151b;

    /* renamed from: c */
    public final Session f32152c;

    /* renamed from: d */
    public final int f32153d;

    /* renamed from: e */
    public final List f32154e;

    /* renamed from: f */
    public final int f32155f;

    /* renamed from: g */
    public final boolean f32156g;

    public RawBucket(long j, long j2, Session session, int i, List list, int i2, boolean z) {
        this.f32150a = j;
        this.f32151b = j2;
        this.f32152c = session;
        this.f32153d = i;
        this.f32154e = list;
        this.f32155f = i2;
        this.f32156g = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RawBucket) {
            RawBucket rawBucket = (RawBucket) obj;
            return this.f32150a == rawBucket.f32150a && this.f32151b == rawBucket.f32151b && this.f32153d == rawBucket.f32153d && sdg.m34949a(this.f32154e, rawBucket.f32154e) && this.f32155f == rawBucket.f32155f && this.f32156g == rawBucket.f32156g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32150a), Long.valueOf(this.f32151b), Integer.valueOf(this.f32155f)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("startTime", Long.valueOf(this.f32150a));
        a.mo25396a("endTime", Long.valueOf(this.f32151b));
        a.mo25396a("activity", Integer.valueOf(this.f32153d));
        a.mo25396a("dataSets", this.f32154e);
        a.mo25396a("bucketType", Integer.valueOf(this.f32155f));
        a.mo25396a("serverHasMoreData", Boolean.valueOf(this.f32156g));
        return a.toString();
    }

    public RawBucket(Bucket bucket, List list) {
        this.f32150a = bucket.mo18886a(TimeUnit.MILLISECONDS);
        this.f32151b = bucket.mo18887b(TimeUnit.MILLISECONDS);
        this.f32152c = bucket.f31987c;
        this.f32153d = bucket.f31988d;
        this.f32155f = bucket.f31990f;
        this.f32156g = bucket.mo18888b();
        List list2 = bucket.f31989e;
        this.f32154e = new ArrayList(list2.size());
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            this.f32154e.add(new RawDataSet((DataSet) list2.get(i), list));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f32150a);
        see.m35036a(parcel, 2, this.f32151b);
        see.m35040a(parcel, 3, this.f32152c, i, false);
        see.m35063b(parcel, 4, this.f32153d);
        see.m35066c(parcel, 5, this.f32154e, false);
        see.m35063b(parcel, 6, this.f32155f);
        see.m35051a(parcel, 7, this.f32156g);
        see.m35062b(parcel, a);
    }
}
