package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

/* renamed from: bulp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bulp implements bulq {

    /* renamed from: a */
    public static final bulp f154160a = new bulp();

    /* renamed from: b */
    public boolean f154161b = false;

    /* renamed from: c */
    public bgmk f154162c;

    /* renamed from: d */
    public bgmm f154163d;

    /* renamed from: e */
    public bgns f154164e;

    /* renamed from: f */
    public bfmf f154165f;

    /* renamed from: g */
    public cewk f154166g;

    /* renamed from: h */
    public bult f154167h;

    /* renamed from: i */
    public bulx f154168i;

    /* renamed from: j */
    public int f154169j;

    /* renamed from: k */
    public int f154170k;

    /* renamed from: l */
    public boolean f154171l;

    /* renamed from: m */
    public boolean f154172m;

    /* renamed from: n */
    public long f154173n;

    /* renamed from: o */
    public long f154174o;

    /* renamed from: p */
    public long f154175p;

    /* renamed from: q */
    public long f154176q;

    /* renamed from: r */
    public bsax f154177r;

    /* renamed from: s */
    public final buit f154178s = new buit();

    /* renamed from: t */
    public bulo f154179t;

    /* renamed from: u */
    public buki f154180u;

    /* renamed from: v */
    public bukj f154181v;

    private bulp() {
    }

    /* renamed from: a */
    public final long mo72818a(long j) {
        return this.f154168i.mo72838c(j);
    }

    /* renamed from: b */
    public final void mo72822b() {
        buit buit = this.f154178s;
        buit.mo72709a("pap_").mo72707a(this.f154162c);
    }

    /* renamed from: c */
    public final void mo72823c() {
        buit buit = this.f154178s;
        buit.mo72709a("pap_").mo72708b(this.f154162c);
    }

    /* renamed from: d */
    public final void mo72824d() {
        this.f154170k = this.f154169j;
    }

    /* renamed from: e */
    public final boolean mo72825e() {
        int i;
        if (!this.f154172m) {
            i = this.f154170k;
            int f = this.f154168i.mo72842f();
            if (this.f154166g.enableGlocRequestReducedDownloadThreshold()) {
                i /= Math.max(f, 1);
            }
        } else {
            i = this.f154170k;
        }
        if (this.f154171l || this.f154162c.mo62776c() - this.f154173n <= ((long) i) || !this.f154168i.mo72841e()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Set mo72819a(bumi bumi, bukm bukm) {
        return this.f154168i.mo72829a(bumi, bukm);
    }

    /* renamed from: a */
    public final void mo72820a() {
        this.f154168i.mo72830a();
        this.f154167h.mo61835b();
    }

    /* renamed from: a */
    public final void mo72821a(bsax bsax) {
        if (bsax != null) {
            bulr.m119900a(bsax, 77, 10000);
            bulr.m119900a(bsax, 78, 1);
            if (bsax.mo70137i(77) && bsax.mo70114b(77) > 30000000) {
                bsax.mo70139k(77);
            }
        } else {
            bsax = null;
        }
        try {
            bsax bsax2 = this.f154177r;
            if ((bsax2 == null || !Arrays.equals(bsax2.mo70120b(), bsax.mo70120b())) && bsax.mo70137i(1)) {
                bsax bsax3 = this.f154177r;
                if (!(bsax3 == null || (bsax3.mo70114b(1) == bsax.mo70114b(1) && this.f154177r.mo70113a(73) == bsax.mo70113a(73) && this.f154177r.mo70113a(74) == bsax.mo70113a(74)))) {
                    mo72820a();
                }
                if (bsax.mo70137i(77)) {
                    this.f154169j = bsax.mo70114b(77);
                }
                this.f154168i.mo72832a(bsax);
                bulo bulo = this.f154179t;
                if (bulo != null) {
                    bulo.mo72714a(bsax);
                }
                this.f154177r = bsax;
            }
        } catch (IOException e) {
        }
    }
}
