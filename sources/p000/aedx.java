package p000;

import java.util.concurrent.Executor;

/* renamed from: aedx */
final /* synthetic */ class aedx implements bqeh {

    /* renamed from: a */
    private final bbjb f63242a;

    /* renamed from: b */
    private final Executor f63243b;

    public aedx(bbjb bbjb, Executor executor) {
        this.f63242a = bbjb;
        this.f63243b = executor;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbjb bbjb = this.f63242a;
        bngx bngx = (bngx) obj;
        return bqga.m112782b(bngx).mo69214a(new aedm(bbjb, bngx), this.f63243b);
    }
}
