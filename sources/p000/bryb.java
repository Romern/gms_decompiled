package p000;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: bryb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bryb extends chul {

    /* renamed from: a */
    public final bngx f143623a;

    /* renamed from: b */
    public final Queue f143624b = new ArrayDeque();

    /* renamed from: c */
    public final Set f143625c;

    /* renamed from: d */
    public int f143626d;

    /* renamed from: e */
    public boolean f143627e;

    /* renamed from: f */
    public boolean f143628f;

    /* renamed from: g */
    public chtr f143629g;

    /* renamed from: h */
    public chuv f143630h;

    /* renamed from: i */
    public chtr f143631i;

    /* renamed from: k */
    private final Executor f143632k = bqgs.m112813a(bqfb.INSTANCE);

    /* renamed from: l */
    private final LinkedHashMap f143633l = new LinkedHashMap();

    /* renamed from: m */
    private final LinkedHashMap f143634m = new LinkedHashMap();

    /* renamed from: n */
    private boolean f143635n;

    public bryb(chqr chqr, bngx bngx, Set set) {
        super(chqr);
        this.f143623a = bngx;
        this.f143626d = bngx.size();
        this.f143625c = set;
    }

    /* renamed from: a */
    public final void mo25569a(chtr chtr) {
        this.f143629g = chtr;
        this.f143632k.execute(new brxx(this));
    }

    /* renamed from: b */
    public final void mo70077b() {
        if (this.f143627e) {
            for (brya brya : this.f143624b) {
                Iterator it = bnkn.m109666a((List) this.f143623a.subList(0, brya.f143622c)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        for (brxe brxe : bnkn.m109666a((List) it.next())) {
                            if (this.f143625c.contains(brxe)) {
                                bmxy.m108601b(brya.f143620a instanceof bxxc, "Only MessageLite is supported");
                                new brxd((bxxc) brya.f143620a);
                                try {
                                    int i = brxe.mo70018c().f143655b;
                                } catch (Throwable th) {
                                    this.f143630h = chuv.m149608a(th);
                                    this.f143631i = new chtr();
                                    mo70079d();
                                    this.f143635n = true;
                                    return;
                                }
                            }
                        }
                        if (!brya.mo70075a()) {
                            brya.f143622c--;
                        } else {
                            return;
                        }
                    }
                }
            }
            while (!this.f143624b.isEmpty()) {
                brya brya2 = (brya) this.f143624b.peek();
                if (brya2.mo70075a() || brya2.f143622c != 0) {
                    break;
                }
                this.f189187j.mo25571a(((brya) this.f143624b.poll()).f143620a);
            }
            mo70078c();
        }
    }

    /* renamed from: c */
    public final void mo70078c() {
        if (!mo70076a() && this.f143624b.isEmpty() && this.f143628f && !this.f143635n) {
            mo70079d();
        }
    }

    /* renamed from: d */
    public final void mo70079d() {
        brwz brwz = new brwz(this.f143630h, this.f143631i);
        for (List list : bnkn.m109666a((List) this.f143623a)) {
            for (brxe brxe : bnkn.m109666a(list)) {
                if (this.f143625c.contains(brxe)) {
                    try {
                        int i = brxe.mo70013a(brwz).f143655b;
                    } catch (Throwable th) {
                        this.f143630h = chuv.m149608a(th);
                        this.f143631i = new chtr();
                    }
                }
            }
        }
        if (this.f143634m.isEmpty()) {
            this.f189187j.mo25570a(this.f143630h, this.f143631i);
        }
    }

    /* renamed from: a */
    public final void mo25570a(chuv chuv, chtr chtr) {
        this.f143632k.execute(new brxz(this, chuv, chtr));
    }

    /* renamed from: a */
    public final void mo25571a(Object obj) {
        this.f143632k.execute(new brxy(this, obj));
    }

    /* renamed from: a */
    public final boolean mo70076a() {
        return !this.f143633l.isEmpty();
    }
}
