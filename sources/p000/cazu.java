package p000;

import java.util.concurrent.Executor;

/* renamed from: cazu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cazu extends cazt implements Executor, bqeh {

    /* renamed from: b */
    private final cijl f176460b;

    /* renamed from: c */
    private final cbag f176461c;

    /* renamed from: d */
    private final cijl f176462d;

    /* renamed from: e */
    private volatile cbaf f176463e = null;

    protected cazu(cijl cijl, cbag cbag, cijl cijl2) {
        cazf.m127594a(cijl);
        this.f176460b = cijl;
        this.f176461c = cbag;
        cazf.m127594a(cijl2);
        this.f176462d = cijl2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bqgg mo14448a();

    @Deprecated
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        this.f176463e.mo75217c();
        try {
            return mo14449b(obj);
        } finally {
            this.f176463e.mo75218d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bqgg mo14449b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final bqgg mo75209c() {
        this.f176463e = ((cbak) this.f176460b.mo6445a()).mo75222a(this.f176461c);
        this.f176463e.mo75213a();
        bqgg a = bqdx.m112674a(mo14448a(), this, this);
        this.f176463e.mo75212a(a);
        return a;
    }

    @Deprecated
    public final void execute(Runnable runnable) {
        this.f176463e.mo75216b();
        ((Executor) this.f176462d.mo6445a()).execute(runnable);
    }
}
