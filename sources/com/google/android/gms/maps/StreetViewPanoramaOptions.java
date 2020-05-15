package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new afcv();

    /* renamed from: a */
    public StreetViewPanoramaCamera f79849a;

    /* renamed from: b */
    public String f79850b;

    /* renamed from: c */
    public LatLng f79851c;

    /* renamed from: d */
    public Integer f79852d;

    /* renamed from: e */
    public StreetViewSource f79853e = StreetViewSource.f79942a;

    /* renamed from: f */
    private Boolean f79854f = true;

    /* renamed from: g */
    private Boolean f79855g = true;

    /* renamed from: h */
    private Boolean f79856h = true;

    /* renamed from: i */
    private Boolean f79857i = true;

    /* renamed from: j */
    private Boolean f79858j;

    public StreetViewPanoramaOptions() {
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("PanoramaId", this.f79850b);
        a.mo25396a("Position", this.f79851c);
        a.mo25396a("Radius", this.f79852d);
        a.mo25396a("Source", this.f79853e);
        a.mo25396a("StreetViewPanoramaCamera", this.f79849a);
        a.mo25396a("UserNavigationEnabled", this.f79854f);
        a.mo25396a("ZoomGesturesEnabled", this.f79855g);
        a.mo25396a("PanningGesturesEnabled", this.f79856h);
        a.mo25396a("StreetNamesEnabled", this.f79857i);
        a.mo25396a("UseViewLifecycleInFragment", this.f79858j);
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
        see.m35040a(parcel, 2, this.f79849a, i, false);
        see.m35046a(parcel, 3, this.f79850b, false);
        see.m35040a(parcel, 4, this.f79851c, i, false);
        see.m35044a(parcel, 5, this.f79852d);
        see.m35032a(parcel, 6, afdc.m52872a(this.f79854f));
        see.m35032a(parcel, 7, afdc.m52872a(this.f79855g));
        see.m35032a(parcel, 8, afdc.m52872a(this.f79856h));
        see.m35032a(parcel, 9, afdc.m52872a(this.f79857i));
        see.m35032a(parcel, 10, afdc.m52872a(this.f79858j));
        see.m35040a(parcel, 11, this.f79853e, i, false);
        see.m35062b(parcel, a);
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.f79849a = streetViewPanoramaCamera;
        this.f79851c = latLng;
        this.f79852d = num;
        this.f79850b = str;
        this.f79854f = afdc.m52873a(b);
        this.f79855g = afdc.m52873a(b2);
        this.f79856h = afdc.m52873a(b3);
        this.f79857i = afdc.m52873a(b4);
        this.f79858j = afdc.m52873a(b5);
        this.f79853e = streetViewSource;
    }
}
