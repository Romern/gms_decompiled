package p000;

/* renamed from: awxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awxt extends awpc {

    /* renamed from: a */
    final /* synthetic */ awxv f95248a;

    public awxt(awxv awxv) {
        this.f95248a = awxv;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awxv awxv = this.f95248a;
        int i = awxv.f95249n;
        awxv.mo52898h(21);
        this.f95248a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awxv awxv = this.f95248a;
        int i = awxv.f95249n;
        awxv.mo52898h(20);
        this.f95248a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awxv awxv = this.f95248a;
        int i = awxv.f95249n;
        awxv.mo52898h(22);
        this.f95248a.mo52897g(-1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awxv.a(bmaq, bwgz, bmar, bwgo, bmav, boolean, java.lang.String):void
     arg types: [bmaq, bwgz, bmar, bwgo, bmav, int, java.lang.String]
     candidates:
      awxv.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, bwgn, java.lang.String, boolean, boolean, com.google.android.wallet.clientlog.LogContext):awxv
      awxv.a(bmaq, bwgz, bmar, bwgo, bmav, boolean, java.lang.String):void */
    /* renamed from: a */
    public final void mo52436a(bwgn bwgn) {
        bmaq bmaq;
        bmar bmar;
        bwgo bwgo;
        bmav bmav;
        awxv awxv = this.f95248a;
        if ((bwgn.f159220a & 2) != 0) {
            bmaq = bwgn.f159222c;
            if (bmaq == null) {
                bmaq = bmaq.f128479l;
            }
        } else {
            bmaq = null;
        }
        bwgz a = bwgz.m121952a(bwgn.f159226g);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwgn.f159220a & 4) != 0) {
            bmar = bwgn.f159223d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwgn.f159220a & 16) != 0) {
            bwgo = bwgn.f159225f;
            if (bwgo == null) {
                bwgo = bwgo.f159228j;
            }
        } else {
            bwgo = null;
        }
        if ((bwgn.f159220a & 1) != 0) {
            bmav = bwgn.f159221b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        int i = awxv.f95249n;
        awxv.mo52727a(bmaq, a, bmar, bwgo, bmav, true, "onInitializeSetupWizardResponse");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awxv.a(bmaq, bwgz, bmar, bwgo, bmav, boolean, java.lang.String):void
     arg types: [bmaq, bwgz, bmar, ?[OBJECT, ARRAY], bmav, int, java.lang.String]
     candidates:
      awxv.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, bwgn, java.lang.String, boolean, boolean, com.google.android.wallet.clientlog.LogContext):awxv
      awxv.a(bmaq, bwgz, bmar, bwgo, bmav, boolean, java.lang.String):void */
    /* renamed from: a */
    public final void mo52437a(bwgr bwgr) {
        bmav bmav;
        awxv awxv = this.f95248a;
        bmaq bmaq = bwgr.f159252b;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwgr.f159254d);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        bmar bmar = bwgr.f159253c;
        if (bmar == null) {
            bmar = bmar.f128490c;
        }
        bmav bmav2 = bwgr.f159251a;
        if (bmav2 == null) {
            bmav = bmav.f128500h;
        } else {
            bmav = bmav2;
        }
        int i = awxv.f95249n;
        awxv.mo52727a(bmaq, a, bmar, (bwgo) null, bmav, false, "onSubmitSetupWizardResponse");
    }
}
