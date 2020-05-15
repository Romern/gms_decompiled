package p000;

import com.google.android.gms.autofill.data.Credential;
import java.util.concurrent.Executor;

/* renamed from: kfr */
final /* synthetic */ class kfr implements bqeh {

    /* renamed from: a */
    private final kfx f24003a;

    /* renamed from: b */
    private final Credential f24004b;

    /* renamed from: c */
    private final kel f24005c;

    public kfr(kfx kfx, Credential credential, kel kel) {
        this.f24003a = kfx;
        this.f24004b = credential;
        this.f24005c = kel;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        kfx kfx = this.f24003a;
        Credential credential = this.f24004b;
        kel kel = this.f24005c;
        bnic bnic = (bnic) obj;
        if (credential.mo7929d()) {
            bnrd a = bnic.iterator();
            while (true) {
                if (!a.hasNext()) {
                    break;
                }
                Credential credential2 = (Credential) a.next();
                if (credential2.mo7928c() && credential2.f11609b.f23889a.equals(credential.f11609b.f23889a)) {
                    kfx.mo14454a(bqfb.INSTANCE, credential2);
                    break;
                }
            }
        }
        if (credential.mo7928c()) {
            bnrd a2 = bnic.iterator();
            Credential credential3 = null;
            while (true) {
                if (a2.hasNext()) {
                    Credential credential4 = (Credential) a2.next();
                    if (credential4.mo7929d()) {
                        if (credential3 != null) {
                            break;
                        }
                        credential3 = credential4;
                    }
                } else if (credential3 != null) {
                    credential = new Credential(credential3.f11608a, credential.f11609b, credential.f11610c, credential.f11611d);
                }
            }
        }
        kgr kgr = new kgr();
        bqgj bqgj = kel.f23937a;
        cazf.m127594a(bqgj);
        kgr.f24091b = bqgj;
        cazf.m127594a(kel);
        kgr.f24090a = kel;
        cazf.m127594a(credential);
        kgr.f24092c = credential;
        cazf.m127594a(kfx);
        kgr.f24093d = kfx;
        cazf.m127595a(kgr.f24090a, kel.class);
        cazf.m127595a(kgr.f24091b, Executor.class);
        cazf.m127595a(kgr.f24092c, Credential.class);
        cazf.m127595a(kgr.f24093d, kgu.class);
        return kfg.m17752a(new kgt(kgr.f24093d, kgr.f24091b, kgr.f24092c).f24095a.mo75201b());
    }
}
