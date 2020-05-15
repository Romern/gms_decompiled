package p000;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;

/* renamed from: zix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class zix implements zgf {

    /* renamed from: a */
    public static final srn f55171a = zvt.m46581a();

    /* renamed from: b */
    public final bngx f55172b;

    /* renamed from: c */
    public final IdentityHashMap f55173c = new IdentityHashMap();

    /* renamed from: d */
    private final zgf f55174d;

    /* renamed from: e */
    private final boolean f55175e;

    public zix(zgf zgf, List list, boolean z) {
        this.f55174d = zgf;
        this.f55172b = bngx.m109368a((Collection) list);
        this.f55175e = z;
    }

    /* renamed from: a */
    private final bqgg m45550a(zgh zgh, yqf yqf) {
        zgh zgh2 = zgh;
        yqf yqf2 = yqf;
        List c = m45554c(yqf.mo30661a());
        if (c.isEmpty()) {
            bnsl bnsl = (bnsl) f55171a.mo68388c();
            bnsl.mo68432a("zix", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("no input data sources found for %s", zgh2);
            return bqga.m112775a((Object) false);
        }
        if (c.size() > 1) {
            bnsl bnsl2 = (bnsl) f55171a.mo68388c();
            bnsl2.mo68432a("zix", "a", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68425a("more than one input data sources found for.  Using the first one: %s, %s, %s", zgh2, yqf2, c);
        }
        caae caae = (caae) c.get(0);
        ziw ziw = new ziw(yqf2, zgh2.f55012b);
        zgh zgh3 = new zgh(caae, ziw, zgh2.f55013c, zgh2.f55015e, zgh2.f55014d, zgh2.f55016f, zgh2.f55018h, zgh2.f55017g);
        bqgg a = this.f55174d.mo19155a(zgh3);
        bqga.m112781a(a, new ziv(this, zgh2, ziw, zgh3), bqfb.INSTANCE);
        return a;
    }

    /* renamed from: c */
    private final List m45554c(caah caah) {
        ArrayList arrayList = new ArrayList();
        if (this.f55174d.mo19159a(caah)) {
            bnre i = this.f55174d.mo19161b(caah).listIterator();
            while (i.hasNext()) {
                caae caae = (caae) i.next();
                if (!this.f55175e) {
                    caad caad = caad.RAW;
                    caad a = caad.m126389a(caae.f172329e);
                    if (a == null) {
                        a = caad.RAW;
                    }
                    if (!caad.equals(a)) {
                    }
                }
                arrayList.add(caae);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return zge.m45363a();
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        bngs j = bngx.m109377j();
        bnre i = this.f55172b.listIterator();
        while (i.hasNext()) {
            yqf yqf = (yqf) i.next();
            if (m45552a(caah, yqf)) {
                j.mo67668c(yqf.mo30664c());
            }
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    private final boolean m45551a(caae caae, yqf yqf) {
        return caae.f172326b.equals(yqf.mo30664c().f172326b) && m45553a(yqf);
    }

    /* renamed from: a */
    private final boolean m45552a(caah caah, yqf yqf) {
        return yqf.mo30663b().equals(caah) && m45553a(yqf);
    }

    /* renamed from: a */
    private final boolean m45553a(yqf yqf) {
        return !m45554c(yqf.mo30661a()).isEmpty();
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        zgh zgh2 = zgh;
        bnre i = this.f55172b.listIterator();
        while (i.hasNext()) {
            yqf yqf = (yqf) i.next();
            if (m45551a(zgh2.f55011a, yqf)) {
                List c = m45554c(yqf.mo30661a());
                if (c.isEmpty()) {
                    bnsl bnsl = (bnsl) f55171a.mo68388c();
                    bnsl.mo68432a("zix", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("no input data sources found for %s", zgh2);
                    return bqga.m112775a((Object) false);
                }
                if (c.size() > 1) {
                    bnsl bnsl2 = (bnsl) f55171a.mo68388c();
                    bnsl2.mo68432a("zix", "a", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68425a("more than one input data sources found for.  Using the first one: %s, %s, %s", zgh2, yqf, c);
                }
                caae caae = (caae) c.get(0);
                ziw ziw = new ziw(yqf, zgh2.f55012b);
                zgh zgh3 = new zgh(caae, ziw, zgh2.f55013c, zgh2.f55015e, zgh2.f55014d, zgh2.f55016f, zgh2.f55018h, zgh2.f55017g);
                bqgg a = this.f55174d.mo19155a(zgh3);
                bqga.m112781a(a, new ziv(this, zgh2, ziw, zgh3), bqfb.INSTANCE);
                return a;
            }
        }
        return bqga.m112775a((Object) false);
    }

    /* renamed from: a */
    public boolean mo19158a(caae caae) {
        bnre i = this.f55172b.listIterator();
        while (i.hasNext()) {
            if (m45551a(caae, (yqf) i.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        bnre i = this.f55172b.listIterator();
        while (i.hasNext()) {
            if (m45552a(caah, (yqf) i.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        ziw ziw;
        synchronized (this) {
            ziw = (ziw) this.f55173c.remove(zgg);
        }
        if (ziw == null) {
            return false;
        }
        ziw.f55169a.mo30665d();
        return this.f55174d.mo19160a(ziw);
    }
}
