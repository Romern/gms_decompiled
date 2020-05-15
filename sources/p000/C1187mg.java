package p000;

import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: mg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1187mg {

    /* renamed from: a */
    private boolean f26670a;

    /* renamed from: b */
    private C1186mf f26671b;

    /* renamed from: c */
    private Object f26672c;

    /* renamed from: d */
    private boolean f26673d;

    /* renamed from: a */
    public final void mo15459a(C1186mf mfVar) {
        synchronized (this) {
            while (this.f26673d) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.f26671b != mfVar) {
                this.f26671b = mfVar;
                if (this.f26670a) {
                    if (mfVar != null) {
                        mfVar.mo2389a();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        r0 = android.os.Build.VERSION.SDK_INT;
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f26673d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002d, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.f26673d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0.mo2389a();
     */
    /* renamed from: b */
    public final void mo15461b() {
        synchronized (this) {
            if (!this.f26670a) {
                this.f26670a = true;
                this.f26673d = true;
                C1186mf mfVar = this.f26671b;
                Object obj = this.f26672c;
            }
        }
    }

    /* renamed from: c */
    public final Object mo15462c() {
        Object obj;
        int i = Build.VERSION.SDK_INT;
        synchronized (this) {
            if (this.f26672c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f26672c = cancellationSignal;
                if (this.f26670a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f26672c;
        }
        return obj;
    }

    /* renamed from: a */
    public final boolean mo15460a() {
        boolean z;
        synchronized (this) {
            z = this.f26670a;
        }
        return z;
    }
}
