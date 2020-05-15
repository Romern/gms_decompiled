package p000;

/* renamed from: ciry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciry implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cisy f191311a;

    /* renamed from: b */
    final /* synthetic */ cisx f191312b;

    public ciry(cisx cisx, cisy cisy) {
        this.f191312b = cisx;
        this.f191311a = cisy;
    }

    public final void run() {
        try {
            this.f191311a.mo86442a();
        } catch (Throwable th) {
            this.f191312b.mo86478a(th);
        }
    }
}
