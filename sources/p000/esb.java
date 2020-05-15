package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: esb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class esb implements ero {

    /* renamed from: a */
    public final eqz f15591a;

    /* renamed from: b */
    public final epw f15592b;

    /* renamed from: c */
    public final eqo f15593c;

    /* renamed from: d */
    private final ExecutorService f15594d;

    /* renamed from: e */
    private final erg f15595e;

    /* renamed from: f */
    private final esx f15596f;

    /* renamed from: g */
    private final bmzi f15597g;

    public esb(eqz eqz, ExecutorService executorService, erg erg, epw epw, eqo eqo, bmzi bmzi, esx esx) {
        this.f15591a = eqz;
        this.f15594d = executorService;
        this.f15595e = erg;
        this.f15592b = epw;
        this.f15593c = eqo;
        this.f15597g = bmzi;
        this.f15596f = esx;
        erg.getClass();
        aucu.m76780a(executorService, new erp(erg)).mo50373a(new ers(this));
        epw epw2 = this.f15592b;
        epw2.getClass();
        aucu.m76780a(executorService, new ert(epw2)).mo50373a(new eru(this));
        eqo eqo2 = this.f15593c;
        eqo2.getClass();
        aucu.m76780a(executorService, new erv(eqo2)).mo50373a(new erw(this));
    }

    /* renamed from: a */
    public final C0034at mo10445a() {
        return this.f15591a.mo10427a();
    }

    /* renamed from: b */
    public final C0034at mo10450b(ffk ffk, bsxn bsxn, esr esr) {
        return this.f15591a.mo10433b(new eqy(ffk, bsxn, esr));
    }

    /* renamed from: c */
    public final void mo10453c() {
        for (C0034at atVar : this.f15591a.f15553b.values()) {
            atVar.mo2450b(bnon.f131923a);
        }
        epw epw = this.f15592b;
        epw.getClass();
        mo10472a(new ery(epw));
    }

    /* renamed from: d */
    public final C0034at mo10456d() {
        return this.f15591a.mo10432b();
    }

    /* renamed from: e */
    public final bnic mo10457e() {
        return this.f15591a.f15554c;
    }

    /* renamed from: f */
    public final void mo10458f() {
        this.f15591a.f15554c = bnon.f131923a;
        eqo eqo = this.f15593c;
        eqo.getClass();
        mo10472a(new erz(eqo));
    }

    /* renamed from: a */
    public final C0034at mo10446a(ffk ffk) {
        if (ffr.m11620a(ffk)) {
            return this.f15591a.mo10429a(ffk.f16458a);
        }
        C0034at atVar = new C0034at();
        atVar.mo2450b(bnon.f131923a);
        return atVar;
    }

    /* renamed from: b */
    public final void mo10451b() {
        eqz eqz = this.f15591a;
        for (C0034at atVar : eqz.f15555d.values()) {
            bsxn bsxn = ((epq) atVar.mo2448b()).f15491a.f147583d;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            atVar.mo2450b(new epq(bsxn));
        }
        for (C0034at atVar2 : eqz.f15552a.values()) {
            atVar2.mo2450b(new eps(false, false, null));
        }
        erg erg = this.f15595e;
        erg.getClass();
        mo10472a(new erx(erg));
    }

    /* renamed from: a */
    public final C0034at mo10447a(ffk ffk, bsxn bsxn, esr esr) {
        return this.f15591a.mo10428a(new eqy(ffk, bsxn, esr));
    }

    /* renamed from: c */
    public final void mo10454c(ffk ffk) {
        this.f15591a.mo10430a(ffk, fgd.m11651b(), true);
    }

    /* renamed from: a */
    public final void mo10448a(ffk ffk, Long l) {
        if (ffr.m11620a(ffk)) {
            eqb eqb = new eqb(ffk.f16458a, l);
            C0034at a = this.f15591a.mo10429a(ffk.f16458a);
            Iterable iterable = (bnic) a.mo2448b();
            if (iterable == null) {
                iterable = bnon.f131923a;
            }
            bnia bnia = new bnia();
            bnia.mo67752b(iterable);
            bnia.mo67629b(l);
            a.mo2450b(bnia.mo67751a());
            mo10472a(new esa(this, eqb));
        }
    }

    /* renamed from: b */
    public final void mo10452b(ffk ffk) {
        this.f15591a.mo10430a(ffk, fgd.m11651b(), false);
    }

    /* renamed from: c */
    public final void mo10455c(ffk ffk, bsxn bsxn, esr esr) {
        esp esp = new esp(ffk, bsxn, esr, this.f15591a, this.f15594d, this.f15595e, (eor) this.f15597g.mo6606a(), this.f15596f);
        if (((eps) esp.f15632k.mo2448b()).f15497a) {
            esp.f15622a.logVerbose("loadScreenGraph root request ongoing already for %s", Integer.valueOf(esp.f15624c.f147589b));
            return;
        }
        esp.f15622a.logVerbose("loadScreenGraph root for %s", Integer.valueOf(esp.f15624c.f147589b));
        esp.f15631j = null;
        if (ffr.m11620a(esp.f15623b)) {
            bsxn bsxn2 = esp.f15624c;
            if (!((bsxn2.f147589b == 524 && epu.m10942a(bsxn2) == 2) || bsxn2.f147589b == 2004 || ssk.m36235a(rpr.m34216b()))) {
                esp.f15631j = new chuw(chuv.f189219f);
            }
        }
        esp.f15629h = true;
        esp.mo10486c();
        esp.mo10479a();
        if (esp.mo10487c(esp.f15624c)) {
            esp.mo10484b();
            return;
        }
        aucb a = aucu.m76780a(esp.f15626e, new esg(esp));
        a.mo50373a(new esh(esp));
        a.mo50372a(new esi(esp));
        a.mo50371a(new esj(esp));
    }

    /* renamed from: a */
    public final void mo10449a(Long l) {
        this.f15591a.mo10431a(l);
        mo10472a(new erq(this, new eqt(l)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10472a(Runnable runnable) {
        aucu.m76780a(this.f15594d, new err(runnable));
    }
}
