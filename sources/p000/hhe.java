package p000;

import android.app.Application;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: hhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hhe extends C1261p {

    /* renamed from: d */
    public final String f19749d;

    /* renamed from: e */
    public final String f19750e;

    /* renamed from: f */
    public final String f19751f;

    /* renamed from: g */
    public final SavePasswordRequest f19752g;

    /* renamed from: h */
    public final bqgj f19753h = sne.m35694a(2, 9);

    /* renamed from: i */
    public final C1240of f19754i;

    /* renamed from: j */
    public final qws f19755j;

    /* renamed from: k */
    public final hvd f19756k;

    /* renamed from: l */
    public final sty f19757l;

    /* renamed from: m */
    public bnhe f19758m;

    /* renamed from: n */
    public final hhc f19759n;

    /* renamed from: o */
    public final hdz f19760o;

    /* renamed from: p */
    public final rjx f19761p;

    /* renamed from: q */
    public final C0034at f19762q;

    /* renamed from: r */
    public final C0034at f19763r;

    /* renamed from: s */
    public final C0034at f19764s;

    /* renamed from: t */
    public final C0034at f19765t;

    /* renamed from: u */
    public final C0034at f19766u;

    public hhe(Application application, String str, String str2, String str3, SavePasswordRequest savePasswordRequest, C1240of ofVar, qws qws) {
        super(application);
        this.f19749d = str;
        this.f19750e = str2;
        this.f19751f = str3;
        this.f19752g = savePasswordRequest;
        this.f19754i = ofVar;
        this.f19755j = qws;
        hvb a = hvc.m14893a();
        a.f20471a = str3;
        this.f19756k = hva.m14891a(application, a.mo12751a());
        allp allp = new allp();
        allp.f73626a = 80;
        this.f19761p = allr.m61237d(application, allp.mo40491a());
        this.f19757l = new sty(new adzt(Looper.getMainLooper()));
        this.f19762q = new C0034at();
        this.f19763r = new C0034at();
        this.f19765t = new C0034at();
        this.f19764s = new C0034at();
        this.f19766u = new C0034at();
        this.f19759n = new hhc(this);
        hdy a2 = hdz.m14237a();
        a2.f19553a = adcu.MATCH_PASSWORDS;
        a2.mo12419a(adcu.MATCH_PASSWORDS, new hgm(this));
        a2.mo12419a(adcu.ACCOUNT_CONFIRMATION, new hgp(this));
        a2.mo12419a(adcu.ACCOUNT_SELECTION, new hgq(this));
        a2.mo12419a(adcu.SAVE_PASSWORD, new hgr(this));
        a2.f19554b = new hgs(this);
        a2.f19555c = new hgt(this);
        a2.mo12420a(qws, str3, hgu.f19730a);
        this.f19760o = a2.mo12418a();
    }

    /* renamed from: a */
    public final void mo12466a() {
        this.f19760o.mo12426d();
        this.f19765t.mo2453l(Status.f30111e);
    }

    /* renamed from: b */
    public final CharSequence mo12467b() {
        return (CharSequence) this.f19754i.f26798a;
    }
}
