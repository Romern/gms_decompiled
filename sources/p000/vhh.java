package p000;

/* renamed from: vhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhh extends soc {

    /* renamed from: j */
    private final Integer f49270j;

    public vhh(int i, Integer num) {
        super(i, 9);
        this.f49270j = num;
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        shr.m35312a();
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        Integer num = this.f49270j;
        if (num != null) {
            shr.m35313a(13312, num.intValue());
        } else {
            shr.m35316b(13312);
        }
    }
}
