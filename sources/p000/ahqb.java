package p000;

/* renamed from: ahqb */
final /* synthetic */ class ahqb implements Runnable {

    /* renamed from: a */
    private final ahqc f67774a;

    /* renamed from: b */
    private final aivw f67775b;

    public ahqb(ahqc ahqc, aivw aivw) {
        this.f67774a = ahqc;
        this.f67775b = aivw;
    }

    public final void run() {
        ahqc ahqc = this.f67774a;
        aivw aivw = this.f67775b;
        srn srn = ahkm.f67363a;
        ahqf ahqf = (ahqf) ahqc.f67779d.remove(aivw);
        if (ahqf != null) {
            ahqc.f67780e.mo36854c(ahqc.f67776a, ahqf);
        }
    }
}
