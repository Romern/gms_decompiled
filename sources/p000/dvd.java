package p000;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: dvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvd extends duq {

    /* renamed from: i */
    private static final int[] f14160i = {18};

    /* renamed from: j */
    private static final int[] f14161j = {18, 7, 1};

    /* renamed from: f */
    public int f14162f;

    /* renamed from: g */
    public int f14163g;

    /* renamed from: h */
    public long f14164h;

    /* renamed from: k */
    private bxce f14165k;

    /* renamed from: l */
    private bxnm f14166l;

    /* renamed from: m */
    private final dxz f14167m;

    /* renamed from: n */
    private final long f14168n;

    /* renamed from: o */
    private List f14169o;

    /* renamed from: p */
    private List f14170p;

    /* renamed from: q */
    private ContextData f14171q;

    /* renamed from: r */
    private boolean f14172r;

    /* renamed from: s */
    private final ArrayList f14173s;

    /* renamed from: t */
    private String f14174t;

    /* renamed from: u */
    private long f14175u;

    /* renamed from: v */
    private boolean f14176v;

    /* renamed from: w */
    private bxig f14177w;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dvd(bxec bxec) {
        super(dvd.class, bxec, (r0 == 0 ? 1 : r0) - 1, bxcl.PLACE_FENCE, new int[0]);
        int a = bxeb.m122619a(bxec.f163081b);
        this.f14165k = null;
        this.f14166l = null;
        this.f14169o = null;
        this.f14170p = null;
        this.f14171q = null;
        this.f14177w = bxig.UNKNOWN;
        this.f14164h = -1;
        this.f14163g = -1;
        this.f14162f = -1;
        this.f14172r = false;
        this.f14173s = new ArrayList();
        this.f14174t = null;
        this.f14175u = 0;
        this.f14176v = false;
        this.f14177w = bxig.UNKNOWN;
        int a2 = bxeb.m122619a(bxec.f163081b);
        if (a2 != 0 && a2 == 6) {
            this.f14167m = new dxz(cdgv.m133420b());
            this.f14168n = dwq.m9665i().mo20505a();
            return;
        }
        this.f14167m = null;
        this.f14168n = 0;
    }

    /* renamed from: a */
    public final int mo9639a(long j) {
        int i;
        bxig bxig;
        int i2;
        int i3;
        int i4;
        long j2 = this.f14164h;
        boolean z = true;
        if (j2 == -1 && ((i4 = this.f14075b) == 2 || i4 == 3 || i4 == 1 || i4 == 5)) {
            return mo9646b();
        }
        int i5 = this.f14075b;
        boolean z2 = false;
        if (i5 == 1) {
            if (this.f14162f != 1 || j < j2 + mo9700m()) {
                z = false;
            }
            return mo9643a(z);
        } else if (i5 == 2) {
            if (!(this.f14162f == 1 && this.f14163g == 0 && duq.m9408a(j, j2, mo9699l()))) {
                z = false;
            }
            return mo9644a(z, mo9699l());
        } else if (i5 == 3) {
            if (!(this.f14162f == 0 && this.f14163g == 1 && duq.m9408a(j, j2, mo9699l()))) {
                z = false;
            }
            return mo9644a(z, mo9699l());
        } else if (i5 == 4) {
            bxig bxig2 = bxig.UNKNOWN;
            if (!this.f14172r) {
                bxig = bxig.SCREEN_IS_OFF;
                i = 2;
            } else if (!this.f14173s.isEmpty()) {
                ArrayList arrayList = this.f14173s;
                String str = (String) arrayList.get(arrayList.size() - 1);
                String str2 = this.f14174t;
                new Object[1][0] = str2;
                new Object[1][0] = str;
                if (str == null) {
                    bxig = bxig.NULL_PLACE_INFERENCE;
                    i = 3;
                } else {
                    int i6 = !TextUtils.equals(str, str2) ? 2 : 3;
                    i = i6;
                    bxig = i6 == 3 ? bxig.PLACES_DID_CHANGE : bxig.SAME_PLACE_ON_CONSECUTIVE_SCREEN_ONS;
                }
            } else if (this.f14175u == 0 || dwq.m9665i().mo20505a() <= this.f14175u + cdgp.m133216y()) {
                bxig = bxig.EMPTY_PLACE_INFERENCE_WITHIN_TIMEOUT_PERIOD;
                i = 2;
            } else {
                bxig = bxig.NO_PLACE_RESULT_WITHIN_TIMEOUT_PERIOD;
                i = 3;
            }
            if (this.f14176v || bxig != this.f14177w) {
                dpf G = dwq.m9650G();
                bxih a = dvc.m9495a(i, bxig);
                if (a != null) {
                    bxvd a2 = dpf.m9017a(3, bxcl.PLACE_FENCE);
                    bxvd da = bxhz.f163490d.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxhz bxhz = (bxhz) da.f164949b;
                    bxhz.f163493b = i - 1;
                    int i7 = 1 | bxhz.f163492a;
                    bxhz.f163492a = i7;
                    a.getClass();
                    bxhz.f163494c = a;
                    bxhz.f163492a = 2 | i7;
                    if (a2.f164950c) {
                        a2.mo74035c();
                        a2.f164950c = false;
                    }
                    bxic bxic = (bxic) a2.f164949b;
                    bxhz bxhz2 = (bxhz) da.mo74062i();
                    bxic bxic2 = bxic.f163497g;
                    bxhz2.getClass();
                    bxic.f163504f = bxhz2;
                    bxic.f163499a |= 16;
                    G.mo9375a((bxic) a2.mo74062i());
                }
                this.f14177w = bxig;
                this.f14176v = false;
            }
            int i8 = i - 1;
            this.f14078e = i8;
            return i8;
        } else if (i5 != 5) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dvd", "a", 455, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[PlaceFenceImpl] Unknown places fence type = %s", this.f14075b);
            return mo9646b();
        } else {
            List list = this.f14169o;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            List list2 = this.f14170p;
            if (list2 != null) {
                i3 = list2.size();
            } else {
                i3 = 0;
            }
            if (i2 != i3) {
                z2 = true;
            } else if (i2 != 0) {
                HashSet hashSet = new HashSet(i2);
                for (int i9 = 0; i9 < i2; i9++) {
                    hashSet.add(((bxmm) this.f14169o.get(i9)).f163951d);
                }
                int i10 = 0;
                while (true) {
                    if (i10 < i3) {
                        if (!hashSet.contains(((bxmm) this.f14170p.get(i10)).f163951d)) {
                            z2 = true;
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            }
            if (z2) {
                bxmn bxmn = (bxmn) bxmo.f163965b.mo74144da();
                bxmn.mo73591a(this.f14169o);
                tip tip = new tip(7, 60, 1);
                tip.mo26572a(bxmo.f163966c, (bxmo) bxmn.mo74062i());
                tip.mo26574a(tka.m37119b(this.f14164h));
                this.f14171q = tip.mo26570a();
            }
            return mo9643a(z2);
        }
    }

    /* renamed from: g */
    public final int[] mo9652g() {
        return this.f14075b == 4 ? f14161j : f14160i;
    }

    /* renamed from: j */
    public final List mo9697j() {
        return ((bxec) this.f14076c).f163084e;
    }

    /* renamed from: k */
    public final List mo9698k() {
        return ((bxec) this.f14076c).f163086g;
    }

    /* renamed from: l */
    public final long mo9699l() {
        return ((bxec) this.f14076c).f163082c;
    }

    /* renamed from: m */
    public final long mo9700m() {
        return ((bxec) this.f14076c).f163085f;
    }

    /* renamed from: n */
    public final String mo9701n() {
        return ((bxec) this.f14076c).f163087h;
    }

    /* renamed from: a */
    public final List mo9695a() {
        return ((bxec) this.f14076c).f163083d;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxmm bxmm;
        long j;
        double d;
        this.f14176v = true;
        bxco a = bxco.m122577a(bxce.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        if (a != bxco.USER_LOCATION) {
            String str = null;
            bxnm bxnm = null;
            if (this.f14075b == 4) {
                bxco a2 = bxco.m122577a(bxce.f162772e);
                if (a2 == null) {
                    a2 = bxco.UNKNOWN_CONTEXT_NAME;
                }
                if (a2 == bxco.SCREEN) {
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
                        bxvj bxvj = bxmz.f164000d;
                        bxcf.mo74135a(bxvj);
                        if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                            bxcf bxcf2 = bxce.f162775h;
                            if (bxcf2 == null) {
                                bxcf2 = bxcf.f162779a;
                            }
                            bxvj bxvj2 = bxmz.f164000d;
                            bxcf2.mo74135a(bxvj2);
                            Object b = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                            if (b == null) {
                                b = bxvj2.f164956b;
                            } else {
                                bxvj2.mo74139a(b);
                            }
                            int a4 = bxmy.m122885a(((bxmz) b).f164003b);
                            if (a4 != 0 && a4 == 3) {
                                this.f14172r = true;
                                this.f14175u = dwq.m9665i().mo20505a();
                                if (!this.f14173s.isEmpty()) {
                                    this.f14174t = null;
                                    ArrayList arrayList = this.f14173s;
                                    int size = arrayList.size();
                                    int i = 0;
                                    while (true) {
                                        if (i < size) {
                                            String str2 = (String) arrayList.get(i);
                                            i++;
                                            if (str2 != null) {
                                                this.f14174t = str2;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    this.f14174t = null;
                                }
                                this.f14173s.clear();
                                dwq.m9648E().mo9554a(cdgp.m133216y(), this.f14077d);
                                bxce bxce2 = this.f14165k;
                                if (bxce2 != null) {
                                    bxcf bxcf3 = bxce2.f162775h;
                                    if (bxcf3 == null) {
                                        bxcf3 = bxcf.f162779a;
                                    }
                                    bxvj bxvj3 = bxnm.f164051j;
                                    bxcf3.mo74135a(bxvj3);
                                    Object b2 = bxcf3.f164952m.mo73913b(bxvj3.f164958d);
                                    if (b2 == null) {
                                        b2 = bxvj3.f164956b;
                                    } else {
                                        bxvj3.mo74139a(b2);
                                    }
                                    bxnm = (bxnm) b2;
                                    bxeu bxeu2 = this.f14165k.f162774g;
                                    if (bxeu2 == null) {
                                        bxeu2 = bxeu.f163125e;
                                    }
                                    j = bxeu2.f163129c;
                                } else {
                                    j = -1;
                                }
                                if (bxnm != null) {
                                    bxnm bxnm2 = this.f14166l;
                                    d = bxnm2 != null ? ayuo.m84843a(bxnm2.f164054b, bxnm2.f164055c, bxnm.f164054b, bxnm.f164055c) : -2.0d;
                                } else {
                                    d = -1.0d;
                                }
                                this.f14166l = bxnm;
                                dpf G = dwq.m9650G();
                                bxvd a5 = dpf.m9017a(2, bxcl.PLACE_FENCE);
                                bxvd da = bxhy.f163486c.mo74144da();
                                bxie a6 = dvc.m9494a(j, d);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bxhy bxhy = (bxhy) da.f164949b;
                                a6.getClass();
                                bxhy.f163489b = a6;
                                bxhy.f163488a = 1 | bxhy.f163488a;
                                if (a5.f164950c) {
                                    a5.mo74035c();
                                    a5.f164950c = false;
                                }
                                bxic bxic = (bxic) a5.f164949b;
                                bxhy bxhy2 = (bxhy) da.mo74062i();
                                bxic bxic2 = bxic.f163497g;
                                bxhy2.getClass();
                                bxic.f163503e = bxhy2;
                                bxic.f163499a |= 8;
                                G.mo9375a((bxic) a5.mo74062i());
                                return;
                            }
                            this.f14172r = false;
                            dpf G2 = dwq.m9650G();
                            bxvd a7 = dpf.m9017a(2, bxcl.PLACE_FENCE);
                            bxvd da2 = bxhy.f163486c.mo74144da();
                            bxie a8 = dvc.m9493a();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bxhy bxhy3 = (bxhy) da2.f164949b;
                            a8.getClass();
                            bxhy3.f163489b = a8;
                            bxhy3.f163488a = 1 | bxhy3.f163488a;
                            if (a7.f164950c) {
                                a7.mo74035c();
                                a7.f164950c = false;
                            }
                            bxic bxic3 = (bxic) a7.f164949b;
                            bxhy bxhy4 = (bxhy) da2.mo74062i();
                            bxic bxic4 = bxic.f163497g;
                            bxhy4.getClass();
                            bxic3.f163503e = bxhy4;
                            bxic3.f163499a |= 8;
                            G2.mo9375a((bxic) a7.mo74062i());
                            return;
                        }
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("dvd", "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("[PlaceFenceImpl] Could not deserialize screen context.");
                        return;
                    }
                    return;
                }
            }
            bxco a9 = bxco.m122577a(bxce.f162772e);
            if (a9 == null) {
                a9 = bxco.UNKNOWN_CONTEXT_NAME;
            }
            if (a9 == bxco.PLACES) {
                bxcf bxcf4 = bxce.f162775h;
                if (bxcf4 == null) {
                    bxcf4 = bxcf.f162779a;
                }
                bxvj bxvj4 = bxmo.f163966c;
                bxcf4.mo74135a(bxvj4);
                if (bxcf4.f164952m.mo73911a(bxvj4.f164958d)) {
                    bxcf bxcf5 = bxce.f162775h;
                    if (bxcf5 == null) {
                        bxcf5 = bxcf.f162779a;
                    }
                    bxvj bxvj5 = bxmo.f163966c;
                    bxcf5.mo74135a(bxvj5);
                    Object b3 = bxcf5.f164952m.mo73913b(bxvj5.f164958d);
                    if (b3 == null) {
                        b3 = bxvj5.f164956b;
                    } else {
                        bxvj5.mo74139a(b3);
                    }
                    bxmo bxmo = (bxmo) b3;
                    if (this.f14075b != 5) {
                        if (bxmo.f163968a.size() != 0) {
                            new Object[1][0] = Integer.valueOf(bxmo.f163968a.size());
                            bxmm = (bxmm) bxmo.f163968a.get(0);
                            bxwc bxwc = bxmo.f163968a;
                            int size2 = bxwc.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                bxmm bxmm2 = (bxmm) bxwc.get(i2);
                                if (bxmm2.f163949b > bxmm.f163949b) {
                                    bxmm = bxmm2;
                                }
                            }
                            dwq.m9650G().mo9372a();
                        } else {
                            new Object[1][0] = bxce;
                            bxmm = null;
                        }
                        if (this.f14075b == 4 && this.f14172r) {
                            if (bxmm != null) {
                                str = bxmm.f163951d;
                            }
                            int size3 = this.f14173s.size();
                            if (size3 == 0) {
                                this.f14173s.add(str);
                                new Object[1][0] = str;
                            } else if (size3 == 1 && str != null) {
                                this.f14173s.add(str);
                                new Object[1][0] = str;
                            }
                        }
                    } else {
                        dxz dxz = this.f14167m;
                        if (dxz != null) {
                            this.f14169o = dxz.mo9843a(bxmo.f163968a);
                            long a10 = dwq.m9665i().mo20505a();
                            this.f14164h = a10;
                            if (this.f14170p == null && a10 < this.f14168n + cdgp.f180782a.mo6606a().mo77520L()) {
                                this.f14170p = this.f14169o;
                                return;
                            }
                            return;
                        }
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                        bnsl2.mo68432a("dvd", "a", 293, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("[PlaceFenceImpl] null filter");
                    }
                } else {
                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                    bnsl3.mo68432a("dvd", "a", 284, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("[PlaceFenceImpl] No extension found.");
                }
            }
        } else {
            this.f14165k = bxce;
        }
    }

    /* renamed from: a */
    public final boolean mo9696a(dub dub) {
        HashSet hashSet = new HashSet(mo9698k());
        HashSet hashSet2 = new HashSet(mo9697j());
        List k = mo9698k();
        int size = k.size();
        int i = 0;
        while (i < size) {
            String str = (String) k.get(i);
            String a = dub.mo9606a(str);
            if (a != null) {
                hashSet.remove(str);
                hashSet2.add(a);
                i++;
            } else {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dvd", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[PlaceFenceImpl] Failed to resolve alias %s", str);
                return false;
            }
        }
        bxec bxec = (bxec) this.f14076c;
        bxvd bxvd = (bxvd) bxec.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bxec);
        bxdz bxdz = (bxdz) bxvd;
        if (bxdz.f164950c) {
            bxdz.mo74035c();
            bxdz.f164950c = false;
        }
        bxec bxec2 = bxec.f163078i;
        ((bxec) bxdz.f164949b).f163086g = GeneratedMessageLite.m124030de();
        if (bxdz.f164950c) {
            bxdz.mo74035c();
            bxdz.f164950c = false;
        }
        ((bxec) bxdz.f164949b).f163084e = GeneratedMessageLite.m124030de();
        if (!hashSet.isEmpty()) {
            bxdz.mo73567a(hashSet);
        }
        if (!hashSet2.isEmpty()) {
            bxdz.mo73568b(hashSet2);
        }
        this.f14076c = (bxec) bxdz.mo74062i();
        return true;
    }

    /* renamed from: a */
    public final boolean mo9645a(Collection collection, Collection collection2) {
        boolean z;
        ContextData contextData = this.f14171q;
        if (!(contextData == null || collection == null)) {
            collection.add(contextData);
        }
        if (this.f14075b == 5) {
            z = true;
        } else {
            z = false;
        }
        this.f14170p = this.f14169o;
        if (collection2 != null && z) {
            for (int i : f14160i) {
                collection2.add(Integer.valueOf(i));
            }
        }
        return z;
    }
}
