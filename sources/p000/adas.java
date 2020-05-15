package p000;

import java.util.concurrent.Executor;

/* renamed from: adas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adas extends bqfo {

    /* renamed from: a */
    private final adap f61221a;

    /* renamed from: c */
    private bqfe f61222c = new bqfe();

    public adas(bqgg bqgg, adap adap) {
        super(bqgg);
        this.f61221a = adap;
        bqgg.mo741a(new adaq(this), adap);
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f61222c.mo69201a(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo33298d() {
        this.f61222c = new bqfe();
        this.f140601b.mo741a(new adar(this), this.f61221a);
    }

    /* renamed from: e */
    public final void mo33299e() {
        this.f61222c.mo69200a();
    }
}
