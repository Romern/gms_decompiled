package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppIndexingErrorInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new apmb();

    /* renamed from: a */
    public String f107345a;

    /* renamed from: b */
    public int f107346b;

    /* renamed from: c */
    public int f107347c;

    /* renamed from: d */
    public String f107348d;

    /* renamed from: e */
    public long f107349e;

    /* renamed from: f */
    public Thing f107350f;

    /* renamed from: g */
    public ActionImpl f107351g;

    public AppIndexingErrorInfo() {
    }

    public AppIndexingErrorInfo(String str, int i, int i2, String str2, long j, Thing thing, ActionImpl actionImpl) {
        this.f107345a = str;
        this.f107346b = i;
        this.f107347c = i2;
        this.f107348d = str2;
        this.f107349e = j;
        this.f107350f = thing;
        this.f107351g = actionImpl;
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
        see.m35046a(parcel, 1, this.f107345a, false);
        see.m35063b(parcel, 2, this.f107346b);
        see.m35063b(parcel, 3, this.f107347c);
        see.m35046a(parcel, 4, this.f107348d, false);
        see.m35036a(parcel, 5, this.f107349e);
        see.m35040a(parcel, 6, this.f107350f, i, false);
        see.m35040a(parcel, 7, this.f107351g, i, false);
        see.m35062b(parcel, a);
    }
}
