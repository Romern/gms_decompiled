package p000;

import com.google.android.gms.wallet.p082im.InstrumentManagerResult;

/* renamed from: awmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awmt extends awpc {

    /* renamed from: a */
    final /* synthetic */ awmv f94635a;

    public awmt(awmv awmv) {
        this.f94635a = awmv;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awmv awmv = this.f94635a;
        int i = awmv.f94636p;
        awmv.mo52898h(21);
        this.f94635a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awmv awmv = this.f94635a;
        int i = awmv.f94636p;
        awmv.mo52898h(20);
        this.f94635a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awmv awmv = this.f94635a;
        int i = awmv.f94636p;
        awmv.mo52898h(22);
        this.f94635a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52289a(bmrv bmrv) {
        bmar bmar;
        bmrx bmrx;
        bmav bmav;
        awmv awmv = this.f94635a;
        bmaq bmaq = bmrv.f130590c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bmrv.f130593f);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bmrv.f130588a & 4) != 0) {
            bmar = bmrv.f130591d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bmrv.f130588a & 8) != 0) {
            bmrx = bmrv.f130592e;
            if (bmrx == null) {
                bmrx = bmrx.f130597t;
            }
        } else {
            bmrx = null;
        }
        if ((bmrv.f130588a & 1) != 0) {
            bmav = bmrv.f130589b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        InstrumentManagerResult instrumentManagerResult = InstrumentManagerResult.f110253a;
        int i = awmv.f94636p;
        awmv.mo52297a(bmaq, a, bmar, bmrx, bmav, instrumentManagerResult, "initializeResponse", true);
    }

    /* renamed from: a */
    public final void mo52290a(bmsa bmsa) {
        bwgz bwgz;
        bmaq bmaq;
        bmar bmar;
        bmrx bmrx;
        bmav bmav;
        if ((bmsa.f130634a & 1) != 0) {
            bwgz = bwgz.HANDLE_UI_ERROR;
        } else {
            bwgz = bwgz.CONTINUE_FLOW_WITH_NEW_PAGE;
        }
        awmv awmv = this.f94635a;
        bmaq bmaq2 = bmsa.f130636c;
        if (bmaq2 != null) {
            bmaq = bmaq2;
        } else {
            bmaq = bmaq.f128479l;
        }
        if ((bmsa.f130634a & 4) != 0) {
            bmar = bmsa.f130637d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bmsa.f130634a & 16) != 0) {
            bmrx = bmsa.f130638e;
            if (bmrx == null) {
                bmrx = bmrx.f130597t;
            }
        } else {
            bmrx = null;
        }
        if ((bmsa.f130634a & 1) != 0) {
            bmav bmav2 = bmsa.f130635b;
            if (bmav2 == null) {
                bmav = bmav.f128500h;
            } else {
                bmav = bmav2;
            }
        } else {
            bmav = null;
        }
        InstrumentManagerResult instrumentManagerResult = InstrumentManagerResult.f110253a;
        int i = awmv.f94636p;
        awmv.mo52297a(bmaq, bwgz, bmar, bmrx, bmav, instrumentManagerResult, "refreshResponse", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009a  */
    /* renamed from: a */
    public final void mo52291a(bmsc bmsc) {
        bwgz bwgz;
        byte[] bArr;
        int i;
        bmaq bmaq;
        bmar bmar;
        bmrx bmrx;
        bmav bmav;
        bxtx bxtx;
        bwgz a = bwgz.m121952a(bmsc.f130655h);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if (a == bwgz.UNKNOWN_FLOW_INSTRUCTION) {
            if (bmsc.f130654g) {
                bwgz = bwgz.COMPLETE_FLOW_IMMEDIATELY;
            } else if (bmsc.f130649b == 6 && ((Boolean) bmsc.f130650c).booleanValue()) {
                bwgz = bwgz.CONTINUE_FLOW_WITH_CURRENT_PAGE;
            }
            if ((bmsc.f130648a & 1024) == 0) {
                bmag bmag = bmsc.f130658k;
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
            awmy a2 = InstrumentManagerResult.m94021a();
            a2.f94653a.f110255c = bmsc.f130657j;
            a2.mo52305a(bArr);
            i = bmsc.f130648a;
            if ((i & 32) != 0) {
                a2.f94653a.f110254b = bmsc.f130656i;
            }
            awmv awmv = this.f94635a;
            if ((i & 2) == 0) {
                bmaq = bmsc.f130652e;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
            } else {
                bmaq = null;
            }
            if ((bmsc.f130648a & 4) == 0) {
                bmar = bmsc.f130653f;
                if (bmar == null) {
                    bmar = bmar.f128490c;
                }
            } else {
                bmar = null;
            }
            if (bmsc.f130649b != 2) {
                bmrx = (bmrx) bmsc.f130650c;
            } else {
                bmrx = null;
            }
            if ((bmsc.f130648a & 1) == 0) {
                bmav = bmsc.f130651d;
                if (bmav == null) {
                    bmav = bmav.f128500h;
                }
            } else {
                bmav = null;
            }
            InstrumentManagerResult instrumentManagerResult = a2.f94653a;
            int i2 = awmv.f94636p;
            awmv.mo52297a(bmaq, bwgz, bmar, bmrx, bmav, instrumentManagerResult, "submitResponse", false);
        }
        bwgz = a;
        if ((bmsc.f130648a & 1024) == 0) {
        }
        awmy a22 = InstrumentManagerResult.m94021a();
        a22.f94653a.f110255c = bmsc.f130657j;
        a22.mo52305a(bArr);
        i = bmsc.f130648a;
        if ((i & 32) != 0) {
        }
        awmv awmv2 = this.f94635a;
        if ((i & 2) == 0) {
        }
        if ((bmsc.f130648a & 4) == 0) {
        }
        if (bmsc.f130649b != 2) {
        }
        if ((bmsc.f130648a & 1) == 0) {
        }
        InstrumentManagerResult instrumentManagerResult2 = a22.f94653a;
        int i22 = awmv.f94636p;
        awmv2.mo52297a(bmaq, bwgz, bmar, bmrx, bmav, instrumentManagerResult2, "submitResponse", false);
    }
}
