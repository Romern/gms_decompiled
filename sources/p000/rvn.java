package p000;

import java.util.List;

/* renamed from: rvn */
final /* synthetic */ class rvn implements Runnable {

    /* renamed from: a */
    private final List f43771a;

    /* renamed from: b */
    private final rvl f43772b;

    /* renamed from: c */
    private final ruf f43773c;

    public rvn(List list, rvl rvl, ruf ruf) {
        this.f43771a = list;
        this.f43772b = rvl;
        this.f43773c = ruf;
    }

    public final void run() {
        List list = this.f43771a;
        rvl rvl = this.f43772b;
        ruf ruf = this.f43773c;
        int i = rvq.f43776a;
        try {
            boolean a = rvq.m34533a(list, rvl);
            try {
                ruf.close();
            } finally {
                if (a && cdkp.m133842i()) {
                    rvw.m34543a(rvl);
                }
            }
        } catch (Throwable th) {
            ruf.close();
            throw th;
        }
    }
}
