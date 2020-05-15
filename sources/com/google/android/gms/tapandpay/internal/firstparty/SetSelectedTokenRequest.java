package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetSelectedTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asyv();

    /* renamed from: a */
    public String f108556a;

    /* renamed from: b */
    public long f108557b;

    /* renamed from: c */
    boolean f108558c;

    /* renamed from: d */
    public int f108559d;

    public SetSelectedTokenRequest(String str, long j, boolean z, int i) {
        this.f108556a = str;
        this.f108557b = j;
        this.f108558c = z;
        this.f108559d = i;
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
        see.m35046a(parcel, 2, this.f108556a, false);
        see.m35036a(parcel, 3, this.f108557b);
        see.m35051a(parcel, 4, this.f108558c);
        see.m35063b(parcel, 5, this.f108559d);
        see.m35062b(parcel, a);
    }
}
