package p000;

/* renamed from: xsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xsw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ xsz f53008a;

    public xsw(xsz xsz) {
        this.f53008a = xsz;
    }

    public final void run() {
        this.f53008a.f53021f.set(xsy.SCAN_COMPLETED);
        xsz.f53015k.mo25414c("Scan timed out...", new Object[0]);
        this.f53008a.mo30114a();
    }
}
