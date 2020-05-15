package com.google.android.gms.lockbox.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockboxOptInFlags extends AbstractSafeParcelable implements aeyi {
    public static final Parcelable.Creator CREATOR = new aezl();

    /* renamed from: a */
    public final String f79796a;

    /* renamed from: b */
    public final boolean f79797b;

    /* renamed from: c */
    public final boolean f79798c;

    public LockboxOptInFlags(String str, boolean z, boolean z2) {
        this.f79796a = str;
        this.f79797b = z;
        this.f79798c = z2;
    }

    /* renamed from: b */
    public final String mo34650b() {
        return this.f79796a;
    }

    /* renamed from: c */
    public final boolean mo34651c() {
        return this.f79797b;
    }

    /* renamed from: d */
    public final boolean mo34652d() {
        return this.f79798c;
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
        see.m35046a(parcel, 2, this.f79796a, false);
        see.m35051a(parcel, 3, this.f79797b);
        see.m35051a(parcel, 4, this.f79798c);
        see.m35062b(parcel, a);
    }
}
