package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* renamed from: adfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfv {

    /* renamed from: w */
    private static final Object f61574w = new Object();

    /* renamed from: x */
    private static adfv f61575x;

    /* renamed from: a */
    public final bqgj f61576a = bqgs.m112811a((ExecutorService) snp.m35702a(10));

    /* renamed from: b */
    public final sqv f61577b = srb.f45012a;

    /* renamed from: c */
    public final adkn f61578c;

    /* renamed from: d */
    public final adkr f61579d;

    /* renamed from: e */
    public final SharedPreferences f61580e;

    /* renamed from: f */
    public final SharedPreferences f61581f;

    /* renamed from: g */
    public final adje f61582g;

    /* renamed from: h */
    public final adhk f61583h;

    /* renamed from: i */
    public final adjx f61584i;

    /* renamed from: j */
    public final adkd f61585j;

    /* renamed from: k */
    public final adfd f61586k;

    /* renamed from: l */
    public final adik f61587l;

    /* renamed from: m */
    public final adli f61588m;

    /* renamed from: n */
    public final adil f61589n;

    /* renamed from: o */
    public final adfq f61590o;

    /* renamed from: p */
    public final adfm f61591p;

    /* renamed from: q */
    public final adjn f61592q;

    /* renamed from: r */
    public final adko f61593r;

    /* renamed from: s */
    public final adkg f61594s;

    /* renamed from: t */
    public final adjy f61595t;

    /* renamed from: u */
    public final File f61596u;

    /* renamed from: v */
    private final adjm f61597v;

    public adfv(Context context) {
        Context applicationContext = context.getApplicationContext();
        int a = adfk.m50305a();
        File dir = applicationContext.getDir("instantapps", 0);
        this.f61596u = new File(dir, "cookies");
        String absolutePath = dir.getAbsolutePath();
        this.f61586k = new adfd(applicationContext);
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("instantapps.OptIn", 0);
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("instantapps.AccountPreferences", 0);
        SharedPreferences sharedPreferences3 = applicationContext.getSharedPreferences("instantapps.Routing", 0);
        SharedPreferences sharedPreferences4 = applicationContext.getSharedPreferences("instantapps.UserPrefsUpdater", 0);
        this.f61580e = applicationContext.getSharedPreferences("instantapps.ServerExperiments", 0);
        this.f61581f = applicationContext.getSharedPreferences("instantapps.RuntimeState", 0);
        adfg adfg = new adfg(applicationContext);
        this.f61578c = new adkn(adyd.m51363a(applicationContext), sharedPreferences2);
        adej adej = new adej(new adei(applicationContext, this.f61586k), this.f61578c);
        shl shl = new shl(applicationContext, cepl.f183185a.mo6606a().mo79533d(), (int) cepl.f183185a.mo6606a().mo79534e(), -1, 13824);
        int i = a;
        adet adet = new adet(applicationContext, this.f61586k, adfg, shl, new adeu(shl), adej, this.f61576a, new adfp(applicationContext));
        adel adel = new adel(applicationContext, adet);
        adem adem = new adem(applicationContext.getPackageManager());
        adek adek = new adek(adem, adet, adel, new aden());
        this.f61579d = new adkr(this.f61578c, sharedPreferences);
        this.f61587l = new adik(applicationContext, this.f61586k, adha.m50459a(applicationContext, "Metadata", new File(absolutePath, "metadataDatabase")), absolutePath, this.f61576a);
        adek adek2 = adek;
        adem adem2 = adem;
        adjg adjg = new adjg(applicationContext, this.f61587l, adfg, adek, adha.m50459a(applicationContext, "DomainFilter", new File(absolutePath, "domainFilterInfoDb")), this.f61578c, this.f61579d, this.f61580e, this.f61586k, new Random());
        this.f61582g = new adiz(adem2, adjg, new adjb(applicationContext, adjg));
        this.f61588m = new adli(applicationContext, adha.m50459a(applicationContext, "AppData", new File(absolutePath, "instantAppDataDb")), absolutePath);
        this.f61589n = new adil();
        this.f61583h = new adhl(this.f61587l, this.f61589n, applicationContext);
        this.f61584i = new adjx(sharedPreferences3);
        adim adim = new adim(this.f61587l, adek2, this.f61583h, this.f61586k, applicationContext);
        this.f61591p = new adfm();
        this.f61595t = new adjy(applicationContext, adem2);
        int i2 = adjz.f61965a;
        int i3 = Build.VERSION.SDK_INT;
        if (cepl.m137722c()) {
            adjm adjm = new adjm(adha.m50459a(applicationContext, "HashPrefix", new File(absolutePath, "prefixFilterInfoDb")), this.f61586k);
            this.f61597v = adjm;
            this.f61582g.mo33561a(adjm);
            int i4 = Build.VERSION.SDK_INT;
            if (cepl.m137722c()) {
                adjo adjo = new adjo(applicationContext, this.f61597v, this.f61591p, this.f61587l, new adfp(applicationContext), this.f61582g, this.f61586k);
                this.f61592q = new adja(adem2, adjo, new adjd(applicationContext, adjo, this.f61576a));
            } else {
                this.f61592q = null;
            }
        } else {
            this.f61592q = null;
            this.f61597v = null;
        }
        this.f61585j = new adkd(applicationContext, this.f61582g, this.f61587l, this.f61579d, this.f61578c, adim, this.f61586k, this.f61591p, i, this.f61595t, adem2, this.f61597v);
        this.f61590o = new adfq(applicationContext);
        if (cepl.f183185a.mo6606a().mo79518B()) {
            this.f61579d.mo33607a(new adkp(applicationContext));
        }
        this.f61593r = adko.m50744a(applicationContext);
        this.f61594s = new adkg(sharedPreferences4, this.f61579d, adek2, this.f61578c, applicationContext, this.f61586k, new Random());
    }

    /* renamed from: a */
    public static adfv m50332a(Context context) {
        adfv adfv;
        int i = spn.f44932a;
        synchronized (f61574w) {
            if (f61575x == null) {
                f61575x = new adfv(context.getApplicationContext());
            }
            adfv = f61575x;
        }
        return adfv;
    }
}
