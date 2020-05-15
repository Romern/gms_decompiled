package p000;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: brvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brvn implements brxe {

    /* renamed from: a */
    public static final bnsp f143457a = bnsp.m110328a("xRPC");

    /* renamed from: b */
    static final chtn f143458b = bryw.m114907a(brty.f143368b);

    /* renamed from: c */
    static final byte[] f143459c = brty.f143367a.mo73642k();

    /* renamed from: d */
    public static final chqn f143460d = chqn.m149405a("ClientInterceptorCacheDirective", brtz.DEFAULT_CACHE_OK_IF_VALID);

    /* renamed from: l */
    private static final chtn f143461l = bryw.m114907a(brtx.f143362e);

    /* renamed from: e */
    public final brvp f143462e;

    /* renamed from: f */
    public chtr f143463f;

    /* renamed from: g */
    public chtr f143464g;

    /* renamed from: h */
    public bryr f143465h;

    /* renamed from: i */
    public brtz f143466i;

    /* renamed from: j */
    public long f143467j = -1;

    /* renamed from: k */
    public List f143468k = bngx.m109376e();

    /* renamed from: m */
    private final Executor f143469m;

    /* renamed from: n */
    private bqgh f143470n;

    public brvn(brvm brvm) {
        this.f143462e = brvm.f143455a;
        this.f143469m = brvm.f143456b;
    }

    /* renamed from: a */
    public static brvm m114753a() {
        return new brvm();
    }

    /* renamed from: b */
    public final bryh mo70016b() {
        bqgh a = bqgh.m112796a(new brvk(this));
        this.f143470n = a;
        this.f143469m.execute(a);
        return bryh.m114872a(this.f143470n);
    }

    /* renamed from: c */
    public final bryi mo70018c() {
        if (this.f143467j == -1) {
            return bryi.f143654a;
        }
        this.f143469m.execute(new brvl(this));
        return bryi.f143654a;
    }

    /* renamed from: a */
    public final bryh mo70011a(brxa brxa) {
        bmxy.m108601b(brxa.f143555c.f189149a.equals(chtu.UNARY), "Caching interceptor only supports unary RPCs");
        bryr bryr = (bryr) brxa.f143554b.mo85548a(bryr.f143673b);
        bmxy.m108582a(bryr, "Using CachingClientInterceptor without MutableMetricsContext");
        this.f143465h = bryr;
        brtz brtz = (brtz) brxa.f143554b.mo85548a(f143460d);
        bmxy.m108582a(brtz, "Using CachingClientInterceptor without CacheDirective");
        this.f143466i = brtz;
        chtr chtr = new chtr();
        this.f143463f = chtr;
        chtr.mo85649a(brxa.f143553a);
        return bryh.f143648b;
    }

    /* renamed from: b */
    public final bryh mo70017b(brxa brxa) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryh mo70012a(brxb brxb) {
        try {
            bmxv bmxv = (bmxv) bqga.m112780a((Future) this.f143470n);
            if (bmxv == null) {
                bnsl bnsl = (bnsl) f143457a.mo68387b();
                bnsl.mo68432a("brvn", "a", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("RpcCache returned null instead of Optional#absent()");
                return bryh.f143647a;
            } else if (!bmxv.mo66813a()) {
                if (!this.f143466i.equals(brtz.CACHE_ONLY)) {
                    if (!this.f143466i.equals(brtz.VALID_CACHE_ONLY)) {
                        return bryh.f143647a;
                    }
                }
                chuv a = chuv.m149607a(chus.FAILED_PRECONDITION).mo85687a("Required value come from cache, but no cached value was found");
                chtr chtr = new chtr();
                chtr.mo85648a(f143458b, f143459c);
                return bryh.m114874a(a, chtr);
            } else {
                brvo brvo = (brvo) bmxv.mo66814b();
                throw null;
            }
        } catch (ExecutionException e) {
            bnsl bnsl2 = (bnsl) f143457a.mo68387b();
            bnsl2.mo68437a(e.getCause());
            bnsl2.mo68432a("brvn", "a", 204, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to read from cache");
            if (e.getCause() instanceof ClassCastException) {
                return bryh.m114874a(chuv.f189228o, new chtr());
            }
            return bryh.f143647a;
        }
    }

    /* renamed from: a */
    public final bryi mo70013a(brwz brwz) {
        return bryi.f143654a;
    }

    /* renamed from: a */
    public final bryi mo70014a(brxc brxc) {
        chtm chtm;
        chtr chtr = new chtr();
        this.f143464g = chtr;
        chtr.mo85649a(brxc.f143557a);
        if (this.f143464g.mo85650a(f143461l)) {
            chtr chtr2 = this.f143464g;
            chtn chtn = f143461l;
            int i = 0;
            while (true) {
                if (i >= chtr2.f189137e) {
                    chtm = null;
                    break;
                } else if (Arrays.equals(chtn.f189130b, chtr2.mo85651a(i))) {
                    chtm = new chtm(chtr2, chtn, i);
                    break;
                } else {
                    i++;
                }
            }
            if (chtm != null) {
                bngx a = bngx.m109355a((Iterable) chtm);
                if (a.size() == 1) {
                    try {
                        bxvd da = brtx.f143361d.mo74144da();
                        da.mo73635b((byte[]) a.get(0), bxus.m123744c());
                        brtx brtx = (brtx) da.mo74062i();
                        if ((brtx.f143364a & 1) != 0) {
                            long j = brtx.f143365b;
                            if (j > 0) {
                                this.f143467j = TimeUnit.SECONDS.toMillis(j);
                                bxwc<String> bxwc = brtx.f143366c;
                                bngs j2 = bngx.m109377j();
                                for (String str : bxwc) {
                                    j2.mo67668c(str.toLowerCase(Locale.ROOT));
                                }
                                this.f143468k = j2.mo67664a();
                                return bryi.f143654a;
                            }
                        }
                    } catch (bxwf e) {
                        bnsl bnsl = (bnsl) f143457a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("brvn", "a", 293, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Could not parse server ttl");
                    }
                } else {
                    bnsl bnsl2 = (bnsl) f143457a.mo68387b();
                    bnsl2.mo68432a("brvn", "a", 296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68409a("Expected a single value for extension, got: %d", a.size());
                }
            }
        }
        return bryi.f143654a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo70015a(brxd brxd) {
        try {
            for (String str : this.f143463f.mo85653b()) {
                if (!this.f143468k.contains(str)) {
                    if (str.endsWith("-bin")) {
                        this.f143463f.mo85656d(chtn.m149536a(str, chtr.f189133a));
                    } else {
                        this.f143463f.mo85656d(chtn.m149535a(str, chtr.f189134b));
                    }
                }
            }
            brvp brvp = this.f143462e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            brvp.mo70021c();
        } catch (Throwable th) {
            bnsl bnsl = (bnsl) f143457a.mo68387b();
            bnsl.mo68437a(th);
            bnsl.mo68432a("brvn", "a", 334, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Could not write to cache");
        }
    }
}
