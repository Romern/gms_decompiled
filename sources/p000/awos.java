package p000;

import com.google.android.gms.wallet.selector.GenericSelectorResult;

/* renamed from: awos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awos extends awpc {

    /* renamed from: a */
    final /* synthetic */ awot f94750a;

    public awos(awot awot) {
        this.f94750a = awot;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awot awot = this.f94750a;
        int i = awot.f94751l;
        awot.mo52898h(21);
        this.f94750a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awot awot = this.f94750a;
        int i = awot.f94751l;
        awot.mo52898h(20);
        this.f94750a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awot awot = this.f94750a;
        int i = awot.f94751l;
        awot.mo52898h(22);
        this.f94750a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52390a(bmrc bmrc) {
        bmrf bmrf;
        bmav bmav;
        awot awot = this.f94750a;
        bmaq bmaq = bmrc.f130471e;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        if (bmrc.f130468b == 5) {
            bmrf = (bmrf) bmrc.f130469c;
        } else {
            bmrf = bmrf.f130474i;
        }
        if ((bmrc.f130467a & 1) != 0) {
            bmav bmav2 = bmrc.f130470d;
            if (bmav2 == null) {
                bmav = bmav.f128500h;
            } else {
                bmav = bmav2;
            }
        } else {
            bmav = null;
        }
        GenericSelectorResult genericSelectorResult = GenericSelectorResult.f110319a;
        int i = awot.f94751l;
        awot.mo52392a(bmaq, bwgz, bmrf, bmav, genericSelectorResult, "onInitialize", true);
    }

    /* renamed from: a */
    public final void mo52391a(bmri bmri) {
        byte[] bArr;
        bmaq bmaq;
        bwgz bwgz;
        bmrf bmrf;
        bmav bmav;
        bxtx bxtx;
        if ((bmri.f130497a & 8) != 0) {
            bmag bmag = bmri.f130501e;
            if (bmag == null) {
                bmag = bmag.f128442c;
            }
            if (bmag.f128444a == 2) {
                bxtx = (bxtx) bmag.f128445b;
            } else {
                bxtx = bxtx.f164797b;
            }
            bArr = bxtx.mo73780k();
        } else {
            bArr = null;
        }
        awoo a = GenericSelectorResult.m94087a();
        a.mo52385a(bArr);
        GenericSelectorResult genericSelectorResult = a.f94747a;
        awot awot = this.f94750a;
        bmaq bmaq2 = bmri.f130499c;
        if (bmaq2 != null) {
            bmaq = bmaq2;
        } else {
            bmaq = bmaq.f128479l;
        }
        bwgz a2 = bwgz.m121952a(bmri.f130500d);
        if (a2 != null) {
            bwgz = a2;
        } else {
            bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        bmrf bmrf2 = bmri.f130502f;
        if (bmrf2 != null) {
            bmrf = bmrf2;
        } else {
            bmrf = bmrf.f130474i;
        }
        if ((bmri.f130497a & 1) != 0) {
            bmav bmav2 = bmri.f130498b;
            if (bmav2 == null) {
                bmav = bmav.f128500h;
            } else {
                bmav = bmav2;
            }
        } else {
            bmav = null;
        }
        int i = awot.f94751l;
        awot.mo52392a(bmaq, bwgz, bmrf, bmav, genericSelectorResult, "onSubmit", false);
    }
}
