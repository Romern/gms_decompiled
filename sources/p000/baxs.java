package p000;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.net.SocketFactory;

/* renamed from: baxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baxs implements bmzi {

    /* renamed from: a */
    final /* synthetic */ bmxv f102059a;

    /* renamed from: b */
    final /* synthetic */ Executor f102060b;

    /* renamed from: c */
    final /* synthetic */ Context f102061c;

    /* renamed from: d */
    final /* synthetic */ bmxv f102062d;

    /* renamed from: e */
    final /* synthetic */ befa f102063e;

    /* renamed from: f */
    final /* synthetic */ bmxv f102064f;

    public baxs(bmxv bmxv, Executor executor, Context context, bmxv bmxv2, befa befa, bmxv bmxv3) {
        this.f102059a = bmxv;
        this.f102060b = executor;
        this.f102061c = context;
        this.f102062d = bmxv2;
        this.f102063e = befa;
        this.f102064f = bmxv3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        cauf cauf = new cauf();
        if (this.f102059a.mo66813a()) {
            cauf.f176006h = new baxq(SocketFactory.getDefault(), ((Integer) this.f102059a.mo66814b()).intValue());
        }
        bdce bdce = new bdce(new bdcg(cauf), this.f102061c, new baxp(this.f102060b, (int) cenf.m137500b()));
        if (this.f102062d.mo66813a()) {
            bdce.mo57869a((bdcc) this.f102062d.mo66814b());
        }
        Context context = this.f102061c;
        befa befa = this.f102063e;
        baxr baxr = null;
        if (this.f102064f.mo66813a() && ((cayo) this.f102064f.mo66814b()).mo16713a() != null) {
            baxr = new baxr(this.f102064f);
        }
        return new baxn(context, bdce, befa, baxr);
    }
}
