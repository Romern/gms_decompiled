package p000;

/* renamed from: aipu */
final /* synthetic */ class aipu implements Runnable {

    /* renamed from: a */
    private final aipz f69463a;

    /* renamed from: b */
    private final blvp f69464b;

    public aipu(aipz aipz, blvp blvp) {
        this.f69463a = aipz;
        this.f69464b = blvp;
    }

    public final void run() {
        aipz aipz = this.f69463a;
        blvp blvp = this.f69464b;
        aiqb aiqb = aipz.f69472a;
        aiqc aiqc = aiqb.f69473a;
        if (aiqb.f69476d.get()) {
            blvp.mo66713b();
            return;
        }
        aiqp a = aiqo.m57733a(blvp, new aipv(aipz, blvp), new aipw(aipz));
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aipz", "b", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to create an incoming MultiplexBleSocket from connection %s.", blvp.mo66756c());
            return;
        }
        aipz.f69472a.f69474b.put(blvp.mo66756c(), a);
    }
}
