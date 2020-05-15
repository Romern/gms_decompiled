package p000;

import android.database.Cursor;
import android.util.Pair;
import java.util.concurrent.Callable;

/* renamed from: bcdh */
final /* synthetic */ class bcdh implements Callable {

    /* renamed from: a */
    private final bcdi f103996a;

    /* renamed from: b */
    private final int f103997b;

    /* renamed from: c */
    private final bngs f103998c;

    /* renamed from: d */
    private final int f103999d;

    public bcdh(bcdi bcdi, int i, bngs bngs, int i2) {
        this.f103996a = bcdi;
        this.f103997b = i;
        this.f103998c = bngs;
        this.f103999d = i2;
    }

    public final Object call() {
        boolean z;
        bcdi bcdi = this.f103996a;
        int i = this.f103997b;
        bngs bngs = this.f103998c;
        int i2 = this.f103999d;
        int g = bcdi.f103993c.mo56693g();
        int i3 = 0;
        while (true) {
            bdae bdae = bcdi.f103992b;
            bcde bcde = bcdi.f103994d;
            Cursor a = bdae.mo54677a(bcde.f103982c, bcde.f103983d, bcde.f103984e, bcde.f103985f, bcde.f103986g, bcdf.m88812a(g, i));
            try {
                bngx bngx = (bngx) bcdi.f104000e.apply(a);
                if (!bngx.isEmpty()) {
                    bngx a2 = bcdi.mo56709a(bngx);
                    bngs.mo67666b((Iterable) a2);
                    i3 += a2.size();
                    g += bngx.size();
                    if (a != null) {
                        a.close();
                        continue;
                    }
                    if (i3 >= i2) {
                        break;
                    }
                } else if (a != null) {
                    a.close();
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (i3 >= i2) {
            z = true;
        } else {
            z = false;
        }
        return Pair.create(bngs.mo67664a().subList(0, Math.min(i3, i2)), Boolean.valueOf(z));
        throw th;
    }
}
