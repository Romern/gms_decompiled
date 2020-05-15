package com.google.android.gms.auth.firstparty.shared;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LatencyTracker extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ize();

    /* renamed from: a */
    final int f10869a;

    /* renamed from: b */
    final String f10870b;

    /* renamed from: c */
    final long f10871c;

    /* renamed from: d */
    public final LatencyTracker f10872d;

    public LatencyTracker(int i, String str, long j, LatencyTracker latencyTracker) {
        this.f10869a = i;
        this.f10870b = str;
        this.f10871c = j;
        this.f10872d = latencyTracker;
    }

    /* renamed from: a */
    public static LatencyTracker m6593a(String str) {
        return new LatencyTracker(1, str, SystemClock.elapsedRealtime(), null);
    }

    /* renamed from: b */
    public final LatencyTracker mo7691b(String str) {
        return new LatencyTracker(1, str, SystemClock.elapsedRealtime(), this);
    }

    /* renamed from: a */
    public final void mo7690a(Intent intent) {
        intent.putExtra("latency.tracker", this);
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
        see.m35063b(parcel, 1, this.f10869a);
        see.m35046a(parcel, 2, this.f10870b, false);
        see.m35036a(parcel, 3, this.f10871c);
        see.m35040a(parcel, 4, this.f10872d, i, false);
        see.m35062b(parcel, a);
    }
}
