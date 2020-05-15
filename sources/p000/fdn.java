package p000;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.android.volley.toolbox.JsonObjectRequest;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fdn {

    /* renamed from: a */
    public final fcg f16323a;

    /* renamed from: b */
    public final C0036av f16324b;

    /* renamed from: c */
    public bswt f16325c;

    /* renamed from: d */
    private final fhe f16326d;

    /* renamed from: e */
    private final C0034at f16327e;

    /* renamed from: f */
    private final C0034at f16328f;

    /* renamed from: g */
    private final C0034at f16329g;

    /* renamed from: h */
    private final C0034at f16330h;

    /* renamed from: i */
    private final C0034at f16331i;

    public fdn(fcg fcg, bsxn bsxn, fhe fhe) {
        this.f16326d = fhe;
        this.f16323a = fcg;
        this.f16327e = fcg.mo10684c(bsxn);
        this.f16329g = fcg.mo10682b(bsxn);
        this.f16328f = C0052bk.m3245b(this.f16327e, new fdf(fcg));
        this.f16330h = fcg.f16263a.mo10456d();
        this.f16331i = fcg.f16263a.mo10445a();
        C0036av avVar = new C0036av();
        this.f16324b = avVar;
        avVar.mo2450b(new epm(1));
        this.f16324b.mo2667a(this.f16329g, new fdg(this));
        this.f16324b.mo2667a(this.f16327e, new fdh(this));
        this.f16324b.mo2667a(this.f16328f, new fdi(this));
        this.f16324b.mo2667a(this.f16330h, new fdj(this));
        this.f16324b.mo2667a(this.f16331i, new fdk(this));
    }

    /* renamed from: a */
    public final void mo10734a() {
        this.f16324b.mo2666a(this.f16329g);
        this.f16324b.mo2666a(this.f16327e);
        this.f16324b.mo2666a(this.f16328f);
        this.f16324b.mo2666a(this.f16330h);
        this.f16324b.mo2666a(this.f16331i);
    }

    /* renamed from: b */
    public final void mo10735b() {
        epm epm = new epm(4);
        mo10734a();
        this.f16324b.mo2450b(epm);
    }

    /* renamed from: c */
    public final epm mo10736c() {
        return (epm) this.f16324b.mo2448b();
    }

    /* renamed from: d */
    public final bsxn mo10737d() {
        return epr.m10938j(((epq) this.f16327e.mo2448b()).mo10395b());
    }

    /* renamed from: e */
    public final void mo10738e() {
        bswt bswt;
        bswt bswt2;
        if (this.f16329g.mo2448b() != null && this.f16327e.mo2448b() != null && this.f16328f.mo2448b() != null && this.f16330h.mo2448b() != null && this.f16331i.mo2448b() != null) {
            int i = Build.VERSION.SDK_INT;
            if (((eps) this.f16329g.mo2448b()).f15499c != null) {
                mo10735b();
            } else if (((Boolean) this.f16331i.mo2448b()).booleanValue()) {
                epq epq = (epq) this.f16327e.mo2448b();
                if (epq.mo10394a()) {
                    this.f16324b.mo2450b(new epm(2));
                } else if (mo10736c().f15487c != 4) {
                    Resources resources = rpr.m34216b().getResources();
                    Configuration configuration = resources.getConfiguration();
                    int a = evi.m11170a(configuration.screenWidthDp, rpr.m34216b());
                    int a2 = evi.m11170a(configuration.screenHeightDp, rpr.m34216b());
                    if (configuration.orientation == 2 || a > resources.getDimensionPixelSize(C0126R.dimen.as_ob_max_display_width) || a2 > resources.getDimensionPixelSize(C0126R.dimen.as_ob_max_display_height)) {
                        mo10735b();
                    } else if (epr.m10938j(epq.mo10395b()) == null) {
                        mo10735b();
                    } else if (((Boolean) this.f16330h.mo2448b()).booleanValue()) {
                        epq epq2 = (epq) this.f16328f.mo2448b();
                        if (epq2.mo10394a()) {
                            this.f16324b.mo2450b(new epm(2));
                            return;
                        }
                        bsxk bsxk = epq2.f15491a;
                        if (bsxk.f147581b == 11) {
                            bswt = (bswt) bsxk.f147582c;
                        } else {
                            bswt = bswt.f147489f;
                        }
                        this.f16325c = bswt;
                        if (epq2.f15491a.f147581b != 11 || (bswt2 = this.f16325c) == null || (bswt2.f147491a & 1) == 0 || this.f16323a.f16263a.mo10457e().contains(Long.valueOf(this.f16325c.f147492b)) || this.f16325c.f147494d.isEmpty()) {
                            mo10735b();
                            return;
                        }
                        mo10734a();
                        this.f16324b.mo2450b(new epm(2));
                        this.f16326d.f16601a.add(new JsonObjectRequest(0, this.f16325c.f147494d, null, new fdl(this), new fdm(this)));
                    }
                }
            }
        }
    }
}
