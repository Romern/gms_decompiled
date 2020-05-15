package p000;

import android.util.Log;

/* renamed from: apkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apkj implements bqfp {

    /* renamed from: a */
    final /* synthetic */ apkk f84602a;

    public apkj(apkk apkk) {
        this.f84602a = apkk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        apkb apkb = (apkb) obj;
        String valueOf = String.valueOf(this.f84602a.f84605c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("nts:reachability:result_success:");
        sb.append(valueOf);
        aech aech = new aech(sb.toString());
        try {
            this.f84602a.mo47364a(apkb);
            this.f84602a.mo47366b();
            aech.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        String valueOf = String.valueOf(this.f84602a.f84605c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("nts:reachability:result_failure:");
        sb.append(valueOf);
        aech aech = new aech(sb.toString());
        try {
            String valueOf2 = String.valueOf(th);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb2.append("Exception in reachability check: ");
            sb2.append(valueOf2);
            Log.e("UriObserver", sb2.toString());
            this.f84602a.mo47366b();
            aech.close();
            return;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
