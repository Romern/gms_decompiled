package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: cicn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cicn extends chqp {

    /* renamed from: a */
    final /* synthetic */ cicv f189776a;

    /* renamed from: b */
    private final String f189777b;

    public cicn(cicv cicv, String str) {
        this.f189776a = cicv;
        bmxy.m108582a(str, "authority");
        this.f189777b = str;
    }

    /* renamed from: a */
    public final chqs mo70053a(chtv chtv, chqo chqo) {
        Executor executor;
        ScheduledExecutorService scheduledExecutorService;
        cicv cicv = this.f189776a;
        Executor executor2 = chqo.f189008c;
        if (executor2 != null) {
            executor = executor2;
        } else {
            executor = cicv.f189834i;
        }
        cicd cicd = cicv.f189817O;
        if (!cicv.f189804B) {
            scheduledExecutorService = this.f189776a.f189833h.mo85714a();
        } else {
            scheduledExecutorService = null;
        }
        chxr chxr = new chxr(chtv, executor, chqo, cicd, scheduledExecutorService, this.f189776a.f189805C);
        cicv cicv2 = this.f189776a;
        chxr.f189482h = cicv2.f189838m;
        chxr.f189483i = cicv2.f189839n;
        return chxr;
    }

    /* renamed from: a */
    public final String mo70054a() {
        return this.f189777b;
    }
}
