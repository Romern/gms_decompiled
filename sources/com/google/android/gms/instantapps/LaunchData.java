package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LaunchData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adeg();

    /* renamed from: a */
    public final Intent f79137a;

    /* renamed from: b */
    public final String f79138b;

    /* renamed from: c */
    public final String f79139c;

    /* renamed from: d */
    final BitmapTeleporter f79140d;

    public LaunchData(Intent intent, String str, String str2, BitmapTeleporter bitmapTeleporter) {
        this.f79137a = intent;
        this.f79138b = str;
        this.f79139c = str2;
        this.f79140d = bitmapTeleporter;
        if (bitmapTeleporter != null) {
            bitmapTeleporter.mo17759a();
        }
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
        see.m35040a(parcel, 2, this.f79137a, i, false);
        see.m35046a(parcel, 3, this.f79138b, false);
        see.m35046a(parcel, 4, this.f79139c, false);
        see.m35040a(parcel, 5, this.f79140d, i, false);
        see.m35062b(parcel, a);
    }
}
