package p000;

/* renamed from: aipx */
final /* synthetic */ class aipx implements Runnable {

    /* renamed from: a */
    private final aipz f69468a;

    /* renamed from: b */
    private final aiqc f69469b;

    public aipx(aipz aipz, aiqc aiqc) {
        this.f69468a = aipz;
        this.f69469b = aiqc;
    }

    public final void run() {
        aipz aipz = this.f69468a;
        aiqc aiqc = this.f69469b;
        aiqb aiqb = aipz.f69472a;
        aiqc aiqc2 = aiqb.f69473a;
        if (aiqb.f69476d.get()) {
            srz.m36171a(aiqc);
        } else {
            aipz.f69472a.f69475c.add(aiqc);
        }
    }
}
