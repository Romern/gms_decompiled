package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: apvp */
final /* synthetic */ class apvp implements Runnable {

    /* renamed from: a */
    private final apvs f84997a;

    /* renamed from: b */
    private final int f84998b;

    /* renamed from: c */
    private final int f84999c;

    public apvp(apvs apvs, int i, int i2) {
        this.f84997a = apvs;
        this.f84998b = i;
        this.f84999c = i2;
    }

    public final void run() {
        apvs apvs = this.f84997a;
        int i = this.f84998b;
        int i2 = this.f84999c;
        synchronized (apvs.f85005d) {
            aucb aucb = apvs.f85004c;
            if (aucb != null) {
                try {
                    apvs.f85003b = ((rkj) aucu.m76782a(aucb)).mo24824r();
                } catch (InterruptedException | ExecutionException e) {
                    apvs.f85003b = false;
                }
                apvs.f85004c = null;
            }
        }
        if (apvs.f85003b) {
            bxvd da = bvzx.f158586e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvzx bvzx = (bvzx) da.f164949b;
            bvzx.f158590c = i - 1;
            int i3 = bvzx.f158588a | 2;
            bvzx.f158588a = i3;
            bvzx.f158589b = i2 - 1;
            bvzx.f158588a = i3 | 1;
            int i4 = apvs.f85006e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvzx bvzx2 = (bvzx) da.f164949b;
            int i5 = i4 - 1;
            if (i4 != 0) {
                bvzx2.f158591d = i5;
                bvzx2.f158588a |= 4;
                apvs.f85002a.mo24335a(((bvzx) da.mo74062i()).mo73642k()).mo24327b();
                return;
            }
            throw null;
        }
    }
}
