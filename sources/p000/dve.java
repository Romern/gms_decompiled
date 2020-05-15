package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.awareness.fence.FenceState;

/* renamed from: dve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dve extends duq {

    /* renamed from: f */
    private int f14178f;

    /* renamed from: g */
    private int f14179g;

    /* renamed from: h */
    private int f14180h;

    /* renamed from: i */
    private int f14181i;

    /* renamed from: j */
    private long f14182j;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dve(bxeg bxeg) {
        super(dve.class, bxeg, (r0 == 0 ? 1 : r0) - 1, bxcl.POWER_CONNECTION_FENCE, new int[]{8});
        int a = bxef.m122625a(bxeg.f163092a);
        this.f14179g = 0;
        this.f14178f = 0;
        this.f14181i = 0;
        this.f14180h = 0;
        this.f14182j = 0;
    }

    /* renamed from: b */
    private final int m9508b(long j) {
        int i = this.f14178f;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i2 = this.f14075b;
        if (i2 == 1) {
            if (i == 1) {
                z = true;
            }
            return FenceState.m7187a(z);
        } else if (i2 == 2) {
            if (i == 1 && this.f14179g == 2 && duq.m9408a(j, this.f14182j, mo9702a())) {
                z = true;
            }
            return FenceState.m7187a(z);
        } else if (i2 != 3) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dve", "b", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[PowerConnectionFenceImpl] unexpected trigger type=%s", this.f14075b);
            return 0;
        } else {
            if (i == 2 && this.f14179g == 1 && duq.m9408a(j, this.f14182j, mo9702a())) {
                z = true;
            }
            return FenceState.m7187a(z);
        }
    }

    /* renamed from: c */
    private final int m9509c(long j) {
        int i = this.f14180h;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i2 = this.f14075b;
        if (i2 == 4) {
            if (i == 1) {
                z = true;
            }
            return FenceState.m7187a(z);
        } else if (i2 == 5) {
            if (i == 1 && this.f14181i == 2 && duq.m9408a(j, this.f14182j, mo9702a())) {
                z = true;
            }
            return FenceState.m7187a(z);
        } else if (i2 != 6) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dve", "c", 184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[PowerConnectionFenceImpl] unexpected trigger type=%s", this.f14075b);
            return 0;
        } else {
            if (i == 2 && this.f14181i == 1 && duq.m9408a(j, this.f14182j, mo9702a())) {
                z = true;
            }
            return FenceState.m7187a(z);
        }
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        boolean z = true;
        switch (this.f14075b) {
            case 1:
                int b = m9508b(j);
                this.f14078e = b;
                return b;
            case 2:
            case 3:
                if (m9508b(j) != 2) {
                    z = false;
                }
                return mo9644a(z, mo9702a());
            case 4:
                int c = m9509c(j);
                this.f14078e = c;
                return c;
            case 5:
            case 6:
                if (m9509c(j) != 2) {
                    z = false;
                }
                return mo9644a(z, mo9702a());
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dve", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[PowerConnectionFenceImpl] Unknown trigger type=%s", this.f14075b);
                return mo9646b();
        }
    }

    /* renamed from: a */
    public final long mo9702a() {
        return ((bxeg) this.f14076c).f163095d;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.POWER_CONNECTION) {
            bxeu bxeu = bxce.f162774g;
            if (bxeu == null) {
                bxeu = bxeu.f163125e;
            }
            int a2 = bxet.m122640a(bxeu.f163128b);
            if (a2 != 0) {
                int i = 2;
                if (a2 == 2) {
                    bxcf bxcf = bxce.f162775h;
                    if (bxcf == null) {
                        bxcf = bxcf.f162779a;
                    }
                    bxvj bxvj = bxmr.f163978e;
                    bxcf.mo74135a(bxvj);
                    if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                        bxcf bxcf2 = bxce.f162775h;
                        if (bxcf2 == null) {
                            bxcf2 = bxcf.f162779a;
                        }
                        bxvj bxvj2 = bxmr.f163978e;
                        bxcf2.mo74135a(bxvj2);
                        Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                        if (b == null) {
                            b = bxvj2.f164956b;
                        } else {
                            bxvj2.mo74139a(b);
                        }
                        bxmr bxmr = (bxmr) b;
                        switch (this.f14075b) {
                            case 1:
                            case 2:
                            case 3:
                                double d = bxmr.f163982c;
                                bxeg bxeg = (bxeg) this.f14076c;
                                double d2 = bxeg.f163093b;
                                double d3 = bxeg.f163094c;
                                if (d2 <= d && d <= d3) {
                                    i = 1;
                                }
                                int i2 = this.f14178f;
                                if (i != i2) {
                                    this.f14179g = i2;
                                    this.f14178f = i;
                                    bxeu bxeu2 = bxce.f162774g;
                                    if (bxeu2 == null) {
                                        bxeu2 = bxeu.f163125e;
                                    }
                                    this.f14182j = bxeu2.f163129c;
                                    return;
                                }
                                return;
                            case 4:
                            case 5:
                            case 6:
                                bxvv bxvv = new bxvv(((bxeg) this.f14076c).f163096e, bxeg.f163089f);
                                bxmq a3 = bxmq.m122875a(bxmr.f163981b);
                                if (a3 == null) {
                                    a3 = bxmq.UNKNOWN;
                                }
                                if (bxvv.contains(a3)) {
                                    i = 1;
                                }
                                int i3 = this.f14180h;
                                if (i != i3) {
                                    this.f14181i = i3;
                                    this.f14180h = i;
                                    bxeu bxeu3 = bxce.f162774g;
                                    if (bxeu3 == null) {
                                        bxeu3 = bxeu.f163125e;
                                    }
                                    this.f14182j = bxeu3.f163129c;
                                    return;
                                }
                                return;
                            default:
                                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                                bnsl.mo68432a("dve", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68409a("[PowerConnectionFenceImpl] Unknown trigger type=%s", this.f14075b);
                                return;
                        }
                    } else {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                        bnsl2.mo68432a("dve", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("[PowerConnectionFenceImpl] No power connection data.");
                    }
                }
            }
        }
    }
}
