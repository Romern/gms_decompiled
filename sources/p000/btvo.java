package p000;

import android.os.SystemClock;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: btvo */
public final /* synthetic */ class btvo implements aubw {

    /* renamed from: a */
    private final btvp f152627a;

    /* renamed from: b */
    private final bplj f152628b;

    public btvo(btvp btvp, bplj bplj) {
        this.f152627a = btvp;
        this.f152628b = bplj;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        btvp btvp = this.f152627a;
        bplj bplj = this.f152628b;
        if (((rkj) obj).mo24824r()) {
            bxvd da = bplj.f138100c.mo74144da();
            da.mo73625a((bxvk) bplj);
            bpll bpll = btvp.f152630b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplj bplj2 = (bplj) da.f164949b;
            bpll.getClass();
            bplj2.f138103b = bpll;
            bplj2.f138102a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            bxvd da2 = bonq.f133833p.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonq bonq = (bonq) da2.f164949b;
            bonq.f133836b = 15;
            bonq.f133835a |= 1;
            bplj bplj3 = (bplj) da.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonq bonq2 = (bonq) da2.f164949b;
            bplj3.getClass();
            bonq2.f133849o = bplj3;
            bonq2.f133835a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            btvp.f152629a.mo24333a(da2.mo74062i()).mo24327b();
            btvp.f152632d = SystemClock.elapsedRealtime();
        }
    }
}
