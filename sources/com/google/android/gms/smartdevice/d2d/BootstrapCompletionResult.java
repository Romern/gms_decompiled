package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BootstrapCompletionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aqyo();

    /* renamed from: a */
    public final int f107801a;

    /* renamed from: b */
    public final String f107802b;

    /* renamed from: c */
    public final ArrayList f107803c;

    /* renamed from: d */
    public final BootstrapAccount f107804d;

    /* renamed from: e */
    public final ArrayList f107805e;

    /* renamed from: f */
    public final int f107806f;

    /* renamed from: g */
    public final long f107807g;

    public BootstrapCompletionResult(int i, String str, ArrayList arrayList, BootstrapAccount bootstrapAccount, ArrayList arrayList2, int i2, long j) {
        this.f107801a = i;
        this.f107802b = str;
        this.f107803c = arrayList;
        this.f107804d = bootstrapAccount;
        this.f107805e = arrayList2;
        this.f107806f = i2;
        this.f107807g = j;
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
        see.m35063b(parcel, 2, this.f107801a);
        see.m35046a(parcel, 3, this.f107802b, false);
        see.m35066c(parcel, 4, this.f107803c, false);
        see.m35040a(parcel, 5, this.f107804d, i, false);
        see.m35066c(parcel, 6, this.f107805e, false);
        see.m35063b(parcel, 7, this.f107806f);
        see.m35036a(parcel, 8, this.f107807g);
        see.m35062b(parcel, a);
    }
}
