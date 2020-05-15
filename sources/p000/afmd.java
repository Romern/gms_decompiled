package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: afmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afmd extends rpf {

    /* renamed from: a */
    final /* synthetic */ afmj f64367a;

    /* renamed from: c */
    final /* synthetic */ afmp f64368c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afmd(afmp afmp, rob rob, afmj afmj) {
        super(rob);
        this.f64368c = afmp;
        this.f64367a = afmj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24972a(rjd rjd, aucf aucf) {
        afmt afmt;
        afns afns = (afns) rjd;
        aucf aucf2 = new aucf();
        aucf2.f91388a.mo50371a((aubq) new afmc(aucf));
        afmj afmj = this.f64367a;
        synchronized (afmj.f64379b.f64401i) {
            try {
                afmt = afmj.f64380c;
                afmj.f64380c = null;
            } catch (Throwable th) {
                afmj.f64380c = null;
                throw th;
            }
        }
        if (afmt != null) {
            afnf n = afns.mo34974n();
            afme afme = new afme(aucf2);
            afmp afmp = this.f64368c;
            n.mo32819a(afme, afmp.f64397e, afmp.f64398f, afmp.f64399g, afmt);
            return;
        }
        aucf.mo50390a((Exception) new rjp(new Status(13, "No listener registered")));
    }
}
