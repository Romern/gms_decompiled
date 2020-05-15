package p000;

/* renamed from: bglj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bglj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f116763a;

    /* renamed from: b */
    final /* synthetic */ bgll f116764b;

    public bglj(bgll bgll, int i) {
        this.f116764b = bgll;
        this.f116763a = i;
    }

    public final void run() {
        bglk bglk = this.f116764b.f116768d;
        int i = this.f116763a;
        bglo bglo = (bglo) bglk;
        bglo.f116775a.mo62049a(bfos.CHRE_AR_UNAVAILABLE, i);
        StringBuilder sb = new StringBuilder(43);
        sb.append("NanoApp unavailable, unloadType=");
        sb.append(i);
        sb.toString();
        if (i == 2) {
            bglo.mo62986h();
        }
    }
}
