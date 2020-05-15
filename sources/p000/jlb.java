package p000;

/* renamed from: jlb */
final /* synthetic */ class jlb implements Runnable {

    /* renamed from: a */
    private final jle f22735a;

    public jlb(jle jle) {
        this.f22735a = jle;
    }

    public final void run() {
        jle jle = this.f22735a;
        byte[] b = jpt.m17081b(rpr.m34216b());
        if (b == null || b.length == 0) {
            jle.f22738a.mo25416d("No valid public key could be fetched from CryptauthKeyService API.", new Object[0]);
            jle.f22743f = true;
            return;
        }
        jle.f22741d = b;
    }
}
