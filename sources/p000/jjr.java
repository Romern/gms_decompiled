package p000;

/* renamed from: jjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f22634a;

    /* renamed from: b */
    final /* synthetic */ jnt f22635b;

    /* renamed from: c */
    final /* synthetic */ jjs f22636c;

    public jjr(jjs jjs, int i, jnt jnt) {
        this.f22636c = jjs;
        this.f22634a = i;
        this.f22635b = jnt;
    }

    public final void run() {
        jjs jjs;
        jnt jnt;
        int i = this.f22634a;
        if (i == 2) {
            String d = this.f22635b.mo13824d();
            qxo qxo = (qxo) this.f22636c.f22637a.f22645h.get(d);
            if (qxo != null) {
                this.f22636c.f22637a.f22649l.mo14044a(qxo);
            }
            this.f22636c.f22637a.f22645h.remove(d);
            return;
        }
        if (i == 3) {
            String d2 = this.f22635b.mo13824d();
            if (this.f22636c.f22637a.f22644g.containsKey(this.f22635b.mo13824d())) {
                this.f22636c.f22637a.f22646i.add(d2);
                this.f22636c.f22637a.f22642e.remove(this.f22635b);
                this.f22636c.f22637a.mo13802c();
                return;
            }
            jjs = this.f22636c;
            jnt = this.f22635b;
        } else if (i == 0) {
            jjs = this.f22636c;
            jnt = this.f22635b;
        } else {
            return;
        }
        jjs.mo13796a(jnt);
    }
}
