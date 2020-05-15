package p000;

import java.util.concurrent.CancellationException;

/* renamed from: aqyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqyc implements bqfp {

    /* renamed from: a */
    final /* synthetic */ aqyf f87069a;

    public aqyc(aqyf aqyf) {
        this.f87069a = aqyf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        aqyf aqyf = this.f87069a;
        aqyf.f87075d = (arhp) obj;
        aqyf.f87074c = null;
        aqyf.mo48257d();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Error establishing encrypted connection: ");
            sb.append(valueOf);
            String sb2 = sb.toString();
            aqyf.f87072a.mo25417e(sb2, th, new Object[0]);
            this.f87069a.mo48244a(10577, sb2);
            this.f87069a.mo48242a();
        }
    }
}
