package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aegb();

    /* renamed from: a */
    public List f79300a;

    /* renamed from: b */
    public long f79301b;

    /* renamed from: c */
    public long f79302c;

    /* renamed from: d */
    public int f79303d;

    /* renamed from: e */
    Bundle f79304e;

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2, int i, Bundle bundle) {
        this(Collections.singletonList(detectedActivity), j, j2, i, bundle);
    }

    /* renamed from: a */
    public static boolean m66819a(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List d = m66823d(intent);
        if (d == null || d.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m66822c(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
        }
        return false;
    }

    /* renamed from: d */
    public static List m66823d(Intent intent) {
        if (m66822c(intent)) {
            return sef.m35076b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f79301b == activityRecognitionResult.f79301b && this.f79302c == activityRecognitionResult.f79302c && this.f79303d == activityRecognitionResult.f79303d && sdg.m34949a(this.f79300a, activityRecognitionResult.f79300a) && m66820a(this.f79304e, activityRecognitionResult.f79304e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f79301b), Long.valueOf(this.f79302c), Integer.valueOf(this.f79303d), this.f79300a, this.f79304e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f79300a);
        long j = this.f79301b;
        long j2 = this.f79302c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* renamed from: b */
    public static ActivityRecognitionResult m66821b(Intent intent) {
        ActivityRecognitionResult activityRecognitionResult;
        if (m66819a(intent)) {
            Object obj = intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (obj instanceof byte[]) {
                activityRecognitionResult = (ActivityRecognitionResult) sef.m35069a((byte[]) obj, CREATOR);
            } else if (obj instanceof ActivityRecognitionResult) {
                activityRecognitionResult = (ActivityRecognitionResult) obj;
            }
            if (activityRecognitionResult == null) {
                return activityRecognitionResult;
            }
            List d = m66823d(intent);
            if (d == null || d.isEmpty()) {
                return null;
            }
            return (ActivityRecognitionResult) d.get(d.size() - 1);
        }
        activityRecognitionResult = null;
        if (activityRecognitionResult == null) {
        }
    }

    /* renamed from: c */
    public final Bundle mo43493c() {
        Bundle bundle = this.f79304e;
        if (bundle != null) {
            return (Bundle) bundle.clone();
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f79300a, false);
        see.m35036a(parcel, 2, this.f79301b);
        see.m35036a(parcel, 3, this.f79302c);
        see.m35063b(parcel, 4, this.f79303d);
        see.m35037a(parcel, 5, this.f79304e, false);
        see.m35062b(parcel, a);
    }

    public ActivityRecognitionResult(List list, long j, long j2) {
        this(list, j, j2, 0, (Bundle) null);
    }

    public ActivityRecognitionResult(List list, long j, long j2, int i, Bundle bundle) {
        boolean z;
        boolean z2 = true;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34975b(z, "Must have at least 1 detected activity");
        sdo.m34975b((j <= 0 || j2 <= 0) ? false : z2, "Must set times");
        this.f79300a = list;
        this.f79301b = j;
        this.f79302c = j2;
        this.f79303d = i;
        this.f79304e = bundle;
    }

    /* renamed from: a */
    private static boolean m66820a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if (bundle == null || bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (bundle2.containsKey(str)) {
                if (bundle.get(str) == null) {
                    if (bundle2.get(str) != null) {
                        return false;
                    }
                } else if (bundle.get(str) instanceof Bundle) {
                    if (!m66820a(bundle.getBundle(str), bundle2.getBundle(str))) {
                        return false;
                    }
                } else if (!bundle.get(str).equals(bundle2.get(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public ActivityRecognitionResult(List list, long j, long j2, Bundle bundle) {
        this(list, j, j2, 0, bundle);
    }

    /* renamed from: a */
    public final int mo43490a(int i) {
        for (DetectedActivity detectedActivity : this.f79300a) {
            if (detectedActivity.mo43513a() == i) {
                return detectedActivity.f79320e;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final DetectedActivity mo43492b() {
        for (int i = 0; i < this.f79300a.size(); i++) {
            DetectedActivity detectedActivity = (DetectedActivity) this.f79300a.get(i);
            if ((detectedActivity.f79319d != 2 || (mo43490a(7) <= 0 && mo43490a(8) <= 0)) && (detectedActivity.f79319d != 0 || (mo43490a(16) <= 0 && mo43490a(17) <= 0))) {
                return detectedActivity;
            }
        }
        return (DetectedActivity) this.f79300a.get(0);
    }

    /* renamed from: a */
    public final DetectedActivity mo43491a() {
        return (DetectedActivity) this.f79300a.get(0);
    }
}
