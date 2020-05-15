package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyRegistrationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ipe();

    /* renamed from: a */
    final int f10541a;

    /* renamed from: b */
    public final Status f10542b;

    /* renamed from: c */
    public final byte[] f10543c;

    /* renamed from: d */
    public final List f10544d;

    public KeyRegistrationResult(int i, Status status, byte[] bArr, List list) {
        this.f10541a = i;
        this.f10542b = status;
        this.f10543c = bArr;
        this.f10544d = list;
    }

    public KeyRegistrationResult(Status status, byte[] bArr, List list) {
        this(1, status, bArr, list);
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
        see.m35063b(parcel, 1, this.f10541a);
        see.m35040a(parcel, 2, this.f10542b, i, false);
        see.m35052a(parcel, 3, this.f10543c, false);
        see.m35066c(parcel, 4, this.f10544d, false);
        see.m35062b(parcel, a);
    }
}
