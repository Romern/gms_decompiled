package p000;

import android.content.IntentSender;

/* renamed from: lnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lnn implements bqfp {

    /* renamed from: a */
    final /* synthetic */ lno f26455a;

    public lnn(lno lno) {
        this.f26455a = lno;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        lib lib = (lib) obj;
        if (lib == null || lib.mo15149b() != 0) {
            this.f26455a.mo15295h();
        } else {
            this.f26455a.mo15294a(lib.mo15148a());
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        try {
            if (th instanceof rki) {
                ((rki) th).mo24808a(this.f26455a.f26159a.getContainerActivity(), 10000);
            } else {
                this.f26455a.mo15295h();
            }
        } catch (IntentSender.SendIntentException e) {
            bnsl bnsl = (bnsl) lno.f26456d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("starting sms retriever onboarding activity failed");
            this.f26455a.mo15295h();
        }
    }
}
