package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: hnu */
final /* synthetic */ class hnu implements bmxj {

    /* renamed from: a */
    private final boolean f20091a;

    public hnu(boolean z) {
        this.f20091a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f20091a;
        alky alky = (alky) obj;
        if (alky.mo7183bo().mo17710c()) {
            bngs j = bngx.m109377j();
            Iterator it = alky.mo12459b().iterator();
            while (it.hasNext()) {
                alzr alzr = (alzr) it.next();
                gvl gvl = new gvl(alzr.mo41063c());
                if (z) {
                    gvl.f19081e = "https://accounts.google.com";
                }
                if (!TextUtils.isEmpty(alzr.mo41064d())) {
                    gvl.f19077a = alzr.mo41064d();
                }
                if (!TextUtils.isEmpty(alzr.mo41066g())) {
                    gvl.f19082f = alzr.mo41066g();
                }
                if (!TextUtils.isEmpty(alzr.mo41067h())) {
                    gvl.f19083g = alzr.mo41067h();
                }
                String j2 = alzr.mo41069j();
                if (!TextUtils.isEmpty(j2)) {
                    gvl.f19078b = Uri.parse(j2);
                }
                j.mo67668c(gvl.mo12267a());
            }
            return j.mo67664a();
        }
        throw adbe.m50110a(alky).mo33303c();
    }
}
