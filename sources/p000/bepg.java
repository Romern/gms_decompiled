package p000;

import java.util.concurrent.Executor;

/* renamed from: bepg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bepg {

    /* renamed from: a */
    public final Executor f111977a;

    /* renamed from: b */
    public final bngs f111978b = bngx.m109377j();

    /* renamed from: c */
    public final bngs f111979c = bngx.m109377j();

    public bepg(Executor executor) {
        this.f111977a = executor;
    }

    /* renamed from: a */
    public final void mo60890a(int i, String str) {
        String[] split = str.split("#");
        bmxy.m108588a(split.length == 2);
        this.f111978b.mo67668c(new bepf(i, split[0], split[1]));
    }

    /* renamed from: b */
    public final void mo60891b(int i, String str) {
        String[] split = str.split("#");
        bmxy.m108588a(split.length == 2);
        this.f111978b.mo67668c(new bepe(i, split[0], split[1]));
    }
}
