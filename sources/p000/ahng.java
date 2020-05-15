package p000;

/* renamed from: ahng */
final /* synthetic */ class ahng implements Runnable {

    /* renamed from: a */
    private final ahnp f67603a;

    /* renamed from: b */
    private final buuw f67604b;

    /* renamed from: c */
    private final ahnm f67605c;

    public ahng(ahnp ahnp, buuw buuw, ahnm ahnm) {
        this.f67603a = ahnp;
        this.f67604b = buuw;
        this.f67605c = ahnm;
    }

    public final void run() {
        ahnp ahnp = this.f67603a;
        buuw buuw = this.f67604b;
        ahnm ahnm = this.f67605c;
        if (!ahnp.f67636c.containsKey(buuw)) {
            return;
        }
        if (ahnp.f67636c.get(buuw) != ahnm) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("EndpointManager cannot unregister IncomingOfflineFrameProcessor %s because it is not registered for frame type %s.", ahnm, buuw);
        } else {
            ahnp.f67636c.remove(buuw);
        }
    }
}
