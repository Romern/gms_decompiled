package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.CarInfo;

/* renamed from: nkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nkm implements nyp {

    /* renamed from: a */
    final /* synthetic */ nkq f35894a;

    public nkm(nkq nkq) {
        this.f35894a = nkq;
    }

    /* renamed from: a */
    public final void mo20945a() {
        bnsn bnsn = nkq.f35898a;
        this.f35894a.f35903e.mo21836c(ErrorInfo.TYPE_SDU_FAILED);
        this.f35894a.mo20963a(nkg.f35888a);
    }

    /* renamed from: b */
    public final void mo20949b() {
        bnsn bnsn = nkq.f35898a;
        nkq nkq = this.f35894a;
        nkq.f35906h = null;
        nkq.f35903e.mo21836c(400);
        this.f35894a.mo20963a(nkh.f35889a);
    }

    /* renamed from: c */
    public final void mo20951c() {
        bnsn bnsn = nkq.f35898a;
        this.f35894a.f35903e.mo21836c(300);
        this.f35894a.mo20963a(nki.f35890a);
    }

    /* renamed from: d */
    public final void mo20952d() {
        bnsn bnsn = nkq.f35898a;
        this.f35894a.f35903e.mo21836c(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE);
        this.f35894a.mo20963a(nkj.f35891a);
    }

    /* renamed from: e */
    public final void mo20953e() {
        bnsn bnsn = nkq.f35898a;
        this.f35894a.f35903e.mo21836c(ErrorInfo.TYPE_FSC_HTTP_ERROR);
        this.f35894a.mo20963a(nkk.f35892a);
    }

    /* renamed from: f */
    public final void mo20954f() {
        bnsn bnsn = nkq.f35898a;
        this.f35894a.f35903e.mo21836c(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
        this.f35894a.mo20963a(nkl.f35893a);
    }

    /* renamed from: g */
    public final void mo20955g() {
        bnsn bnsn = nkq.f35898a;
        this.f35894a.f35909k.mo20943a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r1.f164950c == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r1.f164950c == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r1.f164950c == false) goto L_0x006e;
     */
    /* renamed from: b */
    public final void mo20950b(int i) {
        CarInfo p;
        bisf bisf;
        bnsn bnsn = nkq.f35898a;
        if (ccpm.f179688a.mo6606a().mo76595k() && (p = this.f35894a.f35911m.mo21346p()) != null) {
            int i2 = p.f29336e;
            int i3 = p.f29337f;
            if (i2 <= 0) {
                return;
            }
            if (i2 != 1 || i3 >= 5) {
                ofj ofj = this.f35894a.f35905g;
                bxvd da = bipa.f121130c.mo74144da();
                bisf bisf2 = bisf.STATUS_UNSOLICITED_MESSAGE;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bipa bipa = (bipa) da.f164949b;
                bipa.f121133b = bisf2.f121548F;
                bipa.f121132a |= 1;
                int i4 = i - 1;
                if (i4 != 0) {
                    if (i4 == 1) {
                        bisf = bisf.STATUS_BLUETOOTH_INVALID_PAIRING_METHOD;
                    } else if (i4 != 2) {
                        bisf = bisf.STATUS_BLUETOOTH_AUTH_DATA_MISMATCH;
                    } else {
                        bisf = bisf.STATUS_BLUETOOTH_INVALID_AUTH_DATA;
                    }
                    da.mo74035c();
                    da.f164950c = false;
                    bipa bipa2 = (bipa) da.f164949b;
                    bipa2.f121133b = bisf.f121548F;
                    bipa2.f121132a |= 1;
                } else {
                    bisf bisf3 = bisf.STATUS_SUCCESS;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bipa bipa3 = (bipa) da.f164949b;
                    bipa3.f121133b = bisf3.f121548F;
                    bipa3.f121132a |= 1;
                }
                ofj.mo22206a(32772, da.mo74062i());
            }
        }
    }

    /* renamed from: a */
    public final void mo20946a(int i) {
        bpdh bpdh;
        bisf bisf = bisf.STATUS_UNSOLICITED_MESSAGE;
        int i2 = i - 1;
        if (i2 == 0) {
            bpdh = bpdh.BLUETOOTH_UNPAIR_DEFAULT;
        } else if (i2 == 1) {
            bpdh = bpdh.BLUETOOTH_UNPAIR_HFP_CONNECTING_EXCEEDS_MAX_COUNT;
        } else if (i2 == 2) {
            bpdh = bpdh.BLUETOOTH_UNPAIR_ALREADY_PAIRING_CANCELLING;
        } else if (i2 != 3) {
            bpdh = bpdh.BLUETOOTH_UNPAIR_AUTHENTICATION_FAILED;
        } else {
            bpdh = bpdh.BLUETOOTH_UNPAIR_PHONE_CAR_OUT_OF_SYNC;
        }
        nkq nkq = this.f35894a;
        bnsn bnsn = nkq.f35898a;
        nkq.f35910l.mo20857a(bpdi.BLUETOOTH, bpdh);
    }

    /* renamed from: a */
    public final void mo20947a(boolean z) {
        if (z) {
            bnsi c = nkq.f35898a.mo68388c();
            c.mo68432a("nkm", "a", 683, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("A2DP playing while in projection. Trying disabling");
            this.f35894a.f35909k.mo20943a();
        }
    }

    /* renamed from: a */
    public final void mo20948a(boolean z, boolean z2) {
        if (z == z2) {
            bnsi d = nkq.f35898a.mo68390d();
            d.mo68432a("nkm", "a", 698, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("logPhonebookAccess: expected same as observed");
            this.f35894a.f35910l.mo20860a(bpeb.BLUETOOTH, bpea.BLUETOOTH_PAIRING_PBAP_EXPECTED_SAME_AS_OBSERVED);
        } else if (!z && z2) {
            bnsi d2 = nkq.f35898a.mo68390d();
            d2.mo68432a("nkm", "a", 702, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("logPhonebookAccess: expected false, observed true");
            this.f35894a.f35910l.mo20860a(bpeb.BLUETOOTH, bpea.BLUETOOTH_PAIRING_PBAP_EXPECTED_FALSE_OBSERVED_TRUE);
        } else if (z && !z2) {
            bnsi d3 = nkq.f35898a.mo68390d();
            d3.mo68432a("nkm", "a", 706, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68405a("logPhonebookAccess: expected true, observed false");
            this.f35894a.f35910l.mo20860a(bpeb.BLUETOOTH, bpea.BLUETOOTH_PAIRING_PBAP_EXPECTED_TRUE_OBSERVED_FALSE);
        }
    }
}
