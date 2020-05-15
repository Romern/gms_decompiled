package p000;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: armn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class armn implements armm {

    /* renamed from: a */
    public static final Logger f87910a = ascp.m73787a("D2D", "Metrics", "TargetApiLogManager");

    /* renamed from: b */
    public final Context f87911b;

    /* renamed from: c */
    public final AtomicBoolean f87912c = new AtomicBoolean(false);

    /* renamed from: d */
    public final armo f87913d;

    /* renamed from: e */
    public final arms f87914e;

    /* renamed from: f */
    public armg f87915f;

    /* renamed from: g */
    public armp f87916g;

    /* renamed from: h */
    public armt f87917h;

    /* renamed from: i */
    public armq f87918i;

    /* renamed from: j */
    public armr f87919j;

    /* renamed from: k */
    public final bxvd f87920k;

    /* renamed from: l */
    public final bxvd f87921l = boup.f134948e.mo74144da();

    /* renamed from: m */
    public final bxvd f87922m = bovc.f134986j.mo74144da();

    /* renamed from: n */
    public final bxvd f87923n;

    /* renamed from: o */
    private final qws f87924o;

    public armn(Context context) {
        qws qws = new qws(context, "SMART_SETUP", null);
        bmxy.m108581a(context);
        this.f87911b = context.getApplicationContext();
        this.f87924o = qws;
        armg armg = new armg();
        this.f87915f = armg;
        armf b = armg.mo48640b();
        this.f87920k = bouk.f134931h.mo74144da();
        this.f87916g = new armp(boul.f134940e.mo74144da());
        this.f87913d = new armo();
        this.f87917h = new armt(b.f87890a);
        this.f87914e = new arms(this.f87911b);
        this.f87923n = bowe.f135103h.mo74144da();
        this.f87918i = new armq(this.f87915f);
        this.f87919j = new armr();
    }

    /* renamed from: a */
    public final void mo48657a() {
        if (this.f87912c.compareAndSet(false, true)) {
            f87910a.logVerbose("Sending Target API logs with Clearcut.", new Object[0]);
            this.f87916g.mo48672a();
            armf b = this.f87915f.mo48640b();
            bxvd da = bowf.f135112j.mo74144da();
            bxvd bxvd = this.f87920k;
            boue a = this.f87913d.mo48670a();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bouk bouk = (bouk) bxvd.f164949b;
            bouk bouk2 = bouk.f134931h;
            a.getClass();
            bouk.f134935c = a;
            bouk.f134933a |= 2;
            bxvd bxvd2 = this.f87923n;
            bxvd bxvd3 = b.f87892b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bowe bowe = (bowe) bxvd2.f164949b;
            bowd bowd = (bowd) bxvd3.mo74062i();
            bowe bowe2 = bowe.f135103h;
            bowd.getClass();
            bowe.f135109e = bowd;
            bowe.f135105a |= 8;
            bxvd bxvd4 = this.f87923n;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowf bowf = (bowf) da.f164949b;
            bowe bowe3 = (bowe) bxvd4.mo74062i();
            bowe3.getClass();
            bowf.f135120g = bowe3;
            bowf.f135114a |= 32;
            bxvd bxvd5 = this.f87920k;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowf bowf2 = (bowf) da.f164949b;
            bouk bouk3 = (bouk) bxvd5.mo74062i();
            bouk3.getClass();
            bowf2.f135116c = bouk3;
            bowf2.f135114a |= 2;
            boul a2 = this.f87916g.mo48672a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowf bowf3 = (bowf) da.f164949b;
            a2.getClass();
            bowf3.f135115b = a2;
            bowf3.f135114a = 1 | bowf3.f135114a;
            List asList = Arrays.asList(b.mo48638a());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowf bowf4 = (bowf) da.f164949b;
            if (!bowf4.f135121h.mo73666a()) {
                bowf4.f135121h = GeneratedMessageLite.m124021a(bowf4.f135121h);
            }
            bxsy.m123078a(asList, bowf4.f135121h);
            bxvd bxvd6 = b.f87890a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowf bowf5 = (bowf) da.f164949b;
            bovb bovb = (bovb) bxvd6.mo74062i();
            bovb.getClass();
            bowf5.f135117d = bovb;
            bowf5.f135114a |= 4;
            bxvd bxvd7 = this.f87921l;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowf bowf6 = (bowf) da.f164949b;
            boup boup = (boup) bxvd7.mo74062i();
            boup.getClass();
            bowf6.f135119f = boup;
            bowf6.f135114a |= 16;
            bouw a3 = this.f87914e.mo48675a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowf bowf7 = (bowf) da.f164949b;
            a3.getClass();
            bowf7.f135118e = a3;
            bowf7.f135114a |= 8;
            bowi bowi = (bowi) this.f87919j.f87930b.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowf bowf8 = (bowf) da.f164949b;
            bowi.getClass();
            bowf8.f135122i = bowi;
            bowf8.f135114a |= 64;
            bxvd bxvd8 = this.f87922m;
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            bovc bovc = (bovc) bxvd8.f164949b;
            bowf bowf9 = (bowf) da.mo74062i();
            bovc bovc2 = bovc.f134986j;
            bowf9.getClass();
            bovc.f134992e = bowf9;
            bovc.f134988a |= 8;
            bovc bovc3 = (bovc) this.f87922m.mo74062i();
            f87910a.logVerbose(bovc3.toString(), new Object[0]);
            this.f87924o.mo24335a(bovc3.serializeToBytes()).mo24327b();
            return;
        }
        f87910a.mo25416d("Logs already sent to Clearcut. Ignoring call to log().", new Object[0]);
    }

    /* renamed from: b */
    public final void mo48663b(int i) {
        bxvd bxvd = this.f87921l;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boup boup = (boup) bxvd.f164949b;
        boup boup2 = boup.f134948e;
        boup.f134951b = i - 1;
        boup.f134950a |= 1;
    }

    /* renamed from: c */
    public final void mo48666c(int i) {
        bxvd bxvd = this.f87920k;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bouk bouk = (bouk) bxvd.f164949b;
        bouk bouk2 = bouk.f134931h;
        bouk.f134934b = i - 1;
        bouk.f134933a |= 1;
    }

    /* renamed from: d */
    public final void mo48667d(int i) {
        bxvd bxvd = this.f87920k;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bouk bouk = (bouk) bxvd.f164949b;
        bouk bouk2 = bouk.f134931h;
        bouk.f134936d = i - 1;
        bouk.f134933a |= 4;
    }

    /* renamed from: e */
    public final void mo48668e(int i) {
        bxvd bxvd = this.f87921l;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boup boup = (boup) bxvd.f164949b;
        int i2 = i - 1;
        boup boup2 = boup.f134948e;
        if (i != 0) {
            boup.f134953d = i2;
            boup.f134950a |= 4;
            return;
        }
        throw null;
    }

    /* renamed from: f */
    public final void mo48669f(int i) {
        bxvd bxvd = this.f87920k;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bouk bouk = (bouk) bxvd.f164949b;
        bouk bouk2 = bouk.f134931h;
        bouk.f134938f = i - 1;
        bouk.f134933a |= 16;
    }

    /* renamed from: b */
    public final void mo48664b(long j) {
        this.f87917h.mo48677a(j);
    }

    /* renamed from: b */
    public final void mo48665b(boolean z) {
        this.f87916g.mo48674a(z);
    }

    /* renamed from: a */
    public final void mo48658a(int i) {
        this.f87916g.mo48673a(i);
    }

    /* renamed from: a */
    public final void mo48659a(long j) {
        bxvd bxvd = this.f87922m;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bovc bovc = (bovc) bxvd.f164949b;
        bovc bovc2 = bovc.f134986j;
        bovc.f134988a |= 1;
        bovc.f134989b = j;
    }

    /* renamed from: a */
    public final void mo48660a(boui boui) {
        bxvd bxvd = this.f87920k;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bouk bouk = (bouk) bxvd.f164949b;
        bouk bouk2 = bouk.f134931h;
        bouk.f134937e = boui.f134929d;
        bouk.f134933a |= 8;
    }

    /* renamed from: a */
    public final void mo48661a(String str, boolean z, boolean z2) {
        this.f87913d.mo48671a(str, z, z2);
    }

    /* renamed from: a */
    public final void mo48662a(boolean z) {
        bxvd bxvd = this.f87921l;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boup boup = (boup) bxvd.f164949b;
        boup boup2 = boup.f134948e;
        boup.f134950a |= 2;
        boup.f134952c = z;
    }
}
