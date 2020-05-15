package com.google.android.gms.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppUsageIntervals extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gau();

    /* renamed from: a */
    public final List f9816a;

    /* renamed from: b */
    public final List f9817b;

    /* renamed from: c */
    public final List f9818c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Interval extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new gaw();

        /* renamed from: a */
        public final int f9819a;

        /* renamed from: b */
        public final long f9820b;

        /* renamed from: c */
        public final long f9821c;

        public Interval(int i, long j, long j2) {
            this.f9819a = i;
            this.f9820b = j;
            this.f9821c = j2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f9819a);
            see.m35036a(parcel, 2, this.f9820b);
            see.m35036a(parcel, 3, this.f9821c);
            see.m35062b(parcel, a);
        }
    }

    public AppUsageIntervals(List list, List list2, List list3) {
        this.f9816a = list;
        this.f9817b = list2;
        this.f9818c = list3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 1, this.f9816a, false);
        see.m35049a(parcel, 2, this.f9817b, false);
        see.m35066c(parcel, 3, this.f9818c, false);
        see.m35062b(parcel, a);
    }
}
