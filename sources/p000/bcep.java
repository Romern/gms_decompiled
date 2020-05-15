package p000;

import java.util.Random;

/* renamed from: bcep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcep implements bqfp {

    /* renamed from: a */
    public final bceh f104047a;

    /* renamed from: b */
    final /* synthetic */ bceq f104048b;

    /* renamed from: c */
    private final Random f104049c = new Random();

    /* renamed from: d */
    private int f104050d = 0;

    /* renamed from: e */
    private long f104051e = 0;

    /* renamed from: f */
    private final bqgy f104052f;

    public bcep(bceq bceq, bceh bceh, bqgy bqgy) {
        this.f104048b = bceq;
        this.f104047a = bceh;
        this.f104052f = bqgy;
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        this.f104052f.mo69138b(obj);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        long j;
        if (this.f104050d != 0) {
            double d = (double) this.f104051e;
            double d2 = this.f104047a.mo56732a().mo56720b().mo56727d();
            Double.isNaN(d);
            j = Math.min((long) (d * d2), this.f104047a.mo56732a().mo56720b().mo56725b());
        } else {
            j = this.f104047a.mo56732a().mo56720b().mo56726c();
        }
        long nextInt = j + ((long) this.f104049c.nextInt(this.f104047a.mo56732a().mo56720b().mo56728e()));
        if (this.f104050d >= this.f104047a.mo56732a().mo56720b().mo56724a() || !bceq.m88888a(chuv.m149608a(th))) {
            this.f104052f.mo69136a(th);
            return;
        }
        this.f104050d++;
        this.f104051e = nextInt;
        this.f104048b.f104053a.postDelayed(new bceo(this, this), nextInt);
    }
}
