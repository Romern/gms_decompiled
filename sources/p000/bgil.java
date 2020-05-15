package p000;

/* renamed from: bgil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgil implements Runnable {

    /* renamed from: a */
    final bsax f116523a;

    /* renamed from: b */
    final bgmn f116524b;

    /* renamed from: c */
    final /* synthetic */ bgim f116525c;

    public bgil(bgim bgim, bsax bsax, bgmn bgmn) {
        this.f116525c = bgim;
        this.f116523a = bsax;
        this.f116524b = bgmn;
    }

    public final void run() {
        String valueOf = String.valueOf(this.f116523a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("In ReceiverRunnable, response is ");
        sb.append(valueOf);
        sb.toString();
        this.f116524b.mo62706a(this.f116525c.f116526a.f116535b, this.f116523a);
    }
}
