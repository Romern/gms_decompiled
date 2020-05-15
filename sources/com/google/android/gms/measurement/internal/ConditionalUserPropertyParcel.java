package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConditionalUserPropertyParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agdf();

    /* renamed from: a */
    public String f80120a;

    /* renamed from: b */
    public String f80121b;

    /* renamed from: c */
    public UserAttributeParcel f80122c;

    /* renamed from: d */
    public long f80123d;

    /* renamed from: e */
    public boolean f80124e;

    /* renamed from: f */
    public String f80125f;

    /* renamed from: g */
    public EventParcel f80126g;

    /* renamed from: h */
    public long f80127h;

    /* renamed from: i */
    public EventParcel f80128i;

    /* renamed from: j */
    public long f80129j;

    /* renamed from: k */
    public EventParcel f80130k;

    public ConditionalUserPropertyParcel(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        sdo.m34959a(conditionalUserPropertyParcel);
        this.f80120a = conditionalUserPropertyParcel.f80120a;
        this.f80121b = conditionalUserPropertyParcel.f80121b;
        this.f80122c = conditionalUserPropertyParcel.f80122c;
        this.f80123d = conditionalUserPropertyParcel.f80123d;
        this.f80124e = conditionalUserPropertyParcel.f80124e;
        this.f80125f = conditionalUserPropertyParcel.f80125f;
        this.f80126g = conditionalUserPropertyParcel.f80126g;
        this.f80127h = conditionalUserPropertyParcel.f80127h;
        this.f80128i = conditionalUserPropertyParcel.f80128i;
        this.f80129j = conditionalUserPropertyParcel.f80129j;
        this.f80130k = conditionalUserPropertyParcel.f80130k;
    }

    public ConditionalUserPropertyParcel(String str, String str2, UserAttributeParcel userAttributeParcel, long j, boolean z, String str3, EventParcel eventParcel, long j2, EventParcel eventParcel2, long j3, EventParcel eventParcel3) {
        this.f80120a = str;
        this.f80121b = str2;
        this.f80122c = userAttributeParcel;
        this.f80123d = j;
        this.f80124e = z;
        this.f80125f = str3;
        this.f80126g = eventParcel;
        this.f80127h = j2;
        this.f80128i = eventParcel2;
        this.f80129j = j3;
        this.f80130k = eventParcel3;
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
        see.m35046a(parcel, 2, this.f80120a, false);
        see.m35046a(parcel, 3, this.f80121b, false);
        see.m35040a(parcel, 4, this.f80122c, i, false);
        see.m35036a(parcel, 5, this.f80123d);
        see.m35051a(parcel, 6, this.f80124e);
        see.m35046a(parcel, 7, this.f80125f, false);
        see.m35040a(parcel, 8, this.f80126g, i, false);
        see.m35036a(parcel, 9, this.f80127h);
        see.m35040a(parcel, 10, this.f80128i, i, false);
        see.m35036a(parcel, 11, this.f80129j);
        see.m35040a(parcel, 12, this.f80130k, i, false);
        see.m35062b(parcel, a);
    }
}
