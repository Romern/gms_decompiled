package p000;

import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: baoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baoy implements baqc {

    /* renamed from: a */
    private static final bxtx f101448a = bxtx.m123259a("bc", bmwy.f131158c);

    /* renamed from: b */
    private static final bxtx f101449b = bxtx.m123259a("rdc", bmwy.f131158c);

    /* renamed from: c */
    private static final bxtx f101450c = bxtx.m123259a("dc", bmwy.f131158c);

    /* renamed from: d */
    private static final bxtx f101451d = bxtx.m123259a("scdrc", bmwy.f131158c);

    /* renamed from: e */
    private static final bxtx f101452e = bxtx.m123259a("scdc", bmwy.f131158c);

    /* renamed from: f */
    private static final bxtx f101453f = bxtx.m123259a("scts", bmwy.f131158c);

    /* renamed from: g */
    private static final bxtx f101454g = bxtx.m123258a("cpnts");

    /* renamed from: h */
    private static final bxtx f101455h = bxtx.m123258a("npnts");

    /* renamed from: i */
    private static final bnhe f101456i;

    /* renamed from: j */
    private static final bnhe f101457j;

    /* renamed from: k */
    private final bamq f101458k;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(bqao.SYNC_TRIGGER_UNKNOWN, bxtx.m123258a("ustdc"));
        h.mo67695b(bqao.SYNC_TRIGGER_MANUAL, bxtx.m123258a("mstdc"));
        h.mo67695b(bqao.SYNC_TRIGGER_TIMER, bxtx.m123258a("tstdc"));
        h.mo67695b(bqao.SYNC_TRIGGER_SUBSCRIPTION, bxtx.m123258a("sstdc"));
        h.mo67695b(bqao.SYNC_TRIGGER_PUSH_NOTIFICATION, bxtx.m123258a("pnstdc"));
        h.mo67695b(bqao.SYNC_TRIGGER_READ, bxtx.m123258a("rstdc"));
        h.mo67695b(bqao.SYNC_TRIGGER_WRITE, bxtx.m123258a("wstdc"));
        f101456i = bnmt.m109791a(h.mo67618b());
        bnha bnha = new bnha();
        bnrd a = f101456i.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            bqao bqao = (bqao) entry.getKey();
            String valueOf = String.valueOf(((bxtx) entry.getValue()).mo73781l());
            bnha.mo67695b(bqao, bxtx.m123258a(valueOf.length() == 0 ? new String("sc") : "sc".concat(valueOf)));
        }
        f101457j = bnha.mo67618b();
    }

    public baoy(bamq bamq) {
        this.f101458k = bamq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [bqao, java.lang.Long]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    private final baqa m87303a(bxtx bxtx, bxtx bxtx2, Map map) {
        banx a;
        try {
            a = this.f101458k.mo55766a().mo55798a();
            long a2 = baqr.m87410a(this.f101458k.mo55767a(a, bxtx), 0);
            long a3 = baqr.m87410a(this.f101458k.mo55767a(a, bxtx2), 0);
            bmxy.m108581a(bqao.class);
            EnumMap enumMap = new EnumMap(bqao.class);
            for (Map.Entry entry : map.entrySet()) {
                enumMap.put((Object) ((bqao) entry.getKey()), (Object) Long.valueOf(baqr.m87410a(this.f101458k.mo55767a(a, (bxtx) entry.getValue()), 0)));
            }
            bapz e = baqa.m87370e();
            e.mo55882a(a2);
            e.mo55884b(a3);
            e.mo55883a(bnmt.m109791a(enumMap));
            baqa a4 = e.mo55881a();
            a.close();
            return a4;
        } catch (IOException e2) {
            throw banv.m87235a(e2);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final baqa mo55851b() {
        return m87303a(f101449b, f101450c, f101456i);
    }

    /* renamed from: c */
    public final baqa mo55852c() {
        return m87303a(f101451d, f101452e, f101457j);
    }

    public final void close() {
        this.f101458k.close();
    }

    /* renamed from: d */
    public final Long mo55854d() {
        return m87304a(f101453f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bamq.a(banx, bxtx):bxtx
     arg types: [bany, bxtx]
     candidates:
      bamq.a(bany, bxtx):void
      bamq.a(banx, byte[]):byte[]
      bamq.a(banx, bxtx):bxtx */
    /* renamed from: e */
    public final Long mo55855e() {
        bany b;
        try {
            b = this.f101458k.mo55766a().mo55799b();
            Long b2 = baqr.m87413b(this.f101458k.mo55767a((banx) b, f101454g));
            this.f101458k.mo55770a(b, f101455h);
            b.mo55796b();
            b.close();
            return b2;
        } catch (IOException e) {
            throw banv.m87235a(e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo55856f() {
        bany b;
        try {
            b = this.f101458k.mo55766a().mo55799b();
            this.f101458k.mo55776b(b, bxtx.f164797b, (bxtx) null);
            b.mo55796b();
            b.close();
            return;
        } catch (IOException e) {
            throw banv.m87235a(e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private final Long m87304a(bxtx bxtx) {
        banx a;
        try {
            a = this.f101458k.mo55766a().mo55798a();
            Long b = baqr.m87413b(this.f101458k.mo55767a(a, bxtx));
            a.close();
            return b;
        } catch (IOException e) {
            throw banv.m87235a(e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final Long mo55846a() {
        return m87304a(f101448a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bamq.a(banx, bxtx):bxtx
     arg types: [bany, bxtx]
     candidates:
      bamq.a(bany, bxtx):void
      bamq.a(banx, byte[]):byte[]
      bamq.a(banx, bxtx):bxtx */
    /* renamed from: a */
    public final void mo55847a(long j) {
        bany b;
        try {
            b = this.f101458k.mo55766a().mo55799b();
            if (this.f101458k.mo55767a((banx) b, f101454g) == null) {
                this.f101458k.mo55771a(b, f101454g, baqr.m87411a(j));
            }
            if (this.f101458k.mo55767a((banx) b, f101455h) == null) {
                this.f101458k.mo55771a(b, f101455h, baqr.m87411a(j));
            }
            b.mo55796b();
            b.close();
            return;
        } catch (IOException e) {
            throw banv.m87235a(e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo55848a(long j, long j2) {
        bany b;
        try {
            b = this.f101458k.mo55766a().mo55799b();
            this.f101458k.mo55771a(b, f101448a, baqr.m87411a(j));
            this.f101458k.mo55771a(b, f101449b, baqr.m87411a(0));
            this.f101458k.mo55771a(b, f101450c, baqr.m87411a(0));
            bnrd a = f101456i.values().iterator();
            while (a.hasNext()) {
                this.f101458k.mo55771a(b, (bxtx) a.next(), baqr.m87411a(0));
            }
            this.f101458k.mo55771a(b, f101451d, baqr.m87411a(0));
            this.f101458k.mo55771a(b, f101452e, baqr.m87411a(0));
            bnrd a2 = f101457j.values().iterator();
            while (a2.hasNext()) {
                this.f101458k.mo55771a(b, (bxtx) a2.next(), baqr.m87411a(0));
            }
            this.f101458k.mo55771a(b, f101453f, baqr.m87411a(j2));
            this.f101458k.mo55770a(b, f101454g);
            this.f101458k.mo55770a(b, f101455h);
            b.mo55796b();
            b.close();
            return;
        } catch (IOException e) {
            throw banv.m87235a(e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bamq.a(banx, bxtx):bxtx
     arg types: [bany, bxtx]
     candidates:
      bamq.a(bany, bxtx):void
      bamq.a(banx, byte[]):byte[]
      bamq.a(banx, bxtx):bxtx */
    /* renamed from: a */
    public final void mo55849a(long j, baqa baqa) {
        bany b;
        try {
            b = this.f101458k.mo55766a().mo55799b();
            this.f101458k.mo55771a(b, f101453f, baqr.m87411a(j));
            this.f101458k.mo55771a(b, f101451d, baqr.m87411a(baqa.mo55838a()));
            this.f101458k.mo55771a(b, f101452e, baqr.m87411a(baqa.mo55839b()));
            bnrd a = baqa.mo55840c().entrySet().iterator();
            while (a.hasNext()) {
                Map.Entry entry = (Map.Entry) a.next();
                bqao bqao = (bqao) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                bxtx bxtx = (bxtx) f101457j.get(bqao);
                bmxy.m108587a(bxtx, "Unsupported sync trigger %s!", bqao);
                this.f101458k.mo55771a(b, bxtx, baqr.m87411a(longValue));
            }
            Long b2 = baqr.m87413b(this.f101458k.mo55767a((banx) b, f101455h));
            if (b2 != null) {
                this.f101458k.mo55771a(b, f101454g, baqr.m87411a(b2.longValue()));
            } else {
                this.f101458k.mo55770a(b, f101454g);
            }
            b.mo55796b();
            b.close();
            return;
        } catch (IOException e) {
            throw banv.m87235a(e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo55850a(baqa baqa) {
        bany b;
        try {
            b = this.f101458k.mo55766a().mo55799b();
            this.f101458k.mo55771a(b, f101449b, baqr.m87411a(baqa.mo55838a()));
            this.f101458k.mo55771a(b, f101450c, baqr.m87411a(baqa.mo55839b()));
            bnrd a = baqa.mo55840c().entrySet().iterator();
            while (a.hasNext()) {
                Map.Entry entry = (Map.Entry) a.next();
                bqao bqao = (bqao) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                bxtx bxtx = (bxtx) f101456i.get(bqao);
                bmxy.m108587a(bxtx, "Unsupported sync trigger %s!", bqao);
                this.f101458k.mo55771a(b, bxtx, baqr.m87411a(longValue));
            }
            b.mo55796b();
            b.close();
            return;
        } catch (IOException e) {
            throw banv.m87235a(e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
