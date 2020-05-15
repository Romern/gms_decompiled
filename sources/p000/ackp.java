package p000;

import java.util.concurrent.Executor;

/* renamed from: ackp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ackp {

    /* renamed from: a */
    private final cayo f60035a;

    /* renamed from: b */
    private final cayo f60036b;

    /* renamed from: c */
    private final cayo f60037c;

    /* renamed from: d */
    private final cayo f60038d;

    /* renamed from: e */
    private final cayo f60039e;

    /* renamed from: f */
    private final cayo f60040f;

    /* renamed from: g */
    private final cayo f60041g;

    public ackp(cayo cayo, cayo cayo2, cayo cayo3, cayo cayo4, cayo cayo5, cayo cayo6, cayo cayo7) {
        this.f60036b = cayo;
        this.f60037c = cayo2;
        this.f60035a = cayo3;
        this.f60038d = cayo4;
        this.f60039e = cayo5;
        this.f60040f = cayo6;
        this.f60041g = cayo7;
    }

    /* renamed from: a */
    public final void mo32826a() {
        if (((babr) this.f60035a.mo16713a()).mo32672D()) {
            ((Executor) this.f60036b.mo16713a()).execute(new acko(this));
        } else {
            mo32827b();
        }
    }

    /* renamed from: b */
    public final void mo32827b() {
        try {
            ((bamc) this.f60039e.mo16713a()).mo32788a(((Long) abzv.f59022i.mo58455c()).longValue(), ((Long) abzv.f59023j.mo58455c()).longValue(), 2, ((Boolean) abzv.f59024k.mo58455c()).booleanValue(), false);
            ((bamc) this.f60038d.mo16713a()).mo32788a(cemd.f182957a.mo6606a().mo79336p(), cemd.f182957a.mo6606a().mo79330j(), 3, cemd.f182957a.mo6606a().mo79337q(), false);
            ((bamc) this.f60040f.mo16713a()).mo32788a(((Long) abzv.f59034u.mo58455c()).longValue(), ((Long) abzv.f59035v.mo58455c()).longValue(), 3, ((Boolean) abzv.f59036w.mo58455c()).booleanValue(), false);
            ((bamc) this.f60041g.mo16713a()).mo32788a(((Long) abzv.f59037x.mo58455c()).longValue(), ((Long) abzv.f59038y.mo58455c()).longValue(), 3, ((Boolean) abzv.f59039z.mo58455c()).booleanValue(), true);
        } catch (RuntimeException e) {
            ((acdc) this.f60037c.mo16713a()).mo32707a("Failed to schedule tasks due to unexpected RuntimeException in MDH.", e);
        }
    }
}
