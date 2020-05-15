package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: atde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atde implements atcv {

    /* renamed from: b */
    private static final srn f90112b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final bxvd f90113a;

    /* renamed from: c */
    private final String f90114c;

    public atde(String str, bxvd bxvd) {
        this.f90114c = str;
        this.f90113a = bxvd;
    }

    /* renamed from: a */
    private final asrx m75576a(assh assh) {
        asjq asjq;
        JSONObject jSONObject;
        asjq asjq2;
        asjq asjq3;
        try {
            asjr asjr = (asjr) this.f90113a.f164949b;
            if (asjr.f89087a == 2) {
                asjq = (asjq) asjr.f89088b;
            } else {
                asjq = asjq.f89078f;
            }
            if (!asjq.f89082c.isEmpty()) {
                asjr asjr2 = (asjr) this.f90113a.f164949b;
                if (asjr2.f89087a == 2) {
                    asjq3 = (asjq) asjr2.f89088b;
                } else {
                    asjq3 = asjq.f89078f;
                }
                jSONObject = new JSONObject(asjq3.f89082c);
            } else {
                jSONObject = null;
            }
            asjr asjr3 = (asjr) this.f90113a.f164949b;
            if (asjr3.f89087a == 2) {
                asjq2 = (asjq) asjr3.f89088b;
            } else {
                asjq2 = asjq.f89078f;
            }
            return assh.mo3414a(new JSONObject(asjq2.f89080a), jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException("Cannot parse card profile as JSON", e);
        }
    }

    /* renamed from: b */
    public final assj mo49834b(askf askf, asqq asqq, String str) {
        asjq asjq;
        assh a = mo49833a(this.f90114c);
        try {
            asjr asjr = (asjr) this.f90113a.f164949b;
            if (asjr.f89087a == 2) {
                asjq = (asjq) asjr.f89088b;
            } else {
                asjq = asjq.f89078f;
            }
            bxvd bxvd = (bxvd) asjq.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) asjq);
            asjp asjp = (asjp) bxvd;
            asrx a2 = m75576a(a);
            asjq asjq2 = (asjq) asjp.f164949b;
            if (asjq2.f89083d >= asjq2.f89081b.size()) {
                return null;
            }
            String a3 = asjp.mo49201a(((asjq) asjp.f164949b).f89083d);
            int i = ((asjq) asjp.f164949b).f89083d + 1;
            if (asjp.f164950c) {
                asjp.mo74035c();
                asjp.f164950c = false;
            }
            asjq asjq3 = asjq.f89078f;
            ((asjq) asjp.f164949b).f89083d = i;
            bxvd bxvd2 = this.f90113a;
            int i2 = ((asjr) bxvd2.f164949b).f89093g + 1;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            asjr asjr2 = asjr.f89085h;
            ((asjr) bxvd2.f164949b).f89093g = i2;
            bxvd bxvd3 = this.f90113a;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            asjr asjr3 = (asjr) bxvd3.f164949b;
            asjq asjq4 = (asjq) asjp.mo74062i();
            asjq4.getClass();
            asjr3.f89088b = asjq4;
            asjr3.f89087a = 2;
            return new assj(a, a2, a3, ((asjq) asjp.f164949b).f89084e.getKey(), this.f90114c, asqq, str);
        } catch (JSONException e) {
            bnsl bnsl = (bnsl) f90112b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atde", "b", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error parsing canonical bundle");
            return null;
        }
    }

    /* renamed from: d */
    public final atcs mo49802d() {
        bmtd bmtd = ((asjr) this.f90113a.f164949b).f89092f;
        if (bmtd == null) {
            bmtd = bmtd.f130817d;
        }
        if (bmtd.f130819a != null) {
            bmtd bmtd2 = ((asjr) this.f90113a.f164949b).f89092f;
            if (bmtd2 == null) {
                bmtd2 = bmtd.f130817d;
            }
            if (bmtd2.f130820b != null) {
                bmtd bmtd3 = ((asjr) this.f90113a.f164949b).f89092f;
                if (bmtd3 == null) {
                    bmtd3 = bmtd.f130817d;
                }
                bxyk bxyk = bmtd3.f130819a;
                if (bxyk == null) {
                    bxyk = bxyk.f165095c;
                }
                if (bxyk.f165097a != 0) {
                    bmtd bmtd4 = ((asjr) this.f90113a.f164949b).f89092f;
                    if (bmtd4 == null) {
                        bmtd4 = bmtd.f130817d;
                    }
                    bxyk bxyk2 = bmtd4.f130820b;
                    if (bxyk2 == null) {
                        bxyk2 = bxyk.f165095c;
                    }
                    if (bxyk2.f165097a != 0) {
                        bmtd bmtd5 = ((asjr) this.f90113a.f164949b).f89092f;
                        if (bmtd5 == null) {
                            bmtd5 = bmtd.f130817d;
                        }
                        bxyk bxyk3 = bmtd5.f130819a;
                        if (bxyk3 == null) {
                            bxyk3 = bxyk.f165095c;
                        }
                        long j = bxyk3.f165097a;
                        asjr asjr = (asjr) this.f90113a.f164949b;
                        long j2 = asjr.f89091e;
                        bmtd bmtd6 = asjr.f89092f;
                        if (bmtd6 == null) {
                            bmtd6 = bmtd.f130817d;
                        }
                        bxyk bxyk4 = bmtd6.f130820b;
                        if (bxyk4 == null) {
                            bxyk4 = bxyk.f165095c;
                        }
                        return new atcs((j * 1000) - j2, (bxyk4.f165097a * 1000) - ((asjr) this.f90113a.f164949b).f89091e);
                    }
                }
            }
        }
        return new atcs(Long.MAX_VALUE, Long.MAX_VALUE);
    }

    /* renamed from: e */
    public final boolean mo49803e() {
        asjr asjr = (asjr) this.f90113a.f164949b;
        int i = asjr.f89093g;
        bmtd bmtd = asjr.f89092f;
        if (bmtd == null) {
            bmtd = bmtd.f130817d;
        }
        return i >= bmtd.f130821c;
    }

    /* renamed from: f */
    public final boolean mo49804f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49805g() {
        return (int) asuv.m74875a(m75576a(mo49833a(this.f90114c)).mo3396a(24360));
    }

    /* renamed from: h */
    public final byte[] mo49806h() {
        return ((asjr) this.f90113a.mo74062i()).serializeToBytes();
    }

    /* renamed from: a */
    private final atcq m75577a(assh assh, asse asse, askf askf) {
        asjq asjq;
        int i;
        asrx a = m75576a(assh);
        asjr asjr = (asjr) this.f90113a.f164949b;
        int i2 = 2;
        if (asjr.f89087a != 2) {
            asjq = asjq.f89078f;
        } else {
            asjq = (asjq) asjr.f89088b;
        }
        bxvd bxvd = (bxvd) asjq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) asjq);
        asjp asjp = (asjp) bxvd;
        asjq asjq2 = (asjq) asjp.f164949b;
        if (asjq2.f89083d < asjq2.f89081b.size()) {
            try {
                try {
                    assc a2 = assh.mo3416a(a, new JSONObject(asjp.mo49201a(((asjq) asjp.f164949b).f89083d)), Arrays.copyOf(((asjq) asjp.f164949b).f89084e.getKey(), ((asjq) asjp.f164949b).f89084e.mo73744a()), asse, new atdd(askf));
                    int i3 = ((asjq) asjp.f164949b).f89083d + 1;
                    if (asjp.f164950c) {
                        asjp.mo74035c();
                        asjp.f164950c = false;
                    }
                    asjq asjq3 = asjq.f89078f;
                    ((asjq) asjp.f164949b).f89083d = i3;
                    bxvd bxvd2 = this.f90113a;
                    int i4 = ((asjr) bxvd2.f164949b).f89093g + 1;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    asjr asjr2 = asjr.f89085h;
                    ((asjr) bxvd2.f164949b).f89093g = i4;
                    ByteString a3 = ByteString.m123261a(a2.mo3408a(((asjq) asjp.f164949b).f89084e.getKey()));
                    if (asjp.f164950c) {
                        asjp.mo74035c();
                        asjp.f164950c = false;
                    }
                    a3.getClass();
                    ((asjq) asjp.f164949b).f89084e = a3;
                    bxvd bxvd3 = this.f90113a;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    asjr asjr3 = (asjr) bxvd3.f164949b;
                    asjq asjq4 = (asjq) asjp.mo74062i();
                    asjq4.getClass();
                    asjr3.f89088b = asjq4;
                    asjr3.f89087a = 2;
                    int d = a2.mo3411d();
                    if (cgwn.f187872a.mo6606a().mo84622c()) {
                        if (d < 100) {
                            i = d + 2000;
                            return new atcm(new atct(a2.mo3407a(), a2.mo3409b(), a2.mo3410c(), i, a2.mo3412e(), a2.mo3413f()));
                        }
                    }
                    i = d;
                    return new atcm(new atct(a2.mo3407a(), a2.mo3409b(), a2.mo3410c(), i, a2.mo3412e(), a2.mo3413f()));
                } catch (assb e) {
                    int i5 = e.f89553a;
                    int i6 = i5 - 1;
                    if (i5 != 0) {
                        if (i6 == 0) {
                            i2 = 1;
                        } else if (i6 != 1) {
                            if (i6 != 2) {
                                i2 = 0;
                            } else {
                                i2 = 3;
                            }
                        }
                        throw new atcn(i2, e);
                    }
                    throw null;
                }
            } catch (JSONException e2) {
                bnsl bnsl = (bnsl) f90112b.mo68387b();
                bnsl.mo68432a("atde", "a", 303, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Parsing bundle as JSON failed");
                throw new RuntimeException(e2);
            }
        } else {
            throw new atcr();
        }
    }

    /* renamed from: b */
    public final btjw mo49800b() {
        bxvd da = btjw.f149188c.mo74144da();
        bxvd da2 = btjt.f149177b.mo74144da();
        String str = ((asjr) this.f90113a.f164949b).f89089c;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str.getClass();
        ((btjt) da2.f164949b).f149179a = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btjw btjw = (btjw) da.f164949b;
        btjt btjt = (btjt) da2.mo74062i();
        btjt.getClass();
        btjw.f149191b = btjt;
        btjw.f149190a = 2;
        return (btjw) da.mo74062i();
    }

    /* renamed from: a */
    private final void m75578a(asqs asqs, boolean z) {
        asjq asjq;
        if (!(asqs instanceof assj)) {
            bnsl bnsl = (bnsl) f90112b.mo68388c();
            bnsl.mo68432a("atde", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unexpected applet type: %s. Doing nothing.", asqs.getClass());
            return;
        }
        assj assj = (assj) asqs;
        if (!assj.f89566b.equals(this.f90114c)) {
            bnsl bnsl2 = (bnsl) f90112b.mo68388c();
            bnsl2.mo68432a("atde", "a", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Unexpected applet bundle type: %s. Doing nothing.", this.f90114c);
            return;
        }
        asjr asjr = (asjr) this.f90113a.f164949b;
        if (asjr.f89087a != 2) {
            asjq = asjq.f89078f;
        } else {
            asjq = (asjq) asjr.f89088b;
        }
        bxvd bxvd = (bxvd) asjq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) asjq);
        asjp asjp = (asjp) bxvd;
        if (assj.f89567c.mo3403b() || z) {
            asjq asjq2 = (asjq) asjp.f164949b;
            if (asjq2.f89083d >= asjq2.f89081b.size()) {
                bnsl bnsl3 = (bnsl) f90112b.mo68388c();
                bnsl3.mo68432a("atde", "a", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("updateAfterTap: no credentials!");
            } else {
                if (assj.f89565a.equals(asjp.mo49201a(((asjq) asjp.f164949b).f89083d))) {
                    int i = ((asjq) asjp.f164949b).f89083d + 1;
                    if (asjp.f164950c) {
                        asjp.mo74035c();
                        asjp.f164950c = false;
                    }
                    asjq asjq3 = asjq.f89078f;
                    ((asjq) asjp.f164949b).f89083d = i;
                    bxvd bxvd2 = this.f90113a;
                    int i2 = ((asjr) bxvd2.f164949b).f89093g + 1;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    asjr asjr2 = asjr.f89085h;
                    ((asjr) bxvd2.f164949b).f89093g = i2;
                } else if (Collections.unmodifiableList(((asjq) asjp.f164949b).f89081b).contains(assj.f89565a)) {
                    bnsl bnsl4 = (bnsl) f90112b.mo68388c();
                    bnsl4.mo68432a("atde", "a", 240, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("updateAfterTap: key already consumed!");
                } else {
                    bnsl a = f90112b.mo26019b(aske.m74275a());
                    a.mo68432a("atde", "a", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a.mo68405a("updateAfterTap: replenishment occurred during tap");
                }
            }
        }
        ByteString a2 = ByteString.m123261a(assj.f89567c.mo3402a(((asjq) asjp.f164949b).f89084e.getKey()));
        if (asjp.f164950c) {
            asjp.mo74035c();
            asjp.f164950c = false;
        }
        asjq asjq4 = asjq.f89078f;
        a2.getClass();
        ((asjq) asjp.f164949b).f89084e = a2;
        asqs.mo49387b().f89415k = ((asjq) asjp.f164949b).f89081b.size() - ((asjq) asjp.f164949b).f89083d;
        bxvd bxvd3 = this.f90113a;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        asjr asjr3 = (asjr) bxvd3.f164949b;
        asjq asjq5 = (asjq) asjp.mo74062i();
        asjr asjr4 = asjr.f89085h;
        asjq5.getClass();
        asjr3.f89088b = asjq5;
        asjr3.f89087a = 2;
    }

    /* renamed from: a */
    private final void m75579a(assj assj, asjp asjp) {
        asjq asjq = (asjq) asjp.f164949b;
        if (asjq.f89083d < asjq.f89081b.size()) {
            if (assj.f89565a.equals(asjp.mo49201a(((asjq) asjp.f164949b).f89083d))) {
                int i = ((asjq) asjp.f164949b).f89083d + 1;
                if (asjp.f164950c) {
                    asjp.mo74035c();
                    asjp.f164950c = false;
                }
                asjq asjq2 = asjq.f89078f;
                ((asjq) asjp.f164949b).f89083d = i;
                bxvd bxvd = this.f90113a;
                int i2 = ((asjr) bxvd.f164949b).f89093g + 1;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                asjr asjr = asjr.f89085h;
                ((asjr) bxvd.f164949b).f89093g = i2;
            } else if (Collections.unmodifiableList(((asjq) asjp.f164949b).f89081b).contains(assj.f89565a)) {
                bnsl bnsl = (bnsl) f90112b.mo68388c();
                bnsl.mo68432a("atde", "a", 240, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("updateAfterTap: key already consumed!");
            } else {
                bnsl a = f90112b.mo26019b(aske.m74275a());
                a.mo68432a("atde", "a", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a.mo68405a("updateAfterTap: replenishment occurred during tap");
            }
        } else {
            bnsl bnsl2 = (bnsl) f90112b.mo68388c();
            bnsl2.mo68432a("atde", "a", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("updateAfterTap: no credentials!");
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asqs mo49793a(askf askf, asqq asqq, String str) {
        asjq asjq;
        assh a = mo49833a(this.f90114c);
        try {
            asjr asjr = (asjr) this.f90113a.f164949b;
            if (asjr.f89087a == 2) {
                asjq = (asjq) asjr.f89088b;
            } else {
                asjq = asjq.f89078f;
            }
            bxvd bxvd = (bxvd) asjq.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) asjq);
            asjp asjp = (asjp) bxvd;
            asrx a2 = m75576a(a);
            asjq asjq2 = (asjq) asjp.f164949b;
            if (asjq2.f89083d >= asjq2.f89081b.size()) {
                return null;
            }
            String a3 = asjp.mo49201a(((asjq) asjp.f164949b).f89083d);
            int i = ((asjq) asjp.f164949b).f89083d + 1;
            if (asjp.f164950c) {
                asjp.mo74035c();
                asjp.f164950c = false;
            }
            asjq asjq3 = asjq.f89078f;
            ((asjq) asjp.f164949b).f89083d = i;
            bxvd bxvd2 = this.f90113a;
            int i2 = ((asjr) bxvd2.f164949b).f89093g + 1;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            asjr asjr2 = asjr.f89085h;
            ((asjr) bxvd2.f164949b).f89093g = i2;
            bxvd bxvd3 = this.f90113a;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            asjr asjr3 = (asjr) bxvd3.f164949b;
            asjq asjq4 = (asjq) asjp.mo74062i();
            asjq4.getClass();
            asjr3.f89088b = asjq4;
            asjr3.f89087a = 2;
            return new assj(a, a2, a3, ((asjq) asjp.f164949b).f89084e.getKey(), this.f90114c, asqq, str);
        } catch (JSONException e) {
            bnsl bnsl = (bnsl) f90112b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atde", "b", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error parsing canonical bundle");
            return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final assh mo49833a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1688490866:
                if (str.equals("canonical_interac_bundle")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1426184971:
                if (str.equals("canonical_eftpos_bundle")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -152778304:
                if (str.equals("canonical_mc_bundle")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 309674061:
                if (str.equals("canonical_discover_bundle")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 959178788:
                if (str.equals("canonical_elo_bundle")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new bts();
        }
        if (c == 1) {
            return new asra();
        }
        if (c == 2) {
            return new bqr();
        }
        if (c == 3) {
            return new asrs();
        }
        if (c == 4) {
            return new cxg();
        }
        bnsl bnsl = (bnsl) f90112b.mo68388c();
        bnsl.mo68432a("atde", "a", 184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Can't get applet for bundle type: %s", str);
        return null;
    }

    /* renamed from: a */
    public final atcq mo49795a(atcp atcp, askf askf, btiy btiy) {
        int i;
        asjq asjq;
        int i2;
        long j = 4294967295L & atcp.f90083a;
        int i3 = atcp.f90084b;
        long j2 = atcp.f90085c;
        String str = atcp.f90086d;
        int i4 = atcp.f90087e;
        List list = atcp.f90088f;
        EnumSet noneOf = EnumSet.noneOf(assd.class);
        Iterator it = list.iterator();
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Integer) it.next()).intValue();
            if (intValue == 1) {
                noneOf.add(assd.MC_3DS);
            } else if (intValue == 2) {
                noneOf.add(assd.MC_EMV);
            }
        }
        asse asse = new asse(j, i3, j2, str, i4, noneOf);
        assh a = mo49833a(this.f90114c);
        try {
            asrx a2 = m75576a(a);
            asjr asjr = (asjr) this.f90113a.f164949b;
            if (asjr.f89087a == 2) {
                asjq = (asjq) asjr.f89088b;
            } else {
                asjq = asjq.f89078f;
            }
            bxvd bxvd = (bxvd) asjq.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) asjq);
            asjp asjp = (asjp) bxvd;
            asjq asjq2 = (asjq) asjp.f164949b;
            if (asjq2.f89083d < asjq2.f89081b.size()) {
                assc a3 = a.mo3416a(a2, new JSONObject(asjp.mo49201a(((asjq) asjp.f164949b).f89083d)), Arrays.copyOf(((asjq) asjp.f164949b).f89084e.getKey(), ((asjq) asjp.f164949b).f89084e.mo73744a()), asse, new atdd(askf));
                int i5 = ((asjq) asjp.f164949b).f89083d + 1;
                if (asjp.f164950c) {
                    asjp.mo74035c();
                    asjp.f164950c = false;
                }
                asjq asjq3 = asjq.f89078f;
                ((asjq) asjp.f164949b).f89083d = i5;
                bxvd bxvd2 = this.f90113a;
                int i6 = ((asjr) bxvd2.f164949b).f89093g + 1;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                asjr asjr2 = asjr.f89085h;
                ((asjr) bxvd2.f164949b).f89093g = i6;
                ByteString a4 = ByteString.m123261a(a3.mo3408a(((asjq) asjp.f164949b).f89084e.getKey()));
                if (asjp.f164950c) {
                    asjp.mo74035c();
                    asjp.f164950c = false;
                }
                a4.getClass();
                ((asjq) asjp.f164949b).f89084e = a4;
                bxvd bxvd3 = this.f90113a;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                asjr asjr3 = (asjr) bxvd3.f164949b;
                asjq asjq4 = (asjq) asjp.mo74062i();
                asjq4.getClass();
                asjr3.f89088b = asjq4;
                asjr3.f89087a = 2;
                int d = a3.mo3411d();
                if (cgwn.f187872a.mo6606a().mo84622c()) {
                    if (d < 100) {
                        i2 = d + 2000;
                        return new atcm(new atct(a3.mo3407a(), a3.mo3409b(), a3.mo3410c(), i2, a3.mo3412e(), a3.mo3413f()));
                    }
                }
                i2 = d;
                return new atcm(new atct(a3.mo3407a(), a3.mo3409b(), a3.mo3410c(), i2, a3.mo3412e(), a3.mo3413f()));
            }
            throw new atcr();
        } catch (JSONException e) {
            bnsl bnsl = (bnsl) f90112b.mo68387b();
            bnsl.mo68432a("atde", "a", 303, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Parsing bundle as JSON failed");
            throw new RuntimeException(e);
        } catch (assb e2) {
            int i7 = e2.f89553a;
            int i8 = i7 - 1;
            if (i7 != 0) {
                if (i8 == 0) {
                    i = 1;
                } else if (i8 != 1) {
                    i = i8 != 2 ? 0 : 3;
                }
                throw new atcn(i, e2);
            }
            throw null;
        } catch (atcn e3) {
            return new atco(e3);
        }
    }

    /* renamed from: a */
    public final btmd mo49796a() {
        bxvd da = btlx.f149451b.mo74144da();
        bxvd bxvd = this.f90113a;
        if (bxvd != null) {
            String str = ((asjr) bxvd.f164949b).f89089c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((btlx) da.f164949b).f149453a = str;
        }
        bxvd da2 = btmd.f149473c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btmd btmd = (btmd) da2.f164949b;
        btlx btlx = (btlx) da.mo74062i();
        btlx.getClass();
        btmd.f149476b = btlx;
        btmd.f149475a = 5;
        return (btmd) da2.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atde.a(asqs, boolean):void
     arg types: [asqs, int]
     candidates:
      atde.a(assj, asjp):void
      atde.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atde.a(asqs, boolean):void */
    /* renamed from: a */
    public final void mo49797a(asqs asqs) {
        m75578a(asqs, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atde.a(asqs, boolean):void
     arg types: [asqs, int]
     candidates:
      atde.a(assj, asjp):void
      atde.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atde.a(asqs, boolean):void */
    /* renamed from: a */
    public final void mo49798a(asqs asqs, askf askf) {
        m75578a(asqs, false);
    }
}
