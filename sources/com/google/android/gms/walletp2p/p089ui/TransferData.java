package com.google.android.gms.walletp2p.p089ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.walletp2p.ui.TransferData */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransferData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axoh();

    /* renamed from: a */
    public final String f110857a;

    /* renamed from: b */
    public final String f110858b;

    /* renamed from: c */
    public final long f110859c;

    public TransferData(String str, String str2, long j) {
        this.f110857a = str;
        this.f110858b = str2;
        this.f110859c = j;
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
        see.m35046a(parcel, 1, this.f110857a, false);
        see.m35046a(parcel, 2, this.f110858b, false);
        see.m35036a(parcel, 3, this.f110859c);
        see.m35062b(parcel, a);
    }
}
