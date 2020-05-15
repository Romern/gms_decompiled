package p000;

import java.util.List;

/* renamed from: pfn */
final /* synthetic */ class pfn implements Runnable {

    /* renamed from: a */
    private final pfu f39035a;

    public pfn(pfu pfu) {
        this.f39035a = pfu;
    }

    public final void run() {
        pfu pfu = this.f39035a;
        pfv pfv = pfu.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.f39064n = -1;
        pfv.f39065o = -1;
        pfv.f39060j = null;
        pfv.f39061k = null;
        pfv.f39062l = 0.0d;
        pfv.mo23024e();
        pfv.f39063m = false;
        pfv.f39066p = null;
        pfv pfv2 = pfu.f39047a;
        pfv2.f39072v = 1;
        List list = pfv2.f39071u;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((peo) list.get(i)).mo22979c();
        }
        pfu.f39047a.mo23020b();
        pfv pfv3 = pfu.f39047a;
        pfv3.mo23019a((ptt) pfv3.f39052b);
    }
}
