package p000;

/* renamed from: ap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0028ap implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0034at f1918a;

    public C0028ap(C0034at atVar) {
        this.f1918a = atVar;
    }

    public final void run() {
        Object obj;
        synchronized (this.f1918a.f2152b) {
            obj = this.f1918a.f2154e;
            this.f1918a.f2154e = C0034at.f2150c;
        }
        this.f1918a.mo2450b(obj);
    }
}
