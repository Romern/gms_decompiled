package com.google.android.gms.fitness.store.listener;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataUpdateListener extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zsk();

    /* renamed from: a */
    public final String f32449a;

    /* renamed from: b */
    public final String f32450b;

    /* renamed from: c */
    public final DataSource f32451c;

    /* renamed from: d */
    public final DataType f32452d;

    /* renamed from: e */
    public final PendingIntent f32453e;

    public DataUpdateListener(String str, String str2, DataSource dataSource, DataType dataType, PendingIntent pendingIntent) {
        boolean z = true;
        if (dataSource == null && dataType == null) {
            z = false;
        }
        bmxy.m108600b(z);
        this.f32449a = str;
        this.f32450b = str2;
        this.f32451c = dataSource;
        this.f32452d = dataType;
        this.f32453e = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DataUpdateListener)) {
                return false;
            }
            DataUpdateListener dataUpdateListener = (DataUpdateListener) obj;
            if (!bmxi.m108538a(this.f32449a, dataUpdateListener.f32449a) || !bmxi.m108538a(this.f32450b, dataUpdateListener.f32450b) || !bmxi.m108538a(this.f32451c, dataUpdateListener.f32451c) || !bmxi.m108538a(this.f32452d, dataUpdateListener.f32452d) || !bmxi.m108538a(this.f32453e, dataUpdateListener.f32453e)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32449a, this.f32450b, this.f32451c, this.f32452d, this.f32453e});
    }

    public final String toString() {
        return String.format("DataUpdateListener{accountName=%s, packageName=%s, dataSource=%s, dataType=%s, pendingIntent=%s}", this.f32449a, this.f32450b, this.f32451c, this.f32452d, this.f32453e);
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
        see.m35046a(parcel, 1, this.f32449a, false);
        see.m35046a(parcel, 2, this.f32450b, false);
        see.m35040a(parcel, 3, this.f32451c, i, false);
        see.m35040a(parcel, 4, this.f32452d, i, false);
        see.m35040a(parcel, 5, this.f32453e, i, false);
        see.m35062b(parcel, a);
    }
}
