package p000;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: armh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class armh implements armk {

    /* renamed from: a */
    public static final sek f87895a = ascp.m73787a("D2D", "Metrics", "SourceApiLogManager");

    /* renamed from: b */
    public final Context f87896b;

    /* renamed from: c */
    public final armg f87897c;

    /* renamed from: d */
    public final arms f87898d;

    /* renamed from: e */
    public final bxvd f87899e = bove.f135002g.mo74144da();

    /* renamed from: f */
    public final bxvd f87900f;

    /* renamed from: g */
    public final bxvd f87901g = bovc.f134986j.mo74144da();

    /* renamed from: h */
    private final qws f87902h;

    /* renamed from: i */
    private final AtomicBoolean f87903i = new AtomicBoolean(false);

    /* renamed from: j */
    private final armp f87904j;

    /* renamed from: k */
    private final armo f87905k;

    /* renamed from: l */
    private final armt f87906l;

    /* renamed from: m */
    private final bxvd f87907m;

    /* renamed from: n */
    private final bxvd f87908n = boup.f134948e.mo74144da();

    /* renamed from: o */
    private final bxvd f87909o = bovf.f135010i.mo74144da();

    public armh(Context context) {
        qws qws = new qws(context, "SMART_SETUP", null);
        bmxy.m108581a(context);
        this.f87896b = context.getApplicationContext();
        this.f87902h = qws;
        this.f87897c = new armg();
        this.f87904j = new armp(boul.f134940e.mo74144da());
        this.f87907m = bouk.f134931h.mo74144da();
        this.f87905k = new armo();
        this.f87906l = new armt(bovb.f134982c.mo74144da());
        this.f87898d = new arms(this.f87896b);
        this.f87900f = bovd.f134997d.mo74144da();
    }

    /* renamed from: a */
    public final void mo48641a() {
        if (this.f87903i.compareAndSet(false, true)) {
            f87895a.mo25409a("Sending Source API logs with Clearcut.", new Object[0]);
            bxvd bxvd = this.f87907m;
            boue a = this.f87905k.mo48670a();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bouk bouk = (bouk) bxvd.f164949b;
            bouk bouk2 = bouk.f134931h;
            a.getClass();
            bouk.f134935c = a;
            bouk.f134933a |= 2;
            arme a2 = this.f87897c.mo48639a();
            bxvd bxvd2 = this.f87909o;
            bxvd bxvd3 = this.f87907m;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bovf bovf = (bovf) bxvd2.f164949b;
            bouk bouk3 = (bouk) bxvd3.mo74062i();
            bovf bovf2 = bovf.f135010i;
            bouk3.getClass();
            bovf.f135014c = bouk3;
            bovf.f135012a |= 2;
            bxvd bxvd4 = this.f87909o;
            bxvd bxvd5 = this.f87908n;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bovf bovf3 = (bovf) bxvd4.f164949b;
            boup boup = (boup) bxvd5.mo74062i();
            boup.getClass();
            bovf3.f135017f = boup;
            bovf3.f135012a |= 16;
            bxvd bxvd6 = this.f87909o;
            boul a3 = this.f87904j.mo48672a();
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            bovf bovf4 = (bovf) bxvd6.f164949b;
            a3.getClass();
            bovf4.f135013b = a3;
            bovf4.f135012a = 1 | bovf4.f135012a;
            bxvd bxvd7 = this.f87909o;
            if (bxvd7.f164950c) {
                bxvd7.mo74035c();
                bxvd7.f164950c = false;
            }
            ((bovf) bxvd7.f164949b).f135019h = bxvk.m124030de();
            List asList = Arrays.asList(a2.mo48638a());
            if (bxvd7.f164950c) {
                bxvd7.mo74035c();
                bxvd7.f164950c = false;
            }
            bovf bovf5 = (bovf) bxvd7.f164949b;
            if (!bovf5.f135019h.mo73666a()) {
                bovf5.f135019h = bxvk.m124021a(bovf5.f135019h);
            }
            bxsy.m123078a(asList, bovf5.f135019h);
            bxvd bxvd8 = this.f87909o;
            bxvd bxvd9 = a2.f87890a;
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            bovf bovf6 = (bovf) bxvd8.f164949b;
            bovb bovb = (bovb) bxvd9.mo74062i();
            bovb.getClass();
            bovf6.f135015d = bovb;
            bovf6.f135012a |= 4;
            bxvd bxvd10 = this.f87899e;
            bxvd bxvd11 = this.f87900f;
            if (bxvd10.f164950c) {
                bxvd10.mo74035c();
                bxvd10.f164950c = false;
            }
            bove bove = (bove) bxvd10.f164949b;
            bovd bovd = (bovd) bxvd11.mo74062i();
            bove bove2 = bove.f135002g;
            bovd.getClass();
            bove.f135008e = bovd;
            bove.f135004a |= 8;
            bxvd bxvd12 = this.f87909o;
            bxvd bxvd13 = this.f87899e;
            if (bxvd12.f164950c) {
                bxvd12.mo74035c();
                bxvd12.f164950c = false;
            }
            bovf bovf7 = (bovf) bxvd12.f164949b;
            bove bove3 = (bove) bxvd13.mo74062i();
            bove3.getClass();
            bovf7.f135018g = bove3;
            bovf7.f135012a |= 32;
            bxvd bxvd14 = this.f87909o;
            bouw a4 = this.f87898d.mo48675a();
            if (bxvd14.f164950c) {
                bxvd14.mo74035c();
                bxvd14.f164950c = false;
            }
            bovf bovf8 = (bovf) bxvd14.f164949b;
            a4.getClass();
            bovf8.f135016e = a4;
            bovf8.f135012a |= 8;
            bxvd bxvd15 = this.f87901g;
            bxvd bxvd16 = this.f87909o;
            if (bxvd15.f164950c) {
                bxvd15.mo74035c();
                bxvd15.f164950c = false;
            }
            bovc bovc = (bovc) bxvd15.f164949b;
            bovf bovf9 = (bovf) bxvd16.mo74062i();
            bovc bovc2 = bovc.f134986j;
            bovf9.getClass();
            bovc.f134991d = bovf9;
            bovc.f134988a |= 4;
            bovc bovc3 = (bovc) this.f87901g.mo74062i();
            f87895a.mo25409a(bovc3.toString(), new Object[0]);
            this.f87902h.mo24335a(bovc3.mo73642k()).mo24327b();
            return;
        }
        f87895a.mo25416d("Logs already sent to Clearcut. Ignoring call to log().", new Object[0]);
    }

    /* renamed from: b */
    public final void mo48647b(int i) {
        this.f87904j.mo48673a(i);
    }

    /* renamed from: c */
    public final void mo48650c(int i) {
        bxvd bxvd = this.f87899e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bove bove = (bove) bxvd.f164949b;
        bove bove2 = bove.f135002g;
        bove.f135004a |= 1;
        bove.f135005b = i;
    }

    /* renamed from: d */
    public final void mo48651d(int i) {
        bxvd bxvd = this.f87908n;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boup boup = (boup) bxvd.f164949b;
        boup boup2 = boup.f134948e;
        boup.f134951b = i - 1;
        boup.f134950a |= 1;
    }

    /* renamed from: e */
    public final void mo48652e(int i) {
        bxvd bxvd = this.f87907m;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bouk bouk = (bouk) bxvd.f164949b;
        bouk bouk2 = bouk.f134931h;
        bouk.f134934b = i - 1;
        bouk.f134933a |= 1;
    }

    /* renamed from: f */
    public final void mo48653f(int i) {
        bxvd bxvd = this.f87907m;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bouk bouk = (bouk) bxvd.f164949b;
        bouk bouk2 = bouk.f134931h;
        bouk.f134936d = i - 1;
        bouk.f134933a |= 4;
    }

    /* renamed from: g */
    public final void mo48654g(int i) {
        bxvd bxvd = this.f87908n;
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

    /* renamed from: b */
    public final void mo48648b(long j) {
        this.f87906l.mo48677a(j);
    }

    /* renamed from: b */
    public final void mo48649b(boolean z) {
        this.f87904j.mo48674a(z);
    }

    /* renamed from: a */
    public final void mo48642a(int i) {
        bxvd bxvd = this.f87899e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bove bove = (bove) bxvd.f164949b;
        bove bove2 = bove.f135002g;
        bove.f135004a |= 16;
        bove.f135009f = i;
    }

    /* renamed from: a */
    public final void mo48643a(long j) {
        bxvd bxvd = this.f87901g;
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
    public final void mo48644a(boui boui) {
        bxvd bxvd = this.f87907m;
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
    public final void mo48645a(String str, boolean z, boolean z2) {
        this.f87905k.mo48671a(str, z, z2);
    }

    /* renamed from: a */
    public final void mo48646a(boolean z) {
        bxvd bxvd = this.f87908n;
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
