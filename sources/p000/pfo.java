package p000;

import java.util.List;

/* renamed from: pfo */
final /* synthetic */ class pfo implements Runnable {

    /* renamed from: a */
    private final pfu f39036a;

    /* renamed from: b */
    private final int f39037b;

    public pfo(pfu pfu, int i) {
        this.f39036a = pfu;
        this.f39037b = i;
    }

    public final void run() {
        pfu pfu = this.f39036a;
        int i = this.f39037b;
        int i2 = 0;
        if (i == 0) {
            pfv pfv = pfu.f39047a;
            ptx ptx = pfv.f39050a;
            pfv.f39072v = 2;
            pfv.f39054d = true;
            pfv.f39055e = true;
            List list = pfv.f39071u;
            int size = list.size();
            while (i2 < size) {
                ((peo) list.get(i2)).mo22976a();
                i2++;
            }
            return;
        }
        pfv pfv2 = pfu.f39047a;
        ptx ptx2 = pfv.f39050a;
        pfv2.f39072v = 1;
        List list2 = pfv2.f39071u;
        int size2 = list2.size();
        while (i2 < size2) {
            ((peo) list2.get(i2)).mo22977a(i);
            i2++;
        }
        pfu.f39047a.mo23020b();
    }
}
