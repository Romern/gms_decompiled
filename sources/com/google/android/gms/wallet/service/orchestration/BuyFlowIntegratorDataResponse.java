package com.google.android.gms.wallet.service.orchestration;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BuyFlowIntegratorDataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awtg();

    /* renamed from: a */
    public byte[] f110375a;

    /* renamed from: b */
    public byte[] f110376b;

    /* renamed from: c */
    public byte[] f110377c;

    /* renamed from: d */
    public PendingIntent f110378d;

    /* renamed from: e */
    public int f110379e;

    BuyFlowIntegratorDataResponse() {
        this(new byte[0], new byte[0], new byte[0], null, 1);
    }

    /* renamed from: a */
    public static awtf m94147a() {
        return new awtf(new BuyFlowIntegratorDataResponse(new byte[0], new byte[0], new byte[0], null, 1));
    }

    public BuyFlowIntegratorDataResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, PendingIntent pendingIntent, int i) {
        this.f110375a = bArr;
        this.f110376b = bArr2;
        this.f110377c = bArr3;
        this.f110378d = pendingIntent;
        this.f110379e = i;
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
        see.m35052a(parcel, 2, this.f110376b, false);
        see.m35052a(parcel, 3, this.f110377c, false);
        see.m35040a(parcel, 4, this.f110378d, i, false);
        see.m35063b(parcel, 5, this.f110379e);
        see.m35052a(parcel, 6, this.f110375a, false);
        see.m35062b(parcel, a);
    }
}
