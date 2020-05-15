package p000;

/* renamed from: cieu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cieu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ciev f189981a;

    /* renamed from: b */
    final /* synthetic */ ciew f189982b;

    /* renamed from: c */
    final /* synthetic */ Object f189983c;

    /* renamed from: d */
    final /* synthetic */ ciex f189984d;

    public cieu(ciex ciex, ciev ciev, ciew ciew, Object obj) {
        this.f189984d = ciex;
        this.f189981a = ciev;
        this.f189982b = ciew;
        this.f189983c = obj;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        synchronized (this.f189984d) {
            if (this.f189981a.f189986b == 0) {
                try {
                    this.f189982b.mo85860a(this.f189983c);
                    this.f189984d.f189989a.remove(this.f189982b);
                    if (this.f189984d.f189989a.isEmpty()) {
                        this.f189984d.f189990b.shutdown();
                        this.f189984d.f189990b = null;
                    }
                } catch (Throwable th) {
                    this.f189984d.f189989a.remove(this.f189982b);
                    if (this.f189984d.f189989a.isEmpty()) {
                        this.f189984d.f189990b.shutdown();
                        this.f189984d.f189990b = null;
                    }
                    throw th;
                }
            }
        }
    }
}
