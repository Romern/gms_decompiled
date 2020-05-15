package p000;

import android.content.Context;

/* renamed from: krm */
final /* synthetic */ class krm implements bmzi {

    /* renamed from: a */
    private final Context f24892a;

    public krm(Context context) {
        this.f24892a = context;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        Context context = this.f24892a;
        int i = krp.f24894a;
        cifv b = cifv.m150191b("infinitedata-pa.googleapis.com", 443);
        b.transportExecutor(new shs(context.getApplicationInfo().uid, 18689));
        return bqga.m112775a(b.mo85581b());
    }
}
