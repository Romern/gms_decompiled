package p000;

import java.util.List;

/* renamed from: pfp */
final /* synthetic */ class pfp implements Runnable {

    /* renamed from: a */
    private final pfu f39038a;

    public pfp(pfu pfu) {
        this.f39038a = pfu;
    }

    public final void run() {
        pfv pfv = this.f39038a.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.f39072v = 3;
        List list = pfv.f39071u;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((peo) list.get(i)).mo22978b();
        }
    }
}
