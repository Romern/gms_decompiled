package p000;

/* renamed from: chuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chuz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chva f189241a;

    /* renamed from: b */
    final /* synthetic */ Runnable f189242b;

    /* renamed from: c */
    final /* synthetic */ chvc f189243c;

    public chuz(chvc chvc, chva chva, Runnable runnable) {
        this.f189243c = chvc;
        this.f189241a = chva;
        this.f189242b = runnable;
    }

    public final void run() {
        this.f189243c.execute(this.f189241a);
    }

    public final String toString() {
        return String.valueOf(this.f189242b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
