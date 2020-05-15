package p000;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: aucd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aucd {

    /* renamed from: a */
    private final Object f91384a = new Object();

    /* renamed from: b */
    private Queue f91385b;

    /* renamed from: c */
    private boolean f91386c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = (p000.aucc) r2.f91385b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r2.f91386c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        r0.mo50356a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r1 = r2.f91384a;
     */
    /* renamed from: a */
    public final void mo50388a(aucb aucb) {
        synchronized (this.f91384a) {
            if (this.f91385b != null && !this.f91386c) {
                this.f91386c = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo50389a(aucc aucc) {
        synchronized (this.f91384a) {
            if (this.f91385b == null) {
                this.f91385b = new ArrayDeque();
            }
            this.f91385b.add(aucc);
        }
    }
}
