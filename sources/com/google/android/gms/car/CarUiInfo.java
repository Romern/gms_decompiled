package com.google.android.gms.car;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarUiInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new npf();

    /* renamed from: a */
    public boolean f29369a;

    /* renamed from: b */
    public boolean f29370b;

    /* renamed from: c */
    public boolean f29371c;

    /* renamed from: d */
    public boolean f29372d;

    /* renamed from: e */
    public int[] f29373e;

    /* renamed from: f */
    public boolean f29374f;

    /* renamed from: g */
    public int f29375g;

    /* renamed from: h */
    public boolean f29376h;

    /* renamed from: i */
    public int f29377i;

    /* renamed from: j */
    public int f29378j;

    CarUiInfo() {
    }

    public final String toString() {
        return String.format(Locale.US, "CarUiInfo (hasRotaryController: %b, touchscreenType: %d, hasSearchButton: %b, hasTouchpadForUiNavigation: %b, hasDpad: %b, isTouchpadUiAbsolute: %b, touchpadMoveThresholdPx: %d, touchpadMultimoveThresholdPx: %d)", Boolean.valueOf(this.f29369a), Integer.valueOf(this.f29375g), Boolean.valueOf(this.f29371c), Boolean.valueOf(this.f29372d), Boolean.valueOf(this.f29374f), Boolean.valueOf(this.f29376h), Integer.valueOf(this.f29377i), Integer.valueOf(this.f29378j));
    }

    public CarUiInfo(boolean z, int i, boolean z2, boolean z3, Point point, boolean z4, boolean z5, int i2, int i3) {
        boolean z6;
        this.f29369a = z;
        if (i != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f29370b = z6;
        this.f29371c = z2;
        this.f29372d = z3;
        if (point != null) {
            int[] iArr = new int[2];
            this.f29373e = iArr;
            iArr[0] = point.x;
            this.f29373e[1] = point.y;
        }
        this.f29374f = z4;
        this.f29375g = i;
        this.f29376h = z5;
        this.f29377i = i2;
        this.f29378j = i3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f29369a);
        see.m35051a(parcel, 2, this.f29370b);
        see.m35051a(parcel, 3, this.f29371c);
        see.m35051a(parcel, 4, this.f29372d);
        see.m35055a(parcel, 5, this.f29373e, false);
        see.m35051a(parcel, 6, this.f29374f);
        see.m35063b(parcel, 7, this.f29375g);
        see.m35051a(parcel, 8, this.f29376h);
        see.m35063b(parcel, 9, this.f29377i);
        see.m35063b(parcel, 10, this.f29378j);
        see.m35062b(parcel, a);
    }

    public CarUiInfo(boolean z, boolean z2, boolean z3, boolean z4, int[] iArr, boolean z5, int i, boolean z6, int i2, int i3) {
        this.f29369a = z;
        this.f29370b = z2;
        this.f29371c = z3;
        this.f29372d = z4;
        this.f29373e = iArr;
        this.f29374f = z5;
        this.f29375g = i;
        this.f29376h = z6;
        this.f29377i = i2;
        this.f29378j = i3;
    }
}
