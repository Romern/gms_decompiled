package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Field extends AbstractSafeParcelable {

    /* renamed from: A */
    public static final Field f32078A = m23685a("revolutions");

    /* renamed from: B */
    public static final Field f32079B = m23687c("calories");

    /* renamed from: C */
    public static final Field f32080C = m23687c("watts");
    public static final Parcelable.Creator CREATOR = new ywy();

    /* renamed from: D */
    public static final Field f32081D = m23687c("volume");

    /* renamed from: E */
    public static final Field f32082E = m23686b("meal_type");

    /* renamed from: F */
    public static final Field f32083F = new Field("food_item", 3, true);

    /* renamed from: G */
    public static final Field f32084G = m23689e("nutrients");

    /* renamed from: H */
    public static final Field f32085H = new Field("exercise", 3);

    /* renamed from: I */
    public static final Field f32086I = m23686b("repetitions");

    /* renamed from: J */
    public static final Field f32087J = m23688d("resistance");

    /* renamed from: K */
    public static final Field f32088K = m23686b("resistance_type");

    /* renamed from: L */
    public static final Field f32089L = m23685a("num_segments");

    /* renamed from: M */
    public static final Field f32090M = m23687c("average");

    /* renamed from: N */
    public static final Field f32091N = m23687c("max");

    /* renamed from: O */
    public static final Field f32092O = m23687c("min");

    /* renamed from: P */
    public static final Field f32093P = m23687c("low_latitude");

    /* renamed from: Q */
    public static final Field f32094Q = m23687c("low_longitude");

    /* renamed from: R */
    public static final Field f32095R = m23687c("high_latitude");

    /* renamed from: S */
    public static final Field f32096S = m23687c("high_longitude");

    /* renamed from: T */
    public static final Field f32097T = m23685a("occurrences");

    /* renamed from: U */
    public static final Field f32098U = m23685a("sensor_type");

    /* renamed from: V */
    public static final Field f32099V = new Field("timestamps", 5);

    /* renamed from: W */
    public static final Field f32100W = new Field("sensor_values", 6);

    /* renamed from: X */
    public static final Field f32101X = m23687c("intensity");

    /* renamed from: Y */
    public static final Field f32102Y = m23689e("activity_confidence");

    /* renamed from: Z */
    public static final Field f32103Z = m23687c("probability");

    /* renamed from: aa */
    public static final Field f32104aa = m23690f("google.android.fitness.SportsModel");

    /* renamed from: ab */
    public static final Field f32105ab = m23690f("google.android.fitness.SleepAttributes");

    /* renamed from: ac */
    public static final Field f32106ac = m23690f("google.android.fitness.SleepSchedule");

    /* renamed from: d */
    public static final Field f32107d = m23685a("activity");

    /* renamed from: e */
    public static final Field f32108e = m23685a("sleep_segment_type");

    /* renamed from: f */
    public static final Field f32109f = m23687c("confidence");

    /* renamed from: g */
    public static final Field f32110g = m23685a("steps");
    @Deprecated

    /* renamed from: h */
    public static final Field f32111h = m23687c("step_length");

    /* renamed from: i */
    public static final Field f32112i = m23685a("duration");

    /* renamed from: j */
    public static final Field f32113j = m23686b("duration");

    /* renamed from: k */
    public static final Field f32114k = m23689e("activity_duration.ascending");

    /* renamed from: l */
    public static final Field f32115l = m23689e("activity_duration.descending");

    /* renamed from: m */
    public static final Field f32116m = m23687c("bpm");

    /* renamed from: n */
    public static final Field f32117n = m23687c("latitude");

    /* renamed from: o */
    public static final Field f32118o = m23687c("longitude");

    /* renamed from: p */
    public static final Field f32119p = m23687c("accuracy");

    /* renamed from: q */
    public static final Field f32120q = m23688d("altitude");

    /* renamed from: r */
    public static final Field f32121r = m23687c("distance");

    /* renamed from: s */
    public static final Field f32122s = m23687c("height");

    /* renamed from: t */
    public static final Field f32123t = m23687c("weight");

    /* renamed from: u */
    public static final Field f32124u = m23687c("percentage");

    /* renamed from: v */
    public static final Field f32125v = m23687c("speed");

    /* renamed from: w */
    public static final Field f32126w = m23687c("rpm");

    /* renamed from: x */
    public static final Field f32127x = m23690f("google.android.fitness.GoalV2");

    /* renamed from: y */
    public static final Field f32128y = m23690f("google.android.fitness.StrideModel");

    /* renamed from: z */
    public static final Field f32129z = m23690f("google.android.fitness.Device");

    /* renamed from: a */
    public final String f32130a;

    /* renamed from: b */
    public final int f32131b;

    /* renamed from: c */
    public final Boolean f32132c;

    public Field(String str, int i) {
        this(str, i, null);
    }

    /* renamed from: a */
    public static Field m23685a(String str) {
        return new Field(str, 1);
    }

    /* renamed from: b */
    public static Field m23686b(String str) {
        return new Field(str, 1, true);
    }

    /* renamed from: c */
    public static Field m23687c(String str) {
        return new Field(str, 2);
    }

    /* renamed from: d */
    public static Field m23688d(String str) {
        return new Field(str, 2, true);
    }

    /* renamed from: e */
    public static Field m23689e(String str) {
        return new Field(str, 4);
    }

    /* renamed from: f */
    public static Field m23690f(String str) {
        return new Field(str, 7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Field) {
            Field field = (Field) obj;
            return this.f32130a.equals(field.f32130a) && this.f32131b == field.f32131b;
        }
    }

    public final int hashCode() {
        return this.f32130a.hashCode();
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f32130a;
        objArr[1] = this.f32131b != 1 ? "f" : "i";
        return String.format("%s(%s)", objArr);
    }

    public Field(String str, int i, Boolean bool) {
        sdo.m34959a((Object) str);
        this.f32130a = str;
        this.f32131b = i;
        this.f32132c = bool;
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
        see.m35046a(parcel, 1, this.f32130a, false);
        see.m35063b(parcel, 2, this.f32131b);
        see.m35041a(parcel, 3, this.f32132c);
        see.m35062b(parcel, a);
    }
}
