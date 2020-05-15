package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: brvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brvs implements brxe {

    /* renamed from: a */
    static final chqn f143476a = chqn.m149405a("com.google.frameworks.client.data.android.impl.AuthAsyncInterceptor", false);

    /* renamed from: c */
    private static final chtn f143477c = chtn.m149535a("Authorization", chtr.f189134b);

    /* renamed from: d */
    private static final chtn f143478d = chtn.m149535a("X-Auth-Time", chtr.f189134b);

    /* renamed from: b */
    public final brux f143479b;

    /* renamed from: e */
    private final Executor f143480e;

    /* renamed from: f */
    private bqgg f143481f;

    public brvs(brux brux, Executor executor) {
        this.f143479b = brux;
        this.f143480e = executor;
    }

    /* renamed from: a */
    public final bryh mo70011a(brxa brxa) {
        boolean z;
        chqo chqo = brxa.f143554b;
        if (chqo.mo85548a(brvb.f143438a) != null) {
            return bryh.f143647a;
        }
        if (chqo.mo85548a(brua.f143377a) != null) {
            if (chqo.mo85548a(bruw.f143433a) == null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "Must set exactly one of ApiKeyOption or AuthContext if AuthContextManager is provided.");
            return bryh.f143647a;
        }
        bqgh a = bqgh.m112796a(new brvr(this, chqo, (bruw) chqo.mo85548a(bruw.f143433a), ((brum) chqo.mo85548a(brum.f143417a)).mo69984c()));
        this.f143480e.execute(a);
        this.f143481f = a;
        return bryh.m114872a(a);
    }

    /* renamed from: c */
    public final bryi mo70018c() {
        return bryi.f143654a;
    }

    /* renamed from: b */
    public final bryh mo70016b() {
        return bryh.f143647a;
    }

    /* renamed from: b */
    public final bryh mo70017b(brxa brxa) {
        try {
            bruz bruz = (bruz) bqga.m112780a((Future) this.f143481f);
            chtr chtr = brxa.f143553a;
            chtn chtn = f143477c;
            String valueOf = String.valueOf(bruz.f143434a);
            chtr.mo85648a(chtn, valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
            brxa.f143553a.mo85648a(f143478d, Long.toString(bruz.f143435b));
            return bryh.f143647a;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof bruy) {
                return bryh.m114874a(chuv.m149607a(chus.UNAUTHENTICATED).mo85692c(cause.getCause()), new chtr());
            }
            return bryh.m114874a(chuv.m149608a(cause), new chtr());
        }
    }

    /* renamed from: a */
    public final bryh mo70012a(brxb brxb) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryi mo70013a(brwz brwz) {
        return bryi.f143654a;
    }

    /* renamed from: a */
    public final bryi mo70014a(brxc brxc) {
        return bryi.f143654a;
    }
}
