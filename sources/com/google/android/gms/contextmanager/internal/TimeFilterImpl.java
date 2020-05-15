package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimeFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tnb();

    /* renamed from: a */
    public final ArrayList f30699a;

    /* renamed from: b */
    public final int[] f30700b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Interval extends AbstractSafeParcelable implements tnd {
        public static final Parcelable.Creator CREATOR = new tnc();

        /* renamed from: a */
        public final long f30701a;

        /* renamed from: b */
        public final long f30702b;

        public Interval(long j, long j2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (j >= -1) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            if (j2 > -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34974b(z2);
            if (j != -1) {
                sdo.m34974b(j > j2 ? false : z3);
            }
            this.f30701a = j;
            this.f30702b = j2;
        }

        /* renamed from: a */
        public final boolean mo18094a() {
            return this.f30701a != -1;
        }

        /* renamed from: b */
        public final boolean mo18095b() {
            return this.f30702b != Long.MAX_VALUE;
        }

        /* renamed from: c */
        public final long mo18096c() {
            return this.f30701a;
        }

        /* renamed from: d */
        public final long mo18097d() {
            return this.f30702b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Interval) {
                Interval interval = (Interval) obj;
                return this.f30701a == interval.f30701a && this.f30702b == interval.f30702b;
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f30701a), Long.valueOf(this.f30702b)});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35036a(parcel, 2, this.f30701a);
            see.m35036a(parcel, 3, this.f30702b);
            see.m35062b(parcel, a);
        }
    }

    public TimeFilterImpl(ArrayList arrayList, int[] iArr) {
        this.f30699a = arrayList;
        this.f30700b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeFilterImpl) {
            TimeFilterImpl timeFilterImpl = (TimeFilterImpl) obj;
            return sdg.m34949a(this.f30699a, timeFilterImpl.f30699a) && sdg.m34949a(this.f30700b, timeFilterImpl.f30700b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30699a, this.f30700b});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f30699a, false);
        see.m35055a(parcel, 3, this.f30700b, false);
        see.m35062b(parcel, a);
    }
}
