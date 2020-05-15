package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserMetadata extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new txj();

    /* renamed from: a */
    public final String f30749a;

    /* renamed from: b */
    public final String f30750b;

    /* renamed from: c */
    public final String f30751c;

    /* renamed from: d */
    public final boolean f30752d;

    /* renamed from: e */
    public final String f30753e;

    public UserMetadata(String str, String str2, String str3, boolean z, String str4) {
        this.f30749a = str;
        this.f30750b = str2;
        this.f30751c = str3;
        this.f30752d = z;
        this.f30753e = str4;
    }

    public final String toString() {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", this.f30749a, this.f30750b, this.f30751c, Boolean.valueOf(this.f30752d), this.f30753e);
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
        see.m35046a(parcel, 2, this.f30749a, false);
        see.m35046a(parcel, 3, this.f30750b, false);
        see.m35046a(parcel, 4, this.f30751c, false);
        see.m35051a(parcel, 5, this.f30752d);
        see.m35046a(parcel, 6, this.f30753e, false);
        see.m35062b(parcel, a);
    }
}
