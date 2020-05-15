package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ciij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ciij {

    /* renamed from: a */
    public final chqp f190402a;

    /* renamed from: b */
    public final chqo f190403b;

    protected ciij(chqp chqp, chqo chqo) {
        bmxy.m108582a(chqp, "channel");
        this.f190402a = chqp;
        bmxy.m108582a(chqo, "callOptions");
        this.f190403b = chqo;
    }

    /* renamed from: a */
    public final ciij mo86137a(long j, TimeUnit timeUnit) {
        return mo69274a(this.f190402a, this.f190403b.mo85544a(j, timeUnit));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ciij mo69274a(chqp chqp, chqo chqo);

    /* renamed from: a */
    public final ciij mo86138a(chqm chqm) {
        chqp chqp = this.f190402a;
        chqo chqo = new chqo(this.f190403b);
        chqo.f189009d = chqm;
        return mo69274a(chqp, chqo);
    }

    /* renamed from: a */
    public final ciij mo86139a(chqn chqn, Object obj) {
        return mo69274a(this.f190402a, this.f190403b.mo85545a(chqn, obj));
    }
}
