package p000;

/* renamed from: bgiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgiu implements Runnable {

    /* renamed from: a */
    final bsax f116554a;

    /* renamed from: b */
    final bgmn f116555b;

    /* renamed from: c */
    final /* synthetic */ bgiv f116556c;

    public bgiu(bgiv bgiv, bsax bsax, bgmn bgmn) {
        this.f116556c = bgiv;
        this.f116554a = bsax;
        this.f116555b = bgmn;
    }

    public final void run() {
        String valueOf = String.valueOf(this.f116554a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("In ReceiverRunnable, response is ");
        sb.append(valueOf);
        sb.toString();
        this.f116555b.mo62706a(this.f116556c.f116557a.f116566b, this.f116554a);
    }
}
