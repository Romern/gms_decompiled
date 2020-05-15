package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FloorChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aegn();

    /* renamed from: a */
    public final int f79334a;

    /* renamed from: b */
    public final int f79335b;

    /* renamed from: c */
    public final long f79336c;

    /* renamed from: d */
    public final long f79337d;

    /* renamed from: e */
    public final long f79338e;

    /* renamed from: f */
    public final long f79339f;

    /* renamed from: g */
    public final float f79340g;

    public FloorChangeEvent(int i, int i2, long j, long j2, long j3, long j4, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3 = i2;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        boolean z8 = true;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "confidence must be equal to or greater than 0");
        if (i3 <= 100) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "confidence must be equal to or less than 100");
        if (j5 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34975b(z3, "startTimeMillis must be greater than 0");
        if (j5 <= j6) {
            z4 = true;
        } else {
            z4 = false;
        }
        sdo.m34975b(z4, "endTimeMillis must be equal to or greater than startTimeMillis");
        if (j7 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        sdo.m34975b(z5, "startElapsedRealtimeMillis must be equal to or greater than 0");
        if (j7 <= j8) {
            z6 = true;
        } else {
            z6 = false;
        }
        sdo.m34975b(z6, "endElapsedRealtimeMillis must be equal to or greater than startElapsedRealtimeMillis");
        if (j7 < j5) {
            z7 = true;
        } else {
            z7 = false;
        }
        sdo.m34975b(z7, "startTimeMillis must be greater than startElapsedRealtimeMillis");
        sdo.m34975b(j8 >= j6 ? false : z8, "endTimeMillis must be greater than endElapsedRealtimeMillis");
        this.f79334a = i;
        this.f79335b = i3;
        this.f79336c = j5;
        this.f79337d = j6;
        this.f79338e = j7;
        this.f79339f = j8;
        this.f79340g = f;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "FloorChangeEvent [type=%d, confidence=%d, elevationChange=%f, startTimeMillis=%d, endTimeMillis=%d, startElapsedRealtimeMillis=%d, endElapsedRealtimeMillis=%d]", Integer.valueOf(this.f79334a), Integer.valueOf(this.f79335b), Float.valueOf(this.f79340g), Long.valueOf(this.f79336c), Long.valueOf(this.f79337d), Long.valueOf(this.f79338e), Long.valueOf(this.f79339f));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79334a);
        see.m35063b(parcel, 2, this.f79335b);
        see.m35036a(parcel, 3, this.f79336c);
        see.m35036a(parcel, 4, this.f79337d);
        see.m35036a(parcel, 5, this.f79338e);
        see.m35036a(parcel, 6, this.f79339f);
        see.m35034a(parcel, 7, this.f79340g);
        see.m35062b(parcel, a);
    }
}
