package p000;

import android.content.Intent;

/* renamed from: qqi */
final /* synthetic */ class qqi implements bqeh {

    /* renamed from: a */
    private final qqa f41947a;

    /* renamed from: b */
    private final Intent f41948b;

    /* renamed from: c */
    private final bmzi f41949c;

    public qqi(qqa qqa, Intent intent, bmzi bmzi) {
        this.f41947a = qqa;
        this.f41948b = intent;
        this.f41949c = bmzi;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        qqa qqa = this.f41947a;
        Intent intent = this.f41948b;
        bmzi bmzi = this.f41949c;
        rjp rjp = (rjp) obj;
        if (rjp.mo24655a() == 11002) {
            return bqdx.m112674a(adbb.m50100a(qqa.mo24199a(intent)), new qqj(bmzi), bqfb.INSTANCE);
        }
        throw rjp;
    }
}
