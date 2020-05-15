package p000;

import android.os.Process;

/* renamed from: bdhn */
final /* synthetic */ class bdhn implements Runnable {

    /* renamed from: a */
    private final bdho f105663a;

    /* renamed from: b */
    private final Runnable f105664b;

    public bdhn(bdho bdho, Runnable runnable) {
        this.f105663a = bdho;
        this.f105664b = runnable;
    }

    public final void run() {
        bdho bdho = this.f105663a;
        Runnable runnable = this.f105664b;
        int i = bdho.f105665a;
        if (i != 0) {
            Process.setThreadPriority(i);
        }
        runnable.run();
    }
}
