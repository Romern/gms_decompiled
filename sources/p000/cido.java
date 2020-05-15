package p000;

/* renamed from: cido */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cido {

    /* renamed from: a */
    final /* synthetic */ chss f189923a;

    /* renamed from: b */
    final /* synthetic */ cids f189924b;

    public cido(cids cids, chss chss) {
        this.f189924b = cids;
        this.f189923a = chss;
    }

    /* renamed from: a */
    public final void mo85992a(chrh chrh) {
        chst chst;
        cids cids = this.f189924b;
        chss chss = this.f189923a;
        chrg chrg = chrh.f189033a;
        if (chrg != chrg.SHUTDOWN) {
            int ordinal = chrg.ordinal();
            if (ordinal == 0) {
                chst = new cidp(chso.f189100a);
            } else if (ordinal == 1) {
                chst = new cidp(chso.m149489a(chss));
            } else if (ordinal == 2) {
                chst = new cidp(chso.m149490a(chrh.f189034b));
            } else if (ordinal == 3) {
                chst = new cidr(cids, chss);
            } else {
                String valueOf = String.valueOf(chrg);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unsupported state:");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            cids.f189930c.mo85599a(chrg, chst);
        }
    }
}
