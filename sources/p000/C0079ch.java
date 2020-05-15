package p000;

import java.util.concurrent.Executor;

/* renamed from: ch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0079ch {

    /* renamed from: a */
    private final C0913cs f6835a;

    /* renamed from: b */
    private final C0073cc f6836b;

    /* renamed from: c */
    private final Executor f6837c = C0069c.f6314c;

    public C0079ch(C0073cc ccVar, C0913cs csVar) {
        this.f6836b = ccVar;
        this.f6835a = csVar;
    }

    /* renamed from: a */
    public final C0034at mo3893a() {
        C0913cs csVar = this.f6835a;
        C0073cc ccVar = this.f6836b;
        Executor executor = C0069c.f6313b;
        Executor executor2 = this.f6837c;
        return new C1477x(executor2, ccVar, csVar, executor, executor2).f27546b;
    }
}
