package p000;

import android.content.Context;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;

/* renamed from: at */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0034at {

    /* renamed from: c */
    static final Object f2150c = new Object();

    /* renamed from: a */
    private C1207n f2151a;

    /* renamed from: b */
    final Object f2152b;

    /* renamed from: d */
    int f2153d;

    /* renamed from: e */
    volatile Object f2154e;

    /* renamed from: f */
    public int f2155f;

    /* renamed from: g */
    private volatile Object f2156g;

    /* renamed from: h */
    private boolean f2157h;

    /* renamed from: i */
    private boolean f2158i;

    /* renamed from: j */
    private final Runnable f2159j;

    public C0034at() {
        this.f2152b = new Object();
        this.f2151a = new C1207n();
        this.f2153d = 0;
        this.f2154e = f2150c;
        this.f2159j = new C0028ap(this);
        this.f2156g = f2150c;
        this.f2155f = -1;
    }

    /* renamed from: a */
    static void m1989a(String str) {
        C0069c.m3830a();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: b */
    private final void m1990b(C0033as asVar) {
        if (!asVar.f2102d) {
            return;
        }
        if (!asVar.mo2290a()) {
            asVar.mo2370a(false);
            return;
        }
        int i = asVar.f2103e;
        int i2 = this.f2155f;
        if (i < i2) {
            asVar.f2103e = i2;
            asVar.f2101c.mo2511a(this.f2156g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2443a() {
    }

    /* renamed from: b */
    public Object mo2448b() {
        Object obj = this.f2156g;
        if (obj == f2150c) {
            return null;
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo2451c() {
    }

    /* renamed from: d */
    public final boolean mo2452d() {
        return this.f2153d > 0;
    }

    /* renamed from: l */
    public final void mo2453l(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.f2152b) {
            obj2 = this.f2154e;
            obj3 = f2150c;
            this.f2154e = obj;
        }
        if (obj2 == obj3) {
            C0069c.m3830a().mo3630a(this.f2159j);
        }
    }

    public C0034at(C0008af afVar, Context context) {
        this(aslx.LOADING);
        aslx aslx;
        if (!asjk.m74228b(context)) {
            aslx = aslx.INCORRECT;
        } else {
            aslx = aslx.CORRECT;
        }
        mo2450b(aslx);
        afVar.mo557a(new aslq(this, context));
    }

    /* renamed from: a */
    public final void mo2444a(C0013ak akVar) {
        m1989a("removeObservers");
        Iterator it = this.f2151a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((C0033as) entry.getValue()).mo2309a(akVar)) {
                mo2449b((C0038ax) entry.getKey());
            }
        }
    }

    /* renamed from: a */
    public void mo2445a(C0013ak akVar, C0038ax axVar) {
        m1989a("observe");
        if (akVar.getLifecycle().mo556a() != C0007ae.DESTROYED) {
            C0032ar arVar = new C0032ar(this, akVar, axVar);
            C0033as asVar = (C0033as) this.f2151a.mo15481a(axVar, arVar);
            if (asVar != null && !asVar.mo2309a(akVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (asVar == null) {
                akVar.getLifecycle().mo557a(arVar);
            }
        }
    }

    /* renamed from: b */
    public void mo2449b(C0038ax axVar) {
        m1989a("removeObserver");
        C0033as asVar = (C0033as) this.f2151a.mo11576b(axVar);
        if (asVar != null) {
            asVar.mo2310b();
            asVar.mo2370a(false);
        }
    }

    public C0034at(C0008af afVar, atya atya) {
        this(aslx.LOADING);
        aslx aslx;
        if (atya == null) {
            mo2450b(aslx.INCORRECT);
            return;
        }
        if (!atya.mo50314c()) {
            aslx = aslx.INCORRECT;
        } else {
            aslx = aslx.CORRECT;
        }
        mo2450b(aslx);
        afVar.mo557a(new aslp(this, atya));
    }

    /* renamed from: b */
    public void mo2450b(Object obj) {
        m1989a("setValue");
        this.f2155f++;
        this.f2156g = obj;
        mo2446a((C0033as) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2446a(C0033as asVar) {
        if (!this.f2157h) {
            this.f2157h = true;
            do {
                this.f2158i = false;
                if (asVar == null) {
                    C1124k a = this.f2151a.mo15482a();
                    while (a.hasNext()) {
                        m1990b((C0033as) ((C1097j) a.next()).f22015b);
                        if (this.f2158i) {
                            break;
                        }
                    }
                } else {
                    m1990b(asVar);
                    asVar = null;
                }
            } while (this.f2158i);
            this.f2157h = false;
            return;
        }
        this.f2158i = true;
    }

    public C0034at(Object obj) {
        this.f2152b = new Object();
        this.f2151a = new C1207n();
        this.f2153d = 0;
        this.f2154e = f2150c;
        this.f2159j = new C0028ap(this);
        this.f2156g = obj;
        this.f2155f = 0;
    }

    /* renamed from: a */
    public final void mo2447a(C0038ax axVar) {
        m1989a("observeForever");
        C0031aq aqVar = new C0031aq(this, axVar);
        C0033as asVar = (C0033as) this.f2151a.mo15481a(axVar, aqVar);
        if (asVar instanceof C0032ar) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (asVar == null) {
            aqVar.mo2370a(true);
        }
    }
}
