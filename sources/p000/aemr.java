package p000;

import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.Collections;
import java.util.List;

/* renamed from: aemr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aemr extends rtr implements aekw {
    /* renamed from: h */
    private final String m52159h() {
        return mo25141a("ap_description", "");
    }

    /* renamed from: i */
    private final String m52160i() {
        return mo25141a("ap_primary_text", "");
    }

    /* renamed from: j */
    private final String m52161j() {
        return mo25141a("ap_secondary_text", "");
    }

    /* renamed from: k */
    private final List m52162k() {
        return mo25142a("ap_matched_subscriptions", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    /* renamed from: l */
    private final List m52163l() {
        return mo25142a("ap_primary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    /* renamed from: m */
    private final List m52164m() {
        return mo25142a("ap_secondary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    /* renamed from: a */
    public final CharSequence mo34278a(CharacterStyle characterStyle) {
        return aemu.m52173a(m52160i(), m52163l(), characterStyle);
    }

    /* renamed from: b */
    public final List mo34280b() {
        return m52162k();
    }

    /* renamed from: c */
    public final int mo34281c() {
        return mo25139a("ap_personalization_type", 6);
    }

    /* renamed from: d */
    public final String mo34282d() {
        return mo25141a("ap_place_id", (String) null);
    }

    /* renamed from: f */
    public final CharSequence mo34283f() {
        return aemu.m52173a(m52159h(), m52162k(), null);
    }

    /* renamed from: g */
    public final CharSequence mo34284g() {
        return aemu.m52173a(m52161j(), m52164m(), null);
    }

    public aemr(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return AutocompletePredictionEntity.m66922a(mo34282d(), mo25143a("ap_place_types", Collections.emptyList()), mo34281c(), m52159h(), m52162k(), m52160i(), m52163l(), m52161j(), m52164m());
    }

    /* renamed from: a */
    public final String mo34279a() {
        return m52159h();
    }
}
