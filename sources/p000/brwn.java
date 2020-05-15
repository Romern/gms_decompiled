package p000;

import java.util.concurrent.Executor;

/* renamed from: brwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brwn extends chqp {

    /* renamed from: a */
    private final blie f143533a;

    /* renamed from: b */
    private final String f143534b;

    /* renamed from: c */
    private final Executor f143535c;

    public brwn(bruv bruv, bruu bruu, Executor executor) {
        bruc bruc = (bruc) bruu;
        this.f143534b = bruc.f143389a.getAuthority();
        this.f143535c = bruc.f143390b;
        this.f143533a = new blie(new brwd(bruv, bruu), executor);
    }

    /* renamed from: a */
    public final String mo70054a() {
        return this.f143534b;
    }

    /* renamed from: a */
    public final chqs mo70053a(chtv chtv, chqo chqo) {
        Executor executor = chqo.f189008c;
        bqgg a = this.f143533a.mo66570a();
        brwe brwe = new brwe(chtv, chqo);
        if (executor == null) {
            executor = this.f143535c;
        }
        return new brwm(bqdx.m112673a(a, brwe, executor));
    }
}
