package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Handler;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yzp implements yzs, zrg {

    /* renamed from: a */
    public static final srn f54854a = zvt.m46581a();

    /* renamed from: b */
    public static final bnic f54855b = bnic.m109489a(bzzn.f172101an.f172336b);

    /* renamed from: g */
    private static yzp f54856g;

    /* renamed from: c */
    public final Context f54857c;

    /* renamed from: d */
    public final Handler f54858d = new snr(new sns(10));

    /* renamed from: e */
    public final ExecutorService f54859e = snp.m35704b(10);

    /* renamed from: f */
    public final yzn f54860f = new yzn(new yzd(this));

    /* renamed from: h */
    private final yzn f54861h = new yzn(new yyr(this));

    /* renamed from: i */
    private final yzn f54862i = new yzn(new yzc(this));

    /* renamed from: j */
    private final yzm f54863j = new yzm(new yze(this));

    /* renamed from: k */
    private final yzm f54864k = new yzm(new yzf(this));

    /* renamed from: l */
    private final yzm f54865l = new yzm(new yzg(this));

    /* renamed from: m */
    private final yzm f54866m = new yzm(new yzh(this));

    /* renamed from: n */
    private final yzm f54867n = new yzm(new yzi(this));

    /* renamed from: o */
    private final yzm f54868o = new yzm(new yzj(this));

    /* renamed from: p */
    private final yzm f54869p = new yzm(new yzk(this));

    /* renamed from: q */
    private final yzm f54870q = new yzm(new yys(this));

    /* renamed from: r */
    private final yzm f54871r = new yzm(new yyt(this));

    /* renamed from: s */
    private final yzm f54872s = new yzm(new yyu(this));

    /* renamed from: t */
    private final yzm f54873t = new yzm(new yyv(this));

    /* renamed from: u */
    private final yzn f54874u = new yzn(new yyw(this));

    /* renamed from: v */
    private final yzn f54875v = new yzn(new yyx(this));

    /* renamed from: w */
    private final yzn f54876w = new yzn(new yyy(this));

    /* renamed from: x */
    private final yzn f54877x = new yzn(new yyz());

    /* renamed from: y */
    private final AtomicReference f54878y = new AtomicReference();

    /* renamed from: z */
    private final yzn f54879z = new yzn(new yza(this));

    public yzp(Context context) {
        this.f54857c = context;
    }

    /* renamed from: a */
    public static synchronized yzp m45078a(Context context) {
        yzp yzp;
        synchronized (yzp.class) {
            if (f54856g == null) {
                f54856g = new yzp(context.getApplicationContext());
            }
            yzp = f54856g;
        }
        return yzp;
    }

    /* renamed from: d */
    public static ceae m45079d() {
        return new yno();
    }

    /* renamed from: m */
    protected static final void m45080m(String str) {
        if (cdzd.f182003a.mo6606a().mo78587k()) {
            sdo.m34973b(str);
        }
    }

    /* renamed from: a */
    public final sqv mo30869a() {
        return srb.f45012a;
    }

    /* renamed from: b */
    public final yst mo30874b() {
        return (yst) this.f54861h.mo30867a();
    }

    /* renamed from: c */
    public final zgf mo30876c() {
        return (zgf) this.f54862i.mo30867a();
    }

    /* renamed from: e */
    public final zrg mo30879e() {
        return this;
    }

    /* renamed from: f */
    public final zeb mo30881f(String str) {
        return (zeb) this.f54868o.mo30866a(str);
    }

    /* renamed from: g */
    public final bmxv mo30883g(String str) {
        return bmxv.m108567c((zgp) this.f54873t.mo30866a(str));
    }

    /* renamed from: h */
    public final zgp mo30885h(String str) {
        int i = Build.VERSION.SDK_INT;
        zgp zgp = new zgp(this.f54857c, mo30882f(), this.f54858d);
        try {
            bnre i2 = mo30878d(str).mo31340a().listIterator();
            while (i2.hasNext()) {
                yqq yqq = (yqq) i2.next();
                zhi b = zgp.mo31094b(yqq.f54423a);
                b.f55083d = yqq.f54424b;
                b.f55084e = yqq.f54425c;
                b.f55085f = yqq.f54426d;
                b.f55086g = yqq.f54427e;
                b.f55087h = yqq.f54428f;
                b.f55088i = yqq.f54429g;
                b.mo31114a(yqq.f54423a);
            }
        } catch (SQLiteException | IOException e) {
            bnsl bnsl = (bnsl) f54854a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("yzp", "h", 623, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while initializing claimed devices");
        }
        return zgp;
    }

    /* renamed from: i */
    public final ytp mo30887i() {
        return (ytp) this.f54879z.mo30867a();
    }

    /* renamed from: j */
    public final ytk mo30889j() {
        ytk ytk;
        synchronized (this.f54878y) {
            WeakReference weakReference = (WeakReference) this.f54878y.get();
            if (weakReference != null) {
                ytk = (ytk) weakReference.get();
            } else {
                ytk = null;
            }
            if (ytk != null) {
                return ytk;
            }
            ytk a = mo30870a(this.f54857c, "com.google.android.gms.fitness.cache.DataUpdateListenerCacheService", 2);
            this.f54878y.set(new WeakReference(a));
            return a;
        }
    }

    /* renamed from: k */
    public final yzt mo30891k() {
        return (yzt) this.f54874u.mo30867a();
    }

    /* renamed from: l */
    public final yzo mo30893l() {
        return new yzo(this.f54857c);
    }

    /* renamed from: d */
    public final zqz mo30878d(String str) {
        return (zqz) this.f54865l.mo30866a(str);
    }

    /* renamed from: e */
    public final zrk mo30880e(String str) {
        return (zrk) this.f54866m.mo30866a(str);
    }

    /* renamed from: a */
    public final ytk mo30870a(Context context, String str, int i) {
        return new ytk(context, str, i);
    }

    /* renamed from: l */
    public final zst mo30894l(String str) {
        return (zst) this.f54872s.mo30866a(str);
    }

    /* renamed from: a */
    public final ytu mo30871a(ytt ytt, ytv ytv, sns sns) {
        return new ytu(ytt, ytv, sns);
    }

    /* renamed from: b */
    public final ztl mo30875b(String str) {
        return (ztl) this.f54867n.mo30866a(str);
    }

    /* renamed from: c */
    public final zre mo30877c(String str) {
        return (zre) this.f54864k.mo30866a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final zhl mo30882f() {
        return (zhl) this.f54876w.mo30867a();
    }

    /* renamed from: g */
    public final zhj mo30884g() {
        return (zhj) this.f54875v.mo30867a();
    }

    /* renamed from: i */
    public final zgf mo30888i(String str) {
        return (zgf) this.f54869p.mo30866a(str);
    }

    /* renamed from: k */
    public final zuu mo30892k(String str) {
        return (zuu) this.f54871r.mo30866a(str);
    }

    /* renamed from: a */
    public final zrn mo30872a(String str) {
        return (zrn) this.f54863j.mo30866a(str);
    }

    /* renamed from: j */
    public final zqx mo30890j(String str) {
        return (zqx) this.f54870q.mo30866a(str);
    }

    /* renamed from: a */
    public final zus mo30873a(Context context, String str, zuu zuu) {
        zuu zuu2 = zuu;
        zur zur = new zur(context, str, zuu, mo30877c(str), mo30890j(str), srb.f45012a);
        if (!ceab.f182124a.mo6606a().mo78657h() || !(zuu2 instanceof yrz)) {
            return zur;
        }
        yrz yrz = (yrz) zuu2;
        return new zvh(yrz, mo30877c(str), zvn.m46574a(context), zur, new zvf(context, str, yrz, mo30877c(str), mo30890j(str), zvn.m46574a(context), srb.f45012a), srb.f45012a);
    }

    /* renamed from: h */
    public final zwc mo30886h() {
        return (zwc) this.f54877x.mo30867a();
    }
}
