package p000;

/* renamed from: acod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acod implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f60322a;

    /* renamed from: b */
    final /* synthetic */ String f60323b;

    public acod(Runnable runnable, String str) {
        this.f60322a = runnable;
        this.f60323b = str;
    }

    public final void run() {
        this.f60322a.run();
    }

    public final String toString() {
        return this.f60323b;
    }
}
