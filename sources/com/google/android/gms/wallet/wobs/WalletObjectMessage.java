package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axdv();

    /* renamed from: a */
    public String f110637a;

    /* renamed from: b */
    public String f110638b;

    /* renamed from: c */
    public TimeInterval f110639c;
    @Deprecated

    /* renamed from: d */
    UriData f110640d;
    @Deprecated

    /* renamed from: e */
    UriData f110641e;

    WalletObjectMessage() {
    }

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.f110637a = str;
        this.f110638b = str2;
        this.f110639c = timeInterval;
        this.f110640d = uriData;
        this.f110641e = uriData2;
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
        see.m35046a(parcel, 2, this.f110637a, false);
        see.m35046a(parcel, 3, this.f110638b, false);
        see.m35040a(parcel, 4, this.f110639c, i, false);
        see.m35040a(parcel, 5, this.f110640d, i, false);
        see.m35040a(parcel, 6, this.f110641e, i, false);
        see.m35062b(parcel, a);
    }
}
