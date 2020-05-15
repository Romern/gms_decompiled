package p000;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: bynm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bynm implements byne {

    /* renamed from: a */
    public final bynd f167120a;

    /* renamed from: b */
    private final Executor f167121b;

    /* renamed from: c */
    private volatile bqgg f167122c = bqga.m112775a((Object) false);

    /* renamed from: d */
    private final acrs f167123d;

    public bynm(acrt acrt, Executor executor, bynd bynd) {
        bmxy.m108581a(bynd);
        this.f167120a = bynd;
        this.f167121b = executor;
        String str = bynd.f167104a;
        Context b = ((acsc) acrt.f60643a).mo6445a();
        acrt.m49779a(b, 1);
        acrt.m49779a(str, 2);
        this.f167123d = new acrs(b, str);
    }

    /* renamed from: a */
    private final void m124989a(Runnable runnable) {
        if (this.f167122c.isDone()) {
            if (!this.f167122c.isCancelled()) {
                try {
                    if (!((Boolean) bqga.m112780a((Future) this.f167122c)).booleanValue()) {
                        return;
                    }
                } catch (Exception e) {
                    return;
                }
            } else {
                return;
            }
        }
        bqga.m112781a(this.f167122c, new bynk(this, runnable), this.f167121b);
    }

    /* renamed from: a */
    public final bynd mo74395a() {
        return this.f167120a;
    }

    /* renamed from: a */
    public final void mo74396a(botw botw, bott bott) {
        m124989a(new bynj(this, bott, botw));
    }

    /* renamed from: a */
    public final void mo74397a(botw botw, botw botw2) {
        m124989a(new byni(this, botw, botw2));
    }

    /* renamed from: a */
    public final void mo74398a(botw botw, botx botx) {
        m124989a(new bynh(this, botw, botx));
    }

    /* renamed from: a */
    public final void mo74399a(botw botw, botz botz) {
        m124989a(new byng(this, botw, botz));
    }

    /* renamed from: a */
    public final void mo74409a(boty boty) {
        acrs acrs = this.f167123d;
        acrs.f60642a.mo24335a(boty.serializeToBytes()).mo24327b();
    }

    /* renamed from: a */
    public final void mo74400a(bqgg bqgg) {
        bqga.m112781a(bqgg, new bynl(this), this.f167121b);
        bmxy.m108581a(bqgg);
        this.f167122c = bqgg;
    }
}
