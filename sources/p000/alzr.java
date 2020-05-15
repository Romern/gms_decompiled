package p000;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: alzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alzr extends rtr implements rty {
    public alzr(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        throw new UnsupportedOperationException("Method not supported for object Owner");
    }

    /* renamed from: c */
    public final String mo41063c() {
        return mo25151d("account_name");
    }

    /* renamed from: d */
    public final String mo41064d() {
        return mo41065f() ? mo25151d("display_name") : mo41063c();
    }

    /* renamed from: f */
    public final boolean mo41065f() {
        return !TextUtils.isEmpty(mo25151d("display_name"));
    }

    /* renamed from: i */
    public final String mo41068i() {
        return mo25151d("gaia_id");
    }

    /* renamed from: j */
    public final String mo41069j() {
        return ancb.f76610a.mo41685a(mo25151d("avatar"));
    }

    /* renamed from: k */
    public final String mo41070k() {
        return mo25151d("page_gaia_id");
    }

    /* renamed from: l */
    public final boolean mo41071l() {
        return !this.f43672a.mo17768b();
    }

    /* renamed from: g */
    public final String mo41066g() {
        return !TextUtils.isEmpty(mo25151d("given_name")) ? mo25151d("given_name") : "null";
    }

    /* renamed from: h */
    public final String mo41067h() {
        return !TextUtils.isEmpty(mo25151d("family_name")) ? mo25151d("family_name") : "null";
    }
}
