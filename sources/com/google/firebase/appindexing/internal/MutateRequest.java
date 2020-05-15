package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MutateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brjb();

    /* renamed from: a */
    public final int f152362a;

    /* renamed from: b */
    public final Thing[] f152363b;

    /* renamed from: c */
    public final String[] f152364c;

    /* renamed from: d */
    public final String[] f152365d;

    /* renamed from: e */
    public final ActionImpl f152366e;

    /* renamed from: f */
    public final String f152367f;

    /* renamed from: g */
    public final String f152368g;

    public MutateRequest(int i, Thing[] thingArr) {
        this(i, thingArr, null, null, null, null, null);
    }

    /* renamed from: a */
    public static MutateRequest m118866a(Thing... thingArr) {
        return new MutateRequest(1, thingArr);
    }

    /* renamed from: b */
    public static MutateRequest m118868b(Thing... thingArr) {
        return new MutateRequest(2, thingArr);
    }

    public MutateRequest(int i, Thing[] thingArr, String[] strArr, String[] strArr2, ActionImpl actionImpl, String str, String str2) {
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7)) {
            i = 0;
        }
        this.f152362a = i;
        this.f152363b = thingArr;
        this.f152364c = strArr;
        this.f152365d = strArr2;
        this.f152366e = actionImpl;
        this.f152367f = str;
        this.f152368g = str2;
    }

    /* renamed from: a */
    public static MutateRequest m118867a(String... strArr) {
        return new MutateRequest(3, null, strArr, null, null, null, null);
    }

    /* renamed from: b */
    public static MutateRequest m118869b(String... strArr) {
        return new MutateRequest(6, null, null, strArr, null, null, null);
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
        see.m35063b(parcel, 1, this.f152362a);
        see.m35057a(parcel, 2, this.f152363b, i);
        see.m35058a(parcel, 3, this.f152364c, false);
        see.m35058a(parcel, 5, this.f152365d, false);
        see.m35040a(parcel, 6, this.f152366e, i, false);
        see.m35046a(parcel, 7, this.f152367f, false);
        see.m35046a(parcel, 8, this.f152368g, false);
        see.m35062b(parcel, a);
    }
}
