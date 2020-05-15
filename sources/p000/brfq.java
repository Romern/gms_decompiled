package p000;

import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;
import java.util.List;

/* renamed from: brfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brfq implements brff {

    /* renamed from: a */
    final /* synthetic */ brgm f142770a;

    /* renamed from: b */
    final /* synthetic */ List f142771b;

    /* renamed from: c */
    final /* synthetic */ brgj f142772c;

    public brfq(brgj brgj, brgm brgm, List list) {
        this.f142772c = brgj;
        this.f142770a = brgm;
        this.f142771b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69479a(Object obj) {
        Felica felica = (Felica) obj;
        try {
            felica.activateFelica((String[]) this.f142771b.toArray(new String[0]), new brfp(this, felica));
        } catch (FelicaException e) {
            this.f142772c.mo69502a(8, e);
            this.f142772c.mo69511d();
            this.f142772c.f142819g.execute(new brfj(this.f142770a, e));
            this.f142772c.mo69512d(5);
            this.f142772c.mo69509c();
        }
    }
}
