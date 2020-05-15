package p000;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: cev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cev {

    /* renamed from: a */
    final Map f6629a = new HashMap();

    /* renamed from: b */
    public final ReferenceQueue f6630b = new ReferenceQueue();

    /* renamed from: c */
    public volatile boolean f6631c;

    /* renamed from: d */
    public volatile cet f6632d;

    public cev() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new cer());
        newSingleThreadExecutor.execute(new ces(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo3784a(cdg cdg) {
        ceu ceu = (ceu) this.f6629a.remove(cdg);
        if (ceu != null) {
            ceu.mo3783a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return r0;
     */
    /* renamed from: b */
    public final synchronized cgb mo3787b(cdg cdg) {
        ceu ceu = (ceu) this.f6629a.get(cdg);
        if (ceu == null) {
            return null;
        }
        cgb cgb = (cgb) ceu.get();
        if (cgb == null) {
            mo3786a(ceu);
        }
    }

    /* renamed from: a */
    public final synchronized void mo3785a(cdg cdg, cgb cgb) {
        ceu ceu = (ceu) this.f6629a.put(cdg, new ceu(cdg, cgb, this.f6630b));
        if (ceu != null) {
            ceu.mo3783a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3786a(ceu ceu) {
        synchronized (this) {
            this.f6629a.remove(ceu.f6626a);
            if (ceu.f6627b) {
                cgj cgj = ceu.f6628c;
            }
        }
    }
}
