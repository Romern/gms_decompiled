package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VisitedApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adgx();

    /* renamed from: a */
    BitmapTeleporter f79209a;

    /* renamed from: b */
    public String f79210b;

    /* renamed from: c */
    public String f79211c;

    /* renamed from: d */
    public String f79212d;

    /* renamed from: e */
    public String f79213e;

    /* renamed from: f */
    public ContentRating f79214f;

    /* renamed from: g */
    private ArrayList f79215g;

    public VisitedApplication(BitmapTeleporter bitmapTeleporter, String str, String str2, String str3, String str4, Collection collection, ContentRating contentRating) {
        int i;
        this.f79209a = bitmapTeleporter;
        this.f79210b = str;
        this.f79211c = str2;
        this.f79212d = str3;
        this.f79213e = str4;
        if (collection != null) {
            i = collection.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i);
        this.f79215g = arrayList;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        this.f79214f = contentRating;
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
        see.m35040a(parcel, 2, this.f79209a, i, false);
        see.m35046a(parcel, 3, this.f79210b, false);
        see.m35046a(parcel, 4, this.f79211c, false);
        see.m35046a(parcel, 5, this.f79212d, false);
        see.m35046a(parcel, 6, this.f79213e, false);
        see.m35065b(parcel, 7, Collections.unmodifiableList(this.f79215g), false);
        see.m35040a(parcel, 8, this.f79214f, i, false);
        see.m35062b(parcel, a);
    }
}
