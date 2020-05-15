package p000;

/* renamed from: bdan */
final /* synthetic */ class bdan implements Runnable {

    /* renamed from: a */
    private final bnic f105239a;

    /* renamed from: b */
    private final Object f105240b;

    public bdan(bnic bnic, Object obj) {
        this.f105239a = bnic;
        this.f105240b = obj;
    }

    public final void run() {
        bnic bnic = this.f105239a;
        Object obj = this.f105240b;
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            ((bdaq) a.next()).mo54573a(obj);
        }
    }
}
