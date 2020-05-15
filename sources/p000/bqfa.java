package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: bqfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqfa extends bqeb {

    /* renamed from: d */
    public static final /* synthetic */ int f140576d = 0;

    /* renamed from: c */
    public bqez f140577c;

    public bqfa(bngm bngm, boolean z, Executor executor, bqeg bqeg) {
        super(bngm, z, false);
        this.f140577c = new bqex(this, bqeg, executor);
        mo69159c();
    }

    /* renamed from: a */
    public final void mo69154a(int i, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo69139d() {
        bqez bqez = this.f140577c;
        if (bqez != null) {
            bqez.mo69226e();
        }
    }

    /* renamed from: g */
    public final void mo69160g() {
        bqez bqez = this.f140577c;
        if (bqez != null) {
            bqez.mo69197d();
        }
    }

    public bqfa(bngm bngm, boolean z, Executor executor, Callable callable) {
        super(bngm, z, false);
        this.f140577c = new bqey(this, callable, executor);
        mo69159c();
    }

    /* renamed from: a */
    public final void mo69157a(bqea bqea) {
        super.mo69157a(bqea);
        if (bqea == bqea.OUTPUT_FUTURE_DONE) {
            this.f140577c = null;
        }
    }
}
