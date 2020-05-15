package p000;

import java.util.concurrent.Future;

/* renamed from: bqdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqdy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgg f140529a;

    /* renamed from: b */
    final /* synthetic */ int f140530b;

    /* renamed from: c */
    final /* synthetic */ bqeb f140531c;

    public bqdy(bqeb bqeb, bqgg bqgg, int i) {
        this.f140531c = bqeb;
        this.f140529a = bqgg;
        this.f140530b = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqeb.a(int, java.util.concurrent.Future):void
     arg types: [int, bqgg]
     candidates:
      bqeb.a(java.util.Set, java.lang.Throwable):boolean
      bqeb.a(int, java.lang.Object):void
      bqdt.a(java.lang.StringBuilder, java.lang.Object):void
      bqdt.a(java.lang.Runnable, java.util.concurrent.Executor):void
      bqgg.a(java.lang.Runnable, java.util.concurrent.Executor):void
      bqgg.a(java.lang.Runnable, java.util.concurrent.Executor):void
      bqeb.a(int, java.util.concurrent.Future):void */
    public final void run() {
        try {
            if (!this.f140529a.isCancelled()) {
                this.f140531c.mo69155a(this.f140530b, (Future) this.f140529a);
            } else {
                bqeb bqeb = this.f140531c;
                bqeb.f140538a = null;
                bqeb.cancel(false);
            }
        } finally {
            this.f140531c.mo69156a((bngm) null);
        }
    }
}
