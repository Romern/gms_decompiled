package p000;

/* renamed from: aanp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aanp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aans f28591a;

    /* renamed from: b */
    final /* synthetic */ boolean f28592b;

    /* renamed from: c */
    final /* synthetic */ aanh f28593c;

    /* renamed from: d */
    final /* synthetic */ aanr f28594d;

    public aanp(aanr aanr, aans aans, boolean z, aanh aanh) {
        this.f28594d = aanr;
        this.f28591a = aans;
        this.f28592b = z;
        this.f28593c = aanh;
    }

    public final void run() {
        this.f28594d.mo17144a(this.f28591a, this.f28592b, this.f28593c);
        this.f28591a.f28648o.clear();
    }
}
