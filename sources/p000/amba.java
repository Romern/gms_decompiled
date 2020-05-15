package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: amba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amba extends rtr implements amfa {

    /* renamed from: d */
    private final Bundle f74604d;

    /* renamed from: e */
    private final ambs f74605e;

    /* renamed from: f */
    private final ambr f74606f;

    /* renamed from: g */
    private final boolean f74607g;

    public amba(DataHolder dataHolder, int i, Bundle bundle, ambs ambs, ambr ambr) {
        super(dataHolder, i);
        this.f74604d = bundle;
        this.f74605e = ambs;
        this.f74606f = ambr;
        this.f74607g = bundle.getBoolean("emails_with_affinities", false);
    }

    /* renamed from: a */
    public final String mo25472a() {
        return mo25151d("qualified_id");
    }

    /* renamed from: b */
    public final String mo25473b() {
        return mo25151d("gaia_id");
    }

    /* renamed from: c */
    public final String mo25474c() {
        return mo25151d("name");
    }

    /* renamed from: d */
    public final String mo25475d() {
        return ancb.f76610a.mo41685a(mo25151d("avatar"));
    }

    /* renamed from: e */
    public final String[] mo25476e() {
        String d = mo25151d("v_circle_ids");
        return TextUtils.isEmpty(d) ? ancm.f76631b : ancm.f76632c.split(d, -1);
    }

    /* renamed from: f */
    public final Iterable mo25478f() {
        return this.f74606f.mo41119a(mo25151d("v_emails"), this.f74607g);
    }

    /* renamed from: g */
    public final Iterable mo25479g() {
        return this.f74605e.mo41119a(mo25151d("v_phones"), false);
    }
}
