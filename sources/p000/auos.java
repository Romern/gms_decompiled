package p000;

import com.google.android.gms.trustagent.common.trustlet.AbstractOneTimeAuthTrustletService$1;

/* renamed from: auos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auos implements bqfp {

    /* renamed from: a */
    final /* synthetic */ AbstractOneTimeAuthTrustletService$1 f92212a;

    public auos(AbstractOneTimeAuthTrustletService$1 abstractOneTimeAuthTrustletService$1) {
        this.f92212a = abstractOneTimeAuthTrustletService$1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            auot auot = this.f92212a.f109157a;
            boolean booleanValue = bool.booleanValue();
            aunx aunx = auot.f92213a;
            if (!booleanValue) {
                synchronized (auot.f92214b) {
                    auot.mo50758m(auot.mo50746a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        auot.f92213a.mo50710a("Failed to read isUserPresent", th, new Object[0]).mo50709d();
    }
}
