package p000;

import java.util.List;

/* renamed from: puv */
final /* synthetic */ class puv implements Runnable {

    /* renamed from: a */
    private final puw f40312a;

    /* renamed from: b */
    private final List f40313b;

    public puv(puw puw, List list) {
        this.f40312a = puw;
        this.f40313b = list;
    }

    public final void run() {
        puw puw = this.f40312a;
        List list = this.f40313b;
        ala ala = new ala();
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ala.mo954a((ako) list.get(i));
            }
        }
        puw.mo949a(ala.mo953a());
    }
}
