package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: aeoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeoj extends rtr implements aelh {

    /* renamed from: d */
    private final String f63570d = mo25141a("place_id", "");

    /* renamed from: e */
    private final PlaceExtendedDetailsEntity f63571e;

    /* renamed from: v */
    private final List m52293v() {
        return mo25147b("place_attributions", Collections.emptyList());
    }

    /* renamed from: a */
    public final String mo8007a() {
        return this.f63570d;
    }

    /* renamed from: b */
    public final List mo8008b() {
        return mo25143a("place_types", Collections.emptyList());
    }

    /* renamed from: c */
    public final Locale mo8009c() {
        String a = mo25141a("place_locale_language", "");
        if (!TextUtils.isEmpty(a)) {
            return new Locale(a, mo25141a("place_locale_country", ""));
        }
        String a2 = mo25141a("place_locale", "");
        if (!TextUtils.isEmpty(a2)) {
            return new Locale(a2);
        }
        return Locale.getDefault();
    }

    /* renamed from: d */
    public final LatLng mo8010d() {
        return (LatLng) mo25140a("place_lat_lng", LatLng.CREATOR);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rtr.a(java.lang.String, float):float
     arg types: [java.lang.String, int]
     candidates:
      rtr.a(java.lang.String, int):int
      rtr.a(java.lang.String, android.os.Parcelable$Creator):com.google.android.gms.common.internal.safeparcel.SafeParcelable
      rtr.a(java.lang.String, java.lang.String):java.lang.String
      rtr.a(java.lang.String, java.util.List):java.util.List
      rtr.a(java.lang.String, float):float */
    /* renamed from: f */
    public final float mo8012f() {
        return mo25138a("place_level_number", 0.0f);
    }

    /* renamed from: g */
    public final LatLngBounds mo8013g() {
        return (LatLngBounds) mo25140a("place_viewport", LatLngBounds.CREATOR);
    }

    /* renamed from: h */
    public final TimeZone mo8014h() {
        return null;
    }

    /* renamed from: i */
    public final Uri mo8016i() {
        String a = mo25141a("place_website_uri", (String) null);
        if (a != null) {
            return Uri.parse(a);
        }
        return null;
    }

    /* renamed from: j */
    public final CharSequence mo8017j() {
        return aemu.m52174a(m52293v());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rtr.a(java.lang.String, float):float
     arg types: [java.lang.String, int]
     candidates:
      rtr.a(java.lang.String, int):int
      rtr.a(java.lang.String, android.os.Parcelable$Creator):com.google.android.gms.common.internal.safeparcel.SafeParcelable
      rtr.a(java.lang.String, java.lang.String):java.lang.String
      rtr.a(java.lang.String, java.util.List):java.util.List
      rtr.a(java.lang.String, float):float */
    /* renamed from: l */
    public final float mo8019l() {
        return mo25138a("place_rating", -1.0f);
    }

    /* renamed from: m */
    public final int mo8020m() {
        return mo25139a("place_price_level", -1);
    }

    /* renamed from: n */
    public final String mo8021n() {
        return mo25141a("place_adr_address", "");
    }

    /* renamed from: o */
    public final SafeParcelable mo8022o() {
        return mo7556bF();
    }

    /* renamed from: p */
    public final CharSequence mo8023p() {
        return mo25141a("place_phone_number", "");
    }

    /* renamed from: q */
    public final CharSequence mo8024q() {
        return mo25141a("place_name", "");
    }

    /* renamed from: r */
    public final CharSequence mo8025r() {
        return mo25141a("place_address", "");
    }

    /* renamed from: u */
    public final PlaceEntity mo7556bF() {
        aeob aeob = new aeob();
        aeob.f63558l = mo8025r().toString();
        aeob.f63560n = m52293v();
        aeob.f63547a = this.f63570d;
        aeob.f63554h = mo8018k();
        aeob.f63549c = mo8010d();
        aeob.f63550d = mo8012f();
        aeob.f63548b = mo8024q().toString();
        aeob.f63559m = mo8023p().toString();
        aeob.f63556j = mo8020m();
        aeob.f63555i = mo8019l();
        aeob.f63557k = mo8008b();
        aeob.f63551e = mo8013g();
        aeob.f63553g = mo8016i();
        aeob.f63561o = (PlaceOpeningHoursEntity) mo25140a("place_opening_hours", PlaceOpeningHoursEntity.CREATOR);
        aeob.f63562p = this.f63571e;
        aeob.f63563q = mo8021n();
        PlaceEntity a = aeob.mo34381a();
        a.f79552r = mo8009c();
        return a;
    }

    public aeoj(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        PlaceExtendedDetailsEntity placeExtendedDetailsEntity = null;
        if (mo8008b().size() > 0 || ((mo8023p() != null && mo8023p().length() > 0) || ((mo8016i() != null && !mo8016i().equals(Uri.EMPTY)) || mo8019l() >= 0.0f || mo8020m() >= 0))) {
            placeExtendedDetailsEntity = new PlaceExtendedDetailsEntity(mo8008b(), mo8023p() != null ? mo8023p().toString() : null, mo8016i(), mo8019l(), mo8020m());
        }
        this.f63571e = placeExtendedDetailsEntity;
    }

    /* renamed from: k */
    public final boolean mo8018k() {
        if (!mo25145a("place_is_permanently_closed") || mo25154f("place_is_permanently_closed")) {
            return false;
        }
        return mo25150c("place_is_permanently_closed");
    }
}
