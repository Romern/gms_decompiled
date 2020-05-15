package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aegj();

    /* renamed from: a */
    public static final Comparator f79316a = new aegi();

    /* renamed from: b */
    public static final int[] f79317b = {9, 10};

    /* renamed from: c */
    public static final int[] f79318c = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 21, 22};

    /* renamed from: d */
    int f79319d;

    /* renamed from: e */
    public int f79320e;

    public DetectedActivity(int i, int i2) {
        this.f79319d = i;
        this.f79320e = i2;
    }

    /* renamed from: a */
    public static String m66831a(int i) {
        if (i == 0) {
            return "IN_VEHICLE";
        }
        if (i == 1) {
            return "ON_BICYCLE";
        }
        if (i == 2) {
            return "ON_FOOT";
        }
        if (i == 3) {
            return "STILL";
        }
        if (i == 4) {
            return "UNKNOWN";
        }
        if (i == 5) {
            return "TILTING";
        }
        if (i == 7) {
            return "WALKING";
        }
        if (i == 8) {
            return "RUNNING";
        }
        if (i != 16) {
            return i != 17 ? Integer.toString(i) : "IN_RAIL_VEHICLE";
        }
        return "IN_ROAD_VEHICLE";
    }

    /* renamed from: a */
    public static boolean m66832a(int i, boolean z) {
        return (!z && i == 0) || i == 16 || i == 17;
    }

    /* renamed from: b */
    public static boolean m66833b(int i) {
        return m66832a(i, true);
    }

    /* renamed from: a */
    public final int mo43513a() {
        int i = this.f79319d;
        if (i <= 22 && i >= 0) {
            return i;
        }
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f79319d == detectedActivity.f79319d && this.f79320e == detectedActivity.f79320e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79319d), Integer.valueOf(this.f79320e)});
    }

    public final String toString() {
        String a = m66831a(mo43513a());
        int i = this.f79320e;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(a);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79319d);
        see.m35063b(parcel, 2, this.f79320e);
        see.m35062b(parcel, a);
    }
}
