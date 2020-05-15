package p000;

import java.util.concurrent.Executor;

/* renamed from: cm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0084cm extends C0067by {

    /* renamed from: b */
    public final Object f7037b = new Object();

    /* renamed from: c */
    public Object f7038c = null;

    /* renamed from: d */
    public Object f7039d = null;

    /* renamed from: a */
    public final void mo3609a(int i, Executor executor, C0085cn cnVar) {
        C0081cj cjVar = new C0081cj(this, cnVar);
        mo3968a(new C0082ck(i), cjVar);
        C0076ce ceVar = cjVar.f6921a;
        synchronized (ceVar.f6597c) {
            ceVar.f6598d = executor;
        }
    }

    /* renamed from: a */
    public abstract void mo3968a(C0082ck ckVar, C0081cj cjVar);

    /* renamed from: a */
    public abstract void mo3969a(C0083cl clVar, C0080ci ciVar);

    /* renamed from: a */
    public final boolean mo3611a() {
        return false;
    }

    /* renamed from: b */
    public final Object mo3612b() {
        return null;
    }

    /* renamed from: b */
    public final void mo3613b(Executor executor, C0085cn cnVar) {
        Object obj;
        synchronized (this.f7037b) {
            obj = this.f7039d;
        }
        if (obj != null) {
            new C0083cl(obj);
            new C0080ci(this, 2, executor, cnVar);
            return;
        }
        cnVar.mo3995a(2, C0086co.f7128a);
    }

    /* renamed from: a */
    public final void mo3610a(Executor executor, C0085cn cnVar) {
        Object obj;
        synchronized (this.f7037b) {
            obj = this.f7038c;
        }
        if (obj != null) {
            mo3969a(new C0083cl(obj), new C0080ci(this, 1, executor, cnVar));
        } else {
            cnVar.mo3995a(1, C0086co.f7128a);
        }
    }
}
