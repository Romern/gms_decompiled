package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckRealNameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iwk();

    /* renamed from: a */
    final int f10602a;

    /* renamed from: b */
    public AppDescription f10603b;

    /* renamed from: c */
    public String f10604c;

    /* renamed from: d */
    public String f10605d;

    public CheckRealNameRequest() {
        this.f10602a = 1;
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
        see.m35063b(parcel, 1, this.f10602a);
        see.m35040a(parcel, 2, this.f10603b, i, false);
        see.m35046a(parcel, 3, this.f10604c, false);
        see.m35046a(parcel, 4, this.f10605d, false);
        see.m35062b(parcel, a);
    }

    public CheckRealNameRequest(int i, AppDescription appDescription, String str, String str2) {
        this.f10602a = i;
        this.f10603b = appDescription;
        this.f10604c = str;
        this.f10605d = str2;
    }
}
