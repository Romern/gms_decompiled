package p000;

import android.util.Pair;
import java.util.List;

/* renamed from: bawc */
final /* synthetic */ class bawc implements bqeh {

    /* renamed from: a */
    private final bawq f101962a;

    /* renamed from: b */
    private final bauu f101963b;

    public bawc(bawq bawq, bauu bauu) {
        this.f101962a = bawq;
        this.f101963b = bauu;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bawq bawq = this.f101962a;
        bauu bauu = this.f101963b;
        bqgg a = bqga.m112775a(bngx.m109377j());
        for (Pair pair : (List) obj) {
            a = bqdx.m112674a(a, new bawd(bawq, pair, bauu), bawq.f101996e);
        }
        return bqdx.m112673a(a, bawe.f101967a, bawq.f101996e);
    }
}
