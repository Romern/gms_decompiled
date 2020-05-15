package com.google.android.gms.userlocation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserLocationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avxo();

    /* renamed from: a */
    public final String f109604a;

    /* renamed from: b */
    public final UserLocationClientIdentifier f109605b;

    /* renamed from: c */
    public final List f109606c;

    public UserLocationParameters(String str, UserLocationClientIdentifier userLocationClientIdentifier, List list) {
        this.f109604a = str;
        this.f109605b = userLocationClientIdentifier;
        this.f109606c = list;
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
        see.m35046a(parcel, 1, this.f109604a, false);
        see.m35040a(parcel, 2, this.f109605b, i, false);
        see.m35065b(parcel, 3, this.f109606c, false);
        see.m35062b(parcel, a);
    }
}
