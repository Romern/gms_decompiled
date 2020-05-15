package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afvr();

    /* renamed from: a */
    public final afrg f80029a;

    /* renamed from: b */
    public final byte[] f80030b;

    /* renamed from: c */
    public final SyncOptions f80031c;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions) {
        afrg a = afrg.m53475a(i);
        this.f80029a = a == null ? afrg.UNKNOWN : a;
        this.f80030b = bArr;
        this.f80031c = syncOptions;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80029a.f64622e);
        see.m35052a(parcel, 2, this.f80030b, false);
        see.m35040a(parcel, 3, this.f80031c, i, false);
        see.m35062b(parcel, a);
    }
}
