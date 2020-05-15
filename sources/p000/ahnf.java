package p000;

/* renamed from: ahnf */
final /* synthetic */ class ahnf implements Runnable {

    /* renamed from: a */
    private final ahnp f67600a;

    /* renamed from: b */
    private final buuw f67601b;

    /* renamed from: c */
    private final ahnm f67602c;

    public ahnf(ahnp ahnp, buuw buuw, ahnm ahnm) {
        this.f67600a = ahnp;
        this.f67601b = buuw;
        this.f67602c = ahnm;
    }

    public final void run() {
        ahnp ahnp = this.f67600a;
        buuw buuw = this.f67601b;
        ahnm ahnm = this.f67602c;
        if (ahnp.f67636c.containsKey(buuw)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("EndpointManager received request to update registration of IncomingOfflineFrameProcessor for frame type %s from %s to %s.", buuw.name(), ahnp.f67636c.get(buuw), ahnm);
        }
        ahnp.f67636c.put(buuw, ahnm);
    }
}
