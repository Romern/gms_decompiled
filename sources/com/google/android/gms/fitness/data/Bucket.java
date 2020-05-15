package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Bucket extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ywm();

    /* renamed from: a */
    public final long f31985a;

    /* renamed from: b */
    public final long f31986b;

    /* renamed from: c */
    public final Session f31987c;

    /* renamed from: d */
    public final int f31988d;

    /* renamed from: e */
    public final List f31989e;

    /* renamed from: f */
    public final int f31990f;

    /* renamed from: g */
    private boolean f31991g;

    public Bucket(long j, long j2, Session session, int i, List list, int i2, boolean z) {
        this.f31985a = j;
        this.f31986b = j2;
        this.f31987c = session;
        this.f31988d = i;
        this.f31989e = list;
        this.f31990f = i2;
        this.f31991g = z;
    }

    /* renamed from: a */
    public static String m23662a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "bug" : "intervals" : "segment" : "type" : "session" : "time" : "none";
    }

    /* renamed from: b */
    public final long mo18887b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f31986b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public final int mo18889c() {
        int i;
        Session session = this.f31987c;
        if (session != null) {
            String str = session.f32168c;
            int i2 = 28;
            if (str != null) {
                i2 = 28 + (str.length() * 4);
            }
            String str2 = session.f32169d;
            if (str2 != null) {
                i2 += str2.length() * 4;
            }
            String str3 = session.f32170e;
            if (str3 != null) {
                i2 += str3.length() * 4;
            }
            i = i2 + 44;
        } else {
            i = 40;
        }
        List list = this.f31989e;
        return list != null ? i + (list.size() * 24) : i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Bucket) {
            Bucket bucket = (Bucket) obj;
            return this.f31985a == bucket.f31985a && this.f31986b == bucket.f31986b && this.f31988d == bucket.f31988d && sdg.m34949a(this.f31989e, bucket.f31989e) && this.f31990f == bucket.f31990f && this.f31991g == bucket.f31991g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31985a), Long.valueOf(this.f31986b), Integer.valueOf(this.f31988d), Integer.valueOf(this.f31990f)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("startTime", Long.valueOf(this.f31985a));
        a.mo25396a("endTime", Long.valueOf(this.f31986b));
        a.mo25396a("activity", Integer.valueOf(this.f31988d));
        a.mo25396a("dataSets", this.f31989e);
        a.mo25396a("bucketType", m23662a(this.f31990f));
        a.mo25396a("serverHasMoreData", Boolean.valueOf(this.f31991g));
        return a.toString();
    }

    /* renamed from: a */
    public static ywl m23663a() {
        return new ywl();
    }

    /* renamed from: b */
    public final boolean mo18888b() {
        if (this.f31991g) {
            return true;
        }
        List list = this.f31989e;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((DataSet) list.get(i)).f32001d) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f31985a);
        see.m35036a(parcel, 2, this.f31986b);
        see.m35040a(parcel, 3, this.f31987c, i, false);
        see.m35063b(parcel, 4, this.f31988d);
        see.m35066c(parcel, 5, this.f31989e, false);
        see.m35063b(parcel, 6, this.f31990f);
        see.m35051a(parcel, 7, mo18888b());
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final long mo18886a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f31985a, TimeUnit.MILLISECONDS);
    }
}
