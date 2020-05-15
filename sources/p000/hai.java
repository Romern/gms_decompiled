package p000;

import android.accounts.Account;
import android.graphics.Bitmap;

/* renamed from: hai */
final /* synthetic */ class hai implements bqeh {

    /* renamed from: a */
    private final hav f19346a;

    public hai(hav hav) {
        this.f19346a = hav;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        hav hav = this.f19346a;
        if (!((Boolean) obj).booleanValue()) {
            return hdz.m14238c(adcs.UPDATE_DEFAULT_GOOGLE_ACCOUNT);
        }
        bqgg a = ((hbc) hav.f19366e.mo12294a()).mo12373a(hav.f19368g, hav.f19363b.f19380d);
        Bitmap bitmap = hav.f19363b.f19386j;
        if (bitmap == null) {
            hab hab = (hab) hav.f19367f.mo12294a();
            bqgg = bqdx.m112673a(adbb.m50102a(hab.f19339b.mo24713a(((Account) hav.f19363b.f19384h.mo2448b()).name, hab.f19338a, 1)), new haa(hab), hav.f19368g);
        } else {
            bqgg = bqga.m112775a(bmxv.m108566b(bitmap));
        }
        bqga.m112783b(a, bqgg).mo69215a(new hak(hav, a, bqgg), hav.f19368g);
        return hav.f19362a.mo12421a(adcs.RECORD_CONSENT_GRANT);
    }
}
