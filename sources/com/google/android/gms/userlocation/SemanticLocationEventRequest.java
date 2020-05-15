package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SemanticLocationEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avwh();

    /* renamed from: a */
    public final String f109579a;

    /* renamed from: b */
    public final int f109580b;

    /* renamed from: c */
    public final EstimationOptions f109581c;

    /* renamed from: d */
    public final int f109582d;

    public SemanticLocationEventRequest(String str, int i, EstimationOptions estimationOptions, int i2) {
        this.f109579a = str;
        this.f109580b = i;
        this.f109581c = estimationOptions;
        this.f109582d = i2;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("requestId", this.f109579a);
        a.mo25396a("priority", Integer.valueOf(this.f109580b));
        a.mo25396a("eventTypes", Integer.valueOf(this.f109582d));
        a.mo25396a("options", this.f109581c);
        return a.toString();
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
        see.m35046a(parcel, 1, this.f109579a, false);
        see.m35063b(parcel, 2, this.f109580b);
        see.m35040a(parcel, 3, this.f109581c, i, false);
        see.m35063b(parcel, 4, this.f109582d);
        see.m35062b(parcel, a);
    }
}
