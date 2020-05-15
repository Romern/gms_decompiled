package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: brwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brwu implements chqt {

    /* renamed from: a */
    private final Map f143544a = new HashMap();

    /* renamed from: b */
    private final brul f143545b;

    /* renamed from: c */
    private final Executor f143546c;

    public brwu(brul brul, Executor executor) {
        this.f143545b = brul;
        this.f143546c = executor;
    }

    /* renamed from: a */
    public final chqs mo56353a(chtv chtv, chqo chqo, chqp chqp) {
        bmxv bmxv;
        int e = ((brum) chqo.mo85548a(brum.f143417a)).mo69986e();
        if (e != 0) {
            if (e == 2) {
                String str = (String) chqo.mo85548a(brup.f143420a);
                if (str == null) {
                    str = ((brum) chqo.mo85548a(brum.f143417a)).mo69983b().mo69987a().f105583a;
                }
                brwb brwb = new brwb(str, (bruw) chqo.mo85548a(bruw.f143433a), chtv.f189150b);
                synchronized (this.f143544a) {
                    bmxv = (bmxv) this.f143544a.get(brwb);
                    if (bmxv == null) {
                        bmxv = bmxv.m108567c(this.f143545b.mo69981a());
                        this.f143544a.put(brwb, bmxv);
                    }
                }
                if (bmxv.mo66813a()) {
                    brvm a = brvn.m114753a();
                    a.f143455a = (brvp) bmxv.mo66814b();
                    a.f143456b = this.f143546c;
                    bmxy.m108581a(a.f143455a);
                    bmxy.m108581a(a.f143456b);
                    return brxh.m114841a(new brws(new brvn(a))).mo56353a(chtv, chqo, chqp);
                }
            }
            return chqp.mo70053a(chtv, chqo);
        }
        throw null;
    }
}
