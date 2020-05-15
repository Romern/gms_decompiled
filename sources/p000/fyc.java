package p000;

import android.util.Log;

/* renamed from: fyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fyc implements Runnable {

    /* renamed from: a */
    private final Object f17588a;

    /* renamed from: b */
    private final rkb f17589b;

    /* renamed from: c */
    private final fzl f17590c;

    /* renamed from: d */
    private final fxy f17591d;

    /* renamed from: e */
    private final fxa f17592e;

    /* renamed from: f */
    private final String f17593f;

    /* renamed from: g */
    private final boolean f17594g;

    public fyc(Object obj, rkb rkb, fzl fzl, fxy fxy, String str, boolean z, fxa fxa) {
        this.f17588a = obj;
        this.f17589b = rkb;
        this.f17590c = fzl;
        this.f17591d = fxy;
        this.f17593f = str;
        this.f17594g = z;
        this.f17592e = fxa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae A[SYNTHETIC] */
    public final void run() {
        alvi alvi;
        fzl fzl = new fzl();
        if (this.f17589b.mo24802f().mo17671b()) {
            alvk alvk = new alvk();
            alvk.f74381a = this.f17593f;
            alvk.f74383c = "list_by_email_and_phone";
            alvo alvo = new alvo();
            boolean z = this.f17594g;
            alvo.f74399b = z;
            alvo.f74400c = !z;
            int i = 0;
            alvo.f74401d = false;
            alvl a = alvk.mo40811a();
            sdo.m34959a(a);
            alvo.f74398a = a;
            alvp alvp = new alvp(alvo);
            alxb alxb = new alxb(this.f17591d);
            rjo rjo = allr.f73629a;
            rkb rkb = this.f17589b;
            rkk a2 = rkb.mo24787a((rle) new alxn(rkb, alvp, alxb)).mo9455a();
            while (true) {
                alvi = (alvi) a2;
                if (alvi.mo40806d()) {
                    break;
                }
                a2 = alvi.mo40807e().mo9455a();
            }
            if (alvi.mo7183bo() != null && alvi.mo7183bo().mo17710c()) {
                rtp b = alvi.mo40805b();
                if (b != null) {
                    while (i < b.mo24660a()) {
                        try {
                            fzl.mo11561a(((fyb) b.mo24661a(i)).f17586a);
                            i++;
                        } finally {
                            b.mo12460c();
                        }
                    }
                }
                synchronized (this.f17588a) {
                    if (!Thread.interrupted()) {
                        this.f17590c.mo11563a(fzl.f17738a);
                        this.f17588a.notify();
                    }
                }
                fxa fxa = this.f17592e;
                if (fxa != null) {
                    fxa.mo7259i();
                    return;
                }
                return;
            }
        }
        if (Log.isLoggable("IdentityLoader", 5)) {
            Log.w("IdentityLoader", "Identity web people lookup error");
        }
        synchronized (this.f17588a) {
        }
    }
}
