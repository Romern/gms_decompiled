package p000;

import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.math.BigDecimal;
import java.util.Iterator;

/* renamed from: akgs */
final /* synthetic */ class akgs implements Runnable {

    /* renamed from: a */
    private final akgx f71908a;

    /* renamed from: b */
    private final long f71909b;

    /* renamed from: c */
    private final long f71910c;

    /* renamed from: d */
    private final int f71911d;

    public akgs(akgx akgx, long j, long j2, int i) {
        this.f71908a = akgx;
        this.f71909b = j;
        this.f71910c = j2;
        this.f71911d = i;
    }

    public final void run() {
        float f;
        akgx akgx = this.f71908a;
        long j = this.f71909b;
        long j2 = this.f71910c;
        int i = this.f71911d;
        akgw akgw = (akgw) akgx.f71923f.get(Long.valueOf(j));
        if (akgw != null) {
            akgw.f71918a = j2;
            akgw.f71919b = i;
            srn srn = ajvp.f71371a;
            Iterator it = akgx.f71923f.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((akgw) it.next()).f71919b != 2) {
                        break;
                    }
                } else {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl.mo68432a("akgx", "c", 3807, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("All payloads are complete");
                    if (!akgx.mo39352a()) {
                        for (akgw akgw2 : akgx.f71923f.values()) {
                            akgw2.f71919b = 3;
                        }
                    } else {
                        akgx.mo39367a(2);
                        ajud ajud = akgx.f71922e;
                        ShareTarget shareTarget = akgx.f71921d;
                        ajub ajub = new ajub(6);
                        ajub.mo38917a(100.0f);
                        ajud.mo38711a(shareTarget, ajub.mo38916a());
                        akgx.mo39368b(2);
                        return;
                    }
                }
            }
            for (akgw akgw3 : akgx.f71923f.values()) {
                if (akgw3.f71919b == 4) {
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl2.mo68432a("akgx", "c", 3821, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Payloads cancelled");
                    akgx.mo39353b();
                    akgx.mo39367a(4);
                    akgx.f71922e.mo38711a(akgx.f71921d, new ajub(9).mo38916a());
                    akgx.mo39368b(3);
                    return;
                }
            }
            for (akgw akgw4 : akgx.f71923f.values()) {
                if (akgw4.f71919b == 3) {
                    bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl3.mo68432a("akgx", "c", 3831, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Payloads failed");
                    akgx.mo39353b();
                    akgx.mo39367a(3);
                    akgx.f71922e.mo38711a(akgx.f71921d, new ajub(7).mo38916a());
                    akgx.mo39368b(4);
                    return;
                }
            }
            if (!((Attachment) akgx.f71921d.mo44499b().get(0)).mo44387e()) {
                akgx.f71925h = BigDecimal.ZERO;
                for (akgw akgw5 : akgx.f71923f.values()) {
                    akgx.f71925h = akgx.f71925h.add(new BigDecimal(Long.toString(akgw5.f71918a)));
                }
                f = akgx.f71925h.multiply(new BigDecimal("100")).divide(akgx.f71924g, 1).floatValue();
            } else {
                f = 50.0f;
            }
            ajud ajud2 = akgx.f71922e;
            ShareTarget shareTarget2 = akgx.f71921d;
            ajub ajub2 = new ajub(5);
            ajub2.mo38917a(f);
            ajud2.mo38711a(shareTarget2, ajub2.mo38916a());
        }
    }
}
