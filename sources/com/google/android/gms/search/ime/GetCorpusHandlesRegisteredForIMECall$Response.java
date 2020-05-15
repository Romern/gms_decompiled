package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetCorpusHandlesRegisteredForIMECall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apqw();

    /* renamed from: a */
    public Status f107438a;

    /* renamed from: b */
    public String[] f107439b;

    public GetCorpusHandlesRegisteredForIMECall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107438a;
    }

    public GetCorpusHandlesRegisteredForIMECall$Response(Status status, String[] strArr) {
        this.f107438a = status;
        this.f107439b = strArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107438a, i, false);
        see.m35058a(parcel, 2, this.f107439b, false);
        see.m35062b(parcel, a);
    }
}
