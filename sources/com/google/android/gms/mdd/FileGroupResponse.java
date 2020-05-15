package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FileGroupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afjf();

    /* renamed from: a */
    public final String f79961a;

    /* renamed from: b */
    public final String f79962b;

    /* renamed from: c */
    public final List f79963c;

    /* renamed from: d */
    public final int f79964d;

    public FileGroupResponse(String str, String str2, int i, List list) {
        this.f79961a = str;
        this.f79962b = str2;
        this.f79963c = list;
        this.f79964d = i;
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
        see.m35046a(parcel, 1, this.f79961a, false);
        see.m35066c(parcel, 2, this.f79963c, false);
        see.m35046a(parcel, 3, this.f79962b, false);
        see.m35063b(parcel, 4, this.f79964d);
        see.m35062b(parcel, a);
    }
}
