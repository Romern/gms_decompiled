package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.analytics.events.OrchestrationApiEvent;

/* renamed from: awlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awlv extends awpc {

    /* renamed from: a */
    final /* synthetic */ awma f94599a;

    public awlv(awma awma) {
        this.f94599a = awma;
    }

    /* renamed from: a */
    public final void mo51894a() {
        Activity activity = this.f94599a.getActivity();
        awma awma = this.f94599a;
        int i = awma.f94601h;
        OrchestrationApiEvent.m93817a(activity, 4, null, null, awma.f95359C);
        this.f94599a.mo52898h(21);
        this.f94599a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        Activity activity = this.f94599a.getActivity();
        awma awma = this.f94599a;
        int i = awma.f94601h;
        OrchestrationApiEvent.m93817a(activity, 6, null, null, awma.f95359C);
        this.f94599a.mo52898h(20);
        this.f94599a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        Activity activity = this.f94599a.getActivity();
        awma awma = this.f94599a;
        int i = awma.f94601h;
        OrchestrationApiEvent.m93817a(activity, 5, null, null, awma.f95359C);
        this.f94599a.mo52898h(22);
        this.f94599a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52253a(bwjl bwjl) {
        bmar bmar;
        bwjm bwjm;
        bmav bmav;
        awma awma = this.f94599a;
        bmaq bmaq = bwjl.f159805b;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwjl.f159809f);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwjl.f159804a & 2) != 0) {
            bmar = bwjl.f159806c;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwjl.f159804a & 8) != 0) {
            bwjm = bwjl.f159808e;
            if (bwjm == null) {
                bwjm = bwjm.f159811p;
            }
        } else {
            bwjm = null;
        }
        if ((bwjl.f159804a & 4) != 0) {
            bmav = bwjl.f159807d;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        awma.mo52259a(bmaq, a, bmar, bwjm, bmav, true, "onInitialize");
    }

    /* renamed from: a */
    public final void mo52254a(bwjp bwjp) {
        bmar bmar;
        bwjm bwjm;
        bmav bmav;
        awma awma = this.f94599a;
        bmaq bmaq = bwjp.f159846b;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwjp.f159850f);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwjp.f159845a & 2) != 0) {
            bmar = bwjp.f159847c;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwjp.f159845a & 8) != 0) {
            bwjm = bwjp.f159849e;
            if (bwjm == null) {
                bwjm = bwjm.f159811p;
            }
        } else {
            bwjm = null;
        }
        if ((bwjp.f159845a & 4) != 0) {
            bmav = bwjp.f159848d;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        awma.mo52259a(bmaq, a, bmar, bwjm, bmav, false, "onSubmit");
    }
}
