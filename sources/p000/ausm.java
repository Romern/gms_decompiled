package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: ausm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ausm {

    /* renamed from: a */
    private final auss f92425a;

    /* renamed from: b */
    private final Object f92426b = new Object();

    /* renamed from: c */
    private final Map f92427c;

    /* renamed from: d */
    private final ExecutorService f92428d;

    public ausm(auss auss) {
        HashMap hashMap = new HashMap();
        soc soc = new soc(5, 9);
        this.f92425a = auss;
        this.f92427c = hashMap;
        soc.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        this.f92428d = soc;
    }

    /* renamed from: a */
    public final void mo50878a(ausl ausl) {
        mo50879a(ausl, 0, null);
    }

    /* renamed from: a */
    public final void mo50879a(ausl ausl, long j, ausa ausa) {
        synchronized (this.f92426b) {
            if (this.f92427c.containsKey(ausl)) {
                if (((Future) this.f92427c.get(ausl)).isDone()) {
                    this.f92427c.remove(ausl);
                } else {
                    throw new ausj("Duplicate operation");
                }
            }
            bqgg b = ((soc) this.f92428d).submit(ausl);
            this.f92427c.put(ausl, b);
            if (j != 0) {
                this.f92425a.mo50886a(new ausk(ausl, b, ausa), j);
            }
        }
    }

    /* renamed from: a */
    public final void mo50880a(ausl ausl, boolean z) {
        Future future;
        synchronized (this.f92426b) {
            if (this.f92427c.containsKey(ausl)) {
                future = (Future) this.f92427c.get(ausl);
                this.f92427c.remove(ausl);
            } else {
                throw new ausj("Operation is not submitted");
            }
        }
        if (future != null) {
            future.cancel(z);
        }
    }
}
