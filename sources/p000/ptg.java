package p000;

/* renamed from: ptg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ptg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ pti f40184a;

    /* renamed from: b */
    final /* synthetic */ String f40185b;

    /* renamed from: c */
    final /* synthetic */ String f40186c;

    public ptg(pti pti, String str, String str2) {
        this.f40184a = pti;
        this.f40185b = str;
        this.f40186c = str2;
    }

    public final void run() {
        pem pem;
        synchronized (this.f40184a.f40198e) {
            pem = (pem) this.f40184a.f40198e.get(this.f40185b);
        }
        if (pem == null) {
            pti.f40190a.mo23670a("Discarded message for unknown namespace '%s'", this.f40185b);
            return;
        }
        pem.mo22975a(this.f40186c);
    }
}
