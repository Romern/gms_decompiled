package p000;

import java.io.InputStream;

/* renamed from: chxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chxm extends chyf {

    /* renamed from: a */
    final /* synthetic */ chxp f189463a;

    /* renamed from: b */
    final /* synthetic */ cidd f189464b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chxm(chxp chxp, cidd cidd) {
        super(chxp.f189471c.f189479e);
        this.f189463a = chxp;
        this.f189464b = cidd;
    }

    /* renamed from: a */
    public final void mo85790a() {
        InputStream a;
        int i = ciix.f190424a;
        if (!this.f189463a.f189470b) {
            while (true) {
                try {
                    a = this.f189464b.mo85976a();
                    if (a != null) {
                        chxp chxp = this.f189463a;
                        chxp.f189469a.mo25571a(chxp.f189471c.f189476b.f189153e.mo12899a(a));
                        a.close();
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    ciag.m149913a(this.f189464b);
                    chuv a2 = chuv.f189216c.mo85692c(th).mo85687a("Failed to read message.");
                    this.f189463a.f189471c.f189480f.mo85764b(a2);
                    this.f189463a.mo85795a(a2, new chtr());
                    return;
                }
            }
        } else {
            ciag.m149913a(this.f189464b);
        }
    }
}
