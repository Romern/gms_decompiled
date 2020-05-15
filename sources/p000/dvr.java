package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: dvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvr extends squ {

    /* renamed from: a */
    public final Set f14211a = new HashSet();

    /* renamed from: b */
    final /* synthetic */ dvx f14212b;

    /* renamed from: g */
    private dvz f14213g = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dvr(dvx dvx) {
        super(doi.f13699i, dwq.m9662f(), dwq.m9667k().f13906c);
        this.f14212b = dvx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9714a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9718b(sqt sqt) {
        dwa dwa = (dwa) sqt;
        new Object[1][0] = dwa;
        if (this.f14212b.f14226d) {
            this.f14211a.remove(dwa);
        }
        dvx dvx = this.f14212b;
        doh doh = dwa.f14242b.f14240c;
        sdo.m34959a(doh);
        bxco b = dwa.mo9747b();
        if (b != bxco.UNKNOWN_CONTEXT_NAME) {
            dwf dwf = (dwf) dvx.f14223a.get(doh);
            if (dwf == null) {
                dwf = new dwf();
                dvx.f14223a.put(doh, dwf);
            }
            boolean a = dwf.mo9768a(b.f162973bD);
            if (dwa.mo9744a() == 0) {
                dwa.mo9745a(dwq.m9665i().mo20505a());
            }
            dvz dvz = dwa.f14242b;
            dwa dwa2 = (dwa) dwf.f14258a.remove(dvz);
            dwf.f14258a.put(dvz, dwa);
            dwf.f14259b.mo10098a(dwa.mo9747b().f162973bD, dwa);
            if (dwa.mo9748c()) {
                dwf.f14260c.mo67268a(dwa.f14243c, dwa);
            }
            dwf.f14261d.mo67268a(dvz.mo9739b(), dwa);
            new Object[1][0] = dwa;
            if (!a) {
                dvx.f14225c.mo10086a((egg) new dvt(doh, b));
            }
            dvx.f14225c.mo10086a((egg) new dvs(doh, dwa, dwa2));
        }
        this.f14213g = null;
    }

    /* renamed from: a */
    public final void mo9715a(dvz dvz) {
        new Object[1][0] = dvz;
        this.f14213g = null;
        new Object[1][0] = null;
        mo25984a((Object) dvz);
        if (this.f14212b.f14226d) {
            this.f14211a.remove(dvz);
        }
    }

    /* renamed from: a */
    public final void mo9716a(dwa dwa) {
        new Object[1][0] = dwa;
        this.f14213g = dwa.f14242b;
        if (this.f14212b.f14226d) {
            this.f14211a.add(dwa);
        }
        new Object[1][0] = this.f14213g;
        mo25985a(dwa.f14242b, dwa);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9717a(sqt sqt) {
        dwa dwa = (dwa) sqt;
        new Object[1][0] = dwa;
        new Object[1][0] = this.f14213g;
        if (this.f14212b.f14226d) {
            this.f14211a.add(dwa);
        }
        if (!dwa.f14242b.equals(this.f14213g)) {
            dvx dvx = this.f14212b;
            new Object[1][0] = dwa;
            doh doh = dwa.f14242b.f14240c;
            sdo.m34959a(doh);
            bxco b = dwa.mo9747b();
            dwf dwf = (dwf) dvx.f14223a.get(doh);
            if (dwf != null && dwf.mo9769a(dwa.f14242b)) {
                dwa dwa2 = (dwa) dwf.f14258a.remove(dwa.f14242b);
                if (dwa2 != null) {
                    dwf.f14259b.mo10100b(dwa2.mo9747b().f162973bD, dwa2);
                    if (dwa2.mo9748c()) {
                        dwf.f14260c.mo67310c(dwa2.f14243c, dwa2);
                    }
                    dwf.f14261d.mo67310c(dwa2.f14242b.mo9739b(), dwa2);
                    new Object[1][0] = dwa2;
                }
                if (dwf.f14258a.isEmpty()) {
                    dvx.f14223a.remove(doh);
                }
                dvx.f14225c.mo10086a((egg) new dvv(doh, dwa));
                if (!dwf.mo9768a(b.f162973bD)) {
                    dvx.f14225c.mo10086a((egg) new dvu(doh, b));
                }
            }
        }
        this.f14213g = null;
    }
}
