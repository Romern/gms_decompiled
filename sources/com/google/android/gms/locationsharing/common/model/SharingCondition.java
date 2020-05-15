package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SharingCondition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aeth();

    /* renamed from: a */
    public final int f79643a;

    /* renamed from: b */
    public final long f79644b;

    /* renamed from: c */
    public final Destination f79645c;

    /* renamed from: d */
    public final long f79646d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Destination extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new aeta();

        /* renamed from: a */
        public final String f79647a;

        /* renamed from: b */
        public final FeatureId f79648b;

        /* renamed from: c */
        public final LatLng f79649c;

        /* renamed from: d */
        public final long f79650d;

        public Destination(String str, FeatureId featureId, LatLng latLng, long j) {
            this.f79647a = str;
            this.f79648b = featureId;
            this.f79649c = latLng;
            this.f79650d = j;
        }

        /* renamed from: a */
        public static Destination m67023a(String str, long j, FeatureId featureId) {
            return new Destination(str, featureId, null, j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Destination destination = (Destination) obj;
                return sdg.m34949a(this.f79647a, destination.f79647a) && sdg.m34949a(this.f79648b, destination.f79648b) && sdg.m34949a(this.f79649c, destination.f79649c) && sdg.m34949a(Long.valueOf(this.f79650d), Long.valueOf(destination.f79650d));
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f79647a, this.f79648b, this.f79649c, Long.valueOf(this.f79650d)});
        }

        /* renamed from: a */
        public static Destination m67024a(String str, long j, LatLng latLng) {
            return new Destination(str, null, latLng, j);
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
            see.m35046a(parcel, 2, this.f79647a, false);
            see.m35040a(parcel, 3, this.f79648b, i, false);
            see.m35040a(parcel, 4, this.f79649c, i, false);
            see.m35036a(parcel, 5, this.f79650d);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class FeatureId extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new aetb();

        /* renamed from: a */
        public final long f79651a;

        /* renamed from: b */
        public final long f79652b;

        public FeatureId(long j, long j2) {
            this.f79651a = j;
            this.f79652b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                FeatureId featureId = (FeatureId) obj;
                return this.f79651a == featureId.f79651a && this.f79652b == featureId.f79652b;
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f79651a), Long.valueOf(this.f79652b)});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35036a(parcel, 2, this.f79651a);
            see.m35036a(parcel, 3, this.f79652b);
            see.m35062b(parcel, a);
        }
    }

    public SharingCondition(int i, long j, Destination destination, long j2) {
        this.f79643a = i;
        this.f79644b = j;
        this.f79645c = destination;
        this.f79646d = j2;
    }

    /* renamed from: a */
    public static SharingCondition m67018a() {
        return new SharingCondition(0, -1, null, SystemClock.elapsedRealtime());
    }

    /* renamed from: b */
    public final long mo43780b() {
        if (mo43781c() != 2) {
            return -1;
        }
        return TimeUnit.MINUTES.toMillis(TimeUnit.MILLISECONDS.toMinutes((this.f79644b - (SystemClock.elapsedRealtime() - this.f79646d)) - 1) + 1);
    }

    /* renamed from: c */
    public final int mo43781c() {
        return new int[]{1, 2, 3}[this.f79643a];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SharingCondition) {
            SharingCondition sharingCondition = (SharingCondition) obj;
            return this.f79643a == sharingCondition.f79643a && this.f79644b == sharingCondition.f79644b && sdg.m34949a(this.f79645c, sharingCondition.f79645c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79643a), Long.valueOf(this.f79644b), this.f79645c});
    }

    /* renamed from: a */
    public static SharingCondition m67019a(long j) {
        return new SharingCondition(1, j, null, SystemClock.elapsedRealtime());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79643a);
        see.m35036a(parcel, 2, this.f79644b);
        see.m35040a(parcel, 3, this.f79645c, i, false);
        see.m35036a(parcel, 4, this.f79646d);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static SharingCondition m67020a(Destination destination) {
        return new SharingCondition(2, -1, destination, SystemClock.elapsedRealtime());
    }
}
