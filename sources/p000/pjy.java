package p000;

import java.util.ArrayList;

/* renamed from: pjy */
final /* synthetic */ class pjy implements Runnable {

    /* renamed from: a */
    private final pkd f39415a;

    public pjy(pkd pkd) {
        this.f39415a = pkd;
    }

    public final void run() {
        pkd pkd = this.f39415a;
        if (pkd.f39428h != null) {
            if (pkd.f39432l) {
                pkd.f39423c.mo23856a("Timeout when discovering the new endpoint of %s.", pkd.f39230a);
            } else if (pkd.mo23213c()) {
                pkd.f39423c.mo23856a("Timeout when connecting to the new endpoint of %s.", pkd.f39230a);
            } else if (pkd.mo23211b()) {
                pkd.f39423c.mo23856a("Timeout when joining the app on new endpoint of %s.", pkd.f39230a);
            }
            pkd.f39432l = false;
            pkd.f39424d.mo23463b(pkd.f39430j);
            pkd.mo23294h();
            ArrayList arrayList = new ArrayList(pkd.f39434n);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pim) arrayList.get(i)).f39236e.mo23181a(2901);
            }
        }
    }
}
