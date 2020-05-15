package p000;

import android.accounts.Account;
import java.util.Iterator;

/* renamed from: acyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acyy implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bnhe f61098a;

    /* renamed from: b */
    final /* synthetic */ acza f61099b;

    public acyy(acza acza, bnhe bnhe) {
        this.f61099b = acza;
        this.f61098a = bnhe;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        alky alky = (alky) obj;
        amey b = alky.mo12459b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                alzr alzr = (alzr) it.next();
                if (this.f61098a.containsKey(alzr.mo41063c())) {
                    String c = alzr.mo41063c();
                    String d = alzr.mo41064d();
                    aczd aczd = (aczd) this.f61099b.f61105c.get((Account) this.f61098a.get(c));
                    bmxy.m108581a(aczd);
                    aczd.f61130d = d;
                }
            }
            b.mo12460c();
        }
        alky.mo12460c();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        acza.f61102a.mo25417e("Failed to load owner", th, new Object[0]);
    }
}
