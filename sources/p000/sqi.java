package p000;

/* renamed from: sqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sqi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ sqj f44960a;

    /* renamed from: b */
    private final C1225nr f44961b;

    public sqi(sqj sqj, C1225nr nrVar) {
        this.f44960a = sqj;
        this.f44961b = new C1225nr(nrVar);
    }

    public final void run() {
        synchronized (this.f44960a.f44963b) {
            this.f44960a.mo25973a(this.f44961b);
        }
    }
}
