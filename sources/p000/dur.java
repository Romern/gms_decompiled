package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: dur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dur extends duq {

    /* renamed from: f */
    private ArrayList f14082f;

    /* renamed from: g */
    private long f14083g;

    /* renamed from: h */
    private long f14084h;

    /* renamed from: i */
    private Set f14085i;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dur(bxcb bxcb) {
        super(dur.class, bxcb, (r0 == 0 ? 1 : r0) - 1, bxcl.BEACON_FENCE, new int[]{26});
        int a = bxca.m122559a(bxcb.f162761a);
        this.f14083g = -1;
        this.f14084h = -1;
        this.f14085i = null;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i = this.f14075b;
        if (i == 1) {
            long j2 = this.f14083g;
            if (j2 == -1) {
                return mo9646b();
            }
            boolean a = duq.m9408a(j, j2, mo9658j());
            new Object[1][0] = Boolean.valueOf(a);
            return mo9643a(a);
        } else if (i == 2) {
            long j3 = this.f14084h;
            if (j3 == -1) {
                return mo9646b();
            }
            boolean a2 = duq.m9408a(j, j3, mo9658j());
            new Object[1][0] = Boolean.valueOf(a2);
            return mo9643a(a2);
        } else if (i != 3) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dur", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[BeaconFenceImpl] Unknown beacon fence trigger type=%s", this.f14075b);
            return mo9646b();
        } else {
            Set set = this.f14085i;
            if (set != null) {
                return mo9643a(!set.isEmpty());
            }
            return mo9646b();
        }
    }

    /* renamed from: j */
    public final long mo9658j() {
        return ((bxcb) this.f14076c).f162762b;
    }

    /* renamed from: a */
    public final List mo9656a() {
        if (this.f14082f == null) {
            this.f14082f = new ArrayList();
            bxwc bxwc = ((bxcb) this.f14076c).f162763c;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bxby bxby = (bxby) bxwc.get(i);
                ArrayList arrayList = this.f14082f;
                sdo.m34959a(bxby);
                arrayList.add(bxby);
            }
        }
        return this.f14082f;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.DETECTED_BEACON) {
            bxcf bxcf = bxce.f162775h;
            if (bxcf == null) {
                bxcf = bxcf.f162779a;
            }
            bxvj bxvj = bxkn.f163769e;
            bxcf.mo74135a(bxvj);
            if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                bxcf bxcf2 = bxce.f162775h;
                if (bxcf2 == null) {
                    bxcf2 = bxcf.f162779a;
                }
                bxvj bxvj2 = bxkn.f163769e;
                bxcf2.mo74135a(bxvj2);
                Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                if (b == null) {
                    b = bxvj2.f164956b;
                } else {
                    bxvj2.mo74139a(b);
                }
                bxkn bxkn = (bxkn) b;
                int i = this.f14075b;
                if (i == 1) {
                    bxeu bxeu = bxce.f162774g;
                    if (bxeu == null) {
                        bxeu = bxeu.f163125e;
                    }
                    int a2 = bxet.m122640a(bxeu.f163128b);
                    if (a2 != 0 && a2 == 2 && mo9657a(bxkn)) {
                        bxeu bxeu2 = bxce.f162774g;
                        if (bxeu2 == null) {
                            bxeu2 = bxeu.f163125e;
                        }
                        this.f14083g = bxeu2.f163129c;
                    }
                } else if (i == 2) {
                    bxeu bxeu3 = bxce.f162774g;
                    if (bxeu3 == null) {
                        bxeu3 = bxeu.f163125e;
                    }
                    int a3 = bxet.m122640a(bxeu3.f163128b);
                    if ((a3 == 0 || a3 != 2) && mo9657a(bxkn)) {
                        bxeu bxeu4 = bxce.f162774g;
                        if (bxeu4 == null) {
                            bxeu4 = bxeu.f163125e;
                        }
                        this.f14084h = bxeu4.f163130d;
                    }
                } else if (i != 3) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dur", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("[BeaconFenceImpl] Unknown beacon fence trigger type=%s", this.f14075b);
                } else if (mo9657a(bxkn)) {
                    if (this.f14085i == null) {
                        this.f14085i = new HashSet();
                    }
                    bxeu bxeu5 = bxce.f162774g;
                    if (bxeu5 == null) {
                        bxeu5 = bxeu.f163125e;
                    }
                    int a4 = bxet.m122640a(bxeu5.f163128b);
                    if (a4 != 0 && a4 == 2) {
                        this.f14085i.add(bxkn);
                    } else {
                        this.f14085i.remove(bxkn);
                    }
                }
            } else {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("dur", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("[BeaconFenceImpl] No detected beacon data.");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9657a(bxkn bxkn) {
        List a = mo9656a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            bxby bxby = (bxby) a.get(i);
            Object[] objArr = {bxby.f162755b, bxby.f162756c, bxby.f162757d};
            Object[] objArr2 = new Object[3];
            bxkm bxkm = bxkn.f163772b;
            if (bxkm == null) {
                bxkm = bxkm.f163763d;
            }
            objArr2[0] = bxkm.f163766b;
            bxkm bxkm2 = bxkn.f163772b;
            if (bxkm2 == null) {
                bxkm2 = bxkm.f163763d;
            }
            objArr2[1] = bxkm2.f163767c;
            objArr2[2] = bxkn.f163773c.mo73780k();
            bxkm bxkm3 = bxkn.f163772b;
            if (bxkm3 == null) {
                bxkm3 = bxkm.f163763d;
            }
            if (TextUtils.equals(bxkm3.f163766b, bxby.f162755b)) {
                bxkm bxkm4 = bxkn.f163772b;
                if (bxkm4 == null) {
                    bxkm4 = bxkm.f163763d;
                }
                if (TextUtils.equals(bxkm4.f163767c, bxby.f162756c) && ((bxby.f162754a & 4) == 0 || !bxby.f162757d.mo73779j() || bxkn.f163773c.equals(bxby.f162757d))) {
                    return true;
                }
            }
        }
        return false;
    }
}
