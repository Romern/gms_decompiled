package p000;

import android.util.Pair;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: duy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duy extends duq {

    /* renamed from: f */
    private final Runnable f14137f;

    /* renamed from: g */
    private long f14138g;

    /* renamed from: h */
    private int f14139h;

    /* renamed from: i */
    private int f14140i;

    /* renamed from: j */
    private List f14141j;

    /* renamed from: k */
    private dui f14142k;

    /* renamed from: l */
    private bxce f14143l;

    /* renamed from: m */
    private final bxeh f14144m;

    /* JADX WARNING: Illegal instructions before constructor call */
    public duy(bxdn bxdn, bxeh bxeh) {
        super(duy.class, bxdn, (r0 == 0 ? 1 : r0) - 1, bxcl.LOCATION_FENCE, bxeh == null ? new int[]{1} : new int[]{1, 46});
        int a = bxdm.m122603a(bxdn.f163047b);
        this.f14137f = new dux(this);
        this.f14138g = -1;
        this.f14139h = -1;
        this.f14140i = -1;
        this.f14144m = bxeh;
    }

    /* renamed from: a */
    public static int m9472a(int i) {
        if (i == 1) {
            return 10;
        }
        if (i != 2) {
            return i != 3 ? 100 : 90;
        }
        return 50;
    }

    /* renamed from: b */
    public final int mo9686b(long j) {
        int i = this.f14139h;
        if (i == -1) {
            return mo9646b();
        }
        int i2 = this.f14075b;
        boolean z = true;
        if (i2 == 1) {
            if (i != 0 || j < this.f14138g + mo9692n()) {
                z = false;
            }
            return mo9643a(z);
        } else if (i2 == 2) {
            if (!(i == 0 && this.f14140i == 1 && duq.m9408a(j, this.f14138g, mo9691m() - 1))) {
                z = false;
            }
            return mo9644a(z, mo9691m());
        } else if (i2 != 3) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("duy", "b", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[LocationFenceImpl] Unknown location fence trigger type = %s", this.f14075b);
            return mo9646b();
        } else {
            if (!(i == 1 && this.f14140i == 0 && duq.m9408a(j, this.f14138g, mo9691m() - 1))) {
                z = false;
            }
            return mo9644a(z, mo9691m());
        }
    }

    /* renamed from: h */
    public final dui mo9653h() {
        dui dui = this.f14142k;
        return dui == null ? dui.m9371a() : dui;
    }

    /* renamed from: j */
    public final int mo9688j() {
        return ((bxdn) this.f14076c).f163051f;
    }

    /* renamed from: k */
    public final double mo9689k() {
        return ((bxdn) this.f14076c).f163052g;
    }

    /* renamed from: l */
    public final double mo9690l() {
        return ((bxdn) this.f14076c).f163053h;
    }

    /* renamed from: m */
    public final long mo9691m() {
        return ((bxdn) this.f14076c).f163049d;
    }

    /* renamed from: n */
    public final long mo9692n() {
        return ((bxdn) this.f14076c).f163054i;
    }

    /* renamed from: a */
    private final void m9473a(bxnd bxnd) {
        Object[] objArr = new Object[2];
        bxnc bxnc = bxnd.f164017a;
        if (bxnc == null) {
            bxnc = bxnc.f164010c;
        }
        objArr[0] = Integer.valueOf(bxnc.f164012a);
        bxnc bxnc2 = bxnd.f164017a;
        if (bxnc2 == null) {
            bxnc2 = bxnc.f164010c;
        }
        objArr[1] = Integer.valueOf(bxnc2.f164013b);
        int a = m9472a(this.f14144m.f163100a);
        bxnf bxnf = bxnd.f164018b;
        if (bxnf == null) {
            bxnf = bxnf.f164025d;
        }
        boolean z = false;
        for (int i = 0; i < bxnf.f164029c.size(); i++) {
            z |= (bxnf.f164029c.mo74151b(i) * bxnd.f164019c) / 100 >= a;
        }
        if (z) {
            this.f14141j.add(bxnd);
        }
        bxwc bxwc = bxnd.f164020d;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            m9473a((bxnd) bxwc.get(i2));
        }
    }

    /* renamed from: a */
    public final int mo9685a() {
        return ((bxdn) this.f14076c).f163050e;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i;
        ArrayList arrayList;
        long j2;
        bxnf bxnf;
        int i2;
        long j3;
        dui dui;
        long j4;
        long j5 = j;
        int i3 = 2;
        boolean z = false;
        int i4 = 0;
        r7 = false;
        r7 = false;
        boolean z2 = false;
        r7 = false;
        r7 = false;
        boolean z3 = false;
        z = false;
        char c = 1;
        if (this.f14144m != null) {
            this.f14142k = dui.m9371a();
            if (!sqw.m36041a((Collection) this.f14141j)) {
                new Object[1][0] = Long.valueOf(this.f14144m.f163101b);
                int a = m9472a(this.f14144m.f163100a);
                ArrayList arrayList2 = new ArrayList();
                List list = this.f14141j;
                int size = list.size();
                int i5 = 0;
                long j6 = Long.MAX_VALUE;
                while (i5 < size) {
                    bxnd bxnd = (bxnd) list.get(i5);
                    Object[] objArr = new Object[i3];
                    bxnc bxnc = bxnd.f164017a;
                    if (bxnc == null) {
                        bxnc = bxnc.f164010c;
                    }
                    objArr[i4] = Integer.valueOf(bxnc.f164012a);
                    bxnc bxnc2 = bxnd.f164017a;
                    if (bxnc2 == null) {
                        bxnc2 = bxnc.f164010c;
                    }
                    objArr[c] = Integer.valueOf(bxnc2.f164013b);
                    bxnf bxnf2 = bxnd.f164018b;
                    if (bxnf2 == null) {
                        bxnf2 = bxnf.f164025d;
                    }
                    ArrayList arrayList3 = arrayList2;
                    long j7 = ((long) (bxnf2.f164027a * 60)) * 1000;
                    List list2 = list;
                    long j8 = ((long) (bxnf2.f164028b * 60)) * 1000;
                    dui a2 = dui.m9371a();
                    while (true) {
                        i = size;
                        if (i4 >= bxnf2.f164029c.size()) {
                            break;
                        }
                        int i6 = i5;
                        long j9 = j6;
                        int i7 = i4 + 1;
                        dui dui2 = a2;
                        long j10 = (((long) i4) * j8) + j7;
                        long j11 = (((long) i7) * j8) + j7;
                        if ((bxnf2.f164029c.mo74151b(i4) * bxnd.f164019c) / 100 < a) {
                            i2 = a;
                            bxnf = bxnf2;
                            j2 = j7;
                            dui = dui2;
                            j3 = j10;
                        } else {
                            if (j11 > j5) {
                                i2 = a;
                                bxnf = bxnf2;
                                long j12 = this.f14144m.f163101b + j5;
                                if (j10 <= j12) {
                                    j2 = j7;
                                    j3 = j10;
                                    dui = dui2;
                                    dui.m9392b(duk.m9379a(j3, Math.min(j11, j12)), dui.f14042a);
                                }
                            } else {
                                i2 = a;
                                bxnf = bxnf2;
                            }
                            j2 = j7;
                            dui = dui2;
                            j3 = j10;
                        }
                        long j13 = j8;
                        long j14 = this.f14144m.f163101b + j5;
                        if (j3 > j14) {
                            j4 = Math.min(j9, j3 - j14);
                        } else {
                            j4 = j9;
                            if (j11 > j5) {
                                j4 = Math.min(j4, j11 - j5);
                            }
                        }
                        a2 = dui;
                        i5 = i6;
                        i4 = i7;
                        size = i;
                        j8 = j13;
                        a = i2;
                        bxnf2 = bxnf;
                        j6 = j4;
                        j7 = j2;
                    }
                    int i8 = a;
                    dui dui3 = a2;
                    int i9 = i5;
                    long j15 = j6;
                    if (!dui3.mo9617d()) {
                        bxvd da = bxnm.f164050i.mo74144da();
                        bxnc bxnc3 = bxnd.f164017a;
                        if (bxnc3 == null) {
                            bxnc3 = bxnc.f164010c;
                        }
                        int i10 = bxnc3.f164012a;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bxnm bxnm = (bxnm) da.f164949b;
                        bxnm.f164053a |= 1;
                        bxnm.f164054b = i10;
                        bxnc bxnc4 = bxnd.f164017a;
                        if (bxnc4 == null) {
                            bxnc4 = bxnc.f164010c;
                        }
                        int i11 = bxnc4.f164013b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bxnm bxnm2 = (bxnm) da.f164949b;
                        bxnm2.f164053a |= 2;
                        bxnm2.f164055c = i11;
                        tip tip = new tip(3, 1, 1);
                        tip.mo26574a(tka.m37117a(j));
                        tip.mo26572a(bxnm.f164051j, (bxnm) da.mo74062i());
                        arrayList = arrayList3;
                        arrayList.add(new Pair(tip.mo26570a().mo18013c(), dui3));
                    } else {
                        arrayList = arrayList3;
                    }
                    i5 = i9 + 1;
                    j6 = j15;
                    size = i;
                    list = list2;
                    i3 = 2;
                    i4 = 0;
                    c = 1;
                    arrayList2 = arrayList;
                    a = i8;
                }
                ArrayList arrayList4 = arrayList2;
                if (j6 < Long.MAX_VALUE) {
                    dwq.m9667k().mo9434a(this.f14137f, j6, dqy.m9123a("LocationFenceImpl#fenceEvalOp"));
                } else {
                    dwq.m9667k().mo9433a(this.f14137f);
                }
                int size2 = arrayList4.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Pair pair = (Pair) arrayList4.get(i12);
                    mo9687b((bxce) pair.first);
                    if (this.f14139h == 0) {
                        this.f14142k.mo9614a((dui) pair.second);
                        new Object[1][0] = this.f14142k.toString();
                    }
                }
            }
            bxce bxce = this.f14143l;
            if (bxce != null) {
                mo9687b(bxce);
                if (this.f14139h == 0) {
                    dui.m9392b(duk.m9379a(j5, j5), this.f14142k.f14042a);
                    this.f14078e = 2;
                    return 2;
                }
            }
            if (this.f14141j != null) {
                return mo9643a(!this.f14142k.mo9617d());
            }
            return mo9646b();
        }
        int i13 = this.f14139h;
        if (i13 == -1) {
            return mo9646b();
        }
        int i14 = this.f14075b;
        if (i14 == 1) {
            if (i13 == 0 && j5 >= this.f14138g + mo9692n()) {
                z = true;
            }
            return mo9643a(z);
        } else if (i14 == 2) {
            if (i13 == 0 && this.f14140i == 1 && duq.m9408a(j, this.f14138g, -1 + mo9691m())) {
                z3 = true;
            }
            return mo9644a(z3, mo9691m());
        } else if (i14 != 3) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("duy", "b", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[LocationFenceImpl] Unknown location fence trigger type = %s", this.f14075b);
            return mo9646b();
        } else {
            if (i13 == 1 && this.f14140i == 0 && duq.m9408a(j, this.f14138g, -1 + mo9691m())) {
                z2 = true;
            }
            return mo9644a(z2, mo9691m());
        }
    }

    /* renamed from: b */
    public final void mo9687b(bxce bxce) {
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a == bxco.USER_LOCATION) {
            bxcf bxcf = bxce.f162775h;
            if (bxcf == null) {
                bxcf = bxcf.f162779a;
            }
            bxvj bxvj = bxnm.f164051j;
            bxcf.mo74135a(bxvj);
            if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                bxcf bxcf2 = bxce.f162775h;
                if (bxcf2 == null) {
                    bxcf2 = bxcf.f162779a;
                }
                bxvj bxvj2 = bxnm.f164051j;
                bxcf2.mo74135a(bxvj2);
                Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                if (b == null) {
                    b = bxvj2.f164956b;
                } else {
                    bxvj2.mo74139a(b);
                }
                bxnm bxnm = (bxnm) b;
                double a2 = ayuo.m84843a(mo9685a(), mo9688j(), bxnm.f164054b, bxnm.f164055c);
                int i = this.f14139h;
                this.f14140i = i;
                if (i == -1) {
                    if (a2 <= (mo9689k() + mo9690l()) * 0.5d) {
                        this.f14139h = 0;
                    } else {
                        this.f14139h = 1;
                    }
                    bxeu bxeu = bxce.f162774g;
                    if (bxeu == null) {
                        bxeu = bxeu.f163125e;
                    }
                    this.f14138g = bxeu.f163129c;
                } else if (i != 0) {
                    int i2 = this.f14075b;
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("duy", "b", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68409a("[LocationFenceImpl] Unknown location fence trigger type = %s", this.f14075b);
                    } else if (a2 < mo9690l()) {
                        this.f14139h = 0;
                        bxeu bxeu2 = bxce.f162774g;
                        if (bxeu2 == null) {
                            bxeu2 = bxeu.f163125e;
                        }
                        this.f14138g = bxeu2.f163129c;
                    }
                } else {
                    int i3 = this.f14075b;
                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                        bnsl2.mo68432a("duy", "b", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68409a("[LocationFenceImpl] Unknown location fence trigger type = %s", this.f14075b);
                    } else if (a2 > mo9689k()) {
                        this.f14139h = 1;
                        bxeu bxeu3 = bxce.f162774g;
                        if (bxeu3 == null) {
                            bxeu3 = bxeu.f163125e;
                        }
                        this.f14138g = bxeu3.f163129c;
                    }
                }
                if (mo9692n() == 0) {
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(mo9692n());
                    bxeu bxeu4 = bxce.f162774g;
                    if (bxeu4 == null) {
                        bxeu4 = bxeu.f163125e;
                    }
                    objArr[1] = Long.valueOf((bxeu4.f163129c + mo9692n()) - dwq.m9665i().mo20505a());
                }
                if (this.f14075b == 1 && mo9692n() > 0 && this.f14140i != 0 && this.f14139h == 0) {
                    dwq.m9648E().mo9554a(mo9692n(), this.f14077d);
                    return;
                }
                return;
            }
            bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
            bnsl3.mo68432a("duy", "b", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("[LocationFenceImpl] No UserLocation data.");
        }
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        if (this.f14144m != null) {
            bxco a = bxco.m122577a(bxce.f162772e);
            if (a == null) {
                a = bxco.UNKNOWN_CONTEXT_NAME;
            }
            if (a != bxco.DESTINATION_PREDICTION) {
                bxco a2 = bxco.m122577a(bxce.f162772e);
                if (a2 == null) {
                    a2 = bxco.UNKNOWN_CONTEXT_NAME;
                }
                if (a2 == bxco.USER_LOCATION) {
                    this.f14143l = bxce;
                    return;
                }
                return;
            }
            bxne a3 = dyq.m9836a(bxce);
            if (a3 != null && a3.f164024a.size() != 0) {
                new Object[1][0] = Integer.valueOf(a3.f164024a.size());
                this.f14141j = new ArrayList();
                bxwc bxwc = a3.f164024a;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    m9473a((bxnd) bxwc.get(i));
                }
                return;
            }
            return;
        }
        mo9687b(bxce);
    }
}
