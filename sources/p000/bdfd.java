package p000;

import android.app.Application;

/* renamed from: bdfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdfd {

    /* renamed from: a */
    public static volatile bdfd f105427a;

    /* renamed from: b */
    final bdff f105428b = new bdff();

    private bdfd() {
    }

    /* renamed from: a */
    public static bdfd m90662a(Application application) {
        if (f105427a == null) {
            synchronized (bdfd.class) {
                if (f105427a == null) {
                    bdfd bdfd = new bdfd();
                    bdff bdff = bdfd.f105428b;
                    application.registerActivityLifecycleCallbacks(bdff.f105440b);
                    application.registerComponentCallbacks(bdff.f105440b);
                    f105427a = bdfd;
                }
            }
        }
        return f105427a;
    }

    /* renamed from: b */
    public final void mo57956b(bdfc bdfc) {
        bdff bdff = this.f105428b;
        bmxy.m108581a(bdfc);
        bdff.f105440b.f105429a.remove(bdfc);
    }

    /* renamed from: a */
    public final void mo57955a(bdfc bdfc) {
        bdff bdff = this.f105428b;
        bmxy.m108581a(bdfc);
        bdff.f105440b.f105429a.add(bdfc);
    }
}
