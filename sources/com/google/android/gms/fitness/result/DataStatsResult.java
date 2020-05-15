package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataStatsResult extends AbstractSafeParcelable implements Closeable, rkk {
    public static final Parcelable.Creator CREATOR = new zfu();

    /* renamed from: a */
    public final Status f32342a;

    /* renamed from: b */
    public final List f32343b;

    /* renamed from: c */
    public final long f32344c;

    /* renamed from: d */
    public final String f32345d;

    /* renamed from: e */
    public final long f32346e;

    /* renamed from: f */
    public final DataHolder f32347f;

    public DataStatsResult(Status status, List list, long j, String str, long j2, DataHolder dataHolder) {
        this.f32342a = status;
        this.f32343b = list;
        this.f32344c = j;
        this.f32345d = str == null ? "" : str;
        this.f32346e = j2;
        this.f32347f = dataHolder;
    }

    /* renamed from: a */
    public static DataStatsResult m23718a(Status status) {
        return m23719a(status, Collections.emptyList(), -1, "", 0);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32342a;
    }

    public final void close() {
        DataHolder dataHolder = this.f32347f;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "DataStatsResult{%s %d sources}", this.f32342a, Integer.valueOf(this.f32343b.size()));
    }

    /* renamed from: a */
    public static DataStatsResult m23719a(Status status, List list, long j, String str, long j2) {
        return new DataStatsResult(status, list, j, str, j2, null);
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
        see.m35040a(parcel, 1, this.f32342a, i, false);
        see.m35066c(parcel, 2, this.f32343b, false);
        see.m35036a(parcel, 3, this.f32344c);
        see.m35046a(parcel, 4, this.f32345d, false);
        see.m35036a(parcel, 5, this.f32346e);
        see.m35040a(parcel, 6, this.f32347f, i, false);
        see.m35062b(parcel, a);
    }
}
