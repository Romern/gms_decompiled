package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: bgqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgqm extends shl implements bgpw {

    /* renamed from: l */
    public static final /* synthetic */ int f117287l = 0;

    /* renamed from: a */
    public final aepr f117288a;

    /* renamed from: g */
    public final bmxv f117289g;

    /* renamed from: h */
    public final bgqj f117290h;

    /* renamed from: j */
    public final bgqq f117291j;

    /* renamed from: k */
    public bgqk f117292k;

    /* renamed from: m */
    private final soc f117293m = new soc(10, new LinkedBlockingQueue(4), bgqd.f117267a);

    /* renamed from: n */
    private final SecureRandom f117294n = new SecureRandom();

    /* renamed from: o */
    private long f117295o;

    /* renamed from: p */
    private long f117296p;

    static {
        srn.m36126a("QuakeGrpcServer", sgj.LOCATION);
    }

    public bgqm(Context context, bmxv bmxv, bgqj bgqj, bgqq bgqq) {
        super(context, cezv.m138514i(), 443, Process.myUid(), 1536);
        this.f117289g = bmxv;
        this.f117290h = bgqj;
        this.f117291j = bgqq;
        mo63102c();
        mo25556a("X-Android-Package", context.getPackageName());
        mo25556a("X-Android-Cert", spn.m35895h(context, context.getPackageName()));
        this.f117288a = new aepr(this);
        cezv.m138514i();
    }

    /* renamed from: a */
    private final void m99761a(bgql bgql) {
        this.f117293m.execute(new bgqi(bgql));
    }

    /* renamed from: d */
    private final ClientContext m99762d() {
        Context context = this.f44453i;
        List d = soz.m35801d(context, context.getPackageName());
        if (d.isEmpty()) {
            return null;
        }
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = this.f44453i.getPackageName();
        clientContext.f30216f = this.f44453i.getPackageName();
        clientContext.f30212b = Process.myUid();
        clientContext.f30214d = (Account) d.get(0);
        clientContext.f30213c = (Account) d.get(0);
        clientContext.mo17806d(cezv.m138512g());
        return clientContext;
    }

    /* renamed from: b */
    public final bxvd mo63101b(bmxv bmxv) {
        bxvd da = buoi.f154527i.mo74144da();
        long j = this.f117296p;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((buoi) da.f164949b).f154529a = j;
        int h = (int) cezv.m138513h();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((buoi) da.f164949b).f154530b = h;
        bxun a = bxzr.m124575a(cezu.m138497r());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((buoi) da.f164949b).f154531c = a;
        bxun a2 = bxzr.m124575a(cezu.m138495p());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((buoi) da.f164949b).f154532d = a2;
        if (cezu.m138492m()) {
            bxun a3 = bxzr.m124575a(bgse.m99839a(this.f44453i));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a3.getClass();
            ((buoi) da.f164949b).f154536h = a3;
        }
        if (bmxv.mo66813a()) {
            bunz bunz = (bunz) bmxv.mo66814b();
            bxvd da2 = buop.f154565e.mo74144da();
            double d = bunz.mo72958d();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((buop) da2.f164949b).f154567a = d;
            double e = bunz.mo72959e();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((buop) da2.f164949b).f154568b = e;
            double f = bunz.mo72960f();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((buop) da2.f164949b).f154569c = f;
            double g = bunz.mo72961g();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((buop) da2.f164949b).f154570d = g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buop buop = (buop) da2.mo74062i();
            buop.getClass();
            ((buoi) da.f164949b).f154533e = buop;
            bxvd da3 = buoh.f154523c.mo74144da();
            float f2 = (float) bunz.mo72962h().f154423k;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((buoh) da3.f164949b).f154525a = f2;
            float f3 = (float) bunz.mo72962h().f154424l;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((buoh) da3.f164949b).f154526b = f3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buoh buoh = (buoh) da3.mo74062i();
            buoh.getClass();
            ((buoi) da.f164949b).f154534f = buoh;
        }
        return da;
    }

    /* renamed from: c */
    public final void mo63102c() {
        this.f117295o = this.f117291j.mo63104a();
        long nextLong = this.f117294n.nextLong();
        this.f117296p = nextLong != Long.MIN_VALUE ? Math.abs(nextLong) : 0;
    }

    /* renamed from: a */
    public final void mo63086a() {
        soc soc = this.f117293m;
        aepr aepr = this.f117288a;
        aepr.getClass();
        soc.execute(new bgqe(aepr));
        this.f117293m.shutdown();
        try {
            this.f117293m.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public final void mo63087a(long j, bmxv bmxv) {
        ClientContext d;
        if (cezv.m138515j() && (d = m99762d()) != null) {
            if (cezv.f183536a.mo6606a().quakeApiClientIdExpireMs() - (this.f117291j.mo63104a() - this.f117295o) <= 0) {
                mo63102c();
            }
            m99761a(new bgqf(this, j, bmxv, this.f117291j.mo63107b(), d));
        }
    }

    /* renamed from: a */
    public final void mo63088a(bgqp bgqp, buof buof, bgqp bgqp2, bmxv bmxv) {
        ClientContext d;
        if (cezv.m138516k() && (d = m99762d()) != null) {
            m99761a(new bgqg(this, bmxv, bgqp2, this.f117291j.mo63107b(), bgqp, buof, d));
        }
    }

    /* renamed from: a */
    public final void mo63089a(bmxv bmxv) {
        ClientContext d;
        if (cezv.f183536a.mo6606a().seismicSendQuakeApiNodeOffline() && (d = m99762d()) != null) {
            m99761a(new bgqh(this, bmxv, this.f117291j.mo63107b(), d));
        }
    }
}
