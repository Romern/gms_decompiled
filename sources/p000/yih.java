package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: yih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yih {

    /* renamed from: a */
    public final Map f53859a = new HashMap();

    /* renamed from: b */
    public final Map f53860b = new HashMap();

    /* renamed from: c */
    public final Map f53861c = new HashMap();

    /* renamed from: a */
    static bngx m44182a(yln yln) {
        return yln.mo30570a(bngx.m109376e());
    }

    /* renamed from: b */
    public final void mo30542b(yln yln) {
        caae caae = ((yfr) bnjd.m109587b(m44182a(yln))).f53734a;
        mo30543c(yln);
        mo30540a(caae);
    }

    /* renamed from: c */
    public final void mo30543c(yln yln) {
        bnre i = m44182a(yln).listIterator();
        while (i.hasNext()) {
            caae caae = ((yfr) i.next()).f53734a;
            String str = caae.f172326b;
            bmxy.m108605b(!this.f53860b.containsKey(str), "%s was seen twice", str);
            this.f53859a.put(str, yln);
            this.f53860b.put(str, caae);
        }
    }

    /* renamed from: a */
    public final void mo30540a(caae caae) {
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        this.f53861c.put(caah.f172336b, caae);
    }

    /* renamed from: a */
    public final void mo30541a(ynm ynm) {
        mo30543c(new ylb(ynm));
    }
}
