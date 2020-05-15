package com.google.android.gms.location.places.internal;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
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
public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, aelh {
    public static final Parcelable.Creator CREATOR = new aeoc();

    /* renamed from: a */
    public final String f79535a;

    /* renamed from: b */
    public final LatLng f79536b;

    /* renamed from: c */
    public final float f79537c;

    /* renamed from: d */
    public final LatLngBounds f79538d;

    /* renamed from: e */
    public final String f79539e;

    /* renamed from: f */
    public final Uri f79540f;

    /* renamed from: g */
    public final boolean f79541g;

    /* renamed from: h */
    public final float f79542h;

    /* renamed from: i */
    public final int f79543i;

    /* renamed from: j */
    public final List f79544j;

    /* renamed from: k */
    public final String f79545k;

    /* renamed from: l */
    public final String f79546l;

    /* renamed from: m */
    public final String f79547m;

    /* renamed from: n */
    public final List f79548n;

    /* renamed from: o */
    public final PlaceOpeningHoursEntity f79549o;

    /* renamed from: p */
    public final PlaceExtendedDetailsEntity f79550p;

    /* renamed from: q */
    public final String f79551q;

    /* renamed from: r */
    public Locale f79552r;

    public PlaceEntity(String str, List list, String str2, String str3, String str4, List list2, LatLng latLng, float f, LatLngBounds latLngBounds, String str5, Uri uri, boolean z, float f2, int i, PlaceOpeningHoursEntity placeOpeningHoursEntity, PlaceExtendedDetailsEntity placeExtendedDetailsEntity, String str6) {
        this.f79535a = str;
        this.f79544j = Collections.unmodifiableList(list);
        this.f79545k = str2;
        this.f79546l = str3;
        this.f79547m = str4;
        this.f79548n = list2 == null ? Collections.emptyList() : list2;
        this.f79536b = latLng;
        this.f79537c = f;
        this.f79538d = latLngBounds;
        this.f79539e = str5 == null ? "UTC" : str5;
        this.f79540f = uri;
        this.f79541g = z;
        this.f79542h = f2;
        this.f79543i = i;
        this.f79552r = null;
        this.f79549o = placeOpeningHoursEntity;
        this.f79550p = placeExtendedDetailsEntity;
        this.f79551q = str6;
    }

    /* renamed from: a */
    public static aelh m66940a(Parcelable parcelable, Context context) {
        if (parcelable == null) {
            return null;
        }
        sdo.checkIfNull(context, "context must not be null");
        try {
            return (PlaceEntity) parcelable;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Parcelable is not a Place");
        }
    }

    /* renamed from: a */
    public final String mo8007a() {
        return this.f79535a;
    }

    /* renamed from: b */
    public final List mo8008b() {
        return this.f79544j;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Locale mo8009c() {
        return this.f79552r;
    }

    /* renamed from: d */
    public final LatLng mo8010d() {
        return this.f79536b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceEntity) {
            PlaceEntity placeEntity = (PlaceEntity) obj;
            return this.f79535a.equals(placeEntity.f79535a) && sdg.m34949a(this.f79552r, placeEntity.f79552r);
        }
    }

    /* renamed from: f */
    public final float mo8012f() {
        return this.f79537c;
    }

    /* renamed from: g */
    public final LatLngBounds mo8013g() {
        return this.f79538d;
    }

    @Deprecated
    /* renamed from: h */
    public final TimeZone mo8014h() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79535a, this.f79552r});
    }

    /* renamed from: i */
    public final Uri mo8016i() {
        return this.f79540f;
    }

    /* renamed from: j */
    public final CharSequence mo8017j() {
        return aemu.m52174a(this.f79548n);
    }

    /* renamed from: k */
    public final boolean mo8018k() {
        return this.f79541g;
    }

    /* renamed from: l */
    public final float mo8019l() {
        return this.f79542h;
    }

    /* renamed from: m */
    public final int mo8020m() {
        return this.f79543i;
    }

    /* renamed from: n */
    public final String mo8021n() {
        return this.f79551q;
    }

    /* renamed from: o */
    public final SafeParcelable mo8022o() {
        return this;
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ CharSequence mo8023p() {
        return this.f79547m;
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ CharSequence mo8024q() {
        return this.f79545k;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ CharSequence mo8025r() {
        return this.f79546l;
    }

    /* renamed from: s */
    public final ContentValues mo43688s() {
        ContentValues contentValues = new ContentValues(aeok.f63572a.length);
        contentValues.put("place_id", this.f79535a);
        contentValues.put("place_types", rtr.m34416a(this.f79544j));
        contentValues.put("place_name", this.f79545k);
        contentValues.put("place_address", this.f79546l);
        Locale locale = this.f79552r;
        if (locale != null) {
            contentValues.put("place_locale", locale.getLanguage());
            contentValues.put("place_locale_language", this.f79552r.getLanguage());
            contentValues.put("place_locale_country", this.f79552r.getCountry());
        }
        contentValues.put("place_phone_number", this.f79547m);
        contentValues.put("place_attributions", rtr.m34418c(this.f79548n));
        LatLng latLng = this.f79536b;
        if (latLng != null) {
            contentValues.put("place_lat_lng", sef.m35074a(latLng));
        }
        contentValues.put("place_level_number", Float.valueOf(this.f79537c));
        LatLngBounds latLngBounds = this.f79538d;
        if (latLngBounds != null) {
            contentValues.put("place_viewport", sef.m35074a(latLngBounds));
        }
        Uri uri = this.f79540f;
        if (uri != null) {
            contentValues.put("place_website_uri", uri.toString());
        }
        contentValues.put("place_is_permanently_closed", Boolean.valueOf(this.f79541g));
        contentValues.put("place_rating", Float.valueOf(this.f79542h));
        contentValues.put("place_price_level", Integer.valueOf(this.f79543i));
        PlaceOpeningHoursEntity placeOpeningHoursEntity = this.f79549o;
        if (placeOpeningHoursEntity != null) {
            contentValues.put("place_opening_hours", sef.m35074a(placeOpeningHoursEntity));
        }
        contentValues.put("place_adr_address", this.f79551q);
        return contentValues;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("id", this.f79535a);
        a.mo25396a("placeTypes", this.f79544j);
        a.mo25396a("locale", this.f79552r);
        a.mo25396a("name", this.f79545k);
        a.mo25396a("address", this.f79546l);
        a.mo25396a("phoneNumber", this.f79547m);
        a.mo25396a("latlng", this.f79536b);
        a.mo25396a("viewport", this.f79538d);
        a.mo25396a("websiteUri", this.f79540f);
        a.mo25396a("isPermanentlyClosed", Boolean.valueOf(this.f79541g));
        a.mo25396a("priceLevel", Integer.valueOf(this.f79543i));
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
        see.m35046a(parcel, 1, this.f79535a, false);
        see.m35040a(parcel, 4, this.f79536b, i, false);
        see.m35034a(parcel, 5, this.f79537c);
        see.m35040a(parcel, 6, this.f79538d, i, false);
        see.m35046a(parcel, 7, this.f79539e, false);
        see.m35040a(parcel, 8, this.f79540f, i, false);
        see.m35051a(parcel, 9, this.f79541g);
        see.m35034a(parcel, 10, this.f79542h);
        see.m35063b(parcel, 11, this.f79543i);
        see.m35046a(parcel, 14, this.f79546l, false);
        see.m35046a(parcel, 15, this.f79547m, false);
        see.m35065b(parcel, 17, this.f79548n, false);
        see.m35046a(parcel, 19, this.f79545k, false);
        see.m35049a(parcel, 20, this.f79544j, false);
        see.m35040a(parcel, 21, this.f79549o, i, false);
        see.m35040a(parcel, 22, this.f79550p, i, false);
        see.m35046a(parcel, 23, this.f79551q, false);
        see.m35062b(parcel, a);
    }
}
