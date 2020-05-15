package p000;

import android.app.Activity;
import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bdjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjn extends bdjk implements bdhy, bdfa, bdez, bdkj {

    /* renamed from: f */
    private static final bnrt f105746f = bnrt.m110178a("bdjn");

    /* renamed from: a */
    public final cijl f105747a;

    /* renamed from: b */
    final AtomicBoolean f105748b = new AtomicBoolean();

    /* renamed from: c */
    public final bdka f105749c;

    /* renamed from: d */
    public final bdjf f105750d;

    /* renamed from: e */
    public final bdkg f105751e;

    /* renamed from: g */
    private final Application f105752g;

    /* renamed from: h */
    private final AtomicBoolean f105753h = new AtomicBoolean();

    /* renamed from: i */
    private final bdpz f105754i = bdpz.m91271a();

    public bdjn(bdkh bdkh, Application application, cijl cijl, bdka bdka, bdjf bdjf) {
        new ConcurrentHashMap();
        this.f105751e = bdkh.mo58105a(bqfb.INSTANCE, this.f105754i);
        this.f105752g = application;
        this.f105747a = cijl;
        this.f105749c = bdka;
        this.f105750d = bdjf;
    }

    /* renamed from: a */
    private final bqgg m90903a(cimj cimj) {
        return this.f105751e.mo58100a(new bdjl(this, cimj));
    }

    /* renamed from: b */
    public final void mo58031b() {
        if (this.f105753h.getAndSet(false)) {
            bdfd.m90662a(this.f105752g).mo57956b(this);
        }
        synchronized (this.f105749c) {
            this.f105749c.f105781a.f106239b.edit().remove("primes.battery.snapshot").commit();
        }
    }

    /* renamed from: c */
    public final void mo58086c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final bqgg mo58087d() {
        if (!this.f105748b.getAndSet(true)) {
            return m90903a(cimj.BACKGROUND_TO_FOREGROUND);
        }
        bnrq bnrq = (bnrq) f105746f.mo68388c();
        bnrq.mo68432a("bdjn", "d", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnrq.mo68405a("App is already in the foreground.");
        return bqga.m112770a();
    }

    /* renamed from: a */
    public final void mo58063a() {
        mo57953a((Activity) null);
        if (!this.f105753h.getAndSet(true)) {
            bdfd.m90662a(this.f105752g).mo57955a(this);
        }
    }

    /* renamed from: a */
    public final void mo57953a(Activity activity) {
        bqgg bqgg;
        if (!this.f105748b.get()) {
            if (this.f105748b.getAndSet(true)) {
                bnrq bnrq = (bnrq) f105746f.mo68388c();
                bnrq.mo68432a("bdjn", "d", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("App is already in the foreground.");
                bqgg = bqga.m112770a();
            } else {
                bqgg = m90903a(cimj.BACKGROUND_TO_FOREGROUND);
            }
            bdhp.m90826a(bqgg);
        }
    }

    /* renamed from: b */
    public final void mo57952b(Activity activity) {
        bqgg bqgg;
        try {
            bmxy.m108600b(this.f105748b.getAndSet(false));
            bqgg = m90903a(cimj.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            bqgg = bqga.m112777a((Throwable) e);
        }
        bdhp.m90826a(bqgg);
    }
}
