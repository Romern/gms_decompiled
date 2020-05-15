package p000;

import java.util.concurrent.Callable;

/* renamed from: bzsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzsl implements Callable {

    /* renamed from: a */
    final /* synthetic */ bzso f171265a;

    public bzsl(bzso bzso) {
        this.f171265a = bzso;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bzst bzst;
        bzsb bzsb;
        try {
            bzso bzso = this.f171265a;
            if (bzso.f171270a != null) {
                bzsb = bzso.mo74574a(true);
            } else {
                bzsb = bzso.mo74575b();
            }
            bzst = new bzst(bzsb);
        } catch (bzss e) {
            bzst = new bzst(e);
        } catch (Throwable th) {
            bzst = new bzst(new bzss(bzsr.UNKNOWN, th));
        }
        synchronized (this.f171265a) {
            if (this.f171265a.f171271b != null) {
                if (bzst.mo74578b()) {
                    bzso bzso2 = this.f171265a;
                    bzso2.f171271b.mo19708a(bzso2, bzst.f171296b);
                } else {
                    bzso bzso3 = this.f171265a;
                    bzso3.f171271b.mo19709a(bzso3, bzst.f171295a);
                }
            }
        }
        return bzst;
    }
}
