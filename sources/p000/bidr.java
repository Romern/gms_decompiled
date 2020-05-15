package p000;

/* renamed from: bidr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bidv f120317a;

    public bidr(bidv bidv) {
        this.f120317a = bidv;
    }

    public final void run() {
        C1245ok okVar;
        bhpw bhpw = this.f120317a.f120331f.f119380b;
        bhxl bhxl = bhpw.f119279a;
        bhyd bhyd = bhxl.f119823b;
        bhyd.f119877h = false;
        bhyd.f119879j.f119893a.mo64430b();
        bhxl.f119822a.mo64483a();
        bhxk bhxk = bhxl.f119824c;
        int i = 0;
        while (true) {
            okVar = bhxk.f119819d;
            if (i >= okVar.f26809h) {
                break;
            }
            ((bhzr) okVar.mo15621c(i)).mo64461b();
            i++;
        }
        okVar.clear();
        bhxl.f119826e.clear();
        bhxl.f119825d = false;
        bicz bicz = bhpw.f119280b;
        bicz.f120271d.mo64175a();
        bicz.f120270c.mo64605b(bicz);
        bigx bigx = this.f120317a.f120333h;
        bigi bigi = bigx.f120556f;
        bigi.f120521n = null;
        bigi.mo64592a();
        bigx.f120563m.mo34511a(bigx.f120550b, false);
        bigx.f120557g.mo34507b();
        bigb bigb = bigx.f120559i;
        if (bigb.f120494d) {
            bigb.mo64586a(true);
            bigb.f120494d = false;
            bigb.f120492b = null;
        }
        rkb rkb = bigx.f120561k;
        rkb.mo24790a((rjz) new bigl(bigx, rkb));
        this.f120317a.f120332g.f120052b.shutdown();
        this.f120317a.f120329d.shutdown();
        this.f120317a.f120330e.shutdown();
        this.f120317a.f120337l.shutdown();
        this.f120317a.f120327b.quit();
        this.f120317a.f120338m.shutdown();
    }
}
