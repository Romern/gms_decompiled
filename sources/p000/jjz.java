package p000;

/* renamed from: jjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ jke f22667a;

    public jjz(jke jke) {
        this.f22667a = jke;
    }

    public final void run() {
        jke jke = this.f22667a;
        jke.f22684f.mo14044a(jke.f22687i);
        this.f22667a.f22684f.mo14049e(0);
        this.f22667a.mo13821b(3);
        synchronized (this.f22667a.f22683e) {
            for (jnz jnz : this.f22667a.f22693o) {
                this.f22667a.mo13817a(jnz);
            }
            this.f22667a.f22693o.clear();
        }
    }
}
