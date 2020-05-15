package p000;

import android.accounts.Account;
import java.util.Iterator;

/* renamed from: aczi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aczi implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bnhe f61137a;

    /* renamed from: b */
    final /* synthetic */ aczl f61138b;

    public aczi(aczl aczl, bnhe bnhe) {
        this.f61138b = aczl;
        this.f61137a = bnhe;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        alky alky = (alky) obj;
        amey b = alky.mo12459b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                alzr alzr = (alzr) it.next();
                if (this.f61137a.containsKey(alzr.mo41063c())) {
                    String c = alzr.mo41063c();
                    String d = alzr.mo41064d();
                    aczd aczd = (aczd) this.f61138b.f61153e.get((Account) this.f61137a.get(c));
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
        aczl.f61150a.mo25417e("Failed to load owner", th, new Object[0]);
    }
}
