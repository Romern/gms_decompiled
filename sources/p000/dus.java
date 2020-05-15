package p000;

import android.util.Base64;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: dus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dus extends duq {

    /* renamed from: l */
    private static final int[] f14086l = {-2};

    /* renamed from: A */
    private dvf f14087A;

    /* renamed from: B */
    private duw f14088B;

    /* renamed from: C */
    private dvj f14089C;

    /* renamed from: D */
    private dvn f14090D;

    /* renamed from: E */
    private dvh f14091E;

    /* renamed from: F */
    private dvo f14092F;

    /* renamed from: G */
    private Set f14093G;

    /* renamed from: H */
    private List f14094H;

    /* renamed from: I */
    private List f14095I;

    /* renamed from: f */
    public String f14096f;

    /* renamed from: g */
    public boolean f14097g;

    /* renamed from: h */
    public List f14098h;

    /* renamed from: i */
    public List f14099i;

    /* renamed from: j */
    public List f14100j;

    /* renamed from: k */
    public long f14101k;

    /* renamed from: m */
    private dus f14102m;

    /* renamed from: n */
    private dvl f14103n;

    /* renamed from: o */
    private dvl f14104o;

    /* renamed from: p */
    private duy f14105p;

    /* renamed from: q */
    private dvd f14106q;

    /* renamed from: r */
    private duo f14107r;

    /* renamed from: s */
    private dvg f14108s;

    /* renamed from: t */
    private dve f14109t;

    /* renamed from: u */
    private dvb f14110u;

    /* renamed from: v */
    private dup f14111v;

    /* renamed from: w */
    private dur f14112w;

    /* renamed from: x */
    private duz f14113x;

    /* renamed from: y */
    private dvm f14114y;

    /* renamed from: z */
    private dva f14115z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dus(bxcm bxcm) {
        super(dus.class, bxcm, 0, r5, new int[0]);
        bxcl bxcl;
        bxcl a = bxcl.m122571a(bxcm.f162815b);
        if (a != null) {
            bxcl = a;
        } else {
            bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        }
        this.f14102m = null;
        this.f14096f = null;
        this.f14097g = false;
    }

    /* renamed from: a */
    private final void m9425a(bxcl bxcl, List list) {
        bxcl bxcl2 = this.f14074a;
        if (bxcl2 != bxcl) {
            bxcl bxcl3 = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
            int ordinal = bxcl2.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 22) {
                for (dus dus : mo9661a()) {
                    dus.m9425a(bxcl, list);
                }
                return;
            }
            return;
        }
        list.add(mo9669o());
    }

    /* renamed from: c */
    public final boolean mo9647c() {
        if (mo9671q()) {
            duv o = mo9669o();
            if (o != null) {
                return o.mo9647c();
            }
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dus", "c", 848, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[ContextFenceImpl] Expected to find a primitive fence for type=%s", this.f14074a);
            return false;
        } else if (super.mo9647c()) {
            return true;
        } else {
            for (dus dus : mo9661a()) {
                if (dus.mo9647c()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public final int mo9649e() {
        duv o = mo9669o();
        if (o == null) {
            return 0;
        }
        return o.mo9649e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dus)) {
            return false;
        }
        dus dus = (dus) obj;
        dus t = mo9674t();
        dus t2 = dus.mo9674t();
        if (t.f14074a == bxcl.OR && t2.f14074a == bxcl.OR) {
            if (t.mo9661a().size() == t2.mo9661a().size()) {
                for (dus dus2 : t.mo9661a()) {
                    if (dus2.f14074a == bxcl.AND) {
                        Iterator it = t2.mo9661a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                return false;
                            }
                            dus dus3 = (dus) it.next();
                            if (dus3.f14074a != bxcl.AND) {
                                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                                bnsl.mo68432a("dta", "b", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68420a("[FenceComparator] findMatching: Expected AND. Got %s", dus3.f14074a);
                            } else if (dus2.mo9661a().size() == dus3.mo9661a().size()) {
                                Iterator it2 = dus2.mo9661a().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        dus dus4 = (dus) it2.next();
                                        if (!dus4.mo9671q()) {
                                            if (dus4.f14074a == bxcl.NOT && !dta.m9272a((dus) dus4.mo9661a().get(0), true, dus3)) {
                                                break;
                                            }
                                        } else if (!dta.m9272a(dus4, false, dus3)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                        bnsl2.mo68432a("dta", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("[FenceComparator] areEquivalent: Expected AND. Got %s", dus2.f14074a);
                    }
                }
                return true;
            }
            return false;
        }
        bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
        bnsl3.mo68432a("dta", "a", 33, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68424a("[FenceComparator] Expected OR. fence1 type=%s, fence2 type=%s", this.f14074a, dus.f14074a);
        return false;
    }

    /* renamed from: g */
    public final int[] mo9652g() {
        duv o = mo9669o();
        if (o == null) {
            return f14086l;
        }
        return o.mo9652g();
    }

    /* renamed from: h */
    public final dui mo9653h() {
        if (!mo9672r()) {
            return super.mo9653h();
        }
        dui a = dui.m9371a();
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.f14074a.ordinal();
        if (ordinal == 1) {
            for (dus dus : mo9661a()) {
                if (a.mo9617d()) {
                    a.mo9614a(dus.mo9653h());
                } else {
                    dui h = dus.mo9653h();
                    dui a2 = dui.m9371a();
                    Iterator it = a.f14042a.iterator();
                    Iterator it2 = h.f14042a.iterator();
                    if (it.hasNext() && it2.hasNext()) {
                        duk duk = (duk) it.next();
                        duk duk2 = (duk) it2.next();
                        while (true) {
                            long j = duk.f14046a;
                            if (j < duk2.f14047b) {
                                long j2 = duk.f14047b;
                                long j3 = duk2.f14046a;
                                if (j2 > j3) {
                                    dui.m9392b(new duk(Math.max(j, j3), Math.min(duk.f14047b, duk2.f14047b)), a2.f14042a);
                                }
                            }
                            if (duk.f14047b <= duk2.f14047b) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                duk = (duk) it.next();
                            } else if (!it2.hasNext()) {
                                break;
                            } else {
                                duk2 = (duk) it2.next();
                            }
                        }
                    }
                    if (a2.mo9617d()) {
                        return a2;
                    }
                    a = a2;
                }
            }
            new Object[1][0] = Integer.valueOf(a.f14042a.size());
            return a;
        } else if (ordinal == 2) {
            for (dus dus2 : mo9661a()) {
                a.mo9614a(dus2.mo9653h());
            }
            new Object[1][0] = Integer.valueOf(a.f14042a.size());
            return a;
        } else if (ordinal == 3) {
            dui h2 = ((dus) mo9661a().get(0)).mo9653h();
            dui a3 = dui.m9371a();
            Iterator it3 = h2.f14042a.iterator();
            long j4 = 0;
            while (it3.hasNext()) {
                duk duk3 = (duk) it3.next();
                long j5 = duk3.f14046a;
                if (j4 < j5) {
                    dui.m9392b(new duk(j4, j5), a3.f14042a);
                    j4 = duk3.f14047b;
                }
            }
            if (j4 < Long.MAX_VALUE) {
                dui.m9392b(new duk(j4, Long.MAX_VALUE), a3.f14042a);
            }
            return a3;
        } else if (ordinal == 22) {
            return ((dus) mo9661a().get(0)).mo9653h();
        } else {
            duv o = mo9669o();
            if (o != null) {
                return o.mo9653h();
            }
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dus", "h", 818, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[ContextFenceImpl] Expected to find a primitive fence for type = %s", this.f14074a);
            return a;
        }
    }

    public final int hashCode() {
        int i = 17;
        for (dus dus : mo9674t().mo9661a()) {
            for (dus dus2 : dus.mo9661a()) {
                if (dus2.mo9671q()) {
                    i += (i * 31) + dus2.mo9669o().hashCode();
                } else if (dus2.f14074a == bxcl.NOT) {
                    i += (i * 31) + ((dus) dus2.mo9661a().get(0)).mo9669o().hashCode();
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    public final long mo9655i() {
        return this.f14101k;
    }

    /* renamed from: j */
    public final dvl mo9664j() {
        bxcm bxcm = (bxcm) this.f14076c;
        if ((bxcm.f162814a & 2) == 0) {
            return null;
        }
        dvl dvl = this.f14103n;
        if (dvl == null) {
            bxex bxex = bxcm.f162817d;
            if (bxex == null) {
                bxex = bxex.f163147g;
            }
            dvl = new dvl(bxex);
            this.f14103n = dvl;
            dvl.f14077d = this.f14077d;
        }
        return dvl;
    }

    /* renamed from: k */
    public final dvd mo9665k() {
        bxcm bxcm = (bxcm) this.f14076c;
        if ((bxcm.f162814a & 8) == 0) {
            return null;
        }
        dvd dvd = this.f14106q;
        if (dvd == null) {
            bxec bxec = bxcm.f162819f;
            if (bxec == null) {
                bxec = bxec.f163078i;
            }
            dvd = new dvd(bxec);
            this.f14106q = dvd;
            dvd.f14077d = this.f14077d;
        }
        return dvd;
    }

    /* renamed from: l */
    public final dur mo9666l() {
        bxcm bxcm = (bxcm) this.f14076c;
        if ((bxcm.f162814a & 512) == 0) {
            return null;
        }
        dur dur = this.f14112w;
        if (dur == null) {
            bxcb bxcb = bxcm.f162825l;
            if (bxcb == null) {
                bxcb = bxcb.f162759d;
            }
            dur = new dur(bxcb);
            this.f14112w = dur;
            dur.f14077d = this.f14077d;
        }
        return dur;
    }

    /* renamed from: m */
    public final Set mo9667m() {
        if (((bxcm) this.f14076c).f162834u.size() == 0) {
            return null;
        }
        if (this.f14093G == null) {
            this.f14093G = new HashSet(((bxcm) this.f14076c).f162834u.size());
            for (bxco bxco : new bxvv(((bxcm) this.f14076c).f162834u, bxcm.f162812v)) {
                this.f14093G.add(Integer.valueOf(bxco.f162973bD));
            }
        }
        return this.f14093G;
    }

    /* renamed from: n */
    public final List mo9668n() {
        if (this.f14095I == null) {
            this.f14095I = mo9662a(bxcl.PLACE_FENCE);
        }
        return this.f14095I;
    }

    /* renamed from: o */
    public final duv mo9669o() {
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        bxeh bxeh = null;
        dvo dvo = null;
        dvh dvh = null;
        dvn dvn = null;
        dvl dvl = null;
        dvj dvj = null;
        dvf dvf = null;
        dva dva = null;
        duw duw = null;
        dvm dvm = null;
        duz duz = null;
        dup dup = null;
        dvb dvb = null;
        dve dve = null;
        dvg dvg = null;
        duo duo = null;
        switch (this.f14074a.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 22:
                return null;
            case 4:
                return mo9664j();
            case 5:
                bxcm bxcm = (bxcm) this.f14076c;
                if ((bxcm.f162814a & 4) == 0) {
                    return null;
                }
                duy duy = this.f14105p;
                if (duy != null) {
                    return duy;
                }
                bxdn bxdn = bxcm.f162818e;
                if (bxdn == null) {
                    bxdn = bxdn.f163044j;
                }
                bxcm bxcm2 = (bxcm) this.f14076c;
                if ((bxcm2.f162814a & 1048576) != 0 && (bxeh = bxcm2.f162835w) == null) {
                    bxeh = bxeh.f163098c;
                }
                duy duy2 = new duy(bxdn, bxeh);
                this.f14105p = duy2;
                duy2.f14077d = this.f14077d;
                return duy2;
            case 6:
                return mo9665k();
            case 7:
                bxcm bxcm3 = (bxcm) this.f14076c;
                if ((bxcm3.f162814a & 16) != 0 && (duo = this.f14107r) == null) {
                    bxbu bxbu = bxcm3.f162820g;
                    if (bxbu == null) {
                        bxbu = bxbu.f162734e;
                    }
                    duo = new duo(bxbu);
                    this.f14107r = duo;
                    duo.f14077d = this.f14077d;
                }
                return duo;
            case 8:
                bxcm bxcm4 = (bxcm) this.f14076c;
                if ((bxcm4.f162814a & 32) != 0 && (dvg = this.f14108s) == null) {
                    bxen bxen = bxcm4.f162821h;
                    if (bxen == null) {
                        bxen = bxen.f163109e;
                    }
                    dvg = new dvg(bxen);
                    this.f14108s = dvg;
                    dvg.f14077d = this.f14077d;
                }
                return dvg;
            case 9:
                bxcm bxcm5 = (bxcm) this.f14076c;
                if ((bxcm5.f162814a & 64) != 0 && (dve = this.f14109t) == null) {
                    bxeg bxeg = bxcm5.f162822i;
                    if (bxeg == null) {
                        bxeg = bxeg.f163090g;
                    }
                    dve = new dve(bxeg);
                    this.f14109t = dve;
                    dve.f14077d = this.f14077d;
                }
                return dve;
            case 10:
                bxcm bxcm6 = (bxcm) this.f14076c;
                if ((bxcm6.f162814a & 128) != 0 && (dvb = this.f14110u) == null) {
                    bxdy bxdy = bxcm6.f162823j;
                    if (bxdy == null) {
                        bxdy = bxdy.f163071d;
                    }
                    dvb = new dvb(bxdy);
                    this.f14110u = dvb;
                    dvb.f14077d = this.f14077d;
                }
                return dvb;
            case 11:
                bxcm bxcm7 = (bxcm) this.f14076c;
                if ((bxcm7.f162814a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (dup = this.f14111v) == null) {
                    bxbx bxbx = bxcm7.f162824k;
                    if (bxbx == null) {
                        bxbx = bxbx.f162741i;
                    }
                    dup = new dup(bxbx);
                    this.f14111v = dup;
                    dup.f14077d = this.f14077d;
                }
                return dup;
            case 12:
                return mo9666l();
            case 13:
                bxcm bxcm8 = (bxcm) this.f14076c;
                if ((bxcm8.f162814a & 1024) != 0 && (duz = this.f14113x) == null) {
                    bxds bxds = bxcm8.f162826m;
                    if (bxds == null) {
                        bxds = bxds.f163058h;
                    }
                    duz = new duz(bxds);
                    this.f14113x = duz;
                    duz.f14077d = this.f14077d;
                }
                return duz;
            case 14:
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dus", "o", 448, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[ContextFenceImpl] Unknown fence type=%s", this.f14074a);
                return null;
            case 15:
                bxcm bxcm9 = (bxcm) this.f14076c;
                if ((bxcm9.f162814a & 8192) != 0 && (dvm = this.f14114y) == null) {
                    bxfa bxfa = bxcm9.f162827n;
                    if (bxfa == null) {
                        bxfa = bxfa.f163156c;
                    }
                    dvm = new dvm(bxfa);
                    this.f14114y = dvm;
                    dvm.f14077d = this.f14077d;
                }
                return dvm;
            case 16:
                bxcm bxcm10 = (bxcm) this.f14076c;
                if ((bxcm10.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0 && (duw = this.f14088B) == null) {
                    bxcs bxcs = bxcm10.f162828o;
                    if (bxcs == null) {
                        bxcs = bxcs.f162983c;
                    }
                    duw = new duw(bxcs);
                    this.f14088B = duw;
                    duw.f14077d = this.f14077d;
                }
                return duw;
            case 17:
                bxcm bxcm11 = (bxcm) this.f14076c;
                if ((bxcm11.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0 && (dva = this.f14115z) == null) {
                    bxdv bxdv = bxcm11.f162829p;
                    if (bxdv == null) {
                        bxdv = bxdv.f163066b;
                    }
                    dva = new dva(bxdv);
                    this.f14115z = dva;
                    dva.f14077d = this.f14077d;
                }
                return dva;
            case 18:
                bxcm bxcm12 = (bxcm) this.f14076c;
                if ((bxcm12.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0 && (dvf = this.f14087A) == null) {
                    bxek bxek = bxcm12.f162830q;
                    if (bxek == null) {
                        bxek = bxek.f163104b;
                    }
                    dvf = new dvf(bxek);
                    this.f14087A = dvf;
                    dvf.f14077d = this.f14077d;
                }
                return dvf;
            case 19:
                bxcm bxcm13 = (bxcm) this.f14076c;
                if ((bxcm13.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0 && (dvj = this.f14089C) == null) {
                    bxer bxer = bxcm13.f162831r;
                    if (bxer == null) {
                        bxer = bxer.f163118d;
                    }
                    dvj = new dvj(bxer);
                    this.f14089C = dvj;
                    dvj.f14077d = this.f14077d;
                }
                return dvj;
            case 20:
                bxcm bxcm14 = (bxcm) this.f14076c;
                if ((bxcm14.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0 && (dvl = this.f14104o) == null) {
                    bxex bxex = bxcm14.f162832s;
                    if (bxex == null) {
                        bxex = bxex.f163147g;
                    }
                    dvl = new dvl(bxex);
                    this.f14104o = dvl;
                    dvl.f14077d = this.f14077d;
                }
                return dvl;
            case 21:
                bxcm bxcm15 = (bxcm) this.f14076c;
                if ((bxcm15.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0 && (dvn = this.f14090D) == null) {
                    bxfd bxfd = bxcm15.f162833t;
                    if (bxfd == null) {
                        bxfd = bxfd.f163162g;
                    }
                    dvn = new dvn(bxfd);
                    this.f14090D = dvn;
                    dvn.f14077d = this.f14077d;
                }
                return dvn;
            case 23:
                bxcm bxcm16 = (bxcm) this.f14076c;
                if ((bxcm16.f162814a & 2097152) != 0 && (dvh = this.f14091E) == null) {
                    bxeo bxeo = bxcm16.f162836x;
                    if (bxeo == null) {
                        bxeo = bxeo.f163115a;
                    }
                    dvh = new dvh(bxeo);
                    this.f14091E = dvh;
                    dvh.f14077d = this.f14077d;
                }
                return dvh;
            case 24:
                bxcm bxcm17 = (bxcm) this.f14076c;
                if ((bxcm17.f162814a & 4194304) != 0 && (dvo = this.f14092F) == null) {
                    bxfg bxfg = bxcm17.f162837y;
                    if (bxfg == null) {
                        bxfg = bxfg.f163172e;
                    }
                    dvo = new dvo(bxfg);
                    this.f14092F = dvo;
                    dvo.f14077d = this.f14077d;
                }
                return dvo;
        }
    }

    /* renamed from: p */
    public final void mo9670p() {
        List list = this.f14099i;
        if (list != null) {
            list.clear();
        }
        List list2 = this.f14100j;
        if (list2 != null) {
            list2.clear();
        }
    }

    /* renamed from: q */
    public final boolean mo9671q() {
        return mo9669o() != null;
    }

    /* renamed from: r */
    public final boolean mo9672r() {
        return (((bxcm) this.f14076c).f162814a & 1048576) != 0;
    }

    /* renamed from: s */
    public final bxlo mo9673s() {
        bxvd da = bxlo.f163871e.mo74144da();
        bxcl bxcl = this.f14074a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxlo bxlo = (bxlo) da.f164949b;
        bxlo.f163874b = bxcl.f162810z;
        int i = 1;
        bxlo.f163873a |= 1;
        int a = bxlt.m122847a(mo9648d());
        if (a != 0) {
            i = a;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxlo bxlo2 = (bxlo) da.f164949b;
        bxlo2.f163875c = i - 1;
        bxlo2.f163873a |= 2;
        if (mo9671q()) {
            mo9669o().mo9648d();
        } else {
            List a2 = mo9661a();
            for (int i2 = 0; i2 < a2.size(); i2++) {
                bxlo s = ((dus) a2.get(i2)).mo9673s();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxlo bxlo3 = (bxlo) da.f164949b;
                s.getClass();
                if (!bxlo3.f163876d.mo73666a()) {
                    bxlo3.f163876d = GeneratedMessageLite.m124021a(bxlo3.f163876d);
                }
                bxlo3.f163876d.add(s);
            }
        }
        return (bxlo) da.mo74062i();
    }

    /* renamed from: t */
    public final dus mo9674t() {
        if (this.f14102m == null) {
            this.f14102m = dtq.m9331b(dtq.m9329a(this));
        }
        return this.f14102m;
    }

    public final String toString() {
        return Base64.encodeToString(((bxcm) this.f14076c).serializeToBytes(), 2);
    }

    /* renamed from: u */
    public final boolean mo9676u() {
        dvd k;
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.f14074a.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            return ordinal == 6 && (k = mo9665k()) != null && !k.mo9698k().isEmpty();
        }
        for (dus dus : mo9661a()) {
            if (dus.mo9676u()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dus.a(long, boolean):int
     arg types: [long, int]
     candidates:
      dus.a(bxcl, java.util.List):void
      dus.a(java.util.Collection, java.util.Collection):boolean
      duq.a(boolean, long):int
      duq.a(java.util.Collection, java.util.Collection):boolean
      duv.a(java.util.Collection, java.util.Collection):boolean
      dus.a(long, boolean):int */
    /* renamed from: a */
    public final int mo9639a(long j) {
        return mo9659a(j, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0242, code lost:
        if (r10 == false) goto L_0x0257;
     */
    /* renamed from: a */
    public final int mo9659a(long j, boolean z) {
        long j2 = j;
        boolean z2 = z;
        if (z2) {
            List list = this.f14099i;
            if (list == null || this.f14100j == null) {
                this.f14099i = new ArrayList();
                this.f14100j = new ArrayList();
            } else {
                list.clear();
                this.f14100j.clear();
            }
        }
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.f14074a.ordinal();
        if (ordinal == 1) {
            boolean z3 = false;
            for (dus dus : mo9661a()) {
                int a = dus.mo9659a(j2, z2);
                if (z2) {
                    this.f14100j.addAll(dus.f14100j);
                }
                if (a == 0) {
                    if (z2) {
                        this.f14099i.addAll(dus.f14099i);
                    }
                    z3 = true;
                } else if (a == 1) {
                    if (z2) {
                        dus.mo9670p();
                    }
                    return mo9643a(false);
                } else if (a != 2) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dus", "a", 612, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("[ContextFenceImpl] Unknown eval state=%s", a);
                }
                if (z2) {
                    dus.mo9670p();
                }
            }
            if (mo9672r()) {
                if (!z3) {
                    if (mo9653h().mo9617d()) {
                        return mo9643a(false);
                    }
                }
                return mo9646b();
            }
            return mo9643a(true);
        } else if (ordinal == 2) {
            boolean z4 = false;
            for (dus dus2 : mo9661a()) {
                int a2 = dus2.mo9659a(j2, z2);
                if (z2) {
                    this.f14100j.addAll(dus2.f14100j);
                }
                if (a2 == 0) {
                    if (z2) {
                        this.f14099i.addAll(dus2.f14099i);
                    }
                    z4 = true;
                } else if (a2 != 1) {
                    if (a2 != 2) {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                        bnsl2.mo68432a("dus", "a", 654, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68409a("[ContextFenceImpl] Unknown eval state=%s", a2);
                    } else {
                        if (z2) {
                            dus2.mo9670p();
                        }
                        return mo9643a(true);
                    }
                }
                if (z2) {
                    dus2.mo9670p();
                }
            }
            return !z4 ? mo9643a(false) : mo9646b();
        } else if (ordinal != 3) {
            if (ordinal != 22) {
                duv o = mo9669o();
                if (o == null) {
                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                    bnsl3.mo68432a("dus", "a", 727, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("[ContextFenceImpl] Expected to find a primitive fence for type = %s", this.f14074a);
                    return mo9646b();
                }
                int a3 = o.mo9639a(j2);
                this.f14101k = Math.max(this.f14101k, o.mo9655i());
                if (z2) {
                    if (a3 == 0) {
                        this.f14099i.add(this);
                    }
                    for (int i : o.mo9652g()) {
                        this.f14100j.add(Integer.valueOf(i));
                    }
                }
                this.f14078e = a3;
                return a3;
            }
            if (mo9661a().size() != 1) {
                bnsl bnsl4 = (bnsl) dss.f13961a.mo68388c();
                bnsl4.mo68432a("dus", "a", 706, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("[ContextFenceImpl] Found an invalid PREDICTIVE fence with incorrect number of fences.");
            }
            dus dus3 = (dus) mo9661a().get(0);
            int a4 = dus3.mo9659a(j2, z2);
            if (z2) {
                this.f14100j.addAll(dus3.f14100j);
                if (a4 == 0) {
                    this.f14099i.addAll(dus3.f14099i);
                }
                dus3.mo9670p();
            }
            this.f14078e = a4;
            return a4;
        } else if (mo9661a().size() == 0) {
            bnsl bnsl5 = (bnsl) dss.f13961a.mo68388c();
            bnsl5.mo68432a("dus", "a", 667, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("[ContextFenceImpl] No valid NOT fence type defined.");
            return mo9646b();
        } else {
            if (mo9661a().size() > 1) {
                bnsl bnsl6 = (bnsl) dss.f13961a.mo68388c();
                bnsl6.mo68432a("dus", "a", 673, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("[ContextFenceImpl] Found an invalid NOT fence with more than one fences.");
            }
            dus dus4 = (dus) mo9661a().get(0);
            int a5 = dus4.mo9659a(j2, z2);
            if (z2) {
                this.f14100j.addAll(dus4.f14100j);
            }
            if (a5 == 0) {
                if (z2) {
                    this.f14099i.addAll(dus4.f14099i);
                }
                int b = mo9646b();
                if (z2) {
                    dus4.mo9670p();
                }
                return b;
            } else if (a5 == 1) {
                int a6 = mo9643a(true);
                if (z2) {
                    dus4.mo9670p();
                }
                return a6;
            } else if (a5 != 2) {
                try {
                    bnsl bnsl7 = (bnsl) dss.f13961a.mo68387b();
                    bnsl7.mo68432a("dus", "a", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl7.mo68409a("[ContextFenceImpl] Unknown eval state=%s", a5);
                    int b2 = mo9646b();
                    if (z2) {
                        dus4.mo9670p();
                    }
                    return b2;
                } catch (Throwable th) {
                    if (z2) {
                        dus4.mo9670p();
                    }
                    throw th;
                }
            } else {
                int a7 = mo9643a(false);
                if (z2) {
                    dus4.mo9670p();
                }
                return a7;
            }
        }
    }

    /* renamed from: a */
    public final bxcm mo9660a(dub dub) {
        dvd k;
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.f14074a.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            bxcm bxcm = (bxcm) this.f14076c;
            bxvd bxvd = (bxvd) bxcm.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bxcm);
            bxcj bxcj = (bxcj) bxvd;
            if (bxcj.f164950c) {
                bxcj.mo74035c();
                bxcj.f164950c = false;
            }
            bxvu bxvu = bxcm.f162812v;
            ((bxcm) bxcj.f164949b).f162816c = GeneratedMessageLite.m124030de();
            bxwc bxwc = ((bxcm) this.f14076c).f162816c;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bxcm a = new dus((bxcm) bxwc.get(i)).mo9660a(dub);
                if (a == null) {
                    return null;
                }
                bxcj.mo73562a(a);
            }
            return (bxcm) bxcj.mo74062i();
        } else if (ordinal != 6 || (k = mo9665k()) == null || k.mo9698k().isEmpty()) {
            return (bxcm) this.f14076c;
        } else {
            HashSet hashSet = new HashSet(k.mo9698k());
            HashSet hashSet2 = new HashSet(k.mo9697j());
            List k2 = k.mo9698k();
            int size2 = k2.size();
            int i2 = 0;
            while (i2 < size2) {
                String str = (String) k2.get(i2);
                String a2 = dub.mo9606a(str);
                if (a2 != null) {
                    hashSet.remove(str);
                    hashSet2.add(a2);
                    i2++;
                } else {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dvd", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("[PlaceFenceImpl] Failed to resolve alias %s", str);
                    return null;
                }
            }
            bxec bxec = (bxec) k.f14076c;
            bxvd bxvd2 = (bxvd) bxec.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bxec);
            bxdz bxdz = (bxdz) bxvd2;
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
            k.f14076c = (bxec) bxdz.mo74062i();
            bxcm bxcm2 = (bxcm) this.f14076c;
            bxvd bxvd3 = (bxvd) bxcm2.mo74142c(5);
            bxvd3.mo73625a((GeneratedMessageLite) bxcm2);
            bxcj bxcj2 = (bxcj) bxvd3;
            bxec bxec3 = (bxec) k.f14076c;
            if (bxcj2.f164950c) {
                bxcj2.mo74035c();
                bxcj2.f164950c = false;
            }
            bxcm bxcm3 = (bxcm) bxcj2.f164949b;
            bxvu bxvu2 = bxcm.f162812v;
            bxec3.getClass();
            bxcm3.f162819f = bxec3;
            bxcm3.f162814a |= 8;
            return (bxcm) bxcj2.mo74062i();
        }
    }

    /* renamed from: a */
    public final List mo9661a() {
        if (this.f14094H == null) {
            this.f14094H = new ArrayList(((bxcm) this.f14076c).f162816c.size());
            bxwc bxwc = ((bxcm) this.f14076c).f162816c;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                dus dus = new dus((bxcm) bxwc.get(i));
                dus.f14077d = this.f14077d;
                this.f14094H.add(dus);
            }
        }
        Collections.sort(this.f14094H, dtq.f14006a);
        return this.f14094H;
    }

    /* renamed from: a */
    public final List mo9662a(bxcl bxcl) {
        ArrayList arrayList = new ArrayList();
        m9425a(bxcl, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo9641a(bxce bxce) {
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.f14074a.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 22) {
            for (dus dus : mo9661a()) {
                dus.mo9641a(bxce);
            }
            return;
        }
        duv o = mo9669o();
        if (o == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dus", "a", 559, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[ContextFenceImpl] Expected to find a primitive fence for type = %s", this.f14074a);
            return;
        }
        o.mo9641a(bxce);
    }

    /* renamed from: a */
    public final void mo9663a(Set set) {
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.f14074a.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 22) {
            for (dus dus : mo9661a()) {
                dus.mo9663a(set);
            }
            return;
        }
        duv o = mo9669o();
        if (o == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dus", "a", 484, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[ContextFenceImpl] Expected a primitive fence for type=%s", this.f14074a);
            return;
        }
        for (int i : o.mo9652g()) {
            set.add(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final boolean mo9645a(Collection collection, Collection collection2) {
        boolean z;
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        int ordinal = this.f14074a.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 22) {
            boolean z2 = false;
            for (dus dus : mo9661a()) {
                z2 |= dus.mo9645a(collection, collection2);
            }
            z = z2;
        } else {
            duv o = mo9669o();
            if (o == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dus", "a", 765, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[ContextFenceImpl] Expected to find a primitive fence for type = %s", this.f14074a);
            }
            z = o.mo9645a(collection, collection2);
        }
        return z;
    }
}
