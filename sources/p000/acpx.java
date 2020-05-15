package p000;

/* renamed from: acpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpx implements Runnable {

    /* renamed from: a */
    private final abym f60456a;

    public acpx(abym abym) {
        this.f60456a = abym;
    }

    public final void run() {
        while (true) {
            try {
                Thread.sleep(((Long) abzt.f58938bZ.mo58455c()).longValue());
                if (acpv.m49686a(((Long) abzt.f58938bZ.mo58455c()).longValue())) {
                    bpza a = acpv.m49682a();
                    abym abym = this.f60456a;
                    long u = cema.f182934a.mo6606a().mo79319u();
                    if (abym.mo32452a(u)) {
                        bxvd da = bpxb.f139606R.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpxb bpxb = (bpxb) da.f164949b;
                        a.getClass();
                        bpxb.f139649y = a;
                        bpxb.f139625a |= 134217728;
                        abym.mo32438a(15002, da, u);
                    }
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
