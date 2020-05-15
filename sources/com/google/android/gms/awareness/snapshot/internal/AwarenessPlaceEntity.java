package com.google.android.gms.awareness.snapshot.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AwarenessPlaceEntity extends AbstractSafeParcelable implements aelh {
    public static final Parcelable.Creator CREATOR = new lro();

    /* renamed from: a */
    public final String f11689a;

    /* renamed from: b */
    public final LatLng f11690b;

    /* renamed from: c */
    public final float f11691c;

    /* renamed from: d */
    public final LatLngBounds f11692d;

    /* renamed from: e */
    public final String f11693e;

    /* renamed from: f */
    public final Uri f11694f;

    /* renamed from: g */
    public final boolean f11695g;

    /* renamed from: h */
    public final float f11696h;

    /* renamed from: i */
    public final int f11697i;

    /* renamed from: j */
    public final String f11698j;

    /* renamed from: k */
    public final String f11699k;

    /* renamed from: l */
    public final String f11700l;

    /* renamed from: m */
    public final List f11701m;

    /* renamed from: n */
    public final List f11702n;

    /* renamed from: o */
    public final String f11703o;

    /* renamed from: p */
    private Locale f11704p;

    public AwarenessPlaceEntity(String str, List list, String str2, String str3, String str4, List list2, LatLng latLng, float f, LatLngBounds latLngBounds, String str5, Uri uri, boolean z, float f2, int i, String str6) {
        this.f11689a = str;
        this.f11702n = Collections.unmodifiableList(list);
        this.f11698j = str2;
        this.f11699k = str3;
        this.f11700l = str4;
        this.f11701m = list2 == null ? Collections.emptyList() : list2;
        this.f11690b = latLng;
        this.f11691c = f;
        this.f11692d = latLngBounds;
        this.f11693e = str5 == null ? "UTC" : str5;
        this.f11694f = uri;
        this.f11695g = z;
        this.f11696h = f2;
        this.f11697i = i;
        this.f11704p = null;
        this.f11703o = str6;
    }

    /* renamed from: a */
    public final String mo8007a() {
        return this.f11689a;
    }

    /* renamed from: b */
    public final List mo8008b() {
        return this.f11702n;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Locale mo8009c() {
        return null;
    }

    /* renamed from: d */
    public final LatLng mo8010d() {
        return this.f11690b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AwarenessPlaceEntity) {
            AwarenessPlaceEntity awarenessPlaceEntity = (AwarenessPlaceEntity) obj;
            if (this.f11689a.equals(awarenessPlaceEntity.f11689a)) {
                Locale locale = awarenessPlaceEntity.f11704p;
                if (sdg.m34949a(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final float mo8012f() {
        return this.f11691c;
    }

    /* renamed from: g */
    public final LatLngBounds mo8013g() {
        return this.f11692d;
    }

    @Deprecated
    /* renamed from: h */
    public final TimeZone mo8014h() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11689a, null});
    }

    /* renamed from: i */
    public final Uri mo8016i() {
        return this.f11694f;
    }

    /* renamed from: j */
    public final CharSequence mo8017j() {
        List list = this.f11701m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return TextUtils.join(", ", this.f11701m);
    }

    /* renamed from: k */
    public final boolean mo8018k() {
        return this.f11695g;
    }

    /* renamed from: l */
    public final float mo8019l() {
        return this.f11696h;
    }

    /* renamed from: m */
    public final int mo8020m() {
        return this.f11697i;
    }

    /* renamed from: n */
    public final String mo8021n() {
        return this.f11703o;
    }

    /* renamed from: o */
    public final SafeParcelable mo8022o() {
        return this;
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ CharSequence mo8023p() {
        return this.f11700l;
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ CharSequence mo8024q() {
        return this.f11698j;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ CharSequence mo8025r() {
        return this.f11699k;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("id", this.f11689a);
        a.mo25396a("placeTypes", this.f11702n);
        a.mo25396a("locale", null);
        a.mo25396a("name", this.f11698j);
        a.mo25396a("address", this.f11699k);
        a.mo25396a("phoneNumber", this.f11700l);
        a.mo25396a("latlng", this.f11690b);
        a.mo25396a("viewport", this.f11692d);
        a.mo25396a("websiteUri", this.f11694f);
        a.mo25396a("isPermanentlyClosed", Boolean.valueOf(this.f11695g));
        a.mo25396a("priceLevel", Integer.valueOf(this.f11697i));
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
        see.m35046a(parcel, 1, this.f11689a, false);
        see.m35040a(parcel, 4, this.f11690b, i, false);
        see.m35034a(parcel, 5, this.f11691c);
        see.m35040a(parcel, 6, this.f11692d, i, false);
        see.m35046a(parcel, 7, this.f11693e, false);
        see.m35040a(parcel, 8, this.f11694f, i, false);
        see.m35051a(parcel, 9, this.f11695g);
        see.m35034a(parcel, 10, this.f11696h);
        see.m35063b(parcel, 11, this.f11697i);
        see.m35046a(parcel, 14, this.f11699k, false);
        see.m35046a(parcel, 15, this.f11700l, false);
        see.m35065b(parcel, 17, this.f11701m, false);
        see.m35046a(parcel, 19, this.f11698j, false);
        see.m35049a(parcel, 20, this.f11702n, false);
        see.m35046a(parcel, 23, this.f11703o, false);
        see.m35062b(parcel, a);
    }
}
