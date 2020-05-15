package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Goal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxc();

    /* renamed from: a */
    public final long f32133a;

    /* renamed from: b */
    public final long f32134b;

    /* renamed from: c */
    public final List f32135c;

    /* renamed from: d */
    public final Recurrence f32136d;

    /* renamed from: e */
    public final int f32137e;

    /* renamed from: f */
    public final MetricObjective f32138f;

    /* renamed from: g */
    public final DurationObjective f32139g;

    /* renamed from: h */
    public final FrequencyObjective f32140h;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class DurationObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ywx();

        /* renamed from: a */
        public final long f32141a;

        public DurationObjective(long j) {
            this.f32141a = j;
        }

        public final boolean equals(Object obj) {
            if (obj != this) {
                return (obj instanceof DurationObjective) && this.f32141a == ((DurationObjective) obj).f32141a;
            }
            return true;
        }

        public final int hashCode() {
            return (int) this.f32141a;
        }

        public final String toString() {
            sdf a = sdg.m34948a(this);
            a.mo25396a("duration", Long.valueOf(this.f32141a));
            return a.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35036a(parcel, 1, this.f32141a);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class FrequencyObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ywz();

        /* renamed from: a */
        public final int f32142a;

        public FrequencyObjective(int i) {
            this.f32142a = i;
        }

        public final boolean equals(Object obj) {
            if (obj != this) {
                return (obj instanceof FrequencyObjective) && this.f32142a == ((FrequencyObjective) obj).f32142a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f32142a;
        }

        public final String toString() {
            sdf a = sdg.m34948a(this);
            a.mo25396a("frequency", Integer.valueOf(this.f32142a));
            return a.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f32142a);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class MetricObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new yxj();

        /* renamed from: a */
        public final String f32143a;

        /* renamed from: b */
        public final double f32144b;

        /* renamed from: c */
        public final double f32145c;

        public MetricObjective(String str, double d, double d2) {
            this.f32143a = str;
            this.f32144b = d;
            this.f32145c = d2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof MetricObjective) {
                MetricObjective metricObjective = (MetricObjective) obj;
                return sdg.m34949a(this.f32143a, metricObjective.f32143a) && this.f32144b == metricObjective.f32144b && this.f32145c == metricObjective.f32145c;
            }
        }

        public final int hashCode() {
            return this.f32143a.hashCode();
        }

        public final String toString() {
            sdf a = sdg.m34948a(this);
            a.mo25396a("dataTypeName", this.f32143a);
            a.mo25396a("value", Double.valueOf(this.f32144b));
            a.mo25396a("initialValue", Double.valueOf(this.f32145c));
            return a.toString();
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
         arg types: [android.os.Parcel, int, java.lang.String, int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void */
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35046a(parcel, 1, this.f32143a, false);
            see.m35033a(parcel, 2, this.f32144b);
            see.m35033a(parcel, 3, this.f32145c);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Recurrence extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new yxn();

        /* renamed from: a */
        public final int f32146a;

        /* renamed from: b */
        public final int f32147b;

        public Recurrence(int i, int i2) {
            this.f32146a = i;
            boolean z = false;
            if (i2 > 0 && i2 <= 3) {
                z = true;
            }
            sdo.m34970a(z);
            this.f32147b = i2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Recurrence) {
                Recurrence recurrence = (Recurrence) obj;
                return this.f32146a == recurrence.f32146a && this.f32147b == recurrence.f32147b;
            }
        }

        public final int hashCode() {
            return this.f32147b;
        }

        public final String toString() {
            String str;
            sdf a = sdg.m34948a(this);
            a.mo25396a("count", Integer.valueOf(this.f32146a));
            int i = this.f32147b;
            if (i == 1) {
                str = "day";
            } else if (i == 2) {
                str = "week";
            } else if (i == 3) {
                str = "month";
            } else {
                throw new IllegalArgumentException("invalid unit value");
            }
            a.mo25396a("unit", str);
            return a.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f32146a);
            see.m35063b(parcel, 2, this.f32147b);
            see.m35062b(parcel, a);
        }
    }

    public Goal(long j, long j2, List list, Recurrence recurrence, int i, MetricObjective metricObjective, DurationObjective durationObjective, FrequencyObjective frequencyObjective) {
        this.f32133a = j;
        this.f32134b = j2;
        this.f32135c = list;
        this.f32136d = recurrence;
        this.f32137e = i;
        this.f32138f = metricObjective;
        this.f32139g = durationObjective;
        this.f32140h = frequencyObjective;
    }

    /* renamed from: a */
    public static String m23691a(int i) {
        if (i == 0) {
            return "unknown";
        }
        if (i == 1) {
            return "metric";
        }
        if (i == 2) {
            return "duration";
        }
        if (i == 3) {
            return "frequency";
        }
        throw new IllegalArgumentException("invalid objective type value");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Goal) {
            Goal goal = (Goal) obj;
            return this.f32133a == goal.f32133a && this.f32134b == goal.f32134b && sdg.m34949a(this.f32135c, goal.f32135c) && sdg.m34949a(this.f32136d, goal.f32136d) && this.f32137e == goal.f32137e && sdg.m34949a(this.f32138f, goal.f32138f) && sdg.m34949a(this.f32139g, goal.f32139g) && sdg.m34949a(this.f32140h, goal.f32140h);
        }
    }

    public final int hashCode() {
        return this.f32137e;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("activity", mo18934a());
        a.mo25396a("recurrence", this.f32136d);
        a.mo25396a("metricObjective", this.f32138f);
        a.mo25396a("durationObjective", this.f32139g);
        a.mo25396a("frequencyObjective", this.f32140h);
        return a.toString();
    }

    /* renamed from: a */
    public final String mo18934a() {
        if (this.f32135c.isEmpty() || this.f32135c.size() > 1) {
            return null;
        }
        return bzzh.m126348a(((Integer) this.f32135c.get(0)).intValue());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f32133a);
        see.m35036a(parcel, 2, this.f32134b);
        see.m35048a(parcel, 3, this.f32135c);
        see.m35040a(parcel, 4, this.f32136d, i, false);
        see.m35063b(parcel, 5, this.f32137e);
        see.m35040a(parcel, 6, this.f32138f, i, false);
        see.m35040a(parcel, 7, this.f32139g, i, false);
        see.m35040a(parcel, 8, this.f32140h, i, false);
        see.m35062b(parcel, a);
    }
}
