package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: anso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anso implements rkl {

    /* renamed from: a */
    final /* synthetic */ ansp f77594a;

    public anso(ansp ansp) {
        this.f77594a = ansp;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        alkw alkw = (alkw) rkk;
        ansp ansp = this.f77594a;
        Status bo = alkw.mo7183bo();
        amev b = alkw.mo40471b();
        if (bo.mo17710c()) {
            ansp.f77603g = null;
            try {
                if (b.mo24660a() > 0) {
                    ansp.f77603g = b.mo24661a(0).mo41056c();
                }
                b.mo12460c();
                ansp.f77608l = true;
                ansp.mo42190d();
            } catch (Throwable th) {
                b.mo12460c();
                throw th;
            }
        }
    }
}
