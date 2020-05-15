package p000;

/* renamed from: nwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nwb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nij f36711a;

    /* renamed from: b */
    final /* synthetic */ nil f36712b;

    /* renamed from: c */
    final /* synthetic */ nwc f36713c;

    public nwb(nwc nwc, nij nij, nil nil) {
        this.f36713c = nwc;
        this.f36711a = nij;
        this.f36712b = nil;
    }

    public final void run() {
        nwe nwe = this.f36713c.f36719f.f36726g;
        int i = nwe.f36732u;
        try {
            if (!nwp.m28037b(nwe.f36787m)) {
                bnsi c = nip.f35749b.mo68388c();
                c.mo68432a("nwe", "o", 2491, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Timeout waiting for previous client to stop!");
            }
        } catch (InterruptedException e) {
        }
        nuu.m27792a(new nwa(this));
    }
}
