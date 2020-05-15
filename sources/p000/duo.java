package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: duo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duo extends duq {

    /* renamed from: f */
    private int f14053f;

    /* renamed from: g */
    private int f14054g;

    /* renamed from: h */
    private long f14055h;

    /* JADX WARNING: Illegal instructions before constructor call */
    public duo(bxbu bxbu) {
        super(duo.class, bxbu, (r0 == 0 ? 1 : r0) - 1, bxcl.ACTIVITY_FENCE, new int[]{6});
        int a = bxbt.m122552a(bxbu.f162736a);
        this.f14055h = -1;
        this.f14053f = -1;
        this.f14054g = -1;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        if (this.f14053f == -1) {
            return mo9646b();
        }
        int a = bxbt.m122552a(this.f14075b);
        int i = a - 1;
        if (a != 0) {
            boolean z = false;
            if (i == 1) {
                if (this.f14053f == 1) {
                    z = true;
                }
                return mo9643a(z);
            } else if (i == 2) {
                if (this.f14053f == 1 && this.f14054g == 0 && duq.m9408a(j, this.f14055h, mo9640a())) {
                    z = true;
                }
                return mo9644a(z, mo9640a());
            } else if (i != 3) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("duo", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[ActivityFenceImpl] Unknown activity fence type = %s", this.f14075b);
                return mo9646b();
            } else {
                if (this.f14053f == 0 && this.f14054g == 1 && duq.m9408a(j, this.f14055h, mo9640a())) {
                    z = true;
                }
                return mo9644a(z, mo9640a());
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public final long mo9640a() {
        return ((bxbu) this.f14076c).f162737b;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxkl bxkl;
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.DETECTED_ACTIVITY) {
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
                bxvj bxvj = bxkl.f163760c;
                bxcf.mo74135a(bxvj);
                boolean a3 = bxcf.f164952m.mo73911a(bxvj.f164958d);
                bxkj bxkj = null;
                if (a3) {
                    bxcf bxcf2 = bxce.f162775h;
                    if (bxcf2 == null) {
                        bxcf2 = bxcf.f162779a;
                    }
                    bxvj bxvj2 = bxkl.f163760c;
                    bxcf2.mo74135a(bxvj2);
                    Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    bxkl = (bxkl) b;
                } else {
                    bxkl = null;
                }
                if (bxkl == null || bxkl.f163762a.size() == 0) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                    bnsl.mo68432a("duo", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[ActivityFenceImpl] Invalid activity record received for context.");
                    return;
                }
                int i = 0;
                bxwc bxwc = bxkl.f163762a;
                int size = bxwc.size();
                bxkj bxkj2 = (bxkj) bxkl.f163762a.get(0);
                ArrayList arrayList = null;
                for (int i2 = 0; i2 < size; i2++) {
                    bxkj bxkj3 = (bxkj) bxwc.get(i2);
                    int i3 = bxkj3.f163758c;
                    if (i3 > bxkj2.f163758c) {
                        bxkj2 = bxkj3;
                    }
                    if (bxkj == null || i3 > bxkj.f163758c) {
                        bxki a4 = bxki.m122801a(bxkj3.f163757b);
                        if (a4 == null) {
                            a4 = bxki.IN_VEHICLE;
                        }
                        if (a4 != bxki.ON_FOOT) {
                            bxkj = bxkj3;
                        }
                    }
                    if (bxkj3.f163758c >= ((int) cdgp.f180782a.mo6606a().mo77560ae())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(bxkj3);
                    }
                }
                if (bxkj2.f163758c >= ((int) cdgp.f180782a.mo6606a().mo77570ao())) {
                    Iterator it = new bxvv(((bxbu) this.f14076c).f162738c, bxbu.f162733d).iterator();
                    loop1:
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        bxki bxki = (bxki) it.next();
                        if (bxkj2 != null) {
                            bxki a5 = bxki.m122801a(bxkj2.f163757b);
                            if (a5 == null) {
                                a5 = bxki.IN_VEHICLE;
                            }
                            if (a5 == bxki) {
                                i = 1;
                                break;
                            }
                        }
                        if (bxkj != null) {
                            bxki a6 = bxki.m122801a(bxkj.f163757b);
                            if (a6 == null) {
                                a6 = bxki.IN_VEHICLE;
                            }
                            if (a6 == bxki) {
                                i = 1;
                                break;
                            }
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                bxki a7 = bxki.m122801a(((bxkj) arrayList.get(i4)).f163757b);
                                if (a7 == null) {
                                    a7 = bxki.IN_VEHICLE;
                                }
                                i4++;
                                if (a7 == bxki) {
                                    i = 1;
                                    break loop1;
                                }
                            }
                            continue;
                        }
                    }
                    int i5 = this.f14053f;
                    if (i != i5) {
                        this.f14054g = i5;
                        this.f14053f = i;
                        bxeu bxeu2 = bxce.f162774g;
                        if (bxeu2 == null) {
                            bxeu2 = bxeu.f163125e;
                        }
                        this.f14055h = bxeu2.f163129c;
                    }
                }
            }
        }
    }
}
