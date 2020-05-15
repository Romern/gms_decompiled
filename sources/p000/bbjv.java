package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: bbjv */
final /* synthetic */ class bbjv implements bqeh {

    /* renamed from: a */
    private final bbkb f102793a;

    /* renamed from: b */
    private final List f102794b;

    public bbjv(bbkb bbkb, List list) {
        this.f102793a = bbkb;
        this.f102794b = list;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbkb bbkb = this.f102793a;
        List list = this.f102794b;
        bngs j = bngx.m109377j();
        bnre i = ((bngx) obj).listIterator();
        while (i.hasNext()) {
            batr batr = (batr) i.next();
            if (bbkb.m88117a(batr)) {
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        j.mo67668c(bbkb.f102800a.mo55996a(bbkb.m88119b(batr)));
                        break;
                    }
                    int i3 = i2 + 1;
                    if (bbkb.m88118a(batr, (Account) list.get(i2))) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return bqdx.m112674a(bqga.m112787d(j.mo67664a()), bbjx.f102796a, bqfb.INSTANCE);
    }
}
