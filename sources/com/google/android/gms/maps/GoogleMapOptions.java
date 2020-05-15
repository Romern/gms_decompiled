package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new afco();

    /* renamed from: a */
    public int f79831a = -1;

    /* renamed from: b */
    public CameraPosition f79832b;

    /* renamed from: c */
    public Float f79833c = null;

    /* renamed from: d */
    public Float f79834d = null;

    /* renamed from: e */
    public LatLngBounds f79835e = null;

    /* renamed from: f */
    private Boolean f79836f;

    /* renamed from: g */
    private Boolean f79837g;

    /* renamed from: h */
    private Boolean f79838h;

    /* renamed from: i */
    private Boolean f79839i;

    /* renamed from: j */
    private Boolean f79840j;

    /* renamed from: k */
    private Boolean f79841k;

    /* renamed from: l */
    private Boolean f79842l;

    /* renamed from: m */
    private Boolean f79843m;

    /* renamed from: n */
    private Boolean f79844n;

    /* renamed from: o */
    private Boolean f79845o;

    /* renamed from: p */
    private Boolean f79846p;

    /* renamed from: q */
    private Boolean f79847q;

    public GoogleMapOptions() {
    }

    /* renamed from: a */
    public static GoogleMapOptions m67154a(Context context, AttributeSet attributeSet) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        float f5;
        float f6;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, afcu.f64188a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.f79831a = obtainAttributes.getInt(13, -1);
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.f79836f = Boolean.valueOf(obtainAttributes.getBoolean(23, false));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.f79837g = Boolean.valueOf(obtainAttributes.getBoolean(22, false));
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.f79839i = Boolean.valueOf(obtainAttributes.getBoolean(14, true));
        }
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.f79843m = Boolean.valueOf(obtainAttributes.getBoolean(16, true));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.f79847q = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.f79840j = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.f79842l = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.f79841k = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.f79838h = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.f79844n = Boolean.valueOf(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(15)) {
            googleMapOptions.f79845o = Boolean.valueOf(obtainAttributes.getBoolean(15, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.f79846p = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.f79833c = Float.valueOf(obtainAttributes.getFloat(3, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.f79834d = Float.valueOf(obtainAttributes.getFloat(2, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, afcu.f64188a);
        if (obtainAttributes2.hasValue(10)) {
            f = Float.valueOf(obtainAttributes2.getFloat(10, 0.0f));
        } else {
            f = null;
        }
        if (obtainAttributes2.hasValue(11)) {
            f2 = Float.valueOf(obtainAttributes2.getFloat(11, 0.0f));
        } else {
            f2 = null;
        }
        if (obtainAttributes2.hasValue(8)) {
            f3 = Float.valueOf(obtainAttributes2.getFloat(8, 0.0f));
        } else {
            f3 = null;
        }
        if (obtainAttributes2.hasValue(9)) {
            f4 = Float.valueOf(obtainAttributes2.getFloat(9, 0.0f));
        } else {
            f4 = null;
        }
        obtainAttributes2.recycle();
        if (!(f == null || f2 == null || f3 == null || f4 == null)) {
            latLngBounds = new LatLngBounds(new LatLng((double) f.floatValue(), (double) f2.floatValue()), new LatLng((double) f3.floatValue(), (double) f4.floatValue()));
        }
        googleMapOptions.f79835e = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, afcu.f64188a);
        if (obtainAttributes3.hasValue(4)) {
            f5 = obtainAttributes3.getFloat(4, 0.0f);
        } else {
            f5 = 0.0f;
        }
        if (obtainAttributes3.hasValue(5)) {
            f6 = obtainAttributes3.getFloat(5, 0.0f);
        } else {
            f6 = 0.0f;
        }
        LatLng latLng = new LatLng((double) f5, (double) f6);
        afgx a = CameraPosition.m67167a();
        a.f64239a = latLng;
        if (obtainAttributes3.hasValue(7)) {
            a.f64240b = obtainAttributes3.getFloat(7, 0.0f);
        }
        if (obtainAttributes3.hasValue(1)) {
            a.f64242d = obtainAttributes3.getFloat(1, 0.0f);
        }
        if (obtainAttributes3.hasValue(6)) {
            a.f64241c = obtainAttributes3.getFloat(6, 0.0f);
        }
        obtainAttributes3.recycle();
        googleMapOptions.f79832b = a.mo34834a();
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("MapType", Integer.valueOf(this.f79831a));
        a.mo25396a("LiteMode", this.f79844n);
        a.mo25396a("Camera", this.f79832b);
        a.mo25396a("CompassEnabled", this.f79839i);
        a.mo25396a("ZoomControlsEnabled", this.f79838h);
        a.mo25396a("ScrollGesturesEnabled", this.f79840j);
        a.mo25396a("ZoomGesturesEnabled", this.f79841k);
        a.mo25396a("TiltGesturesEnabled", this.f79842l);
        a.mo25396a("RotateGesturesEnabled", this.f79843m);
        a.mo25396a("ScrollGesturesEnabledDuringRotateOrZoom", this.f79847q);
        a.mo25396a("MapToolbarEnabled", this.f79845o);
        a.mo25396a("AmbientEnabled", this.f79846p);
        a.mo25396a("MinZoomPreference", this.f79833c);
        a.mo25396a("MaxZoomPreference", this.f79834d);
        a.mo25396a("LatLngBoundsForCameraTarget", this.f79835e);
        a.mo25396a("ZOrderOnTop", this.f79836f);
        a.mo25396a("UseViewLifecycleInFragment", this.f79837g);
        return a.toString();
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12) {
        this.f79836f = afdc.m52873a(b);
        this.f79837g = afdc.m52873a(b2);
        this.f79831a = i;
        this.f79832b = cameraPosition;
        this.f79838h = afdc.m52873a(b3);
        this.f79839i = afdc.m52873a(b4);
        this.f79840j = afdc.m52873a(b5);
        this.f79841k = afdc.m52873a(b6);
        this.f79842l = afdc.m52873a(b7);
        this.f79843m = afdc.m52873a(b8);
        this.f79844n = afdc.m52873a(b9);
        this.f79845o = afdc.m52873a(b10);
        this.f79846p = afdc.m52873a(b11);
        this.f79833c = f;
        this.f79834d = f2;
        this.f79835e = latLngBounds;
        this.f79847q = afdc.m52873a(b12);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35032a(parcel, 2, afdc.m52872a(this.f79836f));
        see.m35032a(parcel, 3, afdc.m52872a(this.f79837g));
        see.m35063b(parcel, 4, this.f79831a);
        see.m35040a(parcel, 5, this.f79832b, i, false);
        see.m35032a(parcel, 6, afdc.m52872a(this.f79838h));
        see.m35032a(parcel, 7, afdc.m52872a(this.f79839i));
        see.m35032a(parcel, 8, afdc.m52872a(this.f79840j));
        see.m35032a(parcel, 9, afdc.m52872a(this.f79841k));
        see.m35032a(parcel, 10, afdc.m52872a(this.f79842l));
        see.m35032a(parcel, 11, afdc.m52872a(this.f79843m));
        see.m35032a(parcel, 12, afdc.m52872a(this.f79844n));
        see.m35032a(parcel, 14, afdc.m52872a(this.f79845o));
        see.m35032a(parcel, 15, afdc.m52872a(this.f79846p));
        see.m35043a(parcel, 16, this.f79833c);
        see.m35043a(parcel, 17, this.f79834d);
        see.m35040a(parcel, 18, this.f79835e, i, false);
        see.m35032a(parcel, 19, afdc.m52872a(this.f79847q));
        see.m35062b(parcel, a);
    }
}
