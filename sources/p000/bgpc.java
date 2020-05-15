package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: bgpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgpc implements bgoy, bhco {

    /* renamed from: a */
    final bgnp f117154a;

    /* renamed from: b */
    final bfcu f117155b;

    /* renamed from: c */
    final bfcy f117156c;

    /* renamed from: d */
    final bfck f117157d;

    /* renamed from: e */
    final bgoj f117158e;

    /* renamed from: f */
    public final bgei f117159f;

    /* renamed from: g */
    public final boolean f117160g;

    /* renamed from: h */
    public final bfit f117161h;

    /* renamed from: i */
    final bhaz f117162i;

    /* renamed from: j */
    final bfjy f117163j;

    /* renamed from: k */
    final bfjf f117164k;

    /* renamed from: l */
    final bgpf f117165l;

    /* renamed from: m */
    final bfmm f117166m;

    /* renamed from: n */
    private long f117167n;

    /* renamed from: o */
    private final bgef f117168o;

    /* renamed from: p */
    private final bfcn f117169p = bfcn.f113402a;

    /* renamed from: q */
    private final bgeu f117170q;

    public bgpc(bgnp bgnp, bfct bfct, bfnf bfnf, bglw bglw, File file, boolean z) {
        bgmm bgmm;
        bulx bulx;
        bgdy bgdy;
        bgnp bgnp2 = bgnp;
        boolean z2 = z;
        this.f117154a = bgnp2;
        bgml g = bgnp.mo62752g();
        bgmm h = bgnp.mo62753h();
        bgoj bgoj = new bgoj(bgnp.mo62751f(), h);
        this.f117155b = new bfcu(g, bgnp.mo62751f(), bfct);
        this.f117156c = new bfcy(bgnp.mo62751f(), h, g);
        bgmk f = bgnp.mo62751f();
        bgns k = bgnp.mo62756k();
        byte[] b = g.mo63006b();
        bfcn.f113402a.f113403b = f;
        bfcn.f113402a.f113404c = k;
        bfcn.f113402a.mo61394a();
        bfcn.f113402a.mo61834a(h, bfmf.m97226a(b, (bhdb) null), "dsm");
        bgfj bgfj = (bgfj) bgnp2;
        this.f117157d = new bfck(bgfj.mo62763r(), bgnp.mo62751f(), bgnp.mo62756k(), this.f117155b, bfct, this.f117169p);
        bfjy bfjy = new bfjy(bgnp.mo62761p().mo62797b());
        String valueOf = String.valueOf(bfjy.mo61814c());
        if (valueOf.length() == 0) {
            new String("Initial state: ");
        } else {
            "Initial state: ".concat(valueOf);
        }
        bfjy.mo61812b();
        this.f117163j = bfjy;
        this.f117164k = new bfjf(bgnp.mo62753h(), g.mo63005a(), g.mo63006b());
        this.f117162i = new bhaz(bgnp.mo62750e(), new bgpb(bgnp.mo62755j()), this.f117155b, this.f117156c, this.f117164k, bgoj);
        this.f117166m = new bfmm();
        bfcu bfcu = this.f117155b;
        bgmk f2 = bgnp.mo62751f();
        bgmm h2 = bgnp.mo62753h();
        bgns k2 = bgnp.mo62756k();
        bgfj.mo62763r();
        bgml g2 = bgnp.mo62752g();
        byte[] b2 = g2.mo63006b();
        cewk e = cewj.f183475a.mo6606a();
        boolean z3 = bulp.f154160a.f154161b;
        bulp bulp = bulp.f154160a;
        bulp.f154169j = 180000;
        bulp.f154170k = 3000;
        bulp.f154171l = false;
        bulp.f154172m = false;
        bulp.f154173n = 0;
        bulp.f154174o = 0;
        bulp.f154175p = 0;
        bulp.f154176q = 0;
        bulp.f154177r = null;
        bulp.f154178s.mo72710a();
        bulp.f154179t = null;
        bulp.f154181v = bule.f154133a;
        bulp.f154162c = f2;
        bulp.f154163d = h2;
        bulp.f154164e = k2;
        bulp.f154165f = bfmf.m97226a(b2, (bhdb) null);
        bulp.f154166g = e;
        if (bulp.f154166g.useFrewleTileCacheManagerV2()) {
            buma buma = buma.f154216a;
            buma.f154219c = bulp;
            buma.f154218b = 0;
            bgmm = h2;
            buma.f154227q = (int) bulp.f154166g.frewleDefaultMaxNumApEntriesForDownload();
            buma.f154228r = true;
            buma.f154229s = true;
            buma.f154230t = 0;
            long frewleMacEntryLruCacheMaxSize = bulp.f154166g.frewleMacEntryLruCacheMaxSize();
            bujp bujp = new bujp();
            buma.f154220d = new bujl(bujp, bujt.m119652a((int) frewleMacEntryLruCacheMaxSize, bujp.f153156c)).mo72729a();
            buma.f154221e = bujt.m119651a((int) bulp.f154166g.frewleSeenMacAddressLruCacheMaxSize()).mo72477b();
            bulc bulc = new bulc();
            buma.f154222f = new buky(bulc, buks.m119761a(bulc.f153156c)).mo72805a();
            long frewleFloorModelsCacheMaxSize = bulp.f154166g.frewleFloorModelsCacheMaxSize();
            bukf bukf = new bukf(bulp.f154166g.throwIllegalArgExceptionOnUnsupportedEncoding());
            buma.f154223m = new bukb(bukf, bulm.m119870a((int) frewleFloorModelsCacheMaxSize, bukf.f153156c)).mo72757a();
            long frewleBuildingIdsCacheMaxSize = bulp.f154166g.frewleBuildingIdsCacheMaxSize();
            bujy bujy = new bujy();
            buma.f154224n = new buju(bujy, bulm.m119870a((int) frewleBuildingIdsCacheMaxSize, bujy.f153156c)).mo72746a();
            buma.f154225o = btzl.m119054f().mo72477b();
            buma.f154226p = btzl.m119054f().mo72477b();
            buma.mo61834a(bulp.f154163d, bulp.f154165f, "ftc");
            bulx = buma.f154216a;
        } else {
            bgmm = h2;
            bulw bulw = bulw.f154195a;
            bulw.f154198c = bulp;
            bulw.f154197b = 0;
            bulw.f154204o = (int) bulp.f154166g.frewleDefaultMaxNumApEntriesForDownload();
            bulw.f154205p = true;
            bulw.f154206q = true;
            bulw.f154207r = 0;
            long frewleMacEntryLruCacheMaxSize2 = bulp.f154166g.frewleMacEntryLruCacheMaxSize();
            bujk bujk = new bujk();
            bulw.f154199d = new bujg(bujk, bujt.m119652a((int) frewleMacEntryLruCacheMaxSize2, bujk.f153156c)).mo72723a();
            bulw.f154200e = bujt.m119651a((int) bulp.f154166g.frewleSeenMacAddressLruCacheMaxSize()).mo72477b();
            bukx bukx = new bukx();
            bulw.f154201f = new bukt(bukx, buks.m119761a(bukx.f153156c)).mo72796a();
            bulw.f154202m = btzl.m119054f().mo72477b();
            bulw.f154203n = btzl.m119054f().mo72477b();
            bulw.mo61834a(bulp.f154163d, bulp.f154165f, "ftc");
            bulx = bulw.f154195a;
        }
        bulp.f154168i = bulx;
        bult bult = bult.f154184a;
        bult.f154185b = bulp;
        bult.f154186c.set(false);
        bult.f114297j = 0;
        bult.f154187d = null;
        bult.f154188e = false;
        bulp bulp2 = bult.f154185b;
        bult.mo61834a(bulp2.f154163d, bulp2.f154165f, "fsdsc");
        bulp.f154167h = bult.f154184a;
        bulp.f154180u = new buki(f2.mo62775b());
        bulp.f154161b = true;
        bgdy bgdy2 = new bgdy(bfcu, f2, new bgea(new buiv(bulp.f154160a)), new bgdw(bfcu.f113441f, f2, bgmm, k2, g2));
        this.f117168o = new bgef(bgfj.mo62763r(), bgnp.mo62751f(), this.f117162i, bgdy2, this.f117169p);
        this.f117159f = new bgei(bgnp, bgdy2, bfnf, this.f117168o, this.f117166m, this.f117169p, bgej.m98704a(bgnp.mo62750e()));
        this.f117160g = z2;
        if (z2) {
            bgdy = bgdy2;
            this.f117161h = new bfjr(bgnp, bgnp.mo62751f(), bgnp.mo62756k(), this.f117155b, this.f117156c, this.f117164k, this.f117162i, this.f117163j, bgoj, this.f117166m, bglw);
        } else {
            bgdy = bgdy2;
            this.f117161h = new bfjs(bgnp, bgnp.mo62751f(), bgnp.mo62756k(), this.f117155b, bgoj, this.f117156c, this.f117162i);
        }
        this.f117158e = bgoj;
        this.f117165l = new bgpf(bgnp2, this.f117164k, file, this.f117163j);
        this.f117170q = new bgeu(bgnp2, bgdy);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(bgmk, bfnv[], boolean):void
     arg types: [bgmk, ?[OBJECT, ARRAY], int]
     candidates:
      bgei.a(boolean, int, long):void
      bgei.a(bgmk, bfmx, boolean):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void */
    /* renamed from: a */
    public final void mo61015a() {
        bgei bgei = this.f117159f;
        bgei.f116239E = true;
        if (!bgei.f116235A) {
            bgei.mo62712a(bgei.f116249a.mo62751f(), (bfnv[]) null, false);
        } else {
            bgei.f116249a.mo62759n().mo62804b();
        }
    }

    /* renamed from: a */
    public final void mo61016a(int i) {
    }

    /* renamed from: a */
    public final void mo61018a(int i, bfmb bfmb, boolean z, boolean z2, bgmj bgmj, Map map) {
    }

    /* renamed from: a */
    public final void mo61019a(int i, Object obj, bgmj bgmj) {
    }

    /* renamed from: a */
    public final void mo61020a(long j) {
    }

    /* renamed from: a */
    public final void mo61022a(bfkk bfkk) {
    }

    /* renamed from: a */
    public final void mo61025a(bfnp bfnp) {
    }

    /* renamed from: a */
    public final void mo61027a(bgma bgma, int i) {
    }

    /* renamed from: a */
    public final void mo61029a(bgnq bgnq, bfmg bfmg) {
    }

    /* renamed from: b */
    public final void mo61039b() {
    }

    /* renamed from: c */
    public final void mo61043c() {
    }

    /* renamed from: d */
    public final void mo61045d() {
    }

    /* renamed from: d */
    public final void mo61046d(boolean z) {
    }

    /* renamed from: e */
    public final void mo61047e() {
    }

    /* renamed from: f */
    public final void mo61049f() {
    }

    /* renamed from: g */
    public final void mo61051g() {
    }

    /* renamed from: h */
    public final void mo61053h() {
    }

    /* renamed from: i */
    public final void mo61055i() {
        bfcu bfcu = this.f117155b;
        bgmm h = this.f117154a.mo62753h();
        bgmk f = this.f117154a.mo62751f();
        long c = f.mo62776c();
        File b = h.mo62782b();
        if (b == null) {
            bfcu.mo61421a(c);
        } else {
            File file = new File(b, "nlp_state");
            long d = f.mo62777d();
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bfcu.mo61427a(bufferedInputStream, bfcu.f113440e.mo63006b(), d, c);
                bufferedInputStream.close();
            } catch (FileNotFoundException e) {
                bfcu.mo61421a(c);
                Locale locale = Locale.US;
                new Object[1][0] = new Date(d + bfcu.f113436a);
            } catch (IOException | SecurityException e2) {
                bfcu.mo61421a(c);
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("exception is ");
                } else {
                    "exception is ".concat(valueOf);
                }
            }
        }
        bfjy bfjy = this.f117163j;
        synchronized (bfjy.f114244b) {
            bfjy.f114243a.add(this);
        }
        this.f117163j.mo61813b(true);
        this.f117163j.mo61815c(false);
        bfcy bfcy = this.f117156c;
        if (bfcy != null) {
            try {
                bsax a = bfcy.f113451c.mo61993a();
                int i = bfcy.f113451c.f114485b;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Actual file version: ");
                sb.append(i);
                sb.toString();
                long c2 = a.mo70124c(1);
                long b2 = bfcy.f113450b.mo62775b();
                long c3 = bfcy.f113450b.mo62776c();
                long j = b2 - c3;
                for (int i2 = 0; i2 < a.mo70138j(3); i2++) {
                    bsax f2 = a.mo70131f(3, i2);
                    if (f2 != null) {
                        if (f2.mo70112a() && f2.mo70137i(1)) {
                            bfcx bfcx = new bfcx(f2);
                            short s = bfcx.f113447b;
                            if (s != Short.MAX_VALUE) {
                                bfcx.f113447b = bfcx.m96402a(Math.min(c3, ((((long) s) * 86400000) + c2) - j));
                            }
                            bfcy.f113449a.mo61430a(bfcx);
                        }
                    }
                }
                bfcy.mo61433b();
                Locale locale2 = Locale.US;
                new Object[1][0] = Integer.valueOf(bfcy.f113449a.mo61428a());
            } catch (IOException e3) {
                bfcy.f113449a.f113444a.clear();
                e3.toString();
            }
        }
        this.f117157d.mo61391e();
        this.f117162i.mo63511a(this.f117154a.mo62751f().mo62776c());
        this.f117164k.mo61786b();
    }

    /* renamed from: m */
    public final void mo61056m(Object obj) {
        this.f117161h.mo61752a(obj);
    }

    /* renamed from: b */
    public final void mo61040b(long j) {
        this.f117161h.mo61770g(j);
    }

    /* renamed from: c */
    public final void mo61044c(boolean z) {
        this.f117163j.mo61815c(z);
        bgei bgei = this.f117159f;
        if (z && bgei.mo62713a()) {
            bgei.mo62709a(bgei.f116249a.mo62751f().mo62776c());
        }
        bgei.f116257i = z;
        this.f117161h.mo61753a(z);
    }

    /* renamed from: e */
    public final void mo61048e(boolean z) {
        this.f117163j.mo61813b(false);
        this.f117161h.mo61762d();
        bgei bgei = this.f117159f;
        bgei.f116249a.mo62756k().mo62914a(bgnq.LOCATOR);
        if (bgei.mo62713a()) {
            bgei.mo62709a(bgei.f116249a.mo62751f().mo62776c());
        }
        bgdy bgdy = bgei.f116253e;
        bgdy.f116204e.mo61864a();
        bgdy.f116205f.f116209a.f153981a.mo72820a();
        bgei.f116260l = true;
        bfck bfck = this.f117157d;
        bfck.f113389b.mo62914a(bgnq.CACHE_UPDATER);
        bfck.mo61387b();
        bfjy bfjy = this.f117163j;
        synchronized (bfjy.f114244b) {
            bfjy.f114243a.remove(this);
        }
        if (!z) {
            File a = bfjf.m96993a(this.f117154a.mo62753h());
            if (a != null) {
                a.delete();
                return;
            }
            return;
        }
        this.f117155b.mo61424a(this.f117154a.mo62753h());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(bgmk, bfmx, boolean):void
     arg types: [bgmk, bfmx, int]
     candidates:
      bgei.a(boolean, int, long):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void
      bgei.a(bgmk, bfmx, boolean):void */
    /* renamed from: f */
    public final void mo61050f(boolean z) {
        bgei bgei = this.f117159f;
        bfmx bfmx = bgei.f116252d;
        if (bfmx != null && bfmx.f114435a != Long.MAX_VALUE) {
            bgmk f = bgei.f116249a.mo62751f();
            bfmx bfmx2 = bgei.f116252d;
            bgei.mo62710a(f, new bfmx(bfmx2.f114435a, bfmx2.f114437c, bfmx2.f114438d, bfmx2.f114436b, bfmx2.f114442h, bfmx2.f114439e), false);
        }
    }

    /* renamed from: g */
    public final void mo61052g(boolean z) {
        bgei bgei = this.f117159f;
        bgei.mo62711a(this.f117154a.mo62751f(), !z, bgei.f116271w);
    }

    /* renamed from: h */
    public final void mo61054h(boolean z) {
        StringBuilder sb = new StringBuilder(35);
        sb.append("Full collection mode changed: ");
        sb.append(z);
        sb.toString();
        this.f117161h.mo61766e(z);
    }

    /* renamed from: b */
    public final void mo61041b(bsax bsax) {
        this.f117161h.mo61749a(bsax);
    }

    /* renamed from: b */
    public final void mo61042b(boolean z) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("powerSave mode changed to ");
        sb.append(z);
        sb.toString();
        this.f117161h.mo61757b(z);
    }

    /* renamed from: a */
    public final void mo61017a(int i, int i2, boolean z) {
        this.f117163j.mo61809a(i, i2, z);
        this.f117161h.mo61743a(i, i2, z);
    }

    /* renamed from: a */
    public final void mo61021a(bfct bfct) {
        bgoj bgoj = this.f117158e;
        long c = bgoj.f116925f.mo62776c();
        bgoo bgoo = bgoj.f116921b;
        if (bgoo != null) {
            bgoo.mo63048a(bfct.m96369o(), c);
        }
        bgoo bgoo2 = bgoj.f116922c;
        if (bgoo2 != null) {
            bgoo2.mo63048a(bfct.m96370p(), c);
        }
        bgoo bgoo3 = bgoj.f116923d;
        if (bgoo3 != null) {
            bgoo3.mo63048a(bfct.m96371q(), c);
        }
        bgoo bgoo4 = bgoj.f116924e;
        if (bgoo4 != null) {
            bgoo4.mo63048a(bfct.m96368n(), c);
        }
        bfjy bfjy = this.f117163j;
        bfjy.f114248f = bfct.mo61411e();
        bfjy.mo61812b();
        this.f117161h.mo61744a(bfct);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(bgmk, bfnv[], boolean):void
     arg types: [bgmk, ?[OBJECT, ARRAY], int]
     candidates:
      bgei.a(boolean, int, long):void
      bgei.a(bgmk, bfmx, boolean):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void */
    /* renamed from: a */
    public final void mo61023a(bfmn bfmn) {
        long c = this.f117154a.mo62751f().mo62776c();
        this.f117163j.mo61817e();
        this.f117166m.mo61944a(c, bfmn);
        bgei bgei = this.f117159f;
        bgmk f = this.f117154a.mo62751f();
        if (!bgei.f116257i) {
            if (bfmn != null) {
                bfmq bfmq = bgei.f116267s;
                if (bfmq.f114426b.size() > 0) {
                    long j = bfmn.f114417g - bfmq.f114427c;
                    bfmn bfmn2 = (bfmn) bfmq.f114426b.get(0);
                    while (bfmn2 != null && bfmn2.f114417g < j) {
                        bfmq.f114426b.remove(0);
                        bfmn2 = bfmq.f114426b.size() > 0 ? (bfmn) bfmq.f114426b.get(0) : null;
                    }
                }
                bfmn bfmn3 = bfmq.f114425a;
                if (bfmn3 != null && bfmn3.mo61950e() && !bfmn3.mo61949b(bfmn)) {
                    if (bfmq.f114426b.size() >= 4) {
                        bfmq.f114426b.remove(0);
                    }
                    bfmq.f114426b.add(bfmn3);
                }
                bfmq.f114425a = bfmn;
                if (!bfmn.mo61950e()) {
                    bgei.f116269u++;
                } else {
                    bgei.f116269u = 0;
                }
            } else {
                bgei.f116268t = -1;
            }
            bgei.mo62712a(f, (bfnv[]) null, false);
        }
        this.f117161h.mo61745a(bfmn);
    }

    /* renamed from: a */
    public final void mo61024a(bfmx bfmx, boolean z) {
        this.f117159f.mo62710a(this.f117154a.mo62751f(), bfmx, z);
        if (ceze.m138458c()) {
            bgeu bgeu = this.f117170q;
            bgeu.f116296c = bfmx;
            bgeo bgeo = bgeu.f116295b;
            if (bgeo != null) {
                if (bfmx.f114436b < 5000 && ceze.m138458c()) {
                    long j = bfmx.f114436b;
                    StringBuilder sb = new StringBuilder(66);
                    sb.append("setPeriod(): starting RTT locator with period ");
                    sb.append(j);
                    sb.toString();
                    bgeo.mo62717a();
                    bgeo.mo62718a((int) bfmx.f114436b);
                } else {
                    long j2 = bfmx.f114436b;
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("setPeriod(): can't start RTT locator with period ");
                    sb2.append(j2);
                    sb2.toString();
                    bgeo.mo62717a();
                    bgeu.f116295b = null;
                }
            }
        }
        this.f117157d.f113396i = bfmx.f114439e;
    }

    /* renamed from: a */
    public final void mo61026a(bgjm bgjm) {
        int i = bgjm.f116617c;
        if (i == -1 || i >= 3) {
            this.f117159f.f116245K = bgjm;
            this.f117161h.mo61747a(bgjm);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(bgmk, bfnv[], boolean):void
     arg types: [bgmk, ?[OBJECT, ARRAY], int]
     candidates:
      bgei.a(boolean, int, long):void
      bgei.a(bgmk, bfmx, boolean):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void */
    /* renamed from: a */
    public final void mo61028a(bgnq bgnq) {
        bgnq bgnq2 = bgnq.LOCATOR;
        switch (bgnq.ordinal()) {
            case 0:
                bgei bgei = this.f117159f;
                bgmk f = this.f117154a.mo62751f();
                bgei.f116251c.f116277b = f.mo62776c();
                bgei.mo62712a(f, (bfnv[]) null, false);
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 9:
            case 10:
                this.f117161h.mo61748a(bgnq);
                break;
            case 4:
                bfck bfck = this.f117157d;
                if (bgnq == bgnq.CACHE_UPDATER) {
                    int i = bfck.f113397j;
                    int i2 = i - 1;
                    if (i != 0) {
                        if (i2 == 0) {
                            if (bfck.f113393f.mo61408b()) {
                                bsax bsax = new bsax(bgox.f117045al);
                                bfck.f113392e.mo61399a(bsax);
                                bfck.f113390c.mo62891a(bsax);
                                bfck.mo61389c();
                                bfck.f113389b.mo62917a(bgnq.CACHE_UPDATER, bfck.f113388a.mo62776c() + 10000, bfck.f113396i);
                                bfck.f113397j = 2;
                                break;
                            } else {
                                bfck.mo61386a(true);
                                break;
                            }
                        } else if (i2 != 1) {
                            if (i2 == 2) {
                                bfck.mo61390d();
                                break;
                            }
                        } else {
                            bfck.mo61385a();
                            break;
                        }
                    } else {
                        throw null;
                    }
                }
                break;
            case 7:
                bgpf bgpf = this.f117165l;
                if (bgnq == bgnq.SENSOR_UPLOADER) {
                    bgpf.f117175a = -1;
                    bgpf.mo63064a();
                    break;
                }
                break;
        }
        long c = this.f117154a.mo62751f().mo62776c();
        if (c - this.f117167n > 10800000) {
            this.f117155b.mo61424a(this.f117154a.mo62753h());
            bfcy bfcy = this.f117156c;
            if (bfcy != null) {
                bfcy.mo61433b();
                bfcy bfcy2 = this.f117156c;
                bfcy2.mo61433b();
                try {
                    bfnl bfnl = bfcy2.f113451c;
                    bsax bsax2 = new bsax(bgox.f117080bT);
                    Iterator c2 = bfcy2.mo61434c();
                    while (c2.hasNext()) {
                        bfcx bfcx = (bfcx) c2.next();
                        bsax bsax3 = new bsax(bgox.f117081bU);
                        bsax3.mo70117b(1, bfcx.f113446a);
                        short s = bfcx.f113447b;
                        if (s != Short.MAX_VALUE) {
                            bsax3.mo70134g(3, s);
                        }
                        bsax2.mo70107a(3, bsax3);
                    }
                    bsax2.mo70117b(1, bfcy2.f113450b.mo62777d());
                    bfnl.mo61994a(bsax2);
                } catch (IOException e) {
                }
            }
            this.f117164k.mo61790c();
            this.f117167n = c;
            bfcu bfcu = this.f117155b;
            long b = this.f117154a.mo62751f().mo62775b();
            bfdd bfdd = bfcu.f113441f;
            long l = b - bfcu.f113438c.mo61418l();
            long j = b - 604800000;
            bfdc c3 = bfdd.mo61459c();
            while (c3.hasNext()) {
                c3.mo61448b();
                int g = c3.f113463a.mo72557g();
                if (bfdd.f113467c[g] < l || bfdd.f113468d[g] < j) {
                    bfdd.f113469e.mo61438b();
                    c3.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61030a(bsax bsax) {
        bfck bfck = this.f117157d;
        int i = bfck.f113397j;
        if (i == 2) {
            bfck.f113389b.mo62914a(bgnq.CACHE_UPDATER);
            if (bsax == null || !bhcn.m100637a(bsax) || !bsax.mo70137i(5)) {
                bfck.mo61385a();
                return;
            }
            bfck.f113393f.mo61406a(bsax.mo70129e(5));
            bfck.mo61386a(false);
        } else if (i == 3) {
            bfmu bfmu = new bfmu();
            if (bhcn.m100638b(bsax)) {
                bmxy.m108581a(bsax);
                int j = bsax.mo70138j(2);
                for (int i2 = 0; i2 < j; i2++) {
                    bfmu.mo61958a(bsax.mo70131f(2, i2));
                }
                bfck.f113391d.mo61423a(bfmu, false, bfck.f113388a.mo62775b());
            }
            bfck.mo61388b(false);
        }
    }

    /* renamed from: a */
    public final void mo61031a(ActivityRecognitionResult activityRecognitionResult) {
        this.f117161h.mo61750a(activityRecognitionResult);
    }

    /* renamed from: a */
    public final void mo61032a(PrintWriter printWriter) {
        PrintWriter printWriter2 = printWriter;
        bgei bgei = this.f117159f;
        boolean z = bgei.f116271w;
        StringBuilder sb = new StringBuilder(22);
        sb.append("NL: wifiEnabled: ");
        sb.append(z);
        printWriter2.println(sb.toString());
        int i = bgei.f116236B;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("NL: software batch bins: ");
        sb2.append(i);
        printWriter2.println(sb2.toString());
        int i2 = bgei.f116237C;
        StringBuilder sb3 = new StringBuilder(36);
        sb3.append("NL: hardware batch bins: ");
        sb3.append(i2);
        printWriter2.println(sb3.toString());
        int i3 = bgei.f116238D;
        StringBuilder sb4 = new StringBuilder(36);
        sb4.append("NL: batches delivered  : ");
        sb4.append(i3);
        printWriter2.println(sb4.toString());
        boolean z2 = bgei.f116257i;
        StringBuilder sb5 = new StringBuilder(20);
        sb5.append("NL: deepIdle : ");
        sb5.append(z2);
        printWriter2.println(sb5.toString());
        boolean z3 = bgei.f116261m;
        long j = bgei.f116263o;
        StringBuilder sb6 = new StringBuilder(44);
        sb6.append("NL: inGls : ");
        sb6.append(z3);
        sb6.append(", time ");
        sb6.append(j);
        printWriter2.println(sb6.toString());
        bfmx bfmx = bgei.f116252d;
        if (bfmx != null) {
            String valueOf = String.valueOf(bfmx);
            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb7.append("NL: locatorParams: ");
            sb7.append(valueOf);
            printWriter2.println(sb7.toString());
        }
        bgdy bgdy = bgei.f116253e;
        bgdy.f116204e.mo61864a();
        bgea bgea = bgdy.f116205f;
        int i4 = bfnw.f114518g;
        StringBuilder sb8 = new StringBuilder(39);
        sb8.append("NL: RSSI calibration value: ");
        sb8.append(i4);
        printWriter2.println(sb8.toString());
        buiv buiv = bgea.f116209a;
        if (buiv.mo72715a()) {
            bulp bulp = buiv.f153981a;
            buki buki = bulp.f154180u;
            long b = bulp.f154162c.mo62775b();
            long c = bulp.f154162c.mo62776c();
            if (buki.f154092e) {
                printWriter2.println("----FrewleDebugBuffer-Start----");
                printWriter2.println("Buffer version: 16");
                printWriter2.print("Buffer exists since ");
                printWriter2.println(buki.m119727a(buki.f154088a));
                printWriter2.print("Now is ");
                printWriter2.println(buki.m119727a(b));
                printWriter2.print("Now millis since boot (");
                printWriter2.print(c);
                printWriter2.println(")");
                printWriter2.println("----FrewleDebugBuffer-OneShotDebugInfo----");
                List a = buki.f154089b.mo72751a();
                int size = a.size();
                for (int i5 = 0; i5 < size; i5++) {
                    bukm bukm = (bukm) a.get(i5);
                    if (b - bukm.mo72779a() < 3600000) {
                        printWriter2.print(buki.m119727a(bukm.mo72779a()));
                        printWriter2.print(" ");
                        bukm.mo72785a(printWriter2);
                    }
                }
                printWriter2.println("----FrewleDebugBuffer-ExternalCacheRequestDebugInfo----");
                List a2 = buki.f154090c.mo72751a();
                int size2 = a2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    bukm bukm2 = (bukm) a2.get(i6);
                    if (b - bukm2.mo72779a() < 3600000) {
                        printWriter2.print(buki.m119727a(bukm2.mo72779a()));
                        printWriter2.print(" ");
                        bukm2.mo72785a(printWriter2);
                    }
                }
                printWriter2.println("----FrewleDebugBuffer-GlsRequestDebugInfo----");
                List a3 = buki.f154091d.mo72751a();
                int size3 = a3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    bukj bukj = (bukj) a3.get(i7);
                    if (b - bukj.mo72771a() < 3600000) {
                        printWriter2.print(buki.m119727a(bukj.mo72771a()));
                        printWriter2.print(" ");
                        bukj.mo72774a(printWriter2);
                    }
                }
                printWriter2.println("----FrewleDebugBuffer-End----");
            }
            printWriter2.print("frewleDirector {lastDiscardMillis=");
            printWriter2.print(bulp.f154175p);
            printWriter2.print("; lastSavedToDiskMillis=");
            printWriter2.print(bulp.f154176q);
            printWriter2.print("; modelVersion=");
            bsax bsax = bulp.f154177r;
            if (bsax == null) {
                printWriter2.print(-1);
            } else {
                printWriter2.print(bsax.mo70114b(1));
            }
            printWriter2.print("; downloadThresMillis=");
            printWriter2.print(bulp.f154170k);
            printWriter2.print("; waitingForGlsResponse=");
            printWriter2.print(bulp.f154171l);
            printWriter2.print("; lastGlsQueryFilledMillis=");
            printWriter2.print(bulp.f154173n);
            printWriter2.print("; lastGlsQueryNotFilledMillis=");
            printWriter2.print(bulp.f154174o);
            printWriter2.println("}");
            bulp.f154168i.mo72834a(printWriter2);
        }
        bube bube = bgdy.f116200a.f116186b;
        if (bube != null) {
            printWriter2.print("CellFingerprintLocalizer{");
            long j2 = bube.f153221c;
            StringBuilder sb9 = new StringBuilder(35);
            sb9.append("TriggerCount=");
            sb9.append(j2);
            sb9.append("; ");
            printWriter2.print(sb9.toString());
            long j3 = bube.f153222d;
            StringBuilder sb10 = new StringBuilder(45);
            sb10.append("GeneratedLocationCount=");
            sb10.append(j3);
            sb10.append("; ");
            printWriter2.print(sb10.toString());
            long j4 = bube.f153220b.f153217b;
            StringBuilder sb11 = new StringBuilder(46);
            sb11.append("LocationFromPrimayCount=");
            sb11.append(j4);
            sb11.append("; ");
            printWriter2.print(sb11.toString());
            long j5 = bube.f153220b.f153218c;
            StringBuilder sb12 = new StringBuilder(48);
            sb12.append("LocationWithNeighborsCount=");
            sb12.append(j5);
            sb12.append(";");
            printWriter2.print(sb12.toString());
            printWriter2.println("}");
            bubj bubj = bube.f153219a;
            printWriter2.print("CellFingerprintDirector{");
            bubi bubi = (bubi) bubj;
            long j6 = bubi.f153232g;
            StringBuilder sb13 = new StringBuilder(50);
            sb13.append("LastEntriesDiscardTimeMillis=");
            sb13.append(j6);
            sb13.append(";");
            printWriter2.print(sb13.toString());
            printWriter2.println("}");
            bubk bubk = bubi.f153227b;
            printWriter2.print("CellFingerprintGlsDownloadManager{");
            long j7 = bubk.f153241i;
            StringBuilder sb14 = new StringBuilder(45);
            sb14.append("TotalGlsRequestCounter=");
            sb14.append(j7);
            sb14.append("; ");
            printWriter2.print(sb14.toString());
            long j8 = bubk.f153242j;
            StringBuilder sb15 = new StringBuilder(48);
            sb15.append("ApprovedGlsRequestCounter=");
            sb15.append(j8);
            sb15.append("; ");
            printWriter2.print(sb15.toString());
            long j9 = bubk.f153243k;
            StringBuilder sb16 = new StringBuilder(45);
            sb16.append("TotalGlsReponseCounter=");
            sb16.append(j9);
            sb16.append("; ");
            printWriter2.print(sb16.toString());
            long j10 = bubk.f153244l;
            StringBuilder sb17 = new StringBuilder(51);
            sb17.append("InformativeGlsReponseCounter=");
            sb17.append(j10);
            sb17.append("; ");
            printWriter2.print(sb17.toString());
            long j11 = bubk.f153235c;
            StringBuilder sb18 = new StringBuilder(47);
            sb18.append("LastGlsQueryFilledMillis=");
            sb18.append(j11);
            sb18.append("; ");
            printWriter2.print(sb18.toString());
            long j12 = bubk.f153236d;
            StringBuilder sb19 = new StringBuilder(54);
            sb19.append("LastInformativeGlsReponseMillis=");
            sb19.append(j12);
            sb19.append("; ");
            printWriter2.print(sb19.toString());
            boolean z4 = bubk.f153234b;
            StringBuilder sb20 = new StringBuilder(29);
            sb20.append("WaitingForGlsResponse=");
            sb20.append(z4);
            sb20.append("; ");
            printWriter2.print(sb20.toString());
            int i8 = bubk.f153240h;
            StringBuilder sb21 = new StringBuilder(43);
            sb21.append("CurrentDownloadThresholdMillis=");
            sb21.append(i8);
            sb21.append(";");
            printWriter2.print(sb21.toString());
            printWriter2.println("}");
            bubl bubl = bubi.f153226a;
            printWriter2.print("CellFingerprintTileCacheManager{");
            String str = bubl.f153251f;
            StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 19);
            sb22.append("MissingCellIdKey=");
            sb22.append(str);
            sb22.append("; ");
            printWriter2.print(sb22.toString());
            int size4 = bubl.f153247b.size();
            StringBuilder sb23 = new StringBuilder(34);
            sb23.append("CellIdKeyInCacheSize=");
            sb23.append(size4);
            sb23.append("; ");
            printWriter2.print(sb23.toString());
            int a4 = bubl.mo72617a();
            StringBuilder sb24 = new StringBuilder(30);
            sb24.append("CellMapByteCount=");
            sb24.append(a4);
            sb24.append("; ");
            printWriter2.print(sb24.toString());
            printWriter2.print("CellIdKeysInCache=[");
            bumj a5 = bubl.f153247b.entrySet().iterator();
            while (a5.hasNext()) {
                a5.mo72556f();
                String valueOf2 = String.valueOf(a5.mo72551e());
                StringBuilder sb25 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
                sb25.append(valueOf2);
                sb25.append(", ");
                printWriter2.print(sb25.toString());
            }
            printWriter2.println("]}");
        }
        bgpf bgpf = this.f117165l;
        int i9 = bgpf.f117180f;
        int i10 = bgpf.f117181g;
        int i11 = bgpf.f117182h;
        StringBuilder sb26 = new StringBuilder(39);
        sb26.append("SU: ");
        sb26.append(i9);
        sb26.append("/");
        sb26.append(i10);
        sb26.append("/");
        sb26.append(i11);
        printWriter2.println(sb26.toString());
        this.f117161h.mo61751a(printWriter2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62906a(Object obj) {
        bfjy bfjy = (bfjy) obj;
        this.f117161h.mo61765e();
        this.f117165l.mo63064a();
    }

    /* renamed from: a */
    public final void mo61033a(List list, bgbu bgbu) {
        bgei bgei = this.f117159f;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bfns a = bgei.f116253e.mo62697a((bfoa) list.get(i), null);
            if (a != null) {
                arrayList.add(a);
            }
        }
        bgbv.m98560a(bgbu.f116011a, bgbu.f116012b, arrayList, 0);
    }

    /* renamed from: a */
    public final void mo61034a(boolean z) {
        this.f117166m.mo61945a(z, this.f117154a.mo62751f().mo62776c());
        this.f117163j.mo61810a(z);
        this.f117161h.mo61763d(z);
        this.f117159f.f116244J.f116215f = z;
    }

    /* renamed from: a */
    public final void mo61035a(boolean z, boolean z2) {
        bgeo bgeo;
        bgei bgei = this.f117159f;
        bgei.mo62711a(this.f117154a.mo62751f(), bgei.f116270v, z);
        this.f117161h.mo61759c(z);
        bgpf bgpf = this.f117165l;
        bgpf.f117176b = z2;
        bgpf.mo63064a();
        bgeu bgeu = this.f117170q;
        if (!z && (bgeo = bgeu.f116295b) != null) {
            bgeo.mo62717a();
            bgeu.f116295b = null;
        }
    }

    /* renamed from: a */
    public final void mo61036a(boolean z, boolean z2, int i) {
        boolean z3;
        this.f117158e.mo63034a(z2);
        bgpf bgpf = this.f117165l;
        bgpf.f117177c = z;
        bgpf.f117178d = bgpf.f117179e.mo62751f().mo62776c();
        bgpf.mo63064a();
        bgeb bgeb = this.f117159f.f116244J;
        if ((bgeb.f116213d && z) || (((z3 = bgeb.f116214e) && z2) || (z3 && z && bgeb.f116216g != i))) {
            bgeb.mo62702a();
        }
        bgeb.f116214e = z;
        bgeb.f116213d = z2;
        if (z) {
            bgeb.f116216g = i;
        }
        bgeb.toString();
        bgef bgef = this.f117168o;
        bgef.f116226d = z;
        bgef.f116225c = z2;
    }

    /* renamed from: a */
    public final void mo61037a(long[] jArr, long[] jArr2, bgca bgca) {
        long[] jArr3 = jArr;
        long[] jArr4 = jArr2;
        bgca bgca2 = bgca;
        HashMap hashMap = new HashMap(jArr3.length);
        int length = jArr4.length;
        HashMap hashMap2 = new HashMap(length);
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = arrayList;
        boolean a = mo63062a(jArr, hashMap, jArr2, hashMap2, arrayList, this.f117154a.mo62751f().mo62775b(), this.f117154a.mo62751f().mo62776c());
        int i = 0;
        if (a || !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            StringBuilder sb = new StringBuilder(100);
            sb.append(" Gls query might bring more wifi models, consulting GLS : ");
            sb.append(a);
            sb.append(" and cell request size is ");
            sb.append(size);
            sb.toString();
            bfmu bfmu = new bfmu();
            long c = this.f117154a.mo62751f().mo62776c();
            int size2 = arrayList2.size();
            while (true) {
                bfmn bfmn = null;
                if (i >= size2) {
                    break;
                }
                ArrayList arrayList3 = arrayList2;
                try {
                    bfmn = bfmo.m97271a(c, ((Long) arrayList3.get(i)).longValue());
                } catch (IllegalArgumentException e) {
                }
                if (bfmn != null) {
                    bfmu.mo61959a(bfmn.mo61947a(c), 1);
                }
                i++;
                arrayList2 = arrayList3;
            }
            this.f117168o.mo62708a(bfmu, null, new bgpa(this, jArr3, jArr4, bgca2));
            i = 1;
        } else {
            int size3 = hashMap.size();
            int size4 = hashMap2.size();
            StringBuilder sb2 = new StringBuilder(98);
            sb2.append("Able to satisfy cache request without GLS, wifi entry count is ");
            sb2.append(size3);
            sb2.append(" and cell is ");
            sb2.append(size4);
            sb2.toString();
            bgca2.mo62633a(true, hashMap, hashMap2);
        }
        bfcn bfcn = this.f117169p;
        bfcn.mo61395a(27);
        if (i != 0) {
            bfcn.mo61395a(28);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(bgmk, bfnv[], boolean):void
     arg types: [bgmk, bfnv[], int]
     candidates:
      bgei.a(boolean, int, long):void
      bgei.a(bgmk, bfmx, boolean):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void */
    /* renamed from: a */
    public final void mo61038a(bfnx[] bfnxArr, boolean z) {
        int length;
        bfnx[] bfnxArr2;
        int i;
        int length2;
        bfnx bfnx;
        bfnx[] bfnxArr3 = bfnxArr;
        int i2 = 0;
        while (true) {
            length = bfnxArr3.length;
            if (i2 >= length) {
                break;
            }
            bfnx bfnx2 = bfnxArr3[i2];
            int b = bfnx2.mo62006b();
            long j = bfnx2.f114524a;
            for (int i3 = 0; i3 < b; i3++) {
                long d = bfnx2.mo62022d(i3);
                if (Math.abs(j - bfnx2.mo62022d(i3)) >= 60000) {
                    StringBuilder sb = new StringBuilder(127);
                    sb.append("Stale scan: scanTimestamp is ");
                    sb.append(j);
                    sb.append(" and device timestamp is ");
                    sb.append(d);
                    sb.append(" and diff is ");
                    sb.append(j - d);
                    sb.toString();
                }
            }
            i2++;
        }
        if (length > 0) {
            this.f117161h.mo61746a(bfnxArr3[0]);
            i = 0;
            bfnxArr2 = null;
        } else {
            i = 0;
            bfnxArr2 = null;
        }
        while (i < bfnxArr3.length) {
            bfnx bfnx3 = bfnxArr3[i];
            if (bfnx3 != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= bfnx3.mo62006b()) {
                        bfnx = bfnx3;
                        break;
                    }
                    bfnw c = bfnx3.mo62020c(i4);
                    if (c == null || !bebi.m91716a(c.f114519b, c.f114520c)) {
                        i4++;
                    } else {
                        ArrayList arrayList = new ArrayList(bfnx3.mo62006b());
                        for (int i5 = 0; i5 < bfnx3.mo62006b(); i5++) {
                            bfnw c2 = bfnx3.mo62020c(i5);
                            if (c2 != null && !bebi.m91716a(c2.f114519b, c2.f114520c)) {
                                arrayList.add(c2);
                            }
                        }
                        bfnx = new bfnx(bfnx3.f114524a, arrayList, bfnx3.f114526c, false);
                    }
                }
            } else {
                bfnx = null;
            }
            if (bfnx != bfnx3) {
                if (bfnxArr2 == null) {
                    bfnxArr2 = new bfnx[bfnxArr3.length];
                    for (int i6 = 0; i6 < bfnxArr3.length; i6++) {
                        bfnxArr2[i6] = bfnxArr3[i6];
                    }
                }
                if (bfnx != null) {
                    bfnxArr2[i] = bfnx;
                }
            }
            i++;
        }
        if (bfnxArr2 != null) {
            bfnxArr3 = bfnxArr2;
        }
        if (bfnxArr3 != null) {
            int length3 = bfnxArr3.length;
            bfnv[] bfnvArr = new bfnv[length3];
            for (int i7 = 0; i7 < bfnxArr3.length; i7++) {
                bfnx bfnx4 = bfnxArr3[i7];
                int b2 = bfnx4.mo62006b();
                bfnu bfnu = new bfnu(bfnx4.f114524a, b2);
                int i8 = 0;
                while (i8 < b2) {
                    bfnu.mo62002a(bfnx4.mo62003a(i8), bfnx4.mo62005b(i8), bfnx4.mo62020c(i8).f114522e, bfnx4.mo62022d(i8));
                    i8++;
                    bfnu = bfnu;
                }
                bfnvArr[i7] = bfnu.mo62001a(bfnx4.f114526c, bfnx4.f114528e);
            }
            for (int i9 = 0; i9 < length3; i9++) {
                this.f117154a.mo62754i().mo62672a(bfnvArr[i9]);
            }
            bgei bgei = this.f117159f;
            bgmk f = this.f117154a.mo62751f();
            long c3 = f.mo62776c();
            if (bgei.mo62714b() || length3 != 1 || !bfnvArr[0].f114515b) {
                bgei.f116256h = c3;
                bgei.mo62712a(f, bfnvArr, false);
            }
            if (ceze.m138458c() && (length2 = bfnxArr3.length) > 0) {
                int i10 = length2 - 1;
                if (bfnxArr3[i10].mo62013f()) {
                    bgeu bgeu = this.f117170q;
                    bfnx bfnx5 = bfnxArr3[i10];
                    ArrayList arrayList2 = bfnx5.f114525b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        bfnw bfnw = (bfnw) arrayList2.get(i12);
                        if (bfnw.mo62000a()) {
                            boolean z2 = ((bfnt) bfnw).f114510a;
                            i11++;
                        }
                    }
                    bfnt[] bfntArr = new bfnt[i11];
                    if (i11 > 0) {
                        ArrayList arrayList3 = bfnx5.f114525b;
                        int size2 = arrayList3.size();
                        int i13 = i11;
                        for (int i14 = 0; i14 < size2; i14++) {
                            bfnw bfnw2 = (bfnw) arrayList3.get(i14);
                            if (bfnw2.mo62000a()) {
                                bfnt bfnt = (bfnt) bfnw2;
                                boolean z3 = bfnt.f114510a;
                                i13--;
                                bfntArr[i13] = bfnt;
                            }
                        }
                    }
                    if (i11 == 0) {
                        bgeo bgeo = bgeu.f116295b;
                        if (bgeo != null) {
                            bgeo.mo62717a();
                            bgeu.f116295b = null;
                        }
                    } else if (bgeu.f116296c != null && ceze.m138458c() && bgeu.f116295b == null) {
                        long j2 = bgeu.f116296c.f114436b;
                        if (j2 < 5000) {
                            StringBuilder sb2 = new StringBuilder((int) ErrorInfo.TYPE_SDU_FAILED);
                            sb2.append("setScan(): Starting new RttNetworkLocator, scan length is ");
                            sb2.append(i11);
                            sb2.append(" and period is ");
                            sb2.append(j2);
                            sb2.toString();
                            bgeu.f116295b = new bgeo(bfntArr, bgeu.f116298e, new bget(bgeu), new bgeq(bgeu), new bger(bgeu));
                            bgeu.f116295b.mo62718a((int) bgeu.f116296c.f114436b);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x019f  */
    /* renamed from: a */
    public final boolean mo63062a(long[] jArr, Map map, long[] jArr2, Map map2, ArrayList arrayList, long j, long j2) {
        int i;
        bfmn bfmn;
        int i2;
        int i3;
        long[] jArr3 = jArr;
        Map map3 = map;
        long[] jArr4 = jArr2;
        bgdy bgdy = this.f117159f.f116253e;
        bgdy.f116204e.mo61864a();
        buiv buiv = bgdy.f116205f.f116209a;
        bukm a = buiv.f153981a.f154180u.mo72770a();
        a.mo72782a(buiv.f153981a.f154162c.mo62775b());
        a.mo72780a(jArr3.length);
        bumi bumi = buiv.f153988i;
        bumi.mo72859a(jArr3);
        buiv.f153988i = bumi;
        Set<buje> a2 = buiv.f153981a.mo72819a(buiv.f153988i, a);
        for (buje buje : a2) {
            a.mo72783a(buje.f154008a, (int) buje.f154013f, 12, buje.f154009b, buje.f154012e, buje.f154014g, buje.f154015h, buje.f154019l);
        }
        int length = jArr3.length;
        int i4 = 0;
        while (i4 < length) {
            long j3 = jArr3[i4];
            long a3 = buiv.f153981a.mo72818a(j3);
            Iterator it = a2.iterator();
            while (true) {
                if (it.hasNext()) {
                    buje buje2 = (buje) it.next();
                    i3 = i4;
                    if (a3 == buiv.f153981a.mo72818a(buje2.f154008a)) {
                        int a4 = ayuo.m84844a(buje2.f154017j);
                        int a5 = ayuo.m84844a(buje2.f154018k);
                        double d = (double) (buje2.f154010c + 95.0f);
                        int i5 = 1000;
                        if (d >= 0.0d) {
                            float f = buje2.f154011d;
                            if (f > 0.0f) {
                                double d2 = (double) (f * 20.0f);
                                Double.isNaN(d);
                                Double.isNaN(d2);
                                i5 = Math.min((int) (Math.pow(10.0d, d / d2) * 1000.0d), 500000);
                            }
                        }
                        map3.put(Long.valueOf(j3), new bfni(a4, a5, i5));
                    } else {
                        i4 = i3;
                    }
                } else {
                    i3 = i4;
                    if (buiv.f153981a.f154168i.mo72837b(a3)) {
                        map3.put(Long.valueOf(j3), buiv.f153980h);
                    }
                }
            }
            i4 = i3 + 1;
            jArr3 = jArr;
        }
        boolean e = buiv.f153981a.mo72825e();
        if (!e) {
            i = 1;
        } else {
            i = 7;
        }
        a.mo72781a(i, buiv.f153981a.f154162c.mo62775b());
        int length2 = jArr4.length;
        int i6 = 0;
        while (i6 < length2) {
            Long valueOf = Long.valueOf(jArr4[i6]);
            try {
                try {
                    bfmn = bfmo.m97271a(j2, valueOf.longValue());
                } catch (IllegalArgumentException e2) {
                    bfmn = null;
                    if (bfmn != null) {
                    }
                    i6++;
                    length2 = i2;
                }
            } catch (IllegalArgumentException e3) {
                bfmn = null;
                if (bfmn != null) {
                }
                i6++;
                length2 = i2;
            }
            if (bfmn != null) {
                String a6 = bfmn.mo61934a();
                bfni a7 = this.f117155b.f113441f.mo61455a(a6, j);
                String valueOf2 = String.valueOf(valueOf);
                String valueOf3 = String.valueOf(a7);
                int length3 = String.valueOf(valueOf2).length();
                i2 = length2;
                StringBuilder sb = new StringBuilder(length3 + 60 + String.valueOf(a6).length() + String.valueOf(valueOf3).length());
                sb.append("Incoming MobileCommKey ");
                sb.append(valueOf2);
                sb.append(" translates to ");
                sb.append(a6);
                sb.append(" with cached position ");
                sb.append(valueOf3);
                sb.toString();
                if (a7 == null) {
                    arrayList.add(valueOf);
                } else {
                    map2.put(valueOf, a7);
                }
            } else {
                i2 = length2;
            }
            i6++;
            length2 = i2;
        }
        return e;
    }
}
