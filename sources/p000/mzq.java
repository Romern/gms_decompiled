package p000;

import java.util.concurrent.Callable;

/* renamed from: mzq */
final /* synthetic */ class mzq implements Callable {

    /* renamed from: a */
    private final nab f35056a;

    public mzq(nab nab) {
        this.f35056a = nab;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mbx.a(int, boolean, boolean):void
     arg types: [int, boolean, int]
     candidates:
      mbx.a(mcf, java.lang.String, int):void
      mbx.a(int, int, int):void
      mbx.a(int, int, java.lang.String):void
      mbx.a(int, java.lang.String, boolean):void
      mbx.a(int, msk, int):void
      mbx.a(bxvd, mqj, int):void
      mbx.a(int, boolean, boolean):void */
    public final Object call() {
        nab nab = this.f35056a;
        if (nab.f35089N == 1) {
            nab.f35089N = 5;
        }
        myr myr = nab.f35107n;
        if (myr != null) {
            myr.mo20329b();
            nab.f35117x.mo19832a(2, nab.f35084I, false);
        } else {
            nab.mo20382e();
            nab.f35117x.mo19832a(2, nab.f35084I, false);
        }
        return 0;
    }
}
