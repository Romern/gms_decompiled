package p000;

import java.util.concurrent.Executor;

/* renamed from: aeqt */
final /* synthetic */ class aeqt implements Runnable {

    /* renamed from: a */
    private final aequ f63640a;

    /* renamed from: b */
    private final aerc f63641b;

    /* renamed from: c */
    private final Executor f63642c;

    /* renamed from: d */
    private final int f63643d;

    /* renamed from: e */
    private final int f63644e;

    public aeqt(aequ aequ, aerc aerc, Executor executor, int i, int i2) {
        this.f63640a = aequ;
        this.f63641b = aerc;
        this.f63642c = executor;
        this.f63643d = i;
        this.f63644e = i2;
    }

    public final void run() {
        aequ aequ = this.f63640a;
        aerc aerc = this.f63641b;
        Executor executor = this.f63642c;
        int i = this.f63643d;
        int i2 = this.f63644e;
        synchronized (aequ.f63646b) {
            if (aequ.f63646b.get(aerc) == executor) {
                aerc.mo9721a(i, i2);
            }
        }
    }
}
