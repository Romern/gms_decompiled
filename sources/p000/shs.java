package p000;

/* renamed from: shs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shs extends soc {

    /* renamed from: j */
    private final int f44499j;

    /* renamed from: k */
    private final int f44500k;

    public shs(int i, int i2) {
        super(Integer.MAX_VALUE, 10);
        this.f44499j = i;
        this.f44500k = i2;
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (cdln.f181201a.mo6606a().mo77867c()) {
            shr.m35312a();
        }
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        shr.m35313a(this.f44500k, this.f44499j);
        super.beforeExecute(thread, runnable);
    }
}
