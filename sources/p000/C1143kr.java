package p000;

/* renamed from: kr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1143kr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f24828a;

    /* renamed from: b */
    final /* synthetic */ C1144ks f24829b;

    public C1143kr(C1144ks ksVar, Object obj) {
        this.f24829b = ksVar;
        this.f24828a = obj;
    }

    public final void run() {
        C1144ks ksVar = this.f24829b;
        Object obj = this.f24828a;
        if (ksVar.mo14854b()) {
            ksVar.mo14439b(obj);
        } else {
            ksVar.mo14438a(obj);
        }
        ksVar.f24919f = 3;
    }
}
