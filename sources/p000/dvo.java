package p000;

/* renamed from: dvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvo extends duq {

    /* renamed from: f */
    private boolean f14203f;

    /* renamed from: g */
    private boolean f14204g;

    /* renamed from: h */
    private long f14205h;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dvo(bxfg bxfg) {
        super(dvo.class, bxfg, r5, r6, r7);
        int i;
        int a = bxff.m122654a(bxfg.f163175b);
        int i2 = (a == 0 ? 1 : a) - 1;
        bxcl bxcl = bxcl.WIFI_STATE_FENCE;
        int[] iArr = new int[1];
        int a2 = bxff.m122654a(bxfg.f163175b);
        int i3 = (a2 == 0 ? 1 : a2) - 1;
        if (i3 == 1) {
            i = 91;
        } else if (i3 == 2) {
            i = 17;
        } else {
            throw new IllegalArgumentException("Invalid fence trigger type for wifi fence");
        }
        iArr[0] = i;
        this.f14205h = 0;
        this.f14203f = false;
        this.f14204g = false;
    }

    /* renamed from: a */
    private final boolean m9542a(String str, String str2) {
        bxfg bxfg = (bxfg) this.f14076c;
        if ((bxfg.f163174a & 2) != 0 && !bxfg.f163176c.equals(str)) {
            return false;
        }
        bxfg bxfg2 = (bxfg) this.f14076c;
        if ((bxfg2.f163174a & 4) == 0 || bxfg2.f163177d.equals(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m9543b(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.WIFI_CONNECTION_STATE) {
            bxeu bxeu = bxce.f162774g;
            if (bxeu == null) {
                bxeu = bxeu.f163125e;
            }
            int a2 = bxet.m122640a(bxeu.f163128b);
            if (a2 != 0 && a2 == 2) {
                bxcf bxcf = bxce.f162775h;
                if (bxcf == null) {
                    bxcf = bxcf.f162779a;
                }
                bxvj bxvj = bxnv.f164097d;
                bxcf.mo74135a(bxvj);
                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxnv.f164097d;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    bxnv bxnv = (bxnv) b;
                    this.f14204g = false;
                    if ((bxnv.f164099a & 1) != 0) {
                        bxnu bxnu = bxnv.f164100b;
                        if (bxnu == null) {
                            bxnu = bxnu.f164091d;
                        }
                        this.f14204g = m9542a(bxnu.f164094b, bxnu.f164095c);
                        return;
                    }
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dvo", "b", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[WifiStateFenceImpl] No Wifi State data found.");
            }
        }
    }

    /* renamed from: c */
    private final void m9544c(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.WIFI_SCAN) {
            bxeu bxeu = bxce.f162774g;
            if (bxeu == null) {
                bxeu = bxeu.f163125e;
            }
            int a2 = bxet.m122640a(bxeu.f163128b);
            if (a2 != 0 && a2 == 1) {
                bxcf bxcf = bxce.f162775h;
                if (bxcf == null) {
                    bxcf = bxcf.f162779a;
                }
                bxvj bxvj = bxnw.f164102c;
                bxcf.mo74135a(bxvj);
                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxnw.f164102c;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    int i = 0;
                    this.f14203f = false;
                    bxwc bxwc = ((bxnw) b).f164104a;
                    int size = bxwc.size();
                    while (i < size) {
                        bxnx bxnx = (bxnx) bxwc.get(i);
                        i++;
                        if (m9542a(bxnx.f164108b, bxnx.f164109c)) {
                            this.f14203f = true;
                            return;
                        }
                    }
                    return;
                }
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dvo", "c", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[WifiStateFenceImpl] No WifiScan data found.");
            }
        }
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        if (this.f14205h == 0) {
            return mo9646b();
        }
        int a = bxff.m122654a(((bxfg) this.f14076c).f163175b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return mo9643a(this.f14204g);
        }
        if (i == 2) {
            return mo9643a(this.f14203f);
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("dvo", "a", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("[WifiStateFenceImpl] Unknown trigger type: %s", this.f14075b);
        return mo9646b();
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        int a = bxff.m122654a(((bxfg) this.f14076c).f163175b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        int i2 = 0;
        if (i == 1) {
            bxco a2 = bxco.m122577a(bxce.f162772e);
            if (a2 == null) {
                a2 = bxco.UNKNOWN_CONTEXT_NAME;
            }
            if (a2 == bxco.WIFI_CONNECTION_STATE) {
                bxeu bxeu = bxce.f162774g;
                if (bxeu == null) {
                    bxeu = bxeu.f163125e;
                }
                int a3 = bxet.m122640a(bxeu.f163128b);
                if (a3 != 0 && a3 == 2) {
                    bxcf bxcf = bxce.f162775h;
                    if (bxcf == null) {
                        bxcf = bxcf.f162779a;
                    }
                    bxvj bxvj = bxnv.f164097d;
                    bxcf.mo74135a(bxvj);
                    if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                        bxcf bxcf2 = bxce.f162775h;
                        if (bxcf2 == null) {
                            bxcf2 = bxcf.f162779a;
                        }
                        bxvj bxvj2 = bxnv.f164097d;
                        bxcf2.mo74135a(bxvj2);
                        Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                        if (b == null) {
                            b = bxvj2.f164956b;
                        } else {
                            bxvj2.mo74139a(b);
                        }
                        bxnv bxnv = (bxnv) b;
                        this.f14204g = false;
                        if ((1 & bxnv.f164099a) != 0) {
                            bxnu bxnu = bxnv.f164100b;
                            if (bxnu == null) {
                                bxnu = bxnu.f164091d;
                            }
                            this.f14204g = m9542a(bxnu.f164094b, bxnu.f164095c);
                        }
                    } else {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("dvo", "b", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("[WifiStateFenceImpl] No Wifi State data found.");
                    }
                }
            }
        } else if (i == 2) {
            bxco a4 = bxco.m122577a(bxce.f162772e);
            if (a4 == null) {
                a4 = bxco.UNKNOWN_CONTEXT_NAME;
            }
            if (a4 == bxco.WIFI_SCAN) {
                bxeu bxeu2 = bxce.f162774g;
                if (bxeu2 == null) {
                    bxeu2 = bxeu.f163125e;
                }
                int a5 = bxet.m122640a(bxeu2.f163128b);
                if (a5 != 0 && a5 == 1) {
                    bxcf bxcf3 = bxce.f162775h;
                    if (bxcf3 == null) {
                        bxcf3 = bxcf.f162779a;
                    }
                    bxvj bxvj3 = bxnw.f164102c;
                    bxcf3.mo74135a(bxvj3);
                    if (bxcf3.f164952m.mo73911a(bxvj3.f164958d)) {
                        bxcf bxcf4 = bxce.f162775h;
                        if (bxcf4 == null) {
                            bxcf4 = bxcf.f162779a;
                        }
                        bxvj bxvj4 = bxnw.f164102c;
                        bxcf4.mo74135a(bxvj4);
                        Object b2 = bxcf4.f164952m.mo73913b(bxvj4.f164958d);
                        if (b2 == null) {
                            b2 = bxvj4.f164956b;
                        } else {
                            bxvj4.mo74139a(b2);
                        }
                        this.f14203f = false;
                        bxwc bxwc = ((bxnw) b2).f164104a;
                        int size = bxwc.size();
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            bxnx bxnx = (bxnx) bxwc.get(i2);
                            i2++;
                            if (m9542a(bxnx.f164108b, bxnx.f164109c)) {
                                this.f14203f = true;
                                break;
                            }
                        }
                    } else {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                        bnsl2.mo68432a("dvo", "c", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("[WifiStateFenceImpl] No WifiScan data found.");
                    }
                }
            }
        } else {
            throw new IllegalStateException("Invalid fence trigger type for wifi fence");
        }
        bxeu bxeu3 = bxce.f162774g;
        if (bxeu3 == null) {
            bxeu3 = bxeu.f163125e;
        }
        this.f14205h = bxeu3.f163129c;
    }
}
