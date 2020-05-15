package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avum();

    /* renamed from: a */
    public int f109538a;

    /* renamed from: b */
    public boolean f109539b;

    /* renamed from: c */
    public final List f109540c;

    /* renamed from: d */
    public int f109541d;

    /* renamed from: e */
    public String f109542e;

    /* renamed from: f */
    public boolean f109543f;

    public UsageReportingOptInOptions(int i) {
        this.f109540c = new ArrayList();
        this.f109538a = i;
    }

    /* renamed from: a */
    public static avul m93763a() {
        return new avul();
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
        see.m35063b(parcel, 2, this.f109538a);
        see.m35051a(parcel, 3, this.f109539b);
        see.m35065b(parcel, 4, this.f109540c, false);
        see.m35063b(parcel, 5, this.f109541d);
        see.m35046a(parcel, 6, this.f109542e, false);
        see.m35051a(parcel, 7, this.f109543f);
        see.m35062b(parcel, a);
    }

    public UsageReportingOptInOptions(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.f109540c = arrayList;
        this.f109538a = i;
        this.f109539b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f109541d = i2;
        this.f109542e = str;
        this.f109543f = z2;
    }
}
