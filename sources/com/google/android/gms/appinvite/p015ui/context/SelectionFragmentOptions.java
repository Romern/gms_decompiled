package com.google.android.gms.appinvite.p015ui.context;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

@Deprecated
/* renamed from: com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectionFragmentOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fxf();

    /* renamed from: a */
    public final String f9772a;

    /* renamed from: b */
    public final int f9773b;

    /* renamed from: c */
    public final ArrayList f9774c;

    /* renamed from: d */
    public final boolean f9775d;

    /* renamed from: e */
    public final String[] f9776e;

    /* renamed from: f */
    public final int f9777f;

    /* renamed from: g */
    public final int f9778g;

    /* renamed from: h */
    public final String f9779h;
    @Deprecated

    /* renamed from: i */
    public final String f9780i;

    /* renamed from: j */
    public final boolean f9781j;

    /* renamed from: k */
    public final ArrayList f9782k;

    /* renamed from: l */
    public final boolean f9783l;

    /* renamed from: m */
    public final boolean f9784m;

    /* renamed from: n */
    public final Bundle f9785n;

    public SelectionFragmentOptions(String str, int i, ArrayList arrayList, boolean z, String[] strArr, int i2, int i3, String str2, String str3, boolean z2, ArrayList arrayList2, boolean z3, boolean z4, Bundle bundle) {
        this.f9772a = str;
        this.f9773b = i;
        this.f9774c = arrayList;
        this.f9775d = z;
        this.f9776e = strArr;
        this.f9777f = i2;
        this.f9778g = i3;
        this.f9779h = str2;
        this.f9780i = str3;
        this.f9781j = z2;
        this.f9782k = arrayList2;
        this.f9783l = z3;
        this.f9784m = z4;
        this.f9785n = bundle;
    }

    /* renamed from: a */
    public static final void m6217a(Bundle bundle, String str, String[] strArr, String str2, String str3) {
        bundle.putString("source", str);
        bundle.putStringArray("methodOrder", strArr);
        bundle.putString("loaderOptions", str2);
        bundle.putString("headerText", str3);
        bundle.putBoolean("includeInSearch", true);
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
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
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
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f9772a, false);
        see.m35063b(parcel, 3, this.f9773b);
        see.m35066c(parcel, 4, this.f9774c, false);
        see.m35051a(parcel, 5, this.f9775d);
        see.m35058a(parcel, 6, this.f9776e, false);
        see.m35063b(parcel, 7, this.f9777f);
        see.m35063b(parcel, 8, this.f9778g);
        see.m35046a(parcel, 9, this.f9779h, false);
        see.m35046a(parcel, 10, this.f9780i, false);
        see.m35051a(parcel, 11, this.f9781j);
        see.m35066c(parcel, 12, this.f9782k, false);
        see.m35051a(parcel, 13, this.f9783l);
        see.m35051a(parcel, 14, this.f9784m);
        see.m35037a(parcel, 15, this.f9785n, false);
        see.m35062b(parcel, a);
    }
}
