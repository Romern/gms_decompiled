package p000;

import java.util.concurrent.Executor;

/* renamed from: liu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class liu extends bqfo {

    /* renamed from: a */
    final /* synthetic */ liv f26170a;

    /* renamed from: c */
    private bqfe f26171c = new bqfe();

    /* renamed from: d */
    private boolean f26172d = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public liu(liv liv, bqgg bqgg) {
        super(bqgg);
        this.f26170a = liv;
        bqgg.mo741a(new lit(this), liv.f26174b);
    }

    /* renamed from: a */
    public final void mo15184a() {
        this.f26170a.mo15193d();
        bqfe bqfe = new bqfe();
        this.f26171c = bqfe;
        if (this.f26172d) {
            bqfe.mo69200a();
        }
    }

    /* renamed from: b */
    public final void mo15185b() {
        this.f26170a.mo15193d();
        if (!this.f26172d && this.f26170a.f26175c && isDone()) {
            this.f26171c.mo69200a();
            this.f26172d = true;
        }
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f26171c.mo69201a(runnable, executor);
    }
}
