package p000;

import java.util.concurrent.Executor;

/* renamed from: v */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1423v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1477x f27332a;

    public C1423v(C1477x xVar) {
        this.f27332a = xVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x000c  */
    public final void run() {
        while (this.f27332a.f27548d.compareAndSet(false, true)) {
            C0915ct ctVar = null;
            boolean z = false;
            while (this.f27332a.f27547c.compareAndSet(true, false)) {
                try {
                    C1477x xVar = this.f27332a;
                    C0915ct ctVar2 = xVar.f27550f;
                    if (ctVar2 != null) {
                        ctVar2.mo3642e();
                    }
                    do {
                        C0077cf cfVar = xVar.f27551g;
                        if (cfVar != null) {
                            cfVar.f6647a.remove(xVar.f27556l);
                        }
                        C0073cc ccVar = xVar.f27552h;
                        xVar.f27551g = new ajwd(ccVar.f6448a, ccVar.f6449b, ccVar.f6450c);
                        C0077cf cfVar2 = xVar.f27551g;
                        cfVar2.f6647a.add(xVar.f27556l);
                        C0910cp cpVar = new C0910cp(xVar.f27551g, xVar.f27553i);
                        cpVar.f11758c = xVar.f27554j;
                        cpVar.f11759d = xVar.f27555k;
                        Executor executor = cpVar.f11758c;
                        if (executor != null) {
                            Executor executor2 = cpVar.f11759d;
                            if (executor2 != null) {
                                xVar.f27550f = new C0072cb((C0067by) cpVar.f11756a, executor, executor2, cpVar.f11757b);
                            } else {
                                throw new IllegalArgumentException("BackgroundThreadExecutor required");
                            }
                        } else {
                            throw new IllegalArgumentException("MainThreadExecutor required");
                        }
                    } while (xVar.f27550f.mo8248h());
                    ctVar = xVar.f27550f;
                    z = true;
                } finally {
                    this.f27332a.f27548d.set(false);
                }
            }
            if (z) {
                this.f27332a.f27546b.mo2453l(ctVar);
            }
            if (!z || !this.f27332a.f27547c.get()) {
                return;
            }
            while (this.f27332a.f27548d.compareAndSet(false, true)) {
            }
        }
    }
}
