package p000;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: acbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbt implements acew, baex, acjz, ackl, bals, babg {

    /* renamed from: q */
    private static final Object f59452q = new Object();

    /* renamed from: r */
    private static volatile acbt f59453r;

    /* renamed from: A */
    private cijl f59454A;

    /* renamed from: B */
    private cijl f59455B;

    /* renamed from: C */
    private cijl f59456C;

    /* renamed from: D */
    private cijl f59457D;

    /* renamed from: E */
    private cijl f59458E;

    /* renamed from: F */
    private cijl f59459F;

    /* renamed from: G */
    private cijl f59460G;

    /* renamed from: H */
    private cijl f59461H;

    /* renamed from: I */
    private cijl f59462I;

    /* renamed from: J */
    private cijl f59463J;

    /* renamed from: K */
    private cijl f59464K;

    /* renamed from: L */
    private cijl f59465L;

    /* renamed from: M */
    private cijl f59466M;

    /* renamed from: N */
    private cijl f59467N;

    /* renamed from: O */
    private cijl f59468O;

    /* renamed from: P */
    private cijl f59469P;

    /* renamed from: Q */
    private cijl f59470Q;

    /* renamed from: R */
    private cijl f59471R;

    /* renamed from: S */
    private cijl f59472S;

    /* renamed from: T */
    private cijl f59473T;

    /* renamed from: U */
    private cijl f59474U;

    /* renamed from: V */
    private cijl f59475V;

    /* renamed from: W */
    private cijl f59476W;

    /* renamed from: X */
    private cijl f59477X;

    /* renamed from: Y */
    private cijl f59478Y;

    /* renamed from: Z */
    private cijl f59479Z;

    /* renamed from: a */
    public cijl f59480a;

    /* renamed from: aA */
    private cijl f59481aA;

    /* renamed from: aB */
    private cijl f59482aB;

    /* renamed from: aC */
    private cijl f59483aC;

    /* renamed from: aD */
    private cijl f59484aD;

    /* renamed from: aE */
    private cijl f59485aE;

    /* renamed from: aF */
    private cijl f59486aF;

    /* renamed from: aG */
    private cijl f59487aG;

    /* renamed from: aH */
    private cijl f59488aH;

    /* renamed from: aI */
    private cijl f59489aI;

    /* renamed from: aJ */
    private cijl f59490aJ;

    /* renamed from: aK */
    private cijl f59491aK;

    /* renamed from: aL */
    private cijl f59492aL;

    /* renamed from: aM */
    private cijl f59493aM;

    /* renamed from: aN */
    private cijl f59494aN;

    /* renamed from: aO */
    private cijl f59495aO;

    /* renamed from: aP */
    private cijl f59496aP;

    /* renamed from: aQ */
    private cijl f59497aQ;

    /* renamed from: aR */
    private cijl f59498aR;

    /* renamed from: aS */
    private cijl f59499aS;

    /* renamed from: aT */
    private cijl f59500aT;

    /* renamed from: aa */
    private cijl f59501aa;

    /* renamed from: ab */
    private cijl f59502ab;

    /* renamed from: ac */
    private cijl f59503ac;

    /* renamed from: ad */
    private cijl f59504ad;

    /* renamed from: ae */
    private cijl f59505ae;

    /* renamed from: af */
    private cijl f59506af;

    /* renamed from: ag */
    private cijl f59507ag;

    /* renamed from: ah */
    private cijl f59508ah;

    /* renamed from: ai */
    private cijl f59509ai;

    /* renamed from: aj */
    private cijl f59510aj;

    /* renamed from: ak */
    private cijl f59511ak;

    /* renamed from: al */
    private cijl f59512al;

    /* renamed from: am */
    private cijl f59513am;

    /* renamed from: an */
    private cijl f59514an;

    /* renamed from: ao */
    private cijl f59515ao;

    /* renamed from: ap */
    private cijl f59516ap;

    /* renamed from: aq */
    private cijl f59517aq;

    /* renamed from: ar */
    private cijl f59518ar;

    /* renamed from: as */
    private cijl f59519as;

    /* renamed from: at */
    private cijl f59520at;

    /* renamed from: au */
    private cijl f59521au;

    /* renamed from: av */
    private cijl f59522av;

    /* renamed from: aw */
    private cijl f59523aw;

    /* renamed from: ax */
    private cijl f59524ax;

    /* renamed from: ay */
    private cijl f59525ay;

    /* renamed from: az */
    private cijl f59526az;

    /* renamed from: b */
    public cijl f59527b;

    /* renamed from: c */
    public cijl f59528c;

    /* renamed from: d */
    public cijl f59529d;

    /* renamed from: e */
    public cijl f59530e;

    /* renamed from: f */
    public cijl f59531f;

    /* renamed from: g */
    public cijl f59532g;

    /* renamed from: h */
    public cijl f59533h;

    /* renamed from: i */
    public cijl f59534i;

    /* renamed from: j */
    public cijl f59535j;

    /* renamed from: k */
    public cijl f59536k;

    /* renamed from: l */
    public cijl f59537l;

    /* renamed from: m */
    public cijl f59538m;

    /* renamed from: n */
    public cijl f59539n;

    /* renamed from: o */
    public cijl f59540o;

    /* renamed from: p */
    public cijl f59541p;

    /* renamed from: s */
    private cijl f59542s;

    /* renamed from: t */
    private cijl f59543t;

    /* renamed from: u */
    private cijl f59544u;

    /* renamed from: v */
    private cijl f59545v;

    /* renamed from: w */
    private cijl f59546w;

    /* renamed from: x */
    private cijl f59547x;

    /* renamed from: y */
    private cijl f59548y;

    /* renamed from: z */
    private cijl f59549z;

    public acbt() {
    }

    /* renamed from: a */
    public static acbt m48836a() {
        if (f59453r == null) {
            synchronized (f59452q) {
                if (f59453r == null) {
                    f59453r = new acbt(null);
                }
            }
        }
        return f59453r;
    }

    /* renamed from: A */
    public final ackp mo32624A() {
        return new ackp(cayx.m127580b(this.f59544u), cayx.m127580b(this.f59528c), cayx.m127580b(accw.f59592a), cayx.m127580b(this.f59497aQ), cayx.m127580b(this.f59498aR), cayx.m127580b(this.f59499aS), cayx.m127580b(this.f59500aT));
    }

    /* renamed from: B */
    public final achw mo32625B() {
        return acdj.m48955b();
    }

    /* renamed from: C */
    public final bahc mo32626C() {
        return new bahc();
    }

    /* renamed from: D */
    public final acdc mo32627D() {
        return (acdc) this.f59528c.mo6445a();
    }

    /* renamed from: E */
    public final acdd mo32628E() {
        return (acdd) this.f59481aA.mo6445a();
    }

    /* renamed from: F */
    public final baqv mo32629F() {
        return new baqv();
    }

    /* renamed from: H */
    public final accz mo32631H() {
        return mo32637c();
    }

    /* renamed from: I */
    public final achw mo32632I() {
        return acdl.m48957b();
    }

    /* renamed from: J */
    public final acdb mo32633J() {
        return new acdb();
    }

    /* renamed from: K */
    public final achy mo32634K() {
        return new achy((Context) this.f59480a.mo6445a(), (bqgj) this.f59544u.mo6445a(), (addi) this.f59496aP.mo6445a());
    }

    /* renamed from: L */
    public final accy mo32635L() {
        return new accy();
    }

    /* renamed from: b */
    public final acjf mo32636b() {
        return new acjf(this.f59480a, this.f59542s, ackh.f60027a, this.f59543t, accw.f59592a);
    }

    /* renamed from: c */
    public final accz mo32637c() {
        return new accz((Context) this.f59480a.mo6445a());
    }

    /* renamed from: e */
    public final bamc mo32639e() {
        acje a = mo32636b().mo32791a(acfi.m49020b(), "appsupload-regular");
        cazf.m127593a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: f */
    public final Executor mo32640f() {
        return (Executor) this.f59544u.mo6445a();
    }

    /* renamed from: g */
    public final bafj mo32641g() {
        return (bafj) this.f59538m.mo6445a();
    }

    /* renamed from: h */
    public final bafu mo32642h() {
        return (bafu) this.f59534i.mo6445a();
    }

    /* renamed from: i */
    public final bmzi mo32643i() {
        return (bmzi) this.f59526az.mo6445a();
    }

    /* renamed from: j */
    public final babt mo32644j() {
        return new bacd((Executor) this.f59544u.mo6445a(), cayx.m127580b(acde.f59596a), (Context) this.f59480a.mo6445a(), cayx.m127580b(this.f59468O));
    }

    /* renamed from: k */
    public final bqgg mo32645k() {
        return baar.m86458a((baam) this.f59531f.mo6445a());
    }

    /* renamed from: l */
    public final baok mo32646l() {
        return (baok) this.f59533h.mo6445a();
    }

    /* renamed from: m */
    public final barb mo32647m() {
        return (barb) this.f59527b.mo6445a();
    }

    /* renamed from: n */
    public final babr mo32648n() {
        return new accv();
    }

    /* renamed from: o */
    public final bmzi mo32649o() {
        return (bmzi) this.f59482aB.mo6445a();
    }

    /* renamed from: p */
    public final Map mo32650p() {
        return bnhe.m109409a(bygy.FOOTPRINTS, (babq) this.f59469P.mo6445a(), bygy.REGISTRATION, new bako());
    }

    /* renamed from: q */
    public final bads mo32651q() {
        return (bads) this.f59468O.mo6445a();
    }

    /* renamed from: r */
    public final Map mo32652r() {
        bnha a = bnhe.m109406a(8);
        a.mo67695b("mdh-channelconfig-refresh", (bame) this.f59483aC.mo6445a());
        a.mo67695b("mdh-wipeout", (bame) this.f59485aE.mo6445a());
        a.mo67695b("mdh-subscription-cleanup", (bame) this.f59487aG.mo6445a());
        a.mo67695b("appsupload-periodic", (bame) this.f59494aN.mo6445a());
        a.mo67695b("appsupload-regular", (bame) this.f59494aN.mo6445a());
        a.mo67695b("mdh-regularsync", (bame) this.f59515ao.mo6445a());
        a.mo67695b("mdh-forcedsync", (bame) this.f59495aO.mo6445a());
        bakn bakn = new bakn(cayx.m127580b(acdk.f59599a), cayx.m127580b(this.f59468O), (acbs) this.f59471R.mo6445a(), (bapl) this.f59537l.mo6445a(), (bakr) this.f59540o.mo6445a(), (baok) this.f59533h.mo6445a(), new baki(achz.m49145b(), new bakd(mo32637c(), (Context) this.f59480a.mo6445a(), (Executor) this.f59544u.mo6445a(), new accv()), (Executor) this.f59544u.mo6445a()));
        new accv().getClass();
        bame bame = new bame(new bakj(), bakn);
        cazf.m127593a(bame, "Cannot return null from a non-@Nullable @Provides method");
        a.mo67695b("mdh-pn", bame);
        return a.mo67618b();
    }

    /* renamed from: s */
    public final Context mo32653s() {
        return (Context) this.f59480a.mo6445a();
    }

    /* renamed from: t */
    public final String mo32654t() {
        String packageName = ((Context) this.f59480a.mo6445a()).getPackageName();
        cazf.m127593a(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }

    /* renamed from: u */
    public final String mo32655u() {
        return achz.m49145b();
    }

    /* renamed from: v */
    public final bakr mo32656v() {
        return (bakr) this.f59540o.mo6445a();
    }

    /* renamed from: w */
    public final Executor mo32657w() {
        return (Executor) this.f59544u.mo6445a();
    }

    /* renamed from: x */
    public final Context mo32658x() {
        return (Context) this.f59480a.mo6445a();
    }

    /* renamed from: G */
    public final achw mo32630G() {
        achw achw = achs.f59875e;
        cazf.m127593a(achw, "Cannot return null from a non-@Nullable @Provides method");
        return achw;
    }

    /* renamed from: d */
    public final ayuj mo32638d() {
        ayuj ayuj = acaw.f59403w;
        cazf.m127593a(ayuj, "Cannot return null from a non-@Nullable @Provides method");
        return ayuj;
    }

    /* renamed from: y */
    public final String mo32659y() {
        cazf.m127593a("AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk", "Cannot return null from a non-@Nullable @Provides method");
        return "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk";
    }

    /* renamed from: z */
    public final String mo32660z() {
        cazf.m127593a("com.google.android.gms", "Cannot return null from a non-@Nullable @Provides method");
        return "com.google.android.gms";
    }

    public acbt(byte[] bArr) {
        cijl a = cayx.m127579a(rzr.f43901a);
        this.f59480a = a;
        this.f59542s = new acbz(a);
        this.f59543t = cayx.m127579a(accd.f59559a);
        this.f59544u = cayx.m127579a(accb.f59558a);
        this.f59527b = cayx.m127579a(new acbu(this.f59480a));
        this.f59545v = new accg(this.f59480a);
        this.f59546w = cayx.m127579a(new baoe(acde.f59596a));
        this.f59547x = cayx.m127579a(new barv(acde.f59596a));
        cazh a2 = cazi.m127601a(2, 0);
        a2.mo75192b(this.f59546w);
        a2.mo75192b(this.f59547x);
        this.f59548y = a2.mo75190a();
        this.f59549z = new cayw();
        cayw cayw = new cayw();
        this.f59454A = cayw;
        bant bant = new bant(cayw);
        this.f59455B = bant;
        this.f59456C = cayx.m127579a(bant);
        caza a3 = cazb.m127586a(2);
        a3.mo75186b(1, this.f59549z);
        a3.mo75186b(2, this.f59456C);
        cazb a4 = a3.mo75185a();
        this.f59457D = a4;
        bamh bamh = new bamh(a4);
        this.f59458E = bamh;
        this.f59459F = cayx.m127579a(new banq(this.f59548y, bamh, acdm.f59600a));
        cazh a5 = cazi.m127601a(2, 0);
        a5.mo75192b(this.f59549z);
        a5.mo75192b(this.f59454A);
        this.f59460G = a5.mo75190a();
        cijl a6 = cayx.m127579a(new accf(this.f59480a));
        this.f59528c = a6;
        bamk bamk = new bamk(this.f59460G, a6);
        this.f59461H = bamk;
        cijl a7 = cayx.m127579a(bamk);
        this.f59529d = a7;
        bani bani = new bani(a7);
        this.f59462I = bani;
        cijl a8 = cayx.m127579a(bani);
        this.f59463J = a8;
        cijl a9 = cayx.m127579a(new ackt(this.f59480a, this.f59459F, a8));
        this.f59464K = a9;
        cayw.m127577a(this.f59454A, cayx.m127579a(new ackr(a9, this.f59480a)));
        cayw.m127577a(this.f59549z, cayx.m127579a(new bamt(acdm.f59600a, this.f59545v, this.f59454A, this.f59528c, this.f59529d)));
        cijl a10 = cayx.m127579a(new bamy(this.f59549z));
        this.f59465L = a10;
        this.f59466M = cayx.m127579a(new acby(a10));
        achv achv = new achv(this.f59480a);
        this.f59467N = achv;
        this.f59468O = cayx.m127579a(achv);
        this.f59469P = cazj.m127604a(bafe.f100706a);
        caza a11 = cazb.m127586a(2);
        a11.mo75186b(bygy.FOOTPRINTS, this.f59469P);
        a11.mo75186b(bygy.REGISTRATION, bakp.f101142a);
        this.f59470Q = a11.mo75185a();
        this.f59471R = cayx.m127579a(new acch(this.f59544u));
        cijl a12 = cayx.m127579a(new acci(this.f59465L));
        this.f59472S = a12;
        baoz baoz = new baoz(a12, this.f59470Q);
        this.f59473T = baoz;
        this.f59474U = cayx.m127579a(baoz);
        acjg acjg = new acjg(this.f59480a, this.f59542s, ackh.f60027a, this.f59543t, accw.f59592a);
        this.f59475V = acjg;
        this.f59476W = cayx.m127579a(new bapw(acjg));
        this.f59530e = cayx.m127579a(new baas(acdg.f59597a, this.f59480a));
        cayy a13 = cayz.m127582a(this);
        this.f59477X = a13;
        this.f59478Y = cayx.m127579a(new babi(a13));
        this.f59479Z = new baat(this.f59475V);
        cijl a14 = cayx.m127579a(new baao(acdg.f59597a, this.f59530e, this.f59478Y, this.f59479Z, this.f59528c, this.f59468O));
        this.f59531f = a14;
        this.f59501aa = new baar(a14);
        this.f59502ab = cayx.m127579a(new balu(this.f59477X));
        this.f59503ac = new baez(this.f59477X);
        caza a15 = cazb.m127586a(2);
        a15.mo75186b(bygy.REGISTRATION, this.f59502ab);
        a15.mo75186b(bygy.FOOTPRINTS, this.f59503ac);
        this.f59504ad = a15.mo75185a();
        this.f59532g = new cayw();
        this.f59533h = new cayw();
        this.f59505ae = new cayw();
        acdn acdn = acdm.f59600a;
        acdj acdj = acdi.f59598a;
        cijl cijl = this.f59527b;
        bagb bagb = new bagb(acdn, acdj, cijl, cijl, this.f59466M, this.f59505ae);
        this.f59506af = bagb;
        this.f59534i = cayx.m127579a(bagb);
        cijl a16 = cayx.m127579a(new acbv(this.f59465L));
        this.f59507ag = a16;
        this.f59535j = cayx.m127579a(new baaa(a16, this.f59470Q, this.f59480a));
        acgq acgq = new acgq(acdi.f59598a, this.f59533h, this.f59534i, this.f59535j, this.f59528c);
        this.f59508ah = acgq;
        this.f59536k = cayx.m127579a(new acfy(acgq));
        caza a17 = cazb.m127586a(2);
        a17.mo75186b(byhm.SYNC_LATEST_PER_SECONDARY_ID, this.f59532g);
        a17.mo75186b(byhm.SYNC_FULL_SNAPSHOT, this.f59536k);
        cazb a18 = a17.mo75185a();
        this.f59509ai = a18;
        this.f59510aj = new bafc(a18);
        caza a19 = cazb.m127586a(2);
        a19.mo75186b(bygy.REGISTRATION, bakv.f101156a);
        a19.mo75186b(bygy.FOOTPRINTS, this.f59510aj);
        this.f59511ak = a19.mo75185a();
        this.f59537l = new cayw();
        cayw cayw2 = new cayw();
        this.f59538m = cayw2;
        baft baft = new baft(this.f59468O, cayw2, this.f59534i);
        this.f59512al = baft;
        this.f59539n = cazj.m127604a(baft);
        this.f59540o = cayx.m127579a(new bakt(acdk.f59599a, this.f59533h, this.f59537l));
        caza a20 = cazb.m127586a(2);
        a20.mo75186b(bygy.FOOTPRINTS, this.f59539n);
        a20.mo75186b(bygy.REGISTRATION, this.f59540o);
        this.f59513am = a20.mo75185a();
        this.f59514an = cayx.m127579a(new baru(acde.f59596a, this.f59528c, this.f59454A, this.f59470Q, this.f59533h, this.f59537l, this.f59513am, this.f59458E, this.f59529d));
        this.f59515ao = cayx.m127579a(new bapx(this.f59537l));
        cayw.m127577a(this.f59537l, cayx.m127579a(new bapm(this.f59471R, acdo.f59601a, this.f59474U, this.f59476W, this.f59501aa, this.f59504ad, this.f59470Q, this.f59511ak, this.f59533h, this.f59527b, this.f59468O, this.f59514an, this.f59528c, this.f59540o, this.f59515ao)));
        this.f59516ap = cayx.m127579a(new bapy(acdo.f59601a, this.f59537l, this.f59528c));
        baky baky = new baky(this.f59540o, this.f59528c);
        this.f59517aq = baky;
        this.f59518ar = cayx.m127579a(baky);
        cazh a21 = cazi.m127601a(4, 0);
        a21.mo75192b(this.f59516ap);
        a21.mo75192b(this.f59532g);
        a21.mo75192b(this.f59536k);
        a21.mo75192b(this.f59518ar);
        this.f59519as = a21.mo75190a();
        baod baod = new baod(acde.f59596a, this.f59468O, this.f59527b, this.f59454A, this.f59470Q, this.f59528c, this.f59519as);
        this.f59520at = baod;
        cayw.m127577a(this.f59533h, cayx.m127579a(baod));
        acgh acgh = new acgh(acdi.f59598a, this.f59533h, this.f59538m, this.f59535j, this.f59528c);
        this.f59521au = acgh;
        cayw.m127577a(this.f59532g, cayx.m127579a(new acfx(acgh)));
        bapc bapc = new bapc(acdo.f59601a, this.f59537l, this.f59528c);
        this.f59522av = bapc;
        this.f59523aw = cayx.m127579a(bapc);
        cijl cijl2 = this.f59505ae;
        cazh a22 = cazi.m127601a(3, 0);
        a22.mo75192b(this.f59532g);
        a22.mo75192b(this.f59536k);
        a22.mo75192b(this.f59523aw);
        cayw.m127577a(cijl2, a22.mo75190a());
        acdn acdn2 = acdm.f59600a;
        acdj acdj2 = acdi.f59598a;
        cijl cijl3 = this.f59527b;
        bafr bafr = new bafr(acdn2, acdj2, cijl3, cijl3, this.f59466M, this.f59505ae, this.f59501aa);
        this.f59524ax = bafr;
        cayw.m127577a(this.f59538m, cayx.m127579a(bafr));
        this.f59525ay = cayx.m127579a(new acbw(this.f59544u));
        this.f59526az = cayx.m127579a(new bach(acde.f59596a, this.f59525ay));
        this.f59481aA = cayx.m127579a(accj.f59564a);
        this.f59482aB = cayx.m127579a(new baqp(this.f59480a));
        this.f59541p = baid.m86930a(accw.f59592a, acdi.f59598a, this.f59538m, this.f59533h);
        this.f59483aC = cayx.m127579a(new baau(this.f59531f));
        acda acda = new acda(this.f59480a);
        this.f59484aD = acda;
        this.f59485aE = cayx.m127579a(new bars(this.f59514an, this.f59501aa, acda, this.f59544u));
        baou baou = new baou(acde.f59596a, this.f59468O, this.f59533h, this.f59480a, this.f59471R, this.f59484aD, this.f59501aa, this.f59527b, this.f59528c);
        this.f59486aF = baou;
        this.f59487aG = cayx.m127579a(new baoo(baou));
        this.f59488aH = new acfh(this.f59480a);
        this.f59489aI = new acfk(this.f59480a);
        this.f59490aJ = new acfm(this.f59480a);
        acbx acbx = new acbx(this.f59480a, this.f59544u);
        this.f59491aK = acbx;
        acep acep = new acep(this.f59480a, acbx, this.f59468O, this.f59544u);
        this.f59492aL = acep;
        cijl a23 = cayx.m127579a(new acfo(this.f59488aH, this.f59484aD, this.f59489aI, this.f59468O, this.f59544u, this.f59490aJ, acep));
        this.f59493aM = a23;
        this.f59494aN = cayx.m127579a(new acfn(a23));
        this.f59495aO = cayx.m127579a(new bapv(this.f59537l));
        this.f59496aP = cayx.m127579a(new acca(this.f59480a));
        this.f59497aQ = new acfl(this.f59475V);
        this.f59498aR = cayx.m127579a(new bapu(this.f59475V));
        this.f59499aS = new bart(this.f59475V);
        this.f59500aT = new baon(this.f59475V);
    }
}
