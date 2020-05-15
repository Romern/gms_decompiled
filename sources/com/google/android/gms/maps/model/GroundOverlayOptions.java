package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afhc();

    /* renamed from: a */
    public LatLng f79882a;

    /* renamed from: b */
    public float f79883b;

    /* renamed from: c */
    public float f79884c;

    /* renamed from: d */
    public LatLngBounds f79885d;

    /* renamed from: e */
    public float f79886e;

    /* renamed from: f */
    public float f79887f;

    /* renamed from: g */
    public boolean f79888g = true;

    /* renamed from: h */
    public float f79889h = 0.0f;

    /* renamed from: i */
    public float f79890i = 0.5f;

    /* renamed from: j */
    public float f79891j = 0.5f;

    /* renamed from: k */
    public boolean f79892k = false;

    /* renamed from: l */
    private afgv f79893l;

    public GroundOverlayOptions() {
    }

    /* renamed from: a */
    public final void mo43862a(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        sdo.m34975b(z, "Transparency must be in the range [0..1]");
        this.f79889h = f;
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        vzr vzr;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(iBinder);
        } else {
            vzr = null;
        }
        this.f79893l = new afgv(vzr);
        this.f79882a = latLng;
        this.f79883b = f;
        this.f79884c = f2;
        this.f79885d = latLngBounds;
        this.f79886e = f3;
        this.f79887f = f4;
        this.f79888g = z;
        this.f79889h = f5;
        this.f79890i = f6;
        this.f79891j = f7;
        this.f79892k = z2;
    }

    /* renamed from: a */
    public final void mo43863a(afgv afgv) {
        sdo.checkIfNull(afgv, "imageDescriptor must not be null");
        this.f79893l = afgv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 2, this.f79893l.f64237a.asBinder());
        see.m35040a(parcel, 3, this.f79882a, i, false);
        see.m35034a(parcel, 4, this.f79883b);
        see.m35034a(parcel, 5, this.f79884c);
        see.m35040a(parcel, 6, this.f79885d, i, false);
        see.m35034a(parcel, 7, this.f79886e);
        see.m35034a(parcel, 8, this.f79887f);
        see.m35051a(parcel, 9, this.f79888g);
        see.m35034a(parcel, 10, this.f79889h);
        see.m35034a(parcel, 11, this.f79890i);
        see.m35034a(parcel, 12, this.f79891j);
        see.m35051a(parcel, 13, this.f79892k);
        see.m35062b(parcel, a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo43864a(LatLng latLng, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f79885d == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Position has already been set using positionFromBounds");
        if (latLng != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "Location must be specified");
        sdo.m34975b(f >= 0.0f, "Width must be non-negative");
        if (f2 < 0.0f) {
            z3 = false;
        }
        sdo.m34975b(z3, "Height must be non-negative");
        this.f79882a = latLng;
        this.f79883b = f;
        this.f79884c = f2;
    }
}
