package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aekt();

    /* renamed from: a */
    public final String f79450a;

    /* renamed from: b */
    public final LatLng f79451b;

    /* renamed from: c */
    public final String f79452c;

    /* renamed from: d */
    public final List f79453d;

    /* renamed from: e */
    public final String f79454e;

    /* renamed from: f */
    public final Uri f79455f;

    public AddPlaceRequest(String str, LatLng latLng, String str2, List list, String str3, Uri uri) {
        sdo.m34977c(str);
        this.f79450a = str;
        sdo.m34959a(latLng);
        this.f79451b = latLng;
        sdo.m34977c(str2);
        this.f79452c = str2;
        sdo.m34959a(list);
        ArrayList arrayList = new ArrayList(list);
        this.f79453d = arrayList;
        boolean z = true;
        sdo.m34975b(!arrayList.isEmpty(), "At least one place type should be provided.");
        if (TextUtils.isEmpty(str3) && uri == null) {
            z = false;
        }
        sdo.m34975b(z, "One of phone number or URI should be provided.");
        this.f79454e = str3;
        this.f79455f = uri;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("name", this.f79450a);
        a.mo25396a("latLng", this.f79451b);
        a.mo25396a("address", this.f79452c);
        a.mo25396a("placeTypes", this.f79453d);
        a.mo25396a("phoneNumer", this.f79454e);
        a.mo25396a("websiteUri", this.f79455f);
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f79450a, false);
        see.m35040a(parcel, 2, this.f79451b, i, false);
        see.m35046a(parcel, 3, this.f79452c, false);
        see.m35049a(parcel, 4, this.f79453d, false);
        see.m35046a(parcel, 5, this.f79454e, false);
        see.m35040a(parcel, 6, this.f79455f, i, false);
        see.m35062b(parcel, a);
    }
}
