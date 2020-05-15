package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: dvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvj extends duq {

    /* renamed from: f */
    private final long f14190f;

    /* renamed from: g */
    private final long f14191g;

    /* renamed from: h */
    private List f14192h;

    /* renamed from: i */
    private final drx f14193i;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dvj(bxer bxer) {
        super(dvj.class, bxer, (r0 == 0 ? 1 : r0) - 1, bxcl.SUN_STATE_FENCE, new int[]{43});
        int a = bxeq.m122637a(bxer.f163120a);
        this.f14193i = new dvi(this, "SunStateFenceImpl");
        bxer bxer2 = (bxer) this.f14076c;
        this.f14190f = bxer2.f163121b;
        this.f14191g = bxer2.f163122c;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        if (!sqw.m36041a((Collection) this.f14192h)) {
            int i = this.f14075b;
            boolean z = true;
            if (i == 1 || i == 2) {
                List list = this.f14192h;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    long longValue = ((Long) list.get(i2)).longValue();
                    long j2 = this.f14190f;
                    i2++;
                    if (duq.m9408a(j, longValue + j2, (this.f14191g - j2) - 1)) {
                        break;
                    }
                }
                return mo9643a(z);
            }
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dvj", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[SunStateFenceImpl] Unknown sunStateFence type for matching = %s", this.f14075b);
            return mo9646b();
        }
        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
        bnsl2.mo68432a("dvj", "a", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("[SunStateFenceImpl] Not received a sun-state context to use for evaluation.");
        return mo9646b();
    }

    /* renamed from: b */
    public final long mo9704b(long j) {
        List list = this.f14192h;
        int size = list.size();
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) list.get(i)).longValue();
            long j3 = this.f14190f + longValue;
            if (j >= j3) {
                long j4 = longValue + this.f14191g;
                if (j < j4) {
                    j2 = Math.min(j2, j4);
                }
            } else {
                j2 = Math.min(j2, j3);
            }
        }
        return j2 - j;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.SUN_STATE) {
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
                    bxvj bxvj = bxnj.f164038f;
                    bxcf.mo74135a(bxvj);
                    if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                        bxcf bxcf2 = bxce.f162775h;
                        if (bxcf2 == null) {
                            bxcf2 = bxcf.f162779a;
                        }
                        bxvj bxvj2 = bxnj.f164038f;
                        bxcf2.mo74135a(bxvj2);
                        Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                        if (b == null) {
                            b = bxvj2.f164956b;
                        } else {
                            bxvj2.mo74139a(b);
                        }
                        bxnj bxnj = (bxnj) b;
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("dvj", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("[SunStateFenceImpl] Updating fence schedule using received sunState context");
                        int i2 = this.f14075b;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                i = 1;
                            } else {
                                i = 3;
                            }
                        }
                        bxwc bxwc = bxnj.f164041b;
                        int size = bxwc.size();
                        int i3 = 0;
                        while (i3 < size) {
                            bxni bxni = (bxni) bxwc.get(i3);
                            int a3 = bxnh.m122894a(bxni.f164035b);
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            i3++;
                            if (a3 == i) {
                                this.f14192h = bxni.f164036c;
                                this.f14193i.mo9514a(mo9704b(dwq.m9665i().mo20505a()), dqy.m9123a("SunStateFenceImpl#fenceEvalOp"));
                                return;
                            }
                        }
                        return;
                    }
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                    bnsl2.mo68432a("dvj", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("[SunStateFenceImpl] apply(): Invalid sunState context data received");
                }
            }
        }
    }
}
