package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yht {

    /* renamed from: a */
    public final cadm f53832a = ((cadm) cadn.f172699j.mo74144da());

    /* renamed from: b */
    public List f53833b;

    /* renamed from: c */
    private yfr f53834c = null;

    /* renamed from: d */
    private final yfr f53835d;

    /* renamed from: e */
    private yhu f53836e = null;

    public yht(yfr yfr) {
        bmxy.m108581a(yfr);
        this.f53835d = yfr;
    }

    /* renamed from: a */
    public final yft mo30503a() {
        mo30507b();
        yft yft = new yft();
        this.f53833b = yfp.m43960a(this.f53833b, yft);
        return yft;
    }

    /* renamed from: a */
    public final yht mo30504a(yhg yhg) {
        yfm.m43953a(this, yhg.mo30385a(), yhg.mo30387b());
        return this;
    }

    /* renamed from: b */
    public final void mo30507b() {
        bmxy.m108601b(this.f53836e == null, "ProtoRawDataPoint already built");
    }

    /* renamed from: c */
    public final yhu mo30508c() {
        yhu yhu = this.f53836e;
        if (yhu != null) {
            return yhu;
        }
        cadm cadm = this.f53832a;
        caae caae = this.f53835d.f53734a;
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        cadn cadn2 = cadn.f172699j;
        caae.getClass();
        cadn.f172705e = caae;
        cadn.f172701a |= 4;
        yfr yfr = this.f53834c;
        if (yfr != null) {
            cadm cadm2 = this.f53832a;
            caae caae2 = yfr.f53734a;
            if (cadm2.f164950c) {
                cadm2.mo74035c();
                cadm2.f164950c = false;
            }
            cadn cadn3 = (cadn) cadm2.f164949b;
            caae2.getClass();
            cadn3.f172706f = caae2;
            cadn3.f172701a |= 8;
        }
        List<yft> list = this.f53833b;
        if (list != null) {
            for (yft yft : list) {
                cadm cadm3 = this.f53832a;
                caau caau = yft.f53735a;
                if (cadm3.f164950c) {
                    cadm3.mo74035c();
                    cadm3.f164950c = false;
                }
                cadn cadn4 = (cadn) cadm3.f164949b;
                caaw caaw = (caaw) caau.mo74062i();
                caaw.getClass();
                cadn4.mo74615c();
                cadn4.f172704d.add(caaw);
            }
        }
        yhu yhu2 = new yhu((cadn) this.f53832a.mo74062i(), this.f53835d, this.f53834c);
        this.f53836e = yhu2;
        return yhu2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo30505a(long j, TimeUnit timeUnit) {
        mo30507b();
        if (j != 0) {
            cadm cadm = this.f53832a;
            long nanos = timeUnit.toNanos(j);
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn = (cadn) cadm.f164949b;
            cadn cadn2 = cadn.f172699j;
            cadn.f172701a |= 1;
            cadn.f172702b = nanos;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo30506a(yfr yfr) {
        bmxy.m108581a(yfr);
        mo30507b();
        this.f53834c = yfr;
    }
}
