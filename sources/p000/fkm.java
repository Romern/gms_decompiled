package p000;

import android.content.Context;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;

/* renamed from: fkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fkm {

    /* renamed from: i */
    private static volatile fkm f16784i;

    /* renamed from: a */
    public final Context f16785a;

    /* renamed from: b */
    public final Context f16786b;

    /* renamed from: c */
    public final sqv f16787c = srb.f45012a;

    /* renamed from: d */
    public final flh f16788d = new flh(this);

    /* renamed from: e */
    public final fnt f16789e;

    /* renamed from: f */
    public final flm f16790f;

    /* renamed from: g */
    public final fny f16791g;

    /* renamed from: h */
    public final fll f16792h;

    /* renamed from: j */
    private final fje f16793j;

    /* renamed from: k */
    private final fkh f16794k;

    /* renamed from: l */
    private final foh f16795l;

    /* renamed from: m */
    private final fip f16796m;

    /* renamed from: n */
    private final fle f16797n;

    /* renamed from: o */
    private final fka f16798o;

    /* renamed from: p */
    private final fkw f16799p;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    protected fkm(fkn fkn) {
        Context context = fkn.f16800a;
        sdo.m34966a(context, "Application context can't be null");
        Context context2 = fkn.f16801b;
        sdo.m34959a(context2);
        this.f16785a = context;
        this.f16786b = context2;
        fnt fnt = new fnt(this);
        fnt.mo10955u();
        this.f16789e = fnt;
        fnt a = mo10957a();
        String str = fkk.f16781a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up.");
        a.mo10925a(4, sb.toString(), null, null, null);
        fny fny = new fny(this);
        fny.mo10955u();
        this.f16791g = fny;
        foh foh = new foh(this);
        foh.mo10955u();
        this.f16795l = foh;
        fkh fkh = new fkh(this, fkn);
        fle fle = new fle(this);
        fka fka = new fka(this);
        fkw fkw = new fkw(this);
        fll fll = new fll(this);
        sdo.m34959a(context);
        if (fje.f16706a == null) {
            synchronized (fje.class) {
                if (fje.f16706a == null) {
                    fje.f16706a = new fje(context);
                }
            }
        }
        fje fje = fje.f16706a;
        fje.f16711f = new fkl(this);
        this.f16793j = fje;
        fip fip = new fip(this);
        fle.mo10955u();
        this.f16797n = fle;
        fka.mo10955u();
        this.f16798o = fka;
        fkw.mo10955u();
        this.f16799p = fkw;
        fll.mo10955u();
        this.f16792h = fll;
        flm b = fkn.mo7140b(this);
        b.mo10955u();
        this.f16790f = b;
        fkh.mo10955u();
        this.f16794k = fkh;
        mo10957a().mo10929b("Device AnalyticsService version", fkk.f16781a);
        foh e = fip.f16658a.mo10961e();
        e.mo10954t();
        e.mo10954t();
        if (e.f17012f) {
            e.mo10954t();
            fip.f16674e = e.f17013g;
        }
        e.mo10954t();
        fip.f16672c = true;
        this.f16796m = fip;
        flb flb = fkh.f16778a;
        flb.mo10954t();
        sdo.m34971a(!flb.f16835a, (Object) "Analytics backend already started");
        flb.f16835a = true;
        flb.mo10944i().mo10886a(new fkz(flb));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A[Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }] */
    /* renamed from: a */
    public static fkm m11883a(Context context) {
        boolean z;
        fkn fkn;
        long elapsedRealtime;
        long longValue;
        sdo.m34959a(context);
        if (f16784i == null) {
            synchronized (fkm.class) {
                if (f16784i == null) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    z = false;
                    try {
                        fkn = (fkn) Class.forName("com.google.android.gms.analytics.internal.ModuleAnalyticsFactory").getConstructor(Context.class).newInstance(context);
                    } catch (ClassNotFoundException e) {
                    } catch (ClassCastException e2) {
                    } catch (IllegalAccessException e3) {
                        throw new IllegalStateException(e3);
                    } catch (InstantiationException e4) {
                        throw new IllegalStateException(e4);
                    } catch (NoSuchMethodException e5) {
                        throw new IllegalStateException(e5);
                    } catch (InvocationTargetException e6) {
                        throw new IllegalStateException(e6);
                    }
                    if (z) {
                        fkn = new fkn(context);
                    }
                    fkm fkm = new fkm(fkn);
                    f16784i = fkm;
                    fip.m11766a();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    longValue = ((Long) fni.f16921G.mo11021a()).longValue();
                    if (elapsedRealtime > longValue) {
                        fkm.mo10957a().mo10932c("Slow initialization (ms)", Long.valueOf(elapsedRealtime), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f16784i;
        fkn = null;
        z = true;
        if (z) {
        }
        fkm fkm2 = new fkm(fkn);
        f16784i = fkm2;
        fip.m11766a();
        elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
        longValue = ((Long) fni.f16921G.mo11021a()).longValue();
        if (elapsedRealtime > longValue) {
        }
        return f16784i;
    }

    /* renamed from: b */
    public final fje mo10958b() {
        sdo.m34959a(this.f16793j);
        return this.f16793j;
    }

    /* renamed from: c */
    public final fkh mo10959c() {
        m11884a(this.f16794k);
        return this.f16794k;
    }

    /* renamed from: d */
    public final fip mo10960d() {
        sdo.m34959a(this.f16796m);
        sdo.m34975b(this.f16796m.f16672c, "Analytics instance not initialized");
        return this.f16796m;
    }

    /* renamed from: e */
    public final foh mo10961e() {
        m11884a(this.f16795l);
        return this.f16795l;
    }

    /* renamed from: f */
    public final fka mo10962f() {
        m11884a(this.f16798o);
        return this.f16798o;
    }

    /* renamed from: g */
    public final fle mo10963g() {
        m11884a(this.f16797n);
        return this.f16797n;
    }

    /* renamed from: h */
    public final fkw mo10964h() {
        m11884a(this.f16799p);
        return this.f16799p;
    }

    /* renamed from: a */
    public static final void m11884a(fkj fkj) {
        sdo.m34966a(fkj, "Analytics service not created/initialized");
        sdo.m34975b(fkj.mo10953s(), "Analytics service not initialized");
    }

    /* renamed from: a */
    public final fnt mo10957a() {
        m11884a(this.f16789e);
        return this.f16789e;
    }
}
