package p000;

import java.util.concurrent.Executor;

/* renamed from: bacg */
final /* synthetic */ class bacg implements bmzi {

    /* renamed from: a */
    private final String f100469a;

    /* renamed from: b */
    private final Integer f100470b;

    /* renamed from: c */
    private final Executor f100471c;

    public bacg(String str, Integer num, Executor executor) {
        this.f100469a = str;
        this.f100470b = num;
        this.f100471c = executor;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        String str = this.f100469a;
        Integer num = this.f100470b;
        Executor executor = this.f100471c;
        cifv b = cifv.m150191b(str, num.intValue());
        b.transportExecutor(executor);
        return bqga.m112775a(b.mo85581b());
    }
}
