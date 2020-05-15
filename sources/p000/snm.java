package p000;

/* renamed from: snm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class snm extends soc {

    /* renamed from: j */
    private final String f44799j;

    /* renamed from: k */
    private String f44800k;

    public snm(String str, int i) {
        super(1, i);
        this.f44799j = str;
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        Thread.currentThread().setName(this.f44800k);
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        this.f44800k = currentThread.getName();
        currentThread.setName(this.f44799j);
    }
}
