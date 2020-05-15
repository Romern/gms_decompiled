package p000;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: uco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uco extends ucg implements rkh {

    /* renamed from: g */
    private static final sbw f47246g = new sbw("CancellableOperation", "");

    /* renamed from: f */
    public final sce f47247f = new ucn(this);

    /* renamed from: h */
    private int f47248h = 0;

    /* renamed from: i */
    private boolean f47249i = false;

    /* renamed from: j */
    private final CountDownLatch f47250j = new CountDownLatch(1);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ucg.<init>(java.lang.String, ubk, uto, int, boolean):void
     arg types: [java.lang.String, ubk, uto, int, int]
     candidates:
      ucg.<init>(java.lang.String, ubk, uto, vcy, boolean):void
      ucg.<init>(java.lang.String, ubk, uto, int, boolean):void */
    protected uco(String str, ubk ubk, uto uto, int i) {
        super(str, ubk, uto, i, false);
        synchronized (ubk.f47159t) {
            ubk.f47159t.add(this);
        }
    }

    /* renamed from: a */
    private static final void mo27249a(int i) {
        f47246g.mo25374b("CancellableOperation", "Illegal state: %s", Integer.valueOf(i));
    }

    /* renamed from: d */
    private final void mo27236d() {
        synchronized (this) {
            if (this.f47248h != 4) {
                this.f47248h = 4;
                ubk ubk = this.f47237a;
                synchronized (ubk.f47159t) {
                    ubk.f47159t.remove(this);
                }
                this.f47250j.countDown();
                return;
            }
            mo27249a(4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        mo27237e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        mo27236d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = r1.f47248h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001f, code lost:
        if (r0 == 1) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        if (r0 == 4) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0024, code lost:
        mo27249a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0027, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0029, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002d, code lost:
        if (r1.f47249i == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002f, code lost:
        r1.f47248h = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0033, code lost:
        mo27240h();
        mo27236d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.f47248h = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x003d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 == false) goto L_0x001c;
     */
    /* renamed from: b */
    public final void mo27230b(Context context) {
        synchronized (this) {
            int i = this.f47248h;
            if (i != 0) {
                mo27249a(i);
            } else {
                this.f47248h = 1;
                boolean z = !this.f47249i;
            }
        }
    }

    /* renamed from: c */
    public final void mo12460c() {
        mo27239g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo27237e();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0018, code lost:
        mo27236d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
        return true;
     */
    /* renamed from: f */
    public final boolean mo27238f() {
        synchronized (this) {
            int i = this.f47248h;
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4) {
                    mo27249a(i);
                    return false;
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo27239g() {
        synchronized (this) {
            if (!this.f47249i) {
                this.f47249i = true;
                if (this.f47248h == 2) {
                    this.f47248h = 3;
                    mo27240h();
                    mo27236d();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo27240h();

    /* renamed from: i */
    public final synchronized boolean mo27241i() {
        return this.f47248h == 4;
    }
}
