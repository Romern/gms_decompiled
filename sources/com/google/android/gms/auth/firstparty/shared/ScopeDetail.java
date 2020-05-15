package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScopeDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new izi();

    /* renamed from: a */
    final int f10897a;

    /* renamed from: b */
    public String f10898b;

    /* renamed from: c */
    public String f10899c;

    /* renamed from: d */
    public String f10900d;

    /* renamed from: e */
    public String f10901e;

    /* renamed from: f */
    public String f10902f;

    /* renamed from: g */
    List f10903g;

    /* renamed from: h */
    public FACLData f10904h;

    public ScopeDetail(int i, String str, String str2, String str3, String str4, String str5, List list, FACLData fACLData) {
        this.f10897a = i;
        this.f10898b = str;
        this.f10899c = str2;
        this.f10900d = str3;
        this.f10901e = str4;
        this.f10902f = str5;
        this.f10903g = list;
        this.f10904h = fACLData;
    }

    /* renamed from: a */
    public final List mo7704a() {
        return Collections.unmodifiableList(this.f10903g);
    }

    public ScopeDetail(String str, String str2, String str3, String str4, String str5, FACLData fACLData, List list) {
        this.f10897a = 1;
        this.f10902f = str;
        this.f10898b = str2;
        this.f10899c = str3;
        this.f10900d = str4;
        this.f10901e = str5;
        this.f10904h = fACLData;
        ArrayList arrayList = new ArrayList();
        this.f10903g = arrayList;
        arrayList.addAll(list);
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
        see.m35063b(parcel, 1, this.f10897a);
        see.m35046a(parcel, 2, this.f10898b, false);
        see.m35046a(parcel, 3, this.f10899c, false);
        see.m35046a(parcel, 4, this.f10900d, false);
        see.m35046a(parcel, 5, this.f10901e, false);
        see.m35046a(parcel, 6, this.f10902f, false);
        see.m35065b(parcel, 7, this.f10903g, false);
        see.m35040a(parcel, 8, this.f10904h, i, false);
        see.m35062b(parcel, a);
    }
}
