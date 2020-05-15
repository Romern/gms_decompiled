package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: tsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsf extends C0053bl {

    /* renamed from: a */
    public static final long f46580a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: d */
    long f46581d = (-f46580a);

    /* renamed from: e */
    public final trs f46582e;

    /* renamed from: f */
    public final C0036av f46583f;

    /* renamed from: g */
    public final C0034at f46584g = new C0034at();

    public tsf(trs trs) {
        C0036av avVar = new C0036av();
        this.f46583f = avVar;
        this.f46582e = trs;
        avVar.mo2667a(trs.f46559e, new tsd(this));
        this.f46583f.mo2667a(this.f46584g, new tse(this));
    }

    /* renamed from: a */
    public static tql m37417a(tql tql, String str) {
        bngx bngx = null;
        if (tql == null) {
            return null;
        }
        if (bmxx.m108577a(str)) {
            return tql;
        }
        String lowerCase = str.toLowerCase(tux.m37507a());
        if (tql.mo26735a() != null) {
            bngs j = bngx.m109377j();
            bnre i = ((bngx) tql.mo26735a()).listIterator();
            while (i.hasNext()) {
                C0034at atVar = (C0034at) i.next();
                if (atVar.mo2448b() != null) {
                    if (cdpx.m134644b()) {
                        if (!m37418a((bsjx) atVar.mo2448b(), lowerCase)) {
                            bnre i2 = ((bsjx) atVar.mo2448b()).mo70638c().listIterator();
                            while (true) {
                                if (!i2.hasNext()) {
                                    break;
                                }
                                bskf bskf = (bskf) i2.next();
                                if (bskf.mo70660f().toLowerCase(tux.m37507a()).contains(lowerCase)) {
                                    break;
                                }
                                bnrd a = bskf.mo70644c().iterator();
                                while (true) {
                                    if (a.hasNext()) {
                                        String lowerCase2 = ((bytw) a.next()).f167728b.toLowerCase(tux.m37507a());
                                        if (!lowerCase2.startsWith("android://") && lowerCase2.contains(lowerCase)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!m37418a((bsjx) atVar.mo2448b(), lowerCase)) {
                    }
                    j.mo67668c(atVar);
                }
            }
            bngx = j.mo67664a();
        }
        return tql.m37363a(tql.mo26737c(), bngx, tql.mo26736b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: trs.a(aucb, boolean):void
     arg types: [aucb, int]
     candidates:
      trs.a(bngx, bngx):void
      trs.a(qun, bngx):void
      trs.a(aucb, boolean):void */
    /* renamed from: b */
    public final void mo26758b() {
        trs trs = this.f46582e;
        trs.f46559e.mo2450b(tql.m37366d());
        trs.f46560f.mo2450b(tql.m37366d());
        tox tox = trs.f46556b;
        trs.mo26746a(tox.mo26697a(new tor(tox)).mo50364a(new C1594tos(tox)), true);
    }

    /* renamed from: c */
    public final C0034at mo26759c() {
        return this.f46582e.f46559e;
    }

    /* renamed from: d */
    public final boolean mo26760d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f46581d;
        return elapsedRealtime >= j && elapsedRealtime - j <= f46580a;
    }

    /* renamed from: e */
    public final void mo26761e() {
        this.f46581d = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private static boolean m37418a(bsjx bsjx, String str) {
        return bsjx.mo70637b().f167739b.toLowerCase(tux.m37507a()).contains(str);
    }

    /* renamed from: a */
    public final void mo26755a() {
        this.f46582e.mo26750a(true);
    }

    /* renamed from: a */
    public final void mo26756a(String str) {
        this.f46584g.mo2450b(str);
    }

    /* renamed from: a */
    public final void mo26757a(tql tql) {
        if (this.f46583f.mo2448b() != tql) {
            this.f46583f.mo2450b(tql);
        }
    }
}
