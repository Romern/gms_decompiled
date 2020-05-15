package p000;

import com.felicanetworks.mfc.AppInfo;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaEventListener;
import com.felicanetworks.mfc.FelicaException;

/* renamed from: brfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brfp implements FelicaEventListener {

    /* renamed from: a */
    final /* synthetic */ Felica f142768a;

    /* renamed from: b */
    final /* synthetic */ brfq f142769b;

    public brfp(brfq brfq, Felica felica) {
        this.f142769b = brfq;
        this.f142768a = felica;
    }

    public final void errorOccurred(int i, String str, AppInfo appInfo) {
        this.f142769b.f142772c.mo69503a(i, str, appInfo);
        this.f142769b.f142772c.mo69506a(this.f142768a);
        brfq brfq = this.f142769b;
        brfq.f142772c.f142819g.execute(new brfo(brfq.f142770a, i, str, appInfo));
        this.f142769b.f142772c.mo69512d(5);
        this.f142769b.f142772c.mo69509c();
    }

    public final void finished() {
        this.f142769b.f142772c.mo69507b(2);
        try {
            this.f142768a.open();
            this.f142768a.select(65024);
            try {
                Object a = this.f142769b.f142770a.mo69520a(this.f142768a);
                this.f142769b.f142772c.mo69506a(this.f142768a);
                brfq brfq = this.f142769b;
                brfq.f142772c.f142819g.execute(new brfm(brfq.f142770a, a));
                this.f142769b.f142772c.mo69515f(4);
                this.f142769b.f142772c.mo69509c();
            } catch (FelicaException e) {
                brfq brfq2 = this.f142769b;
                brfq2.f142772c.f142819g.execute(new brfk(brfq2.f142770a, e));
                this.f142769b.f142772c.mo69512d(6);
                this.f142769b.f142772c.mo69502a(9, e);
                this.f142769b.f142772c.mo69506a(this.f142768a);
                this.f142769b.f142772c.mo69509c();
            } catch (Exception e2) {
                this.f142769b.f142772c.mo69506a(this.f142768a);
                this.f142769b.f142772c.f142818f.mo69532a(brgj.f142813c, "Unexpected exception thrown from onFelicaOpened", e2);
                brfq brfq3 = this.f142769b;
                brfq3.f142772c.f142819g.execute(new brfl(brfq3.f142770a));
                this.f142769b.f142772c.mo69512d(7);
                this.f142769b.f142772c.mo69509c();
            }
        } catch (FelicaException e3) {
            this.f142769b.f142772c.mo69502a(9, e3);
            this.f142769b.f142772c.mo69506a(this.f142768a);
            brfq brfq4 = this.f142769b;
            brfq4.f142772c.f142819g.execute(new brfn(brfq4.f142770a, e3));
            this.f142769b.f142772c.mo69512d(6);
            this.f142769b.f142772c.mo69509c();
        }
    }
}
