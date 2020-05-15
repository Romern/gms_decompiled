package p000;

/* renamed from: aurk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurk implements auoz {

    /* renamed from: a */
    final /* synthetic */ aurl f92330a;

    /* renamed from: b */
    private boolean f92331b;

    public aurk(aurl aurl) {
        this.f92330a = aurl;
    }

    /* renamed from: a */
    public final void mo50609a(bohi bohi) {
        if (bohi != null && (bohi.f133071a & 8192) != 0) {
            bohf bohf = bohi.f133089s;
            if (bohf == null) {
                bohf = bohf.f133058h;
            }
            if ((bohf.f133060a & 2) != 0) {
                aurl aurl = this.f92330a;
                aunx aunx = aurl.f92332a;
                synchronized (aurl.f92336e) {
                    aurl aurl2 = this.f92330a;
                    if (aurl2.f92349r != null && aurl2.f92350s) {
                        if (!this.f92331b) {
                            bohf bohf2 = bohi.f133089s;
                            if (bohf2 == null) {
                                bohf2 = bohf.f133058h;
                            }
                            if (bohf2.f133062c) {
                                aurl.f92332a.mo50711a("EvaluationTrustletController: enabling evaluation", new Object[0]).mo50708c();
                                auro auro = this.f92330a.f92349r;
                                synchronized (auro.f92370b) {
                                    for (aurm aurm : auro.f92372d) {
                                        if (aurm.f92357a && !aurm.mo50844c() && aurm.f92358b) {
                                            aurm.mo50842a();
                                        }
                                    }
                                }
                                this.f92331b = true;
                            }
                        }
                        if (this.f92331b) {
                            bohf bohf3 = bohi.f133089s;
                            if (bohf3 == null) {
                                bohf3 = bohf.f133058h;
                            }
                            if (!bohf3.f133062c) {
                                aurl.f92332a.mo50711a("EvaluationTrustletController: disabling evaluation", new Object[0]).mo50708c();
                                auro auro2 = this.f92330a.f92349r;
                                synchronized (auro2.f92370b) {
                                    for (aurm aurm2 : auro2.f92372d) {
                                        if (aurm2.f92357a && aurm2.mo50844c()) {
                                            aurm2.mo50843b();
                                        }
                                    }
                                }
                                this.f92331b = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50610a(boolean z) {
    }

    /* renamed from: a */
    public final void mo50611a(boolean z, boolean z2, boolean z3, String str) {
    }

    /* renamed from: b */
    public final void mo50612b(boolean z) {
    }
}
