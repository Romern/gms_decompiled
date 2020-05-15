package p000;

/* renamed from: ay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0039ay implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0043bb f2524a;

    public C0039ay(C0043bb bbVar) {
        this.f2524a = bbVar;
    }

    public final void run() {
        C0043bb bbVar = this.f2524a;
        if (bbVar.f2822b == 0) {
            bbVar.f2823c = true;
            bbVar.f2826f.mo1023a(C0005ad.ON_PAUSE);
        }
        this.f2524a.mo2973a();
    }
}
