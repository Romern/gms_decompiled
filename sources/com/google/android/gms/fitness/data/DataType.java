package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DataType extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: A */
    public static final DataType f32011A = new DataType("com.google.body.fat.percentage", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.f32124u);

    /* renamed from: B */
    public static final DataType f32012B = new DataType("com.google.nutrition", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", Field.f32084G, Field.f32082E, Field.f32083F);

    /* renamed from: C */
    public static final DataType f32013C = new DataType("com.google.hydration", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", Field.f32081D);
    public static final Parcelable.Creator CREATOR = new yws();

    /* renamed from: D */
    public static final DataType f32014D = new DataType("com.google.activity.exercise", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32085H, Field.f32086I, Field.f32113j, Field.f32088K, Field.f32087J);

    /* renamed from: E */
    public static final DataType f32015E;

    /* renamed from: F */
    public static final DataType f32016F;

    /* renamed from: G */
    public static final DataType f32017G = new DataType("com.google.device_on_body", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32103Z);

    /* renamed from: H */
    public static final DataType f32018H = new DataType("com.google.internal.primary_device", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32129z);

    /* renamed from: I */
    public static final DataType f32019I = new DataType("com.google.activity.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32107d, Field.f32112i, Field.f32089L);

    /* renamed from: J */
    public static final DataType f32020J = new DataType("com.google.calories.bmr.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.f32090M, Field.f32091N, Field.f32092O);

    /* renamed from: K */
    public static final DataType f32021K = f32042e;

    /* renamed from: L */
    public static final DataType f32022L = f32055r;

    /* renamed from: M */
    public static final DataType f32023M = f32048k;

    /* renamed from: N */
    public static final DataType f32024N = new DataType("com.google.heart_minutes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32101X);

    /* renamed from: O */
    public static final DataType f32025O = new DataType("com.google.heart_minutes.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32101X, Field.f32112i);

    /* renamed from: P */
    public static final DataType f32026P = new DataType("com.google.heart_rate.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.f32090M, Field.f32091N, Field.f32092O);

    /* renamed from: Q */
    public static final DataType f32027Q = new DataType("com.google.location.bounding_box", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.f32093P, Field.f32094Q, Field.f32095R, Field.f32096S);

    /* renamed from: R */
    public static final DataType f32028R = new DataType("com.google.power.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32090M, Field.f32091N, Field.f32092O);

    /* renamed from: S */
    public static final DataType f32029S = new DataType("com.google.speed.summary", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.f32090M, Field.f32091N, Field.f32092O);

    /* renamed from: T */
    public static final DataType f32030T = new DataType("com.google.body.fat.percentage.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.f32090M, Field.f32091N, Field.f32092O);
    public static final DataType TYPE_STEP_COUNT_CUMULATIVE = new DataType("com.google.step_count.cumulative", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32110g);

    /* renamed from: U */
    public static final DataType f32031U = new DataType("com.google.weight.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.f32090M, Field.f32091N, Field.f32092O);

    /* renamed from: V */
    public static final DataType f32032V = new DataType("com.google.height.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.f32090M, Field.f32091N, Field.f32092O);

    /* renamed from: W */
    public static final DataType f32033W = new DataType("com.google.nutrition.summary", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", Field.f32084G, Field.f32082E);

    /* renamed from: X */
    public static final DataType f32034X = f32013C;

    /* renamed from: Y */
    public static final DataType f32035Y = new DataType("com.google.activity.samples", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32102Y);
    @Deprecated

    /* renamed from: Z */
    public static final DataType f32036Z = new DataType("com.google.internal.sports_model", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32104aa);
    @Deprecated

    /* renamed from: aa */
    public static final DataType f32037aa = new DataType("com.google.activity.sample", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32107d, Field.f32109f);
    @Deprecated

    /* renamed from: ab */
    public static final DataType f32038ab;
    @Deprecated

    /* renamed from: ac */
    public static final DataType f32039ac;

    /* renamed from: ad */
    public static final DataType f32040ad = new DataType("com.google.internal.sleep_attributes", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.f32105ab);

    /* renamed from: ae */
    public static final DataType f32041ae = new DataType("com.google.internal.sleep_schedule", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.f32106ac);

    /* renamed from: e */
    public static final DataType f32042e = new DataType("com.google.step_count.delta", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32110g);

    /* renamed from: f */
    public static final DataType f32043f = new DataType("com.google.step_count.cadence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32126w);

    /* renamed from: g */
    public static final DataType f32044g = new DataType("com.google.internal.goal", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32127x);

    /* renamed from: h */
    public static final DataType f32045h = new DataType("com.google.stride_model", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32128y);

    /* renamed from: i */
    public static final DataType f32046i = new DataType("com.google.activity.segment", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32107d);

    /* renamed from: j */
    public static final DataType f32047j = new DataType("com.google.sleep.segment", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", Field.f32108e);

    /* renamed from: k */
    public static final DataType f32048k = new DataType("com.google.calories.expended", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32079B);

    /* renamed from: l */
    public static final DataType f32049l = new DataType("com.google.calories.bmr", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32079B);

    /* renamed from: m */
    public static final DataType f32050m = new DataType("com.google.power.sample", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32080C);

    /* renamed from: n */
    public static final DataType f32051n = new DataType("com.google.sensor.events", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32098U, Field.f32099V, Field.f32100W);

    /* renamed from: o */
    public static final DataType f32052o = new DataType("com.google.heart_rate.bpm", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.f32116m);

    /* renamed from: p */
    public static final DataType f32053p = new DataType("com.google.location.sample", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.f32117n, Field.f32118o, Field.f32119p, Field.f32120q);
    @Deprecated

    /* renamed from: q */
    public static final DataType f32054q = new DataType("com.google.location.track", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.f32117n, Field.f32118o, Field.f32119p, Field.f32120q);

    /* renamed from: r */
    public static final DataType f32055r = new DataType("com.google.distance.delta", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.f32121r);

    /* renamed from: s */
    public static final DataType f32056s = new DataType("com.google.distance.cumulative", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.f32121r);

    /* renamed from: t */
    public static final DataType f32057t = new DataType("com.google.speed", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.f32125v);

    /* renamed from: u */
    public static final DataType f32058u = new DataType("com.google.cycling.wheel_revolution.cumulative", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.f32078A);

    /* renamed from: v */
    public static final DataType f32059v = new DataType("com.google.cycling.wheel_revolution.rpm", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", Field.f32126w);

    /* renamed from: w */
    public static final DataType f32060w = new DataType("com.google.cycling.pedaling.cumulative", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32078A);

    /* renamed from: x */
    public static final DataType f32061x = new DataType("com.google.cycling.pedaling.cadence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32126w);

    /* renamed from: y */
    public static final DataType f32062y = new DataType("com.google.height", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.f32122s);

    /* renamed from: z */
    public static final DataType f32063z = new DataType("com.google.weight", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", Field.f32123t);

    /* renamed from: a */
    public final String f32064a;

    /* renamed from: b */
    public final List f32065b;

    /* renamed from: c */
    public final String f32066c;

    /* renamed from: d */
    public final String f32067d;

    static {
        DataType dataType = new DataType("com.google.active_minutes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32112i);
        f32015E = dataType;
        f32016F = dataType;
        DataType dataType2 = new DataType("com.google.calories.consumed", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", Field.f32079B);
        f32038ab = dataType2;
        f32039ac = dataType2;
    }

    public DataType(String str, String str2, String str3, Field... fieldArr) {
        this.f32064a = str;
        this.f32065b = Collections.unmodifiableList(Arrays.asList(fieldArr));
        this.f32066c = str2;
        this.f32067d = str3;
    }

    /* renamed from: a */
    public static String m23682a(DataType dataType) {
        String valueOf = String.valueOf(dataType.f32064a);
        return valueOf.length() == 0 ? new String("vnd.google.fitness.data_type/") : "vnd.google.fitness.data_type/".concat(valueOf);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataType) {
            DataType dataType = (DataType) obj;
            return this.f32064a.equals(dataType.f32064a) && this.f32065b.equals(dataType.f32065b);
        }
    }

    public final int hashCode() {
        return this.f32064a.hashCode();
    }

    public final String toString() {
        return String.format("DataType{%s%s}", this.f32064a, this.f32065b);
    }

    /* renamed from: a */
    public final String mo18916a() {
        return this.f32064a.startsWith("com.google.") ? this.f32064a.substring(11) : this.f32064a;
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
        see.m35046a(parcel, 1, this.f32064a, false);
        see.m35066c(parcel, 2, this.f32065b, false);
        see.m35046a(parcel, 3, this.f32066c, false);
        see.m35046a(parcel, 4, this.f32067d, false);
        see.m35062b(parcel, a);
    }

    public DataType(String str, List list, String str2, String str3) {
        this.f32064a = str;
        this.f32065b = Collections.unmodifiableList(list);
        this.f32066c = str2;
        this.f32067d = str3;
    }
}
