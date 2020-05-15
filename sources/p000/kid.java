package p000;

import java.util.concurrent.Executor;

/* renamed from: kid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kid extends keo {

    /* renamed from: a */
    private final aeky f24203a;

    public kid(aeky aeky) {
        this.f24203a = aeky;
    }

    /* renamed from: a */
    public final bqgg mo14431a(Executor executor) {
        return mo14499b(executor);
    }

    /* renamed from: b */
    public final bqgg mo14499b(Executor executor) {
        khy khy = new khy();
        kic kic = new kic(executor, this.f24203a);
        cazf.m127594a(kic);
        khy.f24179a = kic;
        cazf.m127595a(khy.f24179a, kic.class);
        return new khz(khy.f24179a).f24180a.mo75201b();
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        return bqdx.m112673a(mo14499b(kej.f23934a.f23937a), kib.f24200a, bqfb.INSTANCE);
    }
}
