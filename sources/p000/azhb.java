package p000;

/* renamed from: azhb */
final /* synthetic */ class azhb implements Runnable {

    /* renamed from: a */
    private final azhc f99338a;

    public azhb(azhc azhc) {
        this.f99338a = azhc;
    }

    public final void run() {
        azhc azhc = this.f99338a;
        Object b = azhc.mo54924b();
        if (b != null) {
            try {
                azhc.mo54923a(b, azhc.mo54920a(b));
            } catch (Exception e) {
                azhc.mo54922a(b, e);
            }
        }
    }
}
