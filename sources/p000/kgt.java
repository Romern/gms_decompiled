package p000;

import com.google.android.gms.autofill.data.Credential;
import java.util.concurrent.Executor;

/* renamed from: kgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kgt implements cazw {

    /* renamed from: a */
    public final cazn f24095a;

    /* renamed from: b */
    private final cijl f24096b;

    /* renamed from: c */
    private final cijl f24097c;

    /* renamed from: d */
    private final cijl f24098d;

    /* renamed from: e */
    private final cijl f24099e;

    /* renamed from: f */
    private final cijl f24100f;

    /* renamed from: g */
    private final cazn f24101g;

    /* renamed from: h */
    private final cazn f24102h;

    /* renamed from: i */
    private final cijl f24103i;

    /* renamed from: j */
    private final cazn f24104j;

    /* renamed from: k */
    private final cazn f24105k;

    /* renamed from: l */
    private final cazn f24106l;

    public kgt(kgu kgu, Executor executor, Credential credential) {
        cayy a = cayz.m127582a(executor);
        this.f24096b = a;
        this.f24097c = cayx.m127579a(a);
        cayy a2 = cayz.m127582a(this);
        this.f24098d = a2;
        this.f24099e = cayx.m127579a(new kga(a2, cazi.f176444a));
        cayy a3 = cayz.m127582a(credential);
        this.f24100f = a3;
        cazn a4 = cbac.m127645a(a3);
        this.f24101g = a4;
        this.f24102h = new kge(this.f24097c, this.f24099e, a4);
        kgs kgs = new kgs(kgu);
        this.f24103i = kgs;
        cazn a5 = cbac.m127645a(kgs);
        this.f24104j = a5;
        kgg kgg = new kgg(this.f24097c, this.f24099e, this.f24102h, a5);
        this.f24105k = kgg;
        kgf kgf = new kgf(this.f24097c, this.f24099e, kgg, this.f24102h);
        this.f24106l = kgf;
        this.f24095a = cbac.m127644a(kgf, this);
    }

    /* renamed from: a */
    public final void mo14461a(boolean z) {
        cbac.m127646a(this.f24106l, z);
        cbac.m127646a(this.f24105k, z);
        cbac.m127646a(this.f24104j, z);
        cbac.m127646a(this.f24102h, z);
        cbac.m127646a(this.f24101g, z);
    }
}
