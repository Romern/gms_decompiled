package p000;

import android.content.Context;
import com.google.android.gms.ads.consent.C0237a;
import com.google.android.gms.ads.consent.C0238b;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.request.NonagonRequestParcel;
import com.google.android.gms.ads.internal.social.C0592a;
import com.google.android.gms.ads.internal.spamsignals.C0593a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.C0747a;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0792aa;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0808aq;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0824f;
import com.google.android.gms.ads.nonagon.util.concurrent.C0849b;
import com.google.android.gms.ads.nonagon.util.concurrent.C0852e;
import com.google.android.gms.ads.nonagon.util.concurrent.C0853f;

/* renamed from: fii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fii implements C0747a {

    /* renamed from: q */
    private static fii f16638q;

    /* renamed from: a */
    public final fhu f16639a;

    /* renamed from: b */
    public cijl f16640b;

    /* renamed from: c */
    public cijl f16641c;

    /* renamed from: d */
    public cijl f16642d;

    /* renamed from: e */
    public cijl f16643e;

    /* renamed from: f */
    public cijl f16644f;

    /* renamed from: g */
    public cijl f16645g;

    /* renamed from: h */
    public cijl f16646h;

    /* renamed from: i */
    public cijl f16647i;

    /* renamed from: j */
    public cijl f16648j;

    /* renamed from: k */
    public cijl f16649k;

    /* renamed from: l */
    public cijl f16650l;

    /* renamed from: m */
    public cijl f16651m;

    /* renamed from: n */
    public cijl f16652n;

    /* renamed from: o */
    public cijl f16653o;

    /* renamed from: p */
    public cijl f16654p;

    /* renamed from: r */
    private cijl f16655r;

    /* renamed from: s */
    private cijl f16656s;

    /* renamed from: t */
    private cijl f16657t;

    public fii() {
    }

    /* renamed from: a */
    public static fii m11748a(Context context) {
        fii fii;
        Context context2;
        synchronized (fii.class) {
            Context applicationContext = context.getApplicationContext();
            if (f16638q == null) {
                fhq fhq = new fhq();
                fht fht = new fht();
                if (applicationContext.getApplicationContext() != null) {
                    context2 = applicationContext.getApplicationContext();
                } else {
                    context2 = applicationContext;
                }
                fht.f16616a = context2;
                fhu fhu = new fhu(fht);
                cazf.m127594a(fhu);
                fhq.f16611a = fhu;
                cazf.m127595a(fhq.f16611a, fhu.class);
                f16638q = new fii(fhq.f16611a);
                C0371o.m5339a(applicationContext);
                C0387d.m5366d().mo6782a(applicationContext, VersionInfoParcel.m5635a());
            }
            fii = f16638q;
        }
        return fii;
    }

    /* renamed from: b */
    public final C0593a mo10848b() {
        return fie.m11742a(fia.m11732a(this.f16639a));
    }

    /* renamed from: c */
    public final C0237a mo10849c() {
        return (C0237a) this.f16656s.mo6445a();
    }

    public fii(fhu fhu) {
        this.f16639a = fhu;
        this.f16640b = cayx.m127579a(C0849b.f9354a);
        this.f16641c = cayx.m127579a(new fhz());
        this.f16642d = new fia(fhu);
        cijl a = cayx.m127579a(C0853f.f9356a);
        this.f16655r = a;
        this.f16643e = cayx.m127579a(new C0852e(a));
        this.f16644f = cazj.m127604a(new fhv(this.f16642d));
        fib fib = new fib(this.f16642d);
        this.f16645g = fib;
        this.f16656s = cazj.m127604a(new C0238b(this.f16642d, this.f16643e, this.f16644f, fib));
        this.f16657t = new fih();
        this.f16646h = cayx.m127579a(new fig(fhu));
        this.f16647i = cayx.m127579a(new C0792aa(this.f16642d));
        this.f16648j = new fie(this.f16642d);
        this.f16649k = new fhw();
        this.f16650l = new fhx();
        this.f16651m = new fhy();
        this.f16652n = new fic(this.f16642d);
        this.f16653o = new fid();
        this.f16654p = new fif();
    }

    /* renamed from: a */
    public final C0592a mo10847a() {
        return fib.m11735a(fia.m11732a(this.f16639a));
    }

    /* renamed from: a */
    public final C0824f mo7041a(NonagonRequestParcel nonagonRequestParcel, int i) {
        C0808aq aqVar = new C0808aq(nonagonRequestParcel, i);
        cazf.m127594a(aqVar);
        return new C0824f(this, aqVar);
    }
}
