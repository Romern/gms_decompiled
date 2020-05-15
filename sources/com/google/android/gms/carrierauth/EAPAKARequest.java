package com.google.android.gms.carrierauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EAPAKARequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new oqi();

    /* renamed from: a */
    public final String f29528a;

    /* renamed from: b */
    public final Integer f29529b;

    /* renamed from: c */
    public final Integer f29530c;

    /* renamed from: d */
    public final Integer f29531d;

    public EAPAKARequest(String str, Integer num, Integer num2, Integer num3) {
        this.f29528a = str;
        this.f29529b = num;
        this.f29530c = num2;
        this.f29531d = num3;
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
        see.m35046a(parcel, 1, this.f29528a, false);
        see.m35044a(parcel, 2, this.f29529b);
        see.m35044a(parcel, 3, this.f29530c);
        see.m35044a(parcel, 4, this.f29531d);
        see.m35062b(parcel, a);
    }
}
