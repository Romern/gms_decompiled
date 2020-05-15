package p000;

import com.google.android.chimera.Fragment;

/* renamed from: evt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class evt implements evv {

    /* renamed from: a */
    private static final sek f15899a = ffw.m11631a("ExternalLauncher");

    /* renamed from: b */
    private final bsul f15900b;

    /* renamed from: c */
    private final evs f15901c;

    public evt(bsul bsul, Fragment fragment, ffk ffk, esr esr, ewh ewh, ewg ewg) {
        evs evs = new evs(fragment, ffk, f15899a, esr, ewh, ewg);
        this.f15900b = bsul;
        this.f15901c = evs;
    }

    /* renamed from: a */
    public static boolean m11201a(bsul bsul) {
        int i = bsul.f147144a;
        return ((i & 16) == 0 && (i & 4) == 0 && (i & 2) == 0 && (i & 128) == 0) ? false : true;
    }

    /* renamed from: a */
    public final void mo10533a() {
        evv evv;
        bswr bswr;
        bsvb bsvb;
        bsyq bsyq;
        bsul bsul = this.f15900b;
        int i = bsul.f147144a;
        if ((i & 16) != 0) {
            evs evs = this.f15901c;
            bsyq bsyq2 = bsul.f147148e;
            if (bsyq2 != null) {
                bsyq = bsyq2;
            } else {
                bsyq = bsyq.f147699c;
            }
            evv = new ewi(bsyq, evs.f15894b, evs.f15893a, evs.f15895c, evs.f15898f, evs.f15896d, evs.f15897e);
        } else if ((i & 4) != 0) {
            evs evs2 = this.f15901c;
            bsvb bsvb2 = bsul.f147146c;
            if (bsvb2 == null) {
                bsvb = bsvb.f147222d;
            } else {
                bsvb = bsvb2;
            }
            evv = new evp(bsvb, evs2.f15894b, evs2.f15893a, evs2.f15895c, evs2.f15896d, evs2.f15897e);
        } else if ((i & 2) != 0) {
            evs evs3 = this.f15901c;
            bswr bswr2 = bsul.f147145b;
            if (bswr2 == null) {
                bswr = bswr.f147479e;
            } else {
                bswr = bswr2;
            }
            evv = new ewf(bswr, evs3.f15894b, evs3.f15893a, evs3.f15896d, new evq(evs3, bswr));
        } else if ((i & 128) != 0) {
            evs evs4 = this.f15901c;
            bsup bsup = bsul.f147151h;
            if (bsup == null) {
                bsup = bsup.f147165d;
            }
            evv = new evu(bsup, evs4.f15893a, evs4.f15896d, new evr(evs4));
        } else {
            throw new IllegalArgumentException("The alternative doesn't have any launchable alternatives included");
        }
        evv.mo10533a();
    }
}
